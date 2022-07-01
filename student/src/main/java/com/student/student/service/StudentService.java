package com.student.student.service;

import com.student.student.dto.StudentInfo;
import com.student.student.dto.StudentMarks;
import com.student.student.entity.StudentInfoEntity;
import com.student.student.entity.StudentMarksEntity;
import com.student.student.repository.StudentInfoRepository;
import com.student.student.repository.studentmarksrepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class StudentService {
    @Autowired
    StudentInfoRepository studentInfoRepository;

    @Autowired
    studentmarksrepository studentMarksrepository;
    public String saveInfo(StudentInfo studentInfo) {
        StudentInfoEntity se=new StudentInfoEntity();
        BeanUtils.copyProperties(studentInfo,se);
        se=studentInfoRepository.save(se);

        return "saved";
    }


    public String saveMarks(StudentMarks studentMarks) throws Exception {
        Optional<StudentInfoEntity> se=studentInfoRepository.findByStdId(studentMarks.getStdId());
        if(se.isPresent()){
            StudentMarksEntity sm=new StudentMarksEntity();
            BeanUtils.copyProperties(studentMarks,sm);
            sm=studentMarksrepository.save(sm);

            StudentInfoEntity sie=new StudentInfoEntity();
            sie=se.get();
            sie.setStudentMarksEntity(sm);
            sie=studentInfoRepository.save(sie);
        }
        else{
            throw new Exception("no student found");
        }


        return "saved";
    }
}
