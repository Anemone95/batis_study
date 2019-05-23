package ibatis.model;

import java.sql.Date;
import java.util.List;

public class main {
    public static void main(String[] args) {
        IStudentDAO dao=new IStudentDAOImpl();
        Student s=new Student();
        s.setScore(99);
//        s.setSid(100);
        s.setMajor("Game");
        s.setSname("Lili");
        s.setBirth(Date.valueOf("2008-08-08"));
        dao.addStudent(s);
        List<Student> students=dao.queryAllStudent();
        for ( Student stu: students) {
            System.out.println(stu);
        }

//        Student lili=dao.queryStudentById(100);
//        System.out.println(lili);

//        dao.deleteStudentById(100);

//        Student s1=new Student();
//        s1.setScore(98);
//        s1.setSid(100);
//        s1.setMajor("Game");
//        s1.setSname("Lili");
//        s1.setBirth(Date.valueOf("2008-08-08"));
//        dao.updateStudent(s1);
        List<Student> students2=dao.queryStudentByName("li");
        System.out.println(students2);
    }
}
