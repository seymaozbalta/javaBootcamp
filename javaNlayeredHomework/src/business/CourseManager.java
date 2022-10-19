package business;





import dataAccess.CourseDao;
import dataAccess.JdbcCourseDao;
import entities.Course;
import javaNlayeredHomework.core.logging.Logger;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao,Logger[] loggers) {
		
		this.courseDao = courseDao;
		this.loggers=loggers;
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
		
		for(Logger logger: loggers) {
			logger.log(course.getCourseName());
		}
	}
}
