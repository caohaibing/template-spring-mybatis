package com.quxionglie.tsm.service;




import com.quxionglie.tsm.util.PageQuery;

import java.util.List;

public interface BasePkService<T, PK> {
    T getByPk(PK pk);

    int insert(T entry);

    int update(T entry);

    int deleteByPk(PK pk);

    List<T> findPage(PageQuery pageQuery);
}

