package com.system.mapper;

import com.system.pojo.PagingVO;
import com.system.pojo.StudentCustom;

import java.util.List;


public interface StudentMapperCustom {

    //分页查询学生信息
    List<StudentCustom> findByPaging(PagingVO pagingVO) throws Exception;

    //查询学生信息，和其选课信息
    StudentCustom findStudentAndSelectCourseListById(Integer id) throws Exception;

}
