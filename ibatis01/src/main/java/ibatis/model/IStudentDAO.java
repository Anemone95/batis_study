package ibatis.model;

import java.util.List;

public interface IStudentDAO {
    public void addStudent(Student student);
    public void addStudentBySequence(Student student);
    public int deleteStudentById(int id);
    public void updateStudent(Student student);
    public List<Student> queryAllStudent();
    public List<Student> queryStudentByName(String name);
    public Student queryStudentById(int id);
}
