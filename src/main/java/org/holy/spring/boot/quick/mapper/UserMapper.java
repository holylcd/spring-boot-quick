package org.holy.spring.boot.quick.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.holy.spring.boot.quick.bean.domain.UserDO;
import org.holy.spring.boot.quick.component.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @Description //TODO
 * @Author holyl
 * @Date 2019/9/2 15:28
 * @Version 1.0.0
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<UserDO> {

}
