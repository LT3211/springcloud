package com.lt.repository;

import com.lt.entity.Student;

import java.util.Collection;

/**
 * @author teng.li
 * @version 1.0
 * @date 2020/8/5 11:10
 */
public interface StudentRepository {

    public Collection<Student> findAll();

    public Student findById(long id);

    public void saveOrUpdate(Student student);

    public void deleteById(long id);
}
