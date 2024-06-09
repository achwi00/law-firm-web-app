package org.lawfirm.repository;

import org.lawfirm.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>
{
//    Client findByUsername(String username);
    Client findByEmail(String email);

}
