package com.victormiranda.homr.model;

import com.victormiranda.homr.type.PropertyType;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by victor on 04/07/15.
 */
@Entity
@Table(name="properties")
@Inheritance
@DiscriminatorColumn(name = "mode")
public abstract class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date createDate;

    @Temporal(TemporalType.DATE)
    private Date modifyDate;

    @Enumerated(EnumType.STRING)
    private PropertyType propertyType;

    @ManyToOne
    @JoinColumn(name = "ownerId")
    private User owner;

    @OneToOne
    @JoinColumn(name = "addressId")
    private Address address;

    @OneToMany(mappedBy = "property")
    private List<Picture> pictureList;

    @OneToMany(mappedBy = "property")
    private List<PropertyHistory> propertyHistories;

}
