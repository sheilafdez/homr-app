package com.javaloping.homr.dto.property;

/**
 * @author victormiranda@gmail.com
 */
public class PictureDTO {
    private Integer id;

    private String url;

    private String description;

    private BasicPropertyDTO property;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BasicPropertyDTO getProperty() {
        return property;
    }

    public void setProperty(BasicPropertyDTO property) {
        this.property = property;
    }
}
