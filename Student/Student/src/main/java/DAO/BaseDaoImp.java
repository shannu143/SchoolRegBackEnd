package DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDaoImp implements BaseDao {

	@Autowired
	public SessionFactory sessionFactory;
	@Override
	public boolean SaveData(Object obj) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(obj);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
