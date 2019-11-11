package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.BaseDao;

@Service
@Transactional
public class BaseServiceImp implements BaseService{

	@Autowired
	public BaseDao baseDao;
	
	@Override
	public boolean SaveData(Object obj) {
		return this.baseDao.SaveData(obj);
	}

}
