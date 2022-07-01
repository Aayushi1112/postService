package com.student.student.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class StudentInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stdId;
    private String stdName;
    @OneToOne
    StudentMarksEntity studentMarksEntity;
}
