package ph.edu.sorsu;

import java.util.Scanner;

import ph.edu.sorsu.controller.courseController;
import ph.edu.sorsu.controller.studentController;
import ph.edu.sorsu.controller.subjectController;
import ph.edu.sorsu.controller.teacherController;
import ph.edu.sorsu.controller.scheduleController;

public class App{

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		
		System.out.println("|-------------------------------------------|");
	    System.out.println("|    Sorsu Enrollment Management System     |");
	    System.out.println("|            version 1.0 - ALPHA            |");
	    System.out.println("|         by Armenius II M. Dolores         |");
	    System.out.println("|                      &                    |");
	    System.out.println("|             Rex Raul B. Rebamba           |");
	    System.out.println("|-------------------------------------------|");
	      
	      Scanner scanner = new Scanner(System.in);
	      
	    while(true) {
	      
	      System.out.println("---------------------------------------------");
	      System.out.println("Available Modules:");
	      System.out.println("    [1] Student   ");
	      System.out.println("    [2] Teacher   ");
	      System.out.println("    [3] Course    ");
	      System.out.println("    [4] Subject   ");
	      System.out.println("    [5] Schedule  ");
	      System.out.println("    [0] Exit Application  ");
	      System.out.println("----------------------------------------------");
	      System.out.print("Enter the module number to work on: ");
	      
	      
	      String scannerNumber = scanner.nextLine();
	      int scannedNumber= 
		  int selectedNumber = Integer.parseInt(scannedNumber);
	      
	      if (selectedNumber > 0 && selectedNumber <= 5) {
	        switch(selectedNumber) {
	          
	          case 1:
	           studentController studentController = new studentController(scanner);
	          do {
	            System.out.println("----------------------------------------");
	            System.out.println("Student Module Menu:      ");
	            System.out.println("    [1] Create Student    ");
	            System.out.println("    [2] Get Student       ");
	            System.out.println("    [3] Update Student    ");
	            System.out.println("    [4] Delete Student    ");
	            System.out.println("    [5] Get All Student   ");
	            System.out.println("    [0] Exit Application  ");
	            System.out.println("----------------------------------------");
	            
	            System.out.println("Enter the menu number to work on: ");
	            int selectStudent = Integer.parseInt(scanner.nextLine());
	            System.out.println("----------------------------------------");
	            
	            if (selectStudent == 1) {
	              studentController.createStudent();
	              
	            }else if(selectStudent == 2) {
	              studentController.displayStudent();
	              
	            }else if(selectStudent == 3) {
	              studentController.updateStudent();
	              
	            }else if(selectStudent == 4) {
	              studentController.deleteStudent();
	              
	            }else if(selectStudent == 5) {
	              studentController.displayAllStudent();
	              
	            }else if(selectStudent == 0) {
	              System.out.println("Exit this module. ");
	              break;
	              
	            }
	            
	          }while(selectedNumber > 0 && selectedNumber <= 5);
	          break;
	          
	          
	          case 2:
	           teacherController teacherController = new teacherController(scanner);
	          do {
	            System.out.println("----------------------------------------");
	            System.out.println("Teacher Module Menu:      ");
	            System.out.println("    [1] Create Teacher    ");
	            System.out.println("    [2] Get Teacher       ");
	            System.out.println("    [3] Update Teacher    ");
	            System.out.println("    [4] Delete Teacher    ");
	            System.out.println("    [5] Get All Teacher   ");
	            System.out.println("    [0] Exit Application  ");
	            System.out.println("----------------------------------------");
	            
	            System.out.println(" Enter the menu number to work on: ");
	            int selectTeacher = Integer.parseInt(scanner.nextLine());
	            System.out.println("----------------------------------------");
	            
	            if (selectTeacher == 1) {
	              teacherController.createTeacher();
	              
	            }else if(selectTeacher == 2) {
	              teacherController.displayTeacher();
	              
	            }else if(selectTeacher == 3) {
	              teacherController.updateStudent();
	              
	            }else if(selectTeacher == 4) {
	              teacherController.deleteStudent();
	              
	            }else if(selectTeacher == 5) {
	              teacherController.displayAllStudent();
	
	}else if(selectTeacher == 4) {
	              teacherController.deleteStudent();
	              
	            }else if(selectTeacher == 5) {
	              teacherController.displayAllStudent();
	              
	            }else if(selectTeacher == 0) {
	              System.out.println("Exit this module. ");
	              break;
	              
	            }
	            
	          }while(selectedNumber > 0 && selectedNumber <= 5);
	          break;
	          
	          case 3:
	          courseController courseController = new courseController(scanner);
	          do {
	            System.out.println("----------------------------------------");
	            System.out.println("Course Module Menu:       ");
	            System.out.println("    [1] Create Course     ");
	            System.out.println("    [2] Get Course        ");
	            System.out.println("    [3] Update Course     ");
	            System.out.println("    [4] Delete Course     ");
	            System.out.println("    [5] Get All Course    ");
	            System.out.println("    [0] Exit Application  ");
	            System.out.println("----------------------------------------");
	            
	            System.out.println(" Enter the menu number to work on: ");
	            int selectCourse = Integer.parseInt(scanner.nextLine());
	            System.out.println("----------------------------------------");
	           
	            int selectTeacher = 0;
				if (selectCourse == 1) {
	              courseController.createCourse();
	              
	            }else if(selectCourse == 2) {
	              courseController.displayCourse();
	              
	            }else if(selectCourse == 3) {
	              courseController.updateCourse();
	              
	            }else if(selectCourse == 4) {
	              courseController.deleteCourse();
	              
	            }else if(selectCourse == 5) {
	              courseController.displayAllCourse();
	              
	            }else if(selectTeacher == 0) {
	              System.out.println("Exit this module. ");
	              break;
	              
	            } 
	            
	          }while(selectedNumber > 0 && selectedNumber <= 5);
	          break;
	          
	          case 4:
	          subjectController subjectController = new subjectController(scanner);
	          do {
	            System.out.println("----------------------------------------");
	            System.out.println("Subject Module Menu:      ");
	            System.out.println("    [1] Create Subject    ");
	            System.out.println("    [2] Get Subject       ");
	            System.out.println("    [3] Update Subject    ");
	            System.out.println("    [4] Delete Subject    ");
	            System.out.println("    [5] Get All Subject   ");
	            System.out.println("    [0] Exit Application  ");
	            System.out.println("----------------------------------------");
	            
	            System.out.println(" Enter the menu number to work on: ");
	            int selectSubject = Integer.parseInt(scanner.nextLine());
	            System.out.println("----------------------------------------");
	           
	            if (selectSubject == 1) {
	              subjectController.createSubject();
	              
	            }else if(selectSubject == 2) {
	              subjectController.displaySubject();
	              
	            }else if(selectSubject == 3) {
	              subjectController.updateSubject();
	              
	            }else if(selectSubject == 4) {
	              subjectController.deleteSubject();
	              
	            }else if(selectSubject == 5) {
	              subjectController.displayAllSubject();
	              
	            }else if(selectSubject == 0) {
	              System.out.println("Exit this module. ");
	              break;
	            }
	            
	            }while(selectedNumber > 0 && selectedNumber <= 5);
	            break;
	          
	          case 5:
	          scheduleController scheduleController = new scheduleController(scanner);
	          do {
	            System.out.println("----------------------------------------");
	            System.out.println("Schedule Module Menu:     ");
	            System.out.println("    [1] Create Schedule   ");
	            System.out.println("    [2] Get Schedule      ");
	            System.out.println("    [3] Update Schedule   ");
	            System.out.println("    [4] Delete Schedule   ");
	            System.out.println("    [5] Get All Schedule  ");
	            System.out.println("    [0] Exit Application  ");
	            System.out.println("----------------------------------------");
	            
	            System.out.println(" Enter the menu number to work on: ");
	            int selectSchedule = Integer.parseInt(scanner.nextLine());
	            System.out.println("----------------------------------------");
	           
	            if (selectSchedule == 1) {
	              scheduleController.createSchedule();
	              
	            }else if(selectSchedule == 2) {
	
	}else if(selectSchedule == 3) {
	              scheduleController.updateSchedule();
	              
	            }else if(selectSchedule == 4) {
	              scheduleController.deleteSchedule();
	              
	            }else if(selectSchedule == 5) {
	              scheduleController.displayAllSchedule();
	              
	            }else if(selectSchedule == 0) {
	              System.out.println("Exit this module. ");
	              break;
	             
	          }
	          
	         
	        }while(selectedNumber > 0 && selectedNumber <= 5);
	          break;
	          
	        }
	           
	      }else if(selectedNumber == 0 ) {
	        System.out.println(" Good bye... ");
	        
	        
	      }
	      
	      
	     
	    }

	    }
	}
