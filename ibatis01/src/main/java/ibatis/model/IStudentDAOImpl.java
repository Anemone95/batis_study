package ibatis.model;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

public class IStudentDAOImpl implements IStudentDAO {
    private static SqlMapClient sqlMapClient=null;
    static {
        Reader reader;
        try {
            reader = Resources.getResourceAsReader("SqlMapConfig.xml");
            sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addStudent(Student student) {
        try {
            sqlMapClient.insert("insertStudent", student);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void addStudentBySequence(Student student) {

    }

    public int deleteStudentById(int id) {
        int rows = 0;
        try {
            rows=sqlMapClient.delete("deleteStudentById", id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    public void updateStudent(Student student) {
        try {
            sqlMapClient.update("updateStudent", student);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Student> queryAllStudent() {
        List<Student> students = null;
        try {
            students=sqlMapClient.queryForList("selectAllStudent"); //xml标签里面写的id
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public List<Student> queryStudentByName(String name) {
        List<Student> students = null;
        try {
            students=sqlMapClient.queryForList("selectStudentByName", name); //xml标签里面写的id
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public Student queryStudentById(int id) {
        Student student = null;
        try {
            student= (Student) sqlMapClient.queryForObject("selectStudentById", id); //xml标签里面写的id
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }
}
