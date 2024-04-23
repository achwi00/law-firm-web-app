package org.lawfirm.entity;

import jakarta.persistence.*;

@Entity
public class Document
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long documentId;
    //client

    @ManyToOne
    @JoinColumn(name = "clientId", referencedColumnName = "id")
    private Client client;
    //case -- optional

    @Lob
    private byte[] content;
}
