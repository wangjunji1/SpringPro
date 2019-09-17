package com.wangjunji.springrcepies.sequce;

public interface SequcenceDao {
    Sequcence getSequcence(String sequcenceid);
    int getNextValue(String sequcenceid);
}
