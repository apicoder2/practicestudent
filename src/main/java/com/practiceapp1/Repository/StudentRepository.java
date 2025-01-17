package com.practiceapp1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practiceapp1.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
