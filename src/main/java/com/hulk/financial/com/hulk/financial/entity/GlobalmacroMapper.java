package com.hulk.financial.com.hulk.financial.entity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by HulkGao on 2018/3/15 0015.
 */
@Mapper
public interface GlobalmacroMapper {

    @Select("select * from help_keyword where name = #{value}")
    Globalmacro findUserByValue(@Param("value")String value);

}
