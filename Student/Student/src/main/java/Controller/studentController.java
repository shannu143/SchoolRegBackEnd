package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Student;
import Model.Teacher;
import Service.Student_Service;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/api")
public class studentController {
	
	@Autowired
	private Student_Service studentservice;
	
	@PostMapping("save-student")
	public boolean saveStudent(@RequestBody Student student) {
		 return studentservice.saveStudent(student);
		
	}
	
	@GetMapping("students-list")
	public List<Student> allstudents() {
		 return studentservice.getStudents();
	}
	
	
	@DeleteMapping("delete-student/{student_id}")
	public boolean deleteStudent(@PathVariable("student_id") int student_id,Student student) {
		student.setStudent_id(student_id);
		return studentservice.deleteStudent(student);
	}

	@GetMapping("student/{student_id}")
	public List<Student> allstudentByID(@PathVariable("student_id") int student_id,Student student) {
		 student.setStudent_id(student_id);
		 return studentservice.getStudentByID(student);
		
	}
	@GetMapping("t/{course_id}")
	public List<Teacher> allteachersbycourse(@PathVariable("course_id") int course_id){
		return studentservice.getTechByCourse(course_id);
	}
	@GetMapping("s/{course_id}/{teacher_id}")
	public List<Student> allteachersbycourse(@PathVariable("course_id") int course_id,@PathVariable("teacher_id") int teacher_id){
		return studentservice.getStudentByCaT(course_id,teacher_id);
	}
	
	@PostMapping("update-student/{student_id}")
	public boolean updateStudent(@RequestBody Student student,@PathVariable("student_id") int student_id) {
		student.setStudent_id(student_id);
		return studentservice.updateStudent(student);
	}
	
	@GetMapping("/Count")
	public List getstudentCountbycourse() {
		return studentservice.getStuByCour_cnt();
	}
}
