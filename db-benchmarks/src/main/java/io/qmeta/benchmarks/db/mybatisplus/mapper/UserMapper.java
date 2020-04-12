package io.qmeta.benchmarks.db.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.qmeta.benchmarks.db.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * QMETA
 * created at: 2020/4/11
 * created by: patrick
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
