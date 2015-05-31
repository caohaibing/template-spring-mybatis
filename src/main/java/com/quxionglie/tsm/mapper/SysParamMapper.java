
package com.quxionglie.tsm.mapper;
import com.quxionglie.tsm.model.SysParam;
import org.apache.ibatis.annotations.Param;
import com.quxionglie.tsm.util.MyBatisRepository;

@MyBatisRepository
public interface SysParamMapper extends BaseMapper<SysParam>{
        SysParam getByParamKey(@Param("paramKey") String paramKey) ;
}
