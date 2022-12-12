package ph.edu.sorsu.controller;

import java.util.List;
import java.util.Scanner;
import ph.edu.sorsu.dao.courseDAO;
import ph.edu.sorsu.dao.impl.courseDAOImpl;
import ph.edu.sorsu.entity.Course;

public class courseController {
	private courseDAO <Course> courseDAO;
	private Scanner scanner;
	
	public courseController(Scanner scanner) {
		this.courseDAO =  new courseDAOImpl();
		this.scanner = scanner;
		
	}
	
public void createCourse() {
	System.out.println("Fill up the course form: ");
	
	System.out.println("ID: ");
	Long id = Long.parseLong(scanner.nextLine());
	
	System.out.println("Code: ");
	String code = scanner.nextLine();
	
	System.out.println("Description: ");
	String description= scanner.nextLine();
	
	Course course = new Course();
	course.setId(id);
	course.setcode(code);
	course.setDescription(description);
	
	courseDAO.create(course);
 }
public void displayCourse() {
	System.out.println("To get the course record, provide the index position. ");
	System.out.println("Index Position: ");
	int indexPosition = Integer.parseInt(scanner.nextLine());
	
	courseDAO.read(indexPosition);
}

public void updateCourse() {
	System.out.println("To uptade the course reocrd, provide the index position. ");
	System.out.println("Index Position: ");
	int indexPosition = Integer.parseInt(scanner.nextLine());
	
	Course course = courseDAO.read(indexPosition);
	courseDAO.read(indexPosition);
	
	System.out.println("------------------Course Information------------------");
	System.out.println("ID:" + course.getId());
	System.out.println("Code" + course.getCode());
	System.out.println("Description: " + course.getDescription());
	
	System.out.println( "Update the course Information. ");
	
	System.out.println( "ID: " );
	Long.parseLong(scanner.nextLine());
	
	System.out.println( "Code: " );
	scanner.nextLine();
	
	System.out.println( "Description: " );
	scanner.nextLine();
	
	courseDAO.update(indexPosition, course);
	
}	

public void deleteCourse() {
	System.out.println("To delete the course record, provide the index position: ");
	System.out.println("Index Position: ");
	int indexPosition = Integer.parseInt(scanner.nextLine());
	
	courseDAO.delete(indexPosition);
		
}

public void displayAllCourse() {
	List <Course> course = courseDAO.readAll();
	courseDAO.readAll();
	
	System.out.println(course);
	
}

}


