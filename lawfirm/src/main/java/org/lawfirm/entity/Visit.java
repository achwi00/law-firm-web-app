package org.lawfirm.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Visit
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int visitId;

    @ManyToOne
    @JoinColumn(name = "attorneyId", referencedColumnName = "id")
    private Attorney attorney;

    @ManyToOne
    @JoinColumn(name = "clientId", referencedColumnName = "id")
    private Client client;

    //optional caseId
    //enum status {FREE, BOOKED, PENDING, FINISHED}
    private enum Status{
        FREE, BOOKED, PENDING, FINISHED;
    }

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false)
    private LocalTime time;

    protected Visit(){}
    public Visit(Attorney attorney, LocalDate date, LocalTime time)
    {
        this.attorney = attorney;
        this.date = date;
        this.time = time;
    }

    public void setStatus(String s){
        if(s.equalsIgnoreCase("FREE")) this.status = Status.FREE;
        if(s.equalsIgnoreCase("BOOKED")) this.status = Status.BOOKED;
        if(s.equalsIgnoreCase("PENDING")) this.status = Status.PENDING;
        if(s.equalsIgnoreCase("FINISHED")) this.status = Status.FINISHED;
    }
    public String getStatus(){
        String s = null;
        if(this.status.equals(Status.FREE)) s = "FREE";
        if(this.status.equals(Status.BOOKED)) s = "BOOKED";
        if(this.status.equals(Status.PENDING)) s = "PENDING";
        if(this.status.equals(Status.FINISHED)) s = "FINISHED";
        return s;
    }

    public Attorney getAttorney()
    {
        return attorney;
    }

    public void setAttorney(Attorney attorney)
    {
        this.attorney = attorney;
    }

    public Client getClient()
    {
        return client;
    }

    public void setClient(Client client)
    {
        this.client = client;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public LocalTime getTime()
    {
        return time;
    }

    public void setTime(LocalTime time)
    {
        this.time = time;
    }
}
