package com.ujiuye.domain;

import java.time.LocalDate;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author A11
 * @since 2022-12-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Movie {

    private Integer id;

    private String name;

    private String director;

    private Integer time_length;

    private LocalDate pub_date;

    private String description;

    private Float rating;

    private String pic;

    //一个电影多个演员
    private List<Actor> actors;

    //一个电影多个类型
    private List<Category> categories;
}
