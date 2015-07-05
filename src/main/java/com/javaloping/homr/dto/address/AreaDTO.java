package com.javaloping.homr.dto.address;

/**
 * @author victormiranda@gmail.com
 */
public class AreaDTO {
    private Long id;
    private String name;
    private CountryDTO countryDTO;
    private AreaDTO parent;

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

    public CountryDTO getCountryDTO() {
        return countryDTO;
    }

    public void setCountryDTO(CountryDTO countryDTO) {
        this.countryDTO = countryDTO;
    }

    public AreaDTO getParent() {
        return parent;
    }

    public void setParent(AreaDTO parent) {
        this.parent = parent;
    }
}
