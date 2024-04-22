package org.lawfirm.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Address
{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;


    private String country;
    private String postalCode;
    private String city;
    private String streetName;
    private String houseNum;
}
