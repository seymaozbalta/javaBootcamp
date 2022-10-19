package business;



import dataAccess.InstructorDao;
import entities.Instructor;
import javaNlayeredHomework.core.logging.Logger;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	
	public InstructorManager(InstructorDao instructorDao,Logger[] loggers) {
		
		this.instructorDao = instructorDao;
		this.loggers=loggers;
	}


	public void add(Instructor instructor) {
		//kurallar sonrası
		//instructorDao.add();
	}
}
