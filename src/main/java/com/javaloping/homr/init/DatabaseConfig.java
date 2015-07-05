package com.javaloping.homr.init;

import liquibase.integration.spring.SpringLiquibase;
import org.hibernate.ejb.HibernatePersistence;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by victor on 04/07/15.
 */
@Configuration
@EnableJpaRepositories("com.javaloping.homr.repository")
public class DatabaseConfig {

    @Resource
    private Environment env;

    @Value("${db.url}")
    private String jdbcUrl;

    @Value("${db.user}")
    private String user;

    @Value("${db.password}")
    private String password;

    @Value("${db.driver}")
    private String driver;

    @Value("${db.hibernate.dialect}")
    private String dialect;

    @Value("${db.hibernate.packagescan}")
    private String modelPackage;

    @Value("${db.hibernate.hbm2ddl}")
    private String hbm2ddl;

    @Value("${db.liquibase.path}")
    private String liquibasePath;

    @Value("${db.liquibase.context}")
    private String liquibaseContext;

    @Bean
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName(driver);
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername(user);
        dataSource.setPassword(password);

        return dataSource;
    }

    @Bean(name = "liquibase")
    public SpringLiquibase getLiquibase() {
        SpringLiquibase liquibase = new SpringLiquibase();

        liquibase.setChangeLog(liquibasePath);
        liquibase.setDataSource(dataSource());
        liquibase.setContexts(liquibaseContext);

        return liquibase;
    }

    @Bean
    @DependsOn("liquibase")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        final LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        final Properties hibernateProperties = new Properties();

        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistence.class);
        entityManagerFactoryBean.setPackagesToScan(modelPackage);

        hibernateProperties.setProperty("hibernate.dialect", dialect);
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", hbm2ddl);

        entityManagerFactoryBean.setJpaProperties(hibernateProperties);

        return entityManagerFactoryBean;
    }

    @Bean
    public JpaTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }

}
