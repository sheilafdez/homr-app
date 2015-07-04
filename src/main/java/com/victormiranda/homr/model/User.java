package com.victormiranda.homr.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by victor on 04/07/15.
 */
@Entity
@Table(name = "users")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "user")
    private List<Favorite> favoriteList;

}
