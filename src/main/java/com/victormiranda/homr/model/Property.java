package com.victormiranda.homr.model;

import com.victormiranda.homr.type.ElderyType;
import com.victormiranda.homr.type.PropertyType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by victor on 04/07/15.
 */
@Entity
@Table(name="properties")
@Inheritance
@DiscriminatorColumn(name = "mode")
public abstract class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private PropertyType propertyType;

    private String name;

    private String description;

    @Temporal(TemporalType.DATE)
    private Date createDate;

    @Temporal(TemporalType.DATE)
    private Date modifyDate;

    private int views;

    private Float sqMeters;

    private int bedrooms;

    private Integer floor;

    @Column( precision = 10, scale = 2, columnDefinition="DECIMAL(10,2)")
    private BigDecimal price;

    private Boolean lift;

    @Enumerated(EnumType.STRING)
    private ElderyType eldery;

    @ManyToOne
    @JoinColumn(name = "ownerId")
    private User owner;

    @OneToOne
    @JoinColumn(name = "addressId")
    private Address address;

    @OneToMany(mappedBy = "property")
    private List<Picture> pictureList;

    @OneToMany(mappedBy = "property")
    private List<PropertyHistory> propertyHistories;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Float getSqMeters() {
        return sqMeters;
    }

    public void setSqMeters(Float sqMeters) {
        this.sqMeters = sqMeters;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean isLift() {
        return lift;
    }

    public void setLift(Boolean lift) {
        this.lift = lift;
    }

    public ElderyType getEldery() {
        return eldery;
    }

    public void setEldery(ElderyType eldery) {
        this.eldery = eldery;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Picture> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<Picture> pictureList) {
        this.pictureList = pictureList;
    }

    public List<PropertyHistory> getPropertyHistories() {
        return propertyHistories;
    }

    public void setPropertyHistories(List<PropertyHistory> propertyHistories) {
        this.propertyHistories = propertyHistories;
    }
}
