package org.lawfirm.entity;

import jakarta.persistence.*;

@Entity
public class Document
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long documentId;

    //client
    //case -- optional

    @Lob
    private byte[] content;
}
