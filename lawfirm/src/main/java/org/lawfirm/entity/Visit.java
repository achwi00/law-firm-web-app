package org.lawfirm.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

public class Visit
{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int visitId;

    //attorneyId
    //clientId
    //optional caseId
    //enum status

    private LocalDate date;
    private LocalTime time;

}
