package org.lawfirm.entity;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class LawFirmUser
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 40, nullable = false)
    private String email;
    @Column(length = 20, nullable = false)
    private String name;
    @Column(length = 30, nullable = false)
    private String surname;
    @Column(length = 17, nullable = false)
    private String phoneNum;

    protected LawFirmUser(){};
    public LawFirmUser(String email, String name, String surname, String phoneNum)
    {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.phoneNum = phoneNum;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getPhoneNum()
    {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }
}
