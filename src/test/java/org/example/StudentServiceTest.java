package org.example;

import junit.framework.TestCase;
import org.junit.Test;
import java.util.List;

public class StudentServiceTest extends TestCase {

    @Test
    public void testGetAllStudents() {
        StudentService studentService = new StudentService();
       //Student student = new Student(32,"Ditebogo Tlhakola");
        //studentService.addStudent(student);

        List<Student> studentList = studentService.getAllStudents();

        boolean actualResults = studentList.isEmpty();

        assertNotNull(studentList);
        assertTrue(actualResults);

    }

    @Test
    public void testAddStudent() {
        StudentService studentService = new StudentService();


    }
}