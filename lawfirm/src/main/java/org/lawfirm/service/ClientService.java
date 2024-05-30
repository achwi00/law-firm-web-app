package org.lawfirm.service;

import org.lawfirm.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ClientService
{
    @Autowired
    private ClientRepository clientRepository;

//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;
}
