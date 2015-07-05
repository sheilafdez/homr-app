package com.javaloping.homr.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @author victormiranda@gmail.com
 */
@Entity
@Table(name = "areas")
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "countryId")
    private Country country;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private Area parent;

    @Temporal(TemporalType.DATE)
    private Date createDate;

    @Temporal(TemporalType.DATE)
    private Date modifyDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Area getParent() {
        return parent;
    }

    public void setParent(Area parent) {
        this.parent = parent;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
