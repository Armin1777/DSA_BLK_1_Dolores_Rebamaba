package ph.edu.sorsu.dao.impl;

import java.util.ArrayList;
import java.util.List;
import ph.edu.sorsu.entity.Student;
import ph.edu.sorsu.dao.studentDAO;

public class studentDAOImpl implements studentDAO<Student> {

private List<Student> listofstudents = new ArrayList<>();
    
    @Override
    public void create(Student entity) {
       		boolean IsAdded = listofstudents.add(entity);
        
        if(IsAdded) {
        	System.out.println( "[INFO] You have successfully added a new student. ");
        }else {
        	System.out.println("[ERROR] You have not suceessfully added a new stduent. ");
        	
        }
    }
    
    @Override
    public Student read(int indexPosition) {
		System.out.print("[INFO] Retieving student record from the list. ");
    	return listofstudents.get(indexPosition);
    	
    	
    }

	@Override
	public void update(int indexPosition, Student entity) {
		System.out.println("[INFO] Updating the student record in the list. ");
		listofstudents.remove(indexPosition);
		listofstudents.add(indexPosition, entity);
		System.out.println("[INFO] You have successfully update of the student");
		
	}

	@Override
	public void delete(int indexPosition) {
		System.out.println("[INFO] Deleting course record from the list. ");
		listofstudents.remove(indexPosition);
		System.out.println("[INFO] You have successfully deleted the course. ");
		
	}

	@Override
	public List<Student> readAll() {
		System.out.println("[INFO] Retrieving the list of students. ");
		System.out.println("[INFO]" + listofstudents.size() + "Teacher(s) found in your list. ");
		return listofstudents;
	
	}
}

    
    