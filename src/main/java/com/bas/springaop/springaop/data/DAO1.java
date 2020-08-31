package com.bas.springaop.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class DAO1 {
    public String getSomething(){
        return "Dao1";
    }
}
