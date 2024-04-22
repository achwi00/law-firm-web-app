package org.lawfirm.entity;

import jakarta.persistence.Entity;

@Entity
public class Admin extends LawFirmUser
{
    public Admin(String email, String name, String surname, String phoneNum){
        super(email, name, surname, phoneNum);
    }

    public Admin(){};

}
