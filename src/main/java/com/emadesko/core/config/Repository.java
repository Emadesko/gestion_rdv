package com.emadesko.core.config;

import java.util.List;

public interface Repository <T>{
    
    int insert();
    List<T> selectAll();
}
