package com.auca__mis.service;

import com.auca__mis.model.Teacher;

import java.util.List;

public interface ITeacherService {
    Teacher saveTeacher(Teacher teacher);
    Teacher getTeacherById(Teacher teacher);
    void deleteTeacherById(Teacher teacher);
    List<Teacher> getAllTeachers();
    Teacher updateTeacher(Teacher teacher);
}
