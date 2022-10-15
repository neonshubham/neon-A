package com.neon.dao;

import java.util.List;
import java.util.Map;

import com.neon.bean.Course;
import com.neon.bean.FeePayment;
import com.neon.bean.Student;

public interface StudentDao {
	public List<Student> studentResistratioForCourse(Student student);

	public List<Course> addCourse(Course course);

	public void removeCourse(Long courseId);

	public List<Student> liststudent();

	public List<Course> listcourse();

	public Map<String, String> viewGrades();

	public List<FeePayment> payFee(FeePayment feeform);



}
