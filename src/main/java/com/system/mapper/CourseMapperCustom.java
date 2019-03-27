package com.system.mapper;

import com.system.pojo.CourseCustom;
import com.system.pojo.PagingVO;

import java.util.List;


public interface CourseMapperCustom {

    //分页查询学生信息
    List<CourseCustom> findByPaging(PagingVO pagingVO) throws Exception;

}
