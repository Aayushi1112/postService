package com.student.student.repository;


import com.student.student.dto.StudentInfo;
import com.student.student.entity.StudentInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfoEntity,Long> {


   Optional<StudentInfoEntity> findByStdId(int stdId);
}
