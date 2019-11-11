package Model;

public enum CourseEnum {
	
		   JAVA(1), NODEJS(2),SPRING(3),ANGULAR(4),HIBERNATE(5);
		
	private int numVal;

	CourseEnum(int numVal) {
        this.numVal = numVal;
    }

    public int getCourseEnumVal() {
        return numVal;
    }
}
