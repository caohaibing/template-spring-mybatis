package com.quxionglie.tsm.mapper;


import com.quxionglie.tsm.util.PageQuery;

import java.util.List;

public interface BasePkMapper<T, PK> {
    T getByPk(PK pk);

    int insert(T entity);

    int update(T entity);

    int deleteByPk(PK pk);

    int findPageCount(PageQuery pageQuery);

    List<T> findPage(PageQuery pageQuery);
}
