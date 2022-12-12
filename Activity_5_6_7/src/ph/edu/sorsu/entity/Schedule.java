package ph.edu.sorsu.entity;

public class Schedule {

	private long Id;
	private Subject subject;
	private Teacher teacher;
	private String timeStart;
	private String timeEnd;
	private String dayOfTheWeek;
	
	public long getId() {
		return Id;
	}
	public void setId(long Id) {
		this.Id= Id;
	}
	public Subject getsubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject= subject;
	}
	public Teacher getteacher() {
		return teacher;
	}
	public void setteacher(Teacher teacher) {
		this.teacher= teacher;
	}
	public String gettimeStart() {
		return timeStart;
	}
	public void settimeStart(String timeStart) {
		this.timeStart= timeStart;
	}
	public String gettimeEnd() {
		return timeEnd;
	}
	public void settimeEnd(String timeEnd) {
		this.timeEnd= timeEnd;
	}
	public String getdayOftheWeek() {
		return dayOfTheWeek;
	}
	public void setdayOfTheWeek(String dayOfTheWeek) {
		this.dayOfTheWeek= dayOfTheWeek;
	}
}
