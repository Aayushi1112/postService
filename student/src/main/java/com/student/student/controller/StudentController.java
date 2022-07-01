package com.student.student.controller;

import com.student.student.dto.StudentInfo;
import com.student.student.dto.StudentMarks;
import com.student.student.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private StudentService studentService;

    @PostMapping("/details")
    public ResponseEntity<String> saveInfo(@RequestBody StudentInfo studentInfo) {
        String studentInfoSaved = studentService.saveInfo(studentInfo);
        return new ResponseEntity<>(studentInfoSaved, HttpStatus.CREATED);
    }
    @PostMapping("/marks")
    public ResponseEntity<String> saveMarks(@RequestBody StudentMarks studentMarks) throws Exception {
        String studentInfoSaved = studentService.saveMarks(studentMarks);
        return new ResponseEntity<>(studentInfoSaved, HttpStatus.CREATED);
    }

}
