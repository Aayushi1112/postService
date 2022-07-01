package com.student.student.repository;


import com.student.student.dto.StudentMarks;
import com.student.student.entity.StudentMarksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface studentmarksrepository extends JpaRepository<StudentMarksEntity,Long> {


}
