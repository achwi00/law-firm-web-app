package org.lawfirm.entity;

import jakarta.persistence.Entity;

@Entity
public class Admin extends LawFirmUser
{
    public Admin(String password, String email, String phoneNum)
    {
        super(password, email, phoneNum);
    }

    public Admin(){};

}
