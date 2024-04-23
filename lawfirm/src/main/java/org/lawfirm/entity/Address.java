package org.lawfirm.entity;

import jakarta.persistence.*;

@Entity
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;


    @Column(length = 15, nullable = false)
    private String country;
    @Column(length = 7, nullable = false)
    private String postalCode;
    @Column(length = 15, nullable = false)
    private String city;
    @Column(length = 20, nullable = false)
    private String streetName;
    @Column(length = 6, nullable = false)
    private String houseNum;

    public Address(){}
    public Address(String country, String postalCode, String city, String streetName, String houseNum)
    {
        this.country = country;
        this.postalCode = postalCode;
        this.city = city;
        this.streetName = streetName;
        this.houseNum = houseNum;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

    public String getHouseNum()
    {
        return houseNum;
    }

    public void setHouseNum(String houseNum)
    {
        this.houseNum = houseNum;
    }
}
