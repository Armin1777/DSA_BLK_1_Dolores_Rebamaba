package ph.edu.sorsu.controller;

import java.util.List;
import java.util.Scanner;
import ph.edu.sorsu.dao.studentDAO;
import ph.edu.sorsu.dao.impl.studentDAOImpl;
import ph.edu.sorsu.entity.Student;


public class studentController {
	private studentDAO <Student> studentDAO;
	private Scanner scanner;
	
	public studentController(Scanner scanner) {
		this.studentDAO = new studentDAOImpl();
		this.scanner= scanner;
		
	}
	public void createStudent() {
		System.out.println("Fill up the course form: ");
		
		System.out.println("Student ID: ");
		Long id = Long.parseLong(scanner.nextLine());
		
		System.out.println("Full Name: ");
		String fullname = scanner.nextLine();
		
		System.out.println("Middle Name: ");
		String middlename = scanner.nextLine();
		
		System.out.println("Last Name: ");
		String lastname = scanner.nextLine();
		
		System.out.println("Birth Date: ");
		String birthDate = scanner.nextLine();
		
		System.out.println("Birth Place: ");
		String birthPlace = scanner.nextLine();
		
		
		
		Student student = new Student();
		student.setStudentId(id);
		student.setFullName(fullname);
		student.setMiddleName(middlename);
		student.setLastName(lastname);
		student.setBirthDate(birthDate);
		student.setBirthPlace(birthPlace);
		
		studentDAO.create(student);
	 }
	public void displayStudent() {
		System.out.println("To get the student record, provide the index position. ");
		System.out.println("Index Position: ");
		int indexPosition = Integer.parseInt(scanner.nextLine());
		
		studentDAO.read(indexPosition);
	}

	public void updateStudent() {
		System.out.println("To uptade the student record, provide the index position. ");
		System.out.println("Index Position: ");
		int indexPosition = Integer.parseInt(scanner.nextLine());
		
		Student student = studentDAO.read(indexPosition);
		studentDAO.read(indexPosition);
		
		System.out.println("------------------Student Information------------------");
		System.out.println("Student ID: " + student.getStudentId());
		System.out.println("Full Name: " + student.getFullName());
		System.out.println("Middle Name:  " + student.getMiddleName());
		System.out.println("Last Name:  " + student.getLastName());
		System.out.println("Birth Date:  " + student.getBirthDate());
		System.out.println("Birth Place:  " + student.getBirthPlace());
		
		System.out.println( "Update the student Information. ");
		
		System.out.println( "Student ID: " );
		Long.parseLong(scanner.nextLine());
		
		System.out.println( "Full Name: " );
		scanner.nextLine();
		
		System.out.println( "Middle Name: " );
		scanner.nextLine();
		
		System.out.println( "Last Name: " );
		scanner.nextLine();
		
		System.out.println( "Birth Date: " );
		scanner.nextLine();
		
		System.out.println( "Birth Place: " );
		scanner.nextLine();
		
		studentDAO.update(indexPosition, student);
		
	}	

	public void deleteStudent() {
		System.out.println("To delete the student record, provide the index position: ");
		System.out.println("Index Position: ");
		int indexPosition = Integer.parseInt(scanner.nextLine());
		
		studentDAO.delete(indexPosition);
			
	}

	public void displayAllStudent() {
		List <Student> student = studentDAO.readAll();
		studentDAO.readAll();
		
		System.out.println(student);
		
	}

}
