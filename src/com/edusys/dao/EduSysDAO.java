package com.edusys.dao;

import java.util.List;

public abstract class EduSysDAO<E, K> {
    
    abstract public void insert(E entity);
    abstract public void update(E entity);
    abstract public void delete(K id);
    abstract public List<E> selectAll();
    abstract public E selectByID(K id);
    abstract protected List<E> selectBySQL(String sql, Object...args);
}
