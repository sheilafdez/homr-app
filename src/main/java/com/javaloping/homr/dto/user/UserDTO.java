package com.javaloping.homr.dto.user;

/**
 * @author sheilafdez@gmail.com
 */
public class UserDTO {

    private Long id;

    private String username;

    private String name;

    private String phoneNumber;

    /** GETTERS AND SETTERS **/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

}
