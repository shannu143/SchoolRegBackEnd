package DAO;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.Student;
import Model.Teacher;

@Repository
public class Student_DAO_Imp  implements Student_DAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveStudent(Student student) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(student);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Student> getStudents() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Student> query=currentSession.createQuery("from Student", Student.class);
		List<Student> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteStudent(Student student) {
		boolean status=false;
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			Query<Student> query=currentSession.createQuery("from Student where student_id=:student_id", Student.class);
			query.setParameter("student_id", student.getStudent_id());
			List<Student> list=query.getResultList();
			Iterator<Student> itr=list.iterator(); 
			 while(itr.hasNext()){    
				 Student st =itr.next();  
				 currentSession.delete(st);
			 }
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Student> getStudentByID(Student student) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Student> query=currentSession.createQuery("from Student where student_id=:student_id", Student.class);
		query.setParameter("student_id", student.getStudent_id());
		List<Student> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateStudent(Student student) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(student);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Teacher> getecbycourse(int course_id) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Teacher where course_id=:course_id";
		Query<Teacher> query = session.createQuery(hql,Teacher.class);
		query.setParameter("course_id", course_id);
		List<Teacher> list = query.getResultList();
		return list;
	}

	@Override
	public List<Student> getstubycat(int course_id, int teacher_id) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Student where course_id=:course_id and teacher_id=:teacher_id";
		Query<Student> query = session.createQuery(hql,Student.class);
		query.setParameter("course_id", course_id);
		query.setParameter("teacher_id", teacher_id);
		List<Student> list = query.getResultList();
		return list;
	}

	@Override
	public List getStuByCour_cnt() {
		Session session = sessionFactory.getCurrentSession();
		SQLQuery query = session.createSQLQuery("select count(*),course_id from students group by course_id;");
		List rows = query.list();
//		for(Object[] row : rows){
//			 System.out.println(row[0]+""+row[1]);
//		 
//		 }
		return rows;
	}
	
	

}
