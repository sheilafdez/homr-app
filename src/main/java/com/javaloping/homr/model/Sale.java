package com.javaloping.homr.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author victormiranda@gmail.com
 */
@Entity
@DiscriminatorValue("sale")
public class Sale extends Property {

}
