package org.lawfirm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Client extends LawFirmUser
{
    @OneToOne
    @JoinColumn(name = "addressId")
    private Address address;


    protected Client(){}
    public Client(String password, String email, String phoneNum)
    {
        super(password, email, phoneNum);
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }
}
