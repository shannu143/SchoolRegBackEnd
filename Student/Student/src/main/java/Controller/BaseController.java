package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import Model.Teacher;
import Service.BaseService;

@RestController
public class BaseController {

	
	@Autowired
	public BaseService base_ser;
	
	
	public boolean saveGeneric(Object obj) {
		System.out.println(obj.getClass());
		//return this.base_ser.SaveData(obj);
		return true;
	}
}
