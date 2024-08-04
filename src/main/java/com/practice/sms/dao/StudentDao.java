package com.practice.sms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.sms.entity.Student;

public interface StudentDao extends JpaRepository<Student, Long> {

}
