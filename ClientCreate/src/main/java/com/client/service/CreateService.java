package com.client.service;

import com.client.model.Student;

public interface CreateService {

	Student addStudent(Student s);

	Student getSingleStudent(int rollno);

	void updateStudent(Student s);

}
