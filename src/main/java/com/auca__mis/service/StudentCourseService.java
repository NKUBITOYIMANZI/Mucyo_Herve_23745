package com.auca__mis.service;

import com.auca__mis.model.StudentCourse;

import java.util.List;

public interface StudentCourseService {
    boolean insertStudentCourse(StudentCourse course);
      List<StudentCourse> studentCourseList();
    boolean deleteStudentCourse(StudentCourse course);

}
