package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.Student_DAO;
import Model.Student;
import Model.Teacher;

@Service
@Transactional
public class Student_Service_Imp implements Student_Service {
 
	@Autowired
	private Student_DAO studentdao;
	
	@Override
	public boolean saveStudent(Student student) {
		return studentdao.saveStudent(student);
	}

	@Override
	public List<Student> getStudents() {
		return studentdao.getStudents();
	}

	@Override
	public boolean deleteStudent(Student student) {
		return studentdao.deleteStudent(student);
	}

	@Override
	public List<Student> getStudentByID(Student student) {
		return studentdao.getStudentByID(student);
	}

	@Override
	public boolean updateStudent(Student student) {
		return studentdao.updateStudent(student);
	}

	@Override
	public List<Teacher> getTechByCourse(int course_id) {
		return studentdao.getecbycourse(course_id);
	}

	@Override
	public List<Student> getStudentByCaT(int course_id, int teacher_id) {
		return studentdao.getstubycat(course_id,teacher_id);
	}

	@Override
	public List getStuByCour_cnt() {
		// TODO Auto-generated method stub
		return studentdao.getStuByCour_cnt();
	}

}
