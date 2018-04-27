package camt.se234.lab11.dao;

import camt.se234.lab11.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    List<Student> students;
    public StudentDaoImpl(){
        students = new ArrayList<>();
        students.add(new Student("123","A","temp",2.33));
        students.add(new Student("5721105001","Prayuth","Kamsing",4.00));
        students.add(new Student("5821105002","Somluck","Kamsing",2.50));
        students.add(new Student("5821105003","Cherprang","Capt",3.50));
        students.add(new Student("5921105008","Job","Sung",1.25));
        students.add(new Student("6021155667","Hiroko","Basket",0.20));
    }

    @Override
    public List<Student> findAll() {
        return this.students;
    }
}
