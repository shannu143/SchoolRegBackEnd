package DAO;


import java.util.List;

import Model.Teacher;

public interface TeacherDao {
	public boolean saveTeacher(Teacher tech);
	public List<Teacher> getTeacher();
	public boolean delete(int teacher_id);
	public boolean updateTeacher(Teacher tech);
}
