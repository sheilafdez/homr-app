package com.javaloping.homr.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by victor on 04/07/15.
 */
@Entity
@DiscriminatorValue("sale")
public class Sale extends Property {

}
