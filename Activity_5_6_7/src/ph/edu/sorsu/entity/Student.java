package ph.edu.sorsu.entity;

public class Student {
 
	private long StudentId;
	private String fullName;
	private String middleName;
	private String lastName;
	private String birthDate;
	private String birthPlace;
	private long mobileNumber;
	private String emailAddress;
	private Course course;
	
	public long getStudentId() {
		return StudentId;
	}
	public void setStudentId(long StudentId) {
		this.StudentId= StudentId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName= fullName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName= middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName= lastName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate= birthDate;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace= birthPlace;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber= mobileNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course= course;
	}
}
