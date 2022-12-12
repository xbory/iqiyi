package com.ujiuye.domain;

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
public class RecommendType {

    private Integer id;

    private String name;

    /**
     * 0表示使用这种方式,1表示没有使用这个方式
     */
    private Integer isrecommend;


}
