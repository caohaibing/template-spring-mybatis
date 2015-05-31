package com.quxionglie.tsm.service;




import com.quxionglie.tsm.util.PageQuery;

import java.util.List;

public interface BaseService<T> {
    T getByPk(int pk);

    int insert(T entry);

    int update(T entry);

    int deleteByPk(int pk);

    List<T> findPage(PageQuery pageQuery);
}

