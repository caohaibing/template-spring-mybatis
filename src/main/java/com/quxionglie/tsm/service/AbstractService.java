package com.quxionglie.tsm.service;

import com.quxionglie.tsm.mapper.BaseMapper;
import com.quxionglie.tsm.util.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class AbstractService<M extends BaseMapper, T> implements BaseService<T> {
    @Autowired
    protected M baseMapper;

    @Override
    public T getByPk(int pk) {
        return (T) baseMapper.getByPk(pk);
    }

    @Override
    @Transactional
    public int insert(T entity) {
        return baseMapper.insert(entity);
    }

    @Override
    @Transactional
    public int update(T entity) {
        return baseMapper.update(entity);
    }

    @Override
    @Transactional
    public int deleteByPk(int pk) {
        return baseMapper.deleteByPk(pk);
    }

    @Override
    public List<T> findPage(PageQuery pageQuery) {
        if (pageQuery == null) {
            pageQuery = new PageQuery();
        }
        int total = baseMapper.findPageCount(pageQuery);
        pageQuery.getPageModel().setTotal(total);
        List<T> datas = baseMapper.findPage(pageQuery);
        pageQuery.getPageModel().setResults(datas);
        return datas;
    }
}

