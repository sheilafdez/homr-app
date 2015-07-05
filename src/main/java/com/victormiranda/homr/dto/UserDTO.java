package com.victormiranda.homr.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by sheila on 05/07/15.
 */
public class UserDTO {

    @JsonProperty(value = "username")
    private String username;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "phone")
    private String phoneNumber;


    /** GETTERS AND SETTERS **/

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
}
