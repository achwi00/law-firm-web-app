package org.lawfirm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.util.Set;
@Entity
public class Attorney extends LawFirmUser
{
    @ManyToMany
    @JoinTable(
            name = "attorney_specialization",
            joinColumns = @JoinColumn(name = "attorneyId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "specId")
    )
    private Set<Specialization> specializations;

    public Attorney(){}
}
