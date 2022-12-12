package ph.edu.sorsu.controller;

import java.util.List;

import ph.edu.sorsu.dao.teacherDAO;
import ph.edu.sorsu.dao.impl.teacherDAOImpl;
import ph.edu.sorsu.entity.Teacher;
import java.util.Scanner;

public class teacherController {
	private teacherDAO <Teacher> teacherDAO;
	private Scanner scanner;
	
	public teacherController(Scanner scanner) {
		this.teacherDAO = new teacherDAOImpl();
		this.scanner= scanner;
	
}
	public void createTeacher() {
		System.out.println("Fill up the subject form: ");
		
		System.out.println("Student ID: ");
		Long id = Long.parseLong(scanner.nextLine());
		
		System.out.println("Code: ");
		String code = scanner.nextLine();
		
		System.out.println("Description: ");
		String description = scanner.nextLine();
		
		System.out.println("Number of Units: ");
		Long.parseLong(scanner.nextLine());
		
		
		
		Teacher teacher = new Teacher();
		teacher.setId(id);
		teacher.setcode(code);
		teacher.setDescription(description);
		teacher.setNum_of_units(0);
		
		teacherDAO.create(teacher);
	 }
	public void displayTeacher() {
		System.out.println("To get the teacher record, provide the index position. ");
		System.out.println("Index Position: ");
		int indexPosition = Integer.parseInt(scanner.nextLine());
		
		teacherDAO.read(indexPosition);
	}

	public void updateStudent() {
		System.out.println("To uptade the student record, provide the index position. ");
		System.out.println("Index Position: ");
		int indexPosition = Integer.parseInt(scanner.nextLine());
		
		Teacher teacher = teacherDAO.read(indexPosition);
		teacherDAO.read(indexPosition);
		
		System.out.println("------------------Teacher Information------------------");
		System.out.println("Student ID: " + teacher.getId());
		System.out.println("Code: " + teacher.getCode());
		System.out.println("Description: " + teacher.getDescription());
		System.out.println("Number of Units: " + teacher.getNum_of_units());

		
		System.out.println( "Update the subject Information. ");
		
		System.out.println( "Student ID: " );
		Long.parseLong(scanner.nextLine());
		
		System.out.println( "Code: " );
		scanner.nextLine();
		
		System.out.println( "Description: " );
		scanner.nextLine();
		
		System.out.println( "Number of Units: " );
		Long.parseLong(scanner.nextLine());
		
		
		teacherDAO.update(indexPosition, teacher);
		
	}	

	public void deleteStudent() {
		System.out.println("To delete the subject record, provide the index position: ");
		System.out.println("Index Position: ");
		int indexPosition = Integer.parseInt(scanner.nextLine());
		
		teacherDAO.delete(indexPosition);
			
	}

	public void displayAllStudent() {
		List <Teacher> teacher = teacherDAO.readAll();
		teacherDAO.readAll();
		
		System.out.println(teacher);
		
	}

}
