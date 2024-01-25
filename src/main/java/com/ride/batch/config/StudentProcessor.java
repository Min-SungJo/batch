package com.ride.batch.config;

import com.ride.batch.student.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> { // <입력, 출력>
    @Override
    public Student process(Student student) {
        // all the business logic goes here
        // 비즈니스 로직을 아래에 작성
        student.setId(null);
        return student;
    }
}
