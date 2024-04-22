package org.lawfirm.entity;

import java.util.Set;

public class Attorney extends LawFirmUser
{
//    @ManyToMany
//    @JoinTable(
//            name = "attorney_specialization",
//            joinColumns = @JoinColumn(name = "userId"),
//            inverseJoinColumns = @JoinColumn(name = "specId")
//    )
    private Set<Specialization> specializations;
}
