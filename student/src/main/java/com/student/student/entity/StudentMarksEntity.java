package com.student.student.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class StudentMarksEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stdId;
    private String marks;
    @OneToOne
    StudentInfoEntity studentInfoEntity;
}
