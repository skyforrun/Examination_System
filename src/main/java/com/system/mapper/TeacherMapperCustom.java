package com.system.mapper;

import com.system.pojo.PagingVO;
import com.system.pojo.TeacherCustom;

import java.util.List;


public interface TeacherMapperCustom {

    //分页查询老师信息
    List<TeacherCustom> findByPaging(PagingVO pagingVO) throws Exception;

    //获取
}
