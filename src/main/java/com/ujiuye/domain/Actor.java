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
public class Actor {

    private Integer id;

    private String name;

    private LocalDate birthday;

    private String sex;

    private String description;

    private String pic;

    //一个演员多个区域
    private List<Region> regions;
}
