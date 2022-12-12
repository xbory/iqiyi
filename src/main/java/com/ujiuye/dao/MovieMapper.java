package com.ujiuye.dao;

import com.ujiuye.domain.Movie;
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
public interface MovieMapper {

    public List<Movie> findAll();

}
