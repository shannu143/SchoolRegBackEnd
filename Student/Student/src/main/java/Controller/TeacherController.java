package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Teacher;
import Service.Teacher_Service;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/api/teacher")
public class TeacherController extends BaseController  {
	@Autowired
	private Teacher_Service techservice;
	
	
//	@PostMapping
//	public boolean saveTeacher(@RequestBody Teacher obj) {
//		return saveGeneric(obj);
//	 // return true;
//	}
	
	
	@PostMapping
	public boolean saveTeacher(@RequestBody Teacher obj) {
		 return techservice.saveTeacher(obj);
		
	}
	
	
	
	@GetMapping
	public List<Teacher> getTeacher(){
		 return techservice.getTeacher();
	}
	
	@DeleteMapping("/{teacher_id}")
	public boolean deleteTeacher(@PathVariable("teacher_id") int teacher_id) {
		return techservice.delete(teacher_id);
	}
	
	@PutMapping("/{teacher_id}")
	public boolean updateTeacher(@PathVariable("teacher_id") int teacher_id,@RequestBody Teacher tech) {
		tech.setTeacher_id(teacher_id);
		return techservice.updateTeacher(tech);
	}
	
}
