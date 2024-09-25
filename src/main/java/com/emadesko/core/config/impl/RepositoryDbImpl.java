package com.emadesko.core.config.impl;

import java.util.List;

import com.emadesko.core.config.RepositoryDb;
import com.emadesko.core.database.impl.DataSourceImpl;

public class RepositoryDbImpl<T> extends DataSourceImpl<T> implements RepositoryDb<T>{

    @Override
    public int insert() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public List<T> selectAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectAll'");
    }
    
}
