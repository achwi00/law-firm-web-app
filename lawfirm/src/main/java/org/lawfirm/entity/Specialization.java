package org.lawfirm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Specialization
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int specId;

    private String name;
}
