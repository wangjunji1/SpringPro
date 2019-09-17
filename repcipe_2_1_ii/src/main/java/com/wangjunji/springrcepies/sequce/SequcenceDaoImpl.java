package com.wangjunji.springrcepies.sequce;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
@Component("SequcenceDao")
public class SequcenceDaoImpl  implements SequcenceDao {
    private final Map<String,Sequcence> sequcences = new HashMap<String, Sequcence>();
    private final Map<String,AtomicInteger> values= new HashMap<String, AtomicInteger>();
    public SequcenceDaoImpl(){
        sequcences.put("IT",new Sequcence("IT","30","A"));
        values.put("IT",new AtomicInteger(1000));
    }

    public Sequcence getSequcence(String sequcenceid) {
        return sequcences.get(sequcenceid);
    }

    public int getNextValue(String sequcenceid) {
        return values.get(sequcenceid).getAndIncrement();
    }
}
