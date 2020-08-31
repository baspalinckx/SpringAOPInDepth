package com.bas.springaop.springaop.business;

import com.bas.springaop.springaop.data.DAO2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private DAO2 dao2;
    public String calculateSomething(){
        //does business
        return dao2.getSomething();
    }
}
