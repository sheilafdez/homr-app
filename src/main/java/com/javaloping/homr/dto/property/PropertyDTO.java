package com.javaloping.homr.dto.property;

import com.javaloping.homr.dto.address.AddressDTO;
import com.javaloping.homr.dto.user.UserDTO;

import java.math.BigDecimal;

/**
 * @author victormiranda@gmail.com
 */
public abstract class PropertyDTO extends BasicPropertyDTO {

    private String description;

    private BigDecimal price;

    private AddressDTO address;

    private UserDTO owner;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public UserDTO getOwner() {
        return owner;
    }

    public void setOwner(UserDTO owner) {
        this.owner = owner;
    }
}
