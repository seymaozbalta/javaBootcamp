package dataAccess;

import entities.Course;

public class JdbcCourseDao implements CourseDao{
	//kurallarda bir sıkıntı yoksa eklenir
	public void add(Course course) {
		System.out.println("JDBC ile eklendi");
	}
	public void remove() {
		System.out.println("Silindi");
	}
	
}
