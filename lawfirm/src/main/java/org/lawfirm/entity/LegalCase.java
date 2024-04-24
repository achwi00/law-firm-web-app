package org.lawfirm.entity;

import jakarta.persistence.*;

@Entity
public class LegalCase
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int caseId;

    @ManyToOne
    @JoinColumn(name = "clientId", referencedColumnName = "id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "attorneyId", referencedColumnName = "id", nullable = false)
    private Attorney attorney;

    @Column(length = 50)
    private String description;

    @Column(length = 30, nullable = false)
    private String type;

    private enum CaseStatus{
        STARTED, IN_PROGRESS, FINISHED;
    }

    @Column(name = "case_status")
    @Enumerated(EnumType.STRING)
    private CaseStatus caseStatus;

    protected LegalCase(){}

    public LegalCase(Attorney attorney, String description, String type)
    {
        this.attorney = attorney;
        this.description = description;
        this.type = type;
        this.caseStatus = CaseStatus.STARTED;
    }

    public LegalCase(Client client, Attorney attorney, String description, String type)
    {
        this.client = client;
        this.attorney = attorney;
        this.description = description;
        this.type = type;
        this.caseStatus = CaseStatus.STARTED;
    }

    public void setCaseStatus(String s){
        if(s.equalsIgnoreCase("STARTED")) this.caseStatus = CaseStatus.STARTED;
        if(s.equalsIgnoreCase("IN_PROGRESS")) this.caseStatus = CaseStatus.IN_PROGRESS;
        if(s.equalsIgnoreCase("FINISHED")) this.caseStatus = CaseStatus.FINISHED;

    }
    public String getCaseStatus(){
        String s = null;
        if(this.caseStatus.equals(CaseStatus.STARTED)) s = "STARTED";
        if(this.caseStatus.equals(CaseStatus.IN_PROGRESS)) s = "IN_PROGRESS";
        if(this.caseStatus.equals(CaseStatus.FINISHED)) s = "FINISHED";
        return s;
    }

    public Client getClient()
    {
        return client;
    }

    public void setClient(Client client)
    {
        this.client = client;
    }

    public Attorney getAttorney()
    {
        return attorney;
    }

    public void setAttorney(Attorney attorney)
    {
        this.attorney = attorney;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
