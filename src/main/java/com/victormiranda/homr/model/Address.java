package com.victormiranda.homr.model;

import javax.persistence.*;

/**
 * Created by victor on 04/07/15.
 */
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
