package com.victormiranda.homr.model;

import javax.persistence.*;

/**
 * Created by victor on 04/07/15.
 */
@Entity
@Table(name = "pictures")
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "propertyId")
    private Property property;
}
