package ph.edu.sorsu.entity;

public class Teacher {

	private long Id;
	private String code;
	private String description;
	private long Num_of_units;
	private Course course;
	
	public long getId() {
		return Id;
	}
	public void setId(long Id) {
		this.Id= Id;
	}
	public String getCode() {
		return code;
	}
	public void setcode(String code) {
		this.code= code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description= description;
	}
	public long getNum_of_units() {
		return Num_of_units;
	}
	public void setNum_of_units(long Num_of_units) {
		this.Num_of_units= Num_of_units;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course= course;
	}
	public void setTeacher(String nextLine) {
		// TODO Auto-generated method stub
		
	}
}
