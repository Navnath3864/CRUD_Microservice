package com.client.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.model.Student;
import com.client.repo.CreateRepo;
import com.client.service.CreateService;
@Service
public class CreateServiceImpl  implements CreateService{
	@Autowired
	CreateRepo cr;

	@Override
	public Student addStudent(Student s) {
		Student stu=cr.save(s);
		return stu;
	}

	@Override
	public Student getSingleStudent(int rollno) {
		Optional<Student> stud = cr.findById(rollno);
		if(stud!=null) {
			return stud.get();
		}
		return null;
	}

	@Override
	public void updateStudent(Student s) {
		Optional<Student> stu =cr.findById(s.getRollno());
		if(stu!=null) {
			Student st= stu.get();
			st.setName(s.getName());
			st.setCourse(s.getCourse());
			cr.save(st);
		}
		
	}
}
