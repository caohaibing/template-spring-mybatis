
package com.quxionglie.tsm.service;

import com.quxionglie.tsm.mapper.SysParamMapper;
import com.quxionglie.tsm.model.SysParam;
import org.springframework.stereotype.Service;

@Service
public class SysParamService extends AbstractService<SysParamMapper, SysParam> {
    public SysParam getByParamKey(String paramKey) {
            return baseMapper.getByParamKey(paramKey);
    }
}

