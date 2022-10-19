package javaNlayeredHomework;



import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCourseDao;
import dataAccess.JdbcInstructorDao;
import entities.Categories;
import entities.Course;
import entities.Instructor;
import javaNlayeredHomework.core.logging.DatabaseLogger;
import javaNlayeredHomework.core.logging.FileLogger;
import javaNlayeredHomework.core.logging.Logger;

public class Main {

	public static void main(String[] args) throws Exception {
		//ürün eklendi
		Logger[] loggers= {new DatabaseLogger(),new FileLogger()};
		Course course1=new Course("Java","Engin Demiroğ",10,50);
		//iş kuralına uyuyor mu diye kontrol
		CourseManager courseManager=new CourseManager(new JdbcCourseDao(),loggers);
		courseManager.add(course1);
		
		
		//kategori ekleme
		Categories category1= new Categories("Programlama");
		
		CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager.add(category1);
		
		//eğitmen ekleme
		Instructor instructor1=new Instructor(1,"Engin","Demiroğ");
		
		InstructorManager instructorManager=new InstructorManager(new JdbcInstructorDao(),loggers);
		instructorManager.add(instructor1);

	}

}//burada kaldım 1.19
