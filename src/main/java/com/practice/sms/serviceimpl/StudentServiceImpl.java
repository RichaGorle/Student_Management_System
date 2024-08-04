package com.practice.sms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.sms.dao.StudentDao;
import com.practice.sms.entity.Student;
import com.practice.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao dao;

	public StudentServiceImpl(StudentDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<Student> getAllStudents() {

		return dao.findAll();
	}
	

	@Override
	public Student saveStudent(Student student) {
		return dao.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return dao.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		dao.deleteById(id);	
	}

}
