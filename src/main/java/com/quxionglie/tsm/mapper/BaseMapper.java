package com.quxionglie.tsm.mapper;


import com.quxionglie.tsm.util.PageQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseMapper<T> {
    T getByPk(int pk);

    int insert(T entity);

    int update(T entity);

    int deleteByPk(int pk);

    int findPageCount(PageQuery pageQuery);

    List<T> findPage(PageQuery pageQuery);
}
