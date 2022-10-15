package com.neon.dao;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neon.bean.Course;
import com.neon.bean.FeePayment;
import com.neon.bean.Student;

@Service
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private ProfessorDao professordao;

	private static List<Student> list = new ArrayList<>();
	static {
		list.add(new Student(11, "vaibhav", "patil", "vp@gmail.com", "vp", "M", 28));
		list.add(new Student(12, "snehal", "patil", "sp@gmail.com", "ps", "F", 25));
		list.add(new Student(11, "sunny", "patil", "sp@gmail.com", "sp", "M", 28));
		list.add(new Student(11, "komal", "pagar", "kp@gmail.com", "kp", "F", 26));
	}
	private static List<Course> list1 = new ArrayList<>();
	static {
		list1.add(new Course(101, "course:JAVA",50000));
		list1.add(new Course(202, "course:PYTHON",40000));
		list1.add(new Course(303, "course:C++",30000));
		list1.add(new Course(404, "course:DATA SCIENCE",60000));
	}
	
	private static 	List<FeePayment> fee=new ArrayList<>();

	@Override
	public List<Student> studentResistratioForCourse(Student student) {
		list.add(student);
		System.out.println("Record insert succesfully");
		return list;

	}

	@Override
	public List<Course> addCourse(Course course) {
		list1.add(course);
		System.out.println("Record insert succesfully");
		return list1;

	}

	@Override
	public void removeCourse(Long courseId) {
		list1 = list1.stream().filter(course -> course.equals(courseId)).collect(Collectors.toList());

	}
	
	@Override
	public List<Student> liststudent() {

		list.forEach((x) -> System.out.println(x));
		return list;

	}
	
	@Override
	public List<Course> listcourse() {

		list1.forEach((x) -> System.out.println(x));
		return list1;

	}

	@Override
	public List<FeePayment> payFee(FeePayment feeform) {
		list.forEach((x) -> System.out.println(x));
		list1.forEach((x) -> System.out.println(x));
		
	
		fee.add(feeform);
	
		fee.forEach((x) -> System.out.println(x));
	 System.out.println("fee paid successfully");
	return fee;
		
	}

	@Override
	public Map<String, String> viewGrades() {
		return professordao.viewGrades();
		
	}

}
