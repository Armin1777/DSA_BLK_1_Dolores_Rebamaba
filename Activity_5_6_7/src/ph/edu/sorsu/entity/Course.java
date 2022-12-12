package ph.edu.sorsu.entity;

public class Course {

	private long Id;
	private String code;
	private String description;
	
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
}
