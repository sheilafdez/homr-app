package com.javaloping.homr.dto.property;

import com.javaloping.homr.type.PropertyType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * @author victormiranda@gmail.com
 */
public class BasicPropertyDTO {
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private PropertyType type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PropertyType getType() {
        return type;
    }

    public void setType(PropertyType type) {
        this.type = type;
    }
}
