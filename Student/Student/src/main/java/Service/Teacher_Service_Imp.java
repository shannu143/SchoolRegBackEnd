package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.TeacherDao;
import Model.Teacher;

@Service
@Transactional
public class Teacher_Service_Imp implements Teacher_Service {
	
	@Autowired
	private TeacherDao teachDao;
	
	@Override
	public boolean saveTeacher(Teacher tech) {
		return teachDao.saveTeacher(tech);
	}

	@Override
	public List<Teacher> getTeacher() {
		
		return teachDao.getTeacher();
	}

	@Override
	public boolean delete(int teacher_id) {
		// TODO Auto-generated method stub
		return teachDao.delete(teacher_id);
	}

	@Override
	public boolean updateTeacher(Teacher tech) {
		// TODO Auto-generated method stub
		return teachDao.updateTeacher(tech);
	}

}
