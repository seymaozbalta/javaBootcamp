package business;

import dataAccess.InstructorDao;

public class InstructorManager {
	private InstructorDao instructorDao;
	
	
	public InstructorManager(InstructorDao instructorDao) {
		super();
		this.instructorDao = instructorDao;
	}


	public void add() {
		//kurallar sonrası
		//instructorDao.add();
	}
}
