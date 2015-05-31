
package com.quxionglie.tsm.mapper;
import com.quxionglie.tsm.model.User;
import org.apache.ibatis.annotations.Param;
import com.quxionglie.tsm.util.MyBatisRepository;

@MyBatisRepository
public interface UserMapper extends BaseMapper<User>{
        User getByUsername(@Param("username") String username) ;
}
