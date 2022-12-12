package ph.edu.sorsu.controller;


import java.util.List;
import java.util.Scanner;
import ph.edu.sorsu.entity.Schedule;
import ph.edu.sorsu.dao.scheduleDAO;
import ph.edu.sorsu.dao.impl.scheduleDAOImpl;
import ph.edu.sorsu.entity.Teacher;
import ph.edu.sorsu.entity.Subject;


public class scheduleController {
	private scheduleDAO <Schedule> scheduleDAO;
	private Scanner scanner;
	
	public scheduleController(Scanner scanner) {
		this.scheduleDAO = new scheduleDAOImpl();
		this.scanner = scanner;
		
	}
	
	public void createSchedule() {
		System.out.println("Fill up the schedule form: ");
		
		System.out.println("ID: ");
		Long id = Long.parseLong(scanner.nextLine());
		
		System.out.println("Subject: ");
		Subject subject = new Subject();
		subject.setSubject(scanner.nextLine());
		
		System.out.println("Teacher: ");
		Teacher teacher = new Teacher();
		teacher.setTeacher(scanner.nextLine());
		
		System.out.println("Time Start: ");
		String timeStart = scanner.nextLine();
		
		
		System.out.println("Time End: ");
		String timeEnd = scanner.nextLine();
		
		System.out.println("Day of the week: ");
		String dayOfTheWeek = scanner.nextLine();
		
		Schedule schedule = new Schedule();
		schedule.setId(id);
		schedule.setSubject(subject);
		schedule.setteacher(teacher);
		schedule.settimeStart(timeStart);
		schedule.settimeEnd(timeEnd);
		schedule.setdayOfTheWeek(dayOfTheWeek);
		
		scheduleDAO.create(schedule);
	 }
	
	public void displaySchedule() {
		System.out.println("To get the schedule record, provide the index position. ");
		System.out.println("Index Position: ");
		int indexPosition = Integer.parseInt(scanner.nextLine());
		
		scheduleDAO.read(indexPosition);
	}

	public void updateSchedule() {
		System.out.println("To uptade the schedule record, provide the index position. ");
		System.out.println("Index Position: ");
		int indexPosition = Integer.parseInt(scanner.nextLine());
		
		Schedule schedule = scheduleDAO.read(indexPosition);
		scheduleDAO.read(indexPosition);
		
		System.out.println("------------------Schedule Information------------------");
		System.out.println("ID: " + schedule.getId());
		System.out.println("Subject: " + schedule.getsubject());
		System.out.println("Teacher: " + schedule.getteacher());
		System.out.println("Time start: " + schedule.gettimeStart());
		System.out.println("Time end: " + schedule.gettimeEnd());
		
		System.out.println( "Update the course Information. ");
		
		System.out.println( "ID: " );
		Long.parseLong(scanner.nextLine());
		
		System.out.println( "Subject: " );
		scanner.nextLine();
		
		System.out.println( "Teacher: " );
		scanner.nextLine();
		
		System.out.println( "Time start: " );
		scanner.nextLine();
		
		System.out.println( "Time end: " );
		scanner.nextLine();
		
		scheduleDAO.update(indexPosition, schedule);
		
	}	

	public void deleteSchedule() {
		System.out.println("To delete the course record, provide the index position: ");
		System.out.println("Index Position: ");
		int indexPosition = Integer.parseInt(scanner.nextLine());
		
		scheduleDAO.delete(indexPosition);
			
	}

	public void displayAllSchedule() {
		List <Schedule> course = scheduleDAO.readAll();
		scheduleDAO.readAll();
		
		System.out.println(course);
		
	}


}
