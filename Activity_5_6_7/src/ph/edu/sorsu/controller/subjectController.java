package ph.edu.sorsu.controller;

import java.util.List;
import ph.edu.sorsu.dao.subjectDAO;
import ph.edu.sorsu.entity.Subject;
import ph.edu.sorsu.dao.impl.subjectDAOImpl;
import java.util.Scanner;

public class subjectController {
	private subjectDAO <Subject> subjectDAO;
	private Scanner scanner;
	
	public subjectController(Scanner scanner) {
		this.subjectDAO = new subjectDAOImpl();
		this.scanner= scanner;
	
}
	public void createSubject() {
		System.out.println("Fill up the subject form: ");
		
		System.out.println("Student ID: ");
		Long id = Long.parseLong(scanner.nextLine());
		
		System.out.println("Code: ");
		String code = scanner.nextLine();
		
		System.out.println("Description: ");
		String description = scanner.nextLine();
		
		System.out.println("Number of Units: ");
		Long.parseLong(scanner.nextLine());
		
		
		
		Subject subject = new Subject();
		subject.setId(id);
		subject.setcode(code);
		subject.setDescription(description);
		subject.setNum_of_units(0);
		
		subjectDAO.create(subject);
	 }
	public void displaySubject() {
		System.out.println("To get the student record, provide the index position. ");
		System.out.println("Index Position: ");
		int indexPosition = Integer.parseInt(scanner.nextLine());
		
		subjectDAO.read(indexPosition);
	}

	public void updateSubject() {
		System.out.println("To uptade the student record, provide the index position. ");
		System.out.println("Index Position: ");
		int indexPosition = Integer.parseInt(scanner.nextLine());
		
		Subject subject = subjectDAO.read(indexPosition);
		subjectDAO.read(indexPosition);
		
		System.out.println("------------------Subject Information------------------");
		System.out.println("Student ID: " + subject.getId());
		System.out.println("Code: " + subject.getCode());
		System.out.println("Description: " + subject.getDescription());
		System.out.println("Number of Units: " + subject.getNum_of_units() );

		
		System.out.println( "Update the subject Information. ");
		
		System.out.println( "Student ID: " );
		Long.parseLong(scanner.nextLine());
		
		System.out.println( "Code: " );
		scanner.nextLine();
		
		System.out.println( "Description: " );
		scanner.nextLine();
		
		System.out.println( "Number of Units: " );
		Long.parseLong(scanner.nextLine());
		
		
		subjectDAO.update(indexPosition, subject);
		
	}	

	public void deleteSubject() {
		System.out.println("To delete the subject record, provide the index position: ");
		System.out.println("Index Position: ");
		int indexPosition = Integer.parseInt(scanner.nextLine());
		
		subjectDAO.delete(indexPosition);
			
	}

	public void displayAllSubject() {
		List <Subject> subject = subjectDAO.readAll();
		subjectDAO.readAll();
		
		System.out.println(subject);
		
	}

}
