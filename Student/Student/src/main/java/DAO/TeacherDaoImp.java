package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.Teacher;

@Repository
public class TeacherDaoImp implements TeacherDao {
	
   @PersistenceContext
    private EntityManager em;

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveTeacher(Teacher tech) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(tech);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Teacher> getTeacher() {
		Session  session = sessionFactory.getCurrentSession();
		Query<Teacher> query = session.createQuery("from Teacher",Teacher.class);
//		List<Teacher> tr = query.list();
//		Iterator itr = tr.iterator();
//		while(itr.hasNext()) {
//			Teacher t = (Teacher) itr.next();
//			System.out.println(t.getName());
//		}
		return query.list();
	}

	@Override
	public boolean delete(int id) {
		boolean status=false;
		Teacher teacher = new Teacher();
		teacher.setTeacher_id(id);
		try {
		sessionFactory.getCurrentSession().delete(teacher);
		status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean updateTeacher(Teacher tech) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(tech);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
