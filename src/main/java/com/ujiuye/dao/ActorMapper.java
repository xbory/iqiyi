package com.ujiuye.dao;

import com.ujiuye.domain.Actor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author A11
 * @since 2022-12-09
 */
@Mapper
public interface ActorMapper {

    // 查询演员列表
    public List<Actor> findAll();

    // 按id查询演员
    public Actor findById(Integer id);

}
