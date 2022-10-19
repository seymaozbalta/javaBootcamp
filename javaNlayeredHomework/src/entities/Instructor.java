package entities;

public class Instructor {
	private int egitmenId;
	private String name;
	private String surname;
	
	public Instructor() {
		
	}

	public Instructor(int egitmenId, String name, String surname) {
		super();
		this.egitmenId = egitmenId;
		this.name = name;
		this.surname = surname;
	}

	public int getEgitmenId() {
		return egitmenId;
	}

	public void setEgitmenId(int egitmenId) {
		this.egitmenId = egitmenId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
}
