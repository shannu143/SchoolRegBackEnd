package Model;

public class Main {
	

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		System.out.println(CourseEnum.values());
		CourseEnum[] x = CourseEnum.values();
		for(CourseEnum sig: x) {
			System.out.println(sig);
		}
	}

}
