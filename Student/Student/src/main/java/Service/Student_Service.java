package Service;

import java.util.List;

import Model.Student;
import Model.Teacher;

public interface Student_Service {

	
	public boolean saveStudent(Student student);
	public List<Student> getStudents();
	public boolean deleteStudent(Student student);
	public List<Student> getStudentByID(Student student);
	public boolean updateStudent(Student student);
	public List<Teacher> getTechByCourse(int course_id);
	public List<Student> getStudentByCaT(int course_id, int teacher_id);
	public List getStuByCour_cnt();
}
