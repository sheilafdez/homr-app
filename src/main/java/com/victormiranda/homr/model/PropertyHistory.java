package com.victormiranda.homr.model;

import javax.persistence.*;

/**
 * Created by victor on 04/07/15.
 */
@Entity
@Table(name = "propertyhistories")
public class PropertyHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "propertyId")
    private Property property;

}
