package org.lawfirm.entity;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class LawFirmUser
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //possibly a seperate account class?
    //other suggested attributes:
    //account status(like active, inactive, suspended), last logged in time, role or permissions, salt for password hashing,

    @Column(length = 20, nullable = false)
    private String password;

    @Column(length = 40, nullable = false)
    private String email;
    @Column(length = 20)
    private String name;
    @Column(length = 30)
    private String surname;
    @Column(length = 17, nullable = false)
    private String phoneNum;

    protected LawFirmUser(){}

    public LawFirmUser(String password, String email, String phoneNum)
    {
        this.password = password;
        this.email = email;
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
