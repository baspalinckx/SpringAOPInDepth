package com.bas.springaop.springaop.business;

import com.bas.springaop.springaop.data.DAO1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private DAO1 dao1;
    public String calculateSomething(){
        //does business
        return dao1.getSomething();
    }
}
