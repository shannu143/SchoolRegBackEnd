package Service;

import java.util.List;

import Model.Teacher;

public interface Teacher_Service {
	public boolean saveTeacher(Teacher tech);
	public List<Teacher> getTeacher();
	public boolean delete(int student_id);
	public boolean updateTeacher(Teacher tech);
}
