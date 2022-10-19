package business;

import dataAccess.CourseDao;
import dataAccess.JdbcCourseDao;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;

	
	public CourseManager(CourseDao courseDao) {
		
		this.courseDao = courseDao;
	}


	public void add(Course course) throws Exception {
		//iş kuralları
		if(course.getPrice()<=0) {
			throw new Exception("Fiyat 0 dan küçük olamaz");
		}
		//kurs ismi tekrar edemez
		//iften geçtiyse kabul
		//hibernate için aynı şekilde o newlenir ancak bağımlı olunmuş olur.
		//Bunun için base bir sınıf oluşturulup ordan implement edilir
		//interface yapılır
		//--
		//JdbcCourseDao courseDao=new JdbcCourseDao();
		//CourseDao courseDao=new JdbcCourseDao();
		
		courseDao.add(course);//şimdi maine
	}
}
