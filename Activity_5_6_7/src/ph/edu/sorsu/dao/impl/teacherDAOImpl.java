package ph.edu.sorsu.dao.impl;

import java.util.ArrayList;
import java.util.List;
import ph.edu.sorsu.dao.teacherDAO;
import ph.edu.sorsu.entity.Teacher;


public class teacherDAOImpl implements teacherDAO<Teacher> {
private List<Teacher> listofteachers = new ArrayList<>();
    
    
	@Override
	public void create(Teacher entity) {
    boolean IsAdded = listofteachers.add(entity);
        
        if(IsAdded) {
        	System.out.println( "[INFO] You have successfully added a new teacher. ");
        }else {
        	System.out.println("[ERROR] You have not suceessfully added a new teacher. ");
        	
        }
    }
    
    @Override
    public Teacher read(int indexPosition) {
		System.out.print("[INFO] Retieving student record from the list. ");
    	return listofteachers.get(indexPosition);
    	
    	
    }

	@Override
	public void update(int indexPosition, Teacher entity) {
		System.out.println("[INFO] Updating the student record in the list. ");
		listofteachers.remove(indexPosition);
		listofteachers.add(indexPosition, entity);
		System.out.println("[INFO] You have successfully update of the subjects");
		
	}

	@Override
	public void delete(int indexPosition) {
		System.out.println("[INFO] Deleting a teacher from the list. ");
		listofteachers.remove(indexPosition);
		System.out.println("[INFO] You have successfully deleted the teacher. ");
		
	}

	@Override
	public List<Teacher> readAll() {
		System.out.println("[INFO] Retrieving the list of teachers. ");
		System.out.println("[INFO]" + listofteachers.size() + "Teacher(s) found in your list. ");
		return listofteachers;
	
	}
}
