package javaNlayeredHomework;

import business.CourseManager;
import dataAccess.JdbcCourseDao;
import entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		//ürün eklendi
		Course course1=new Course("Java","Engin Demiroğ",10,0);
		//iş kuralına uyuyor mu diye kontrol
		CourseManager courseManager=new CourseManager(new JdbcCourseDao());
		courseManager.add(course1);

	}

}//burada kaldım 1.19
