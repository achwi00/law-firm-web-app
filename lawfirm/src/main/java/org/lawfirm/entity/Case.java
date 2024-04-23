package org.lawfirm.entity;

import jakarta.persistence.*;

//@Entity
public class Case
{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int caseId;

//    @ManyToOne
//    @JoinColumn(name = "clientId", referencedColumnName = "id")
    private Client client;

//    @ManyToOne
//    @JoinColumn(name = "attorneyId", referencedColumnName = "id")
    //private Attorney attorney;

    private String type;
    //Status - enum type {STARTED, IN_PROGRESS, FINISHED}
    //Description (the attorney could provide what was done

}
