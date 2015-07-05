package com.javaloping.homr.model;

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

    private String username;

    private String name;

    private String phoneNumber;

    @OneToMany(mappedBy = "user")
    private List<Favorite> favoriteList;

    /** CONSTRUCTORS **/

    public User(){}

    public User(String username, String name, String phoneNumber){
        this.username = username;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /** GETTERS AND SETTERS **/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Favorite> getFavoriteList() {
        return favoriteList;
    }

    public void setFavoriteList(List<Favorite> favoriteList) {
        this.favoriteList = favoriteList;
    }
}
