package com.pt.st.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pt.st.entity.Student;

@Repository
public interface StudRepository extends JpaRepository<Student,Long> {

}
