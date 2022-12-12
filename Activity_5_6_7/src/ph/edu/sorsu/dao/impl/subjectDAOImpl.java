package ph.edu.sorsu.dao.impl;

import java.util.ArrayList;
import java.util.List;
import ph.edu.sorsu.entity.Subject;
import ph.edu.sorsu.dao.subjectDAO;

public class subjectDAOImpl implements subjectDAO<Subject> {
	
private List<Subject> listofsubjects = new ArrayList<>();
    
    @Override
    public void create(Subject entity) {
       		boolean IsAdded = listofsubjects.add(entity);
        
        if(IsAdded) {
        	System.out.println( "[INFO] You have successfully added a new subject. ");
        }else {
        	System.out.println("[ERROR] You have not suceessfully added a new subject. ");
        	
        }
    }
    
    @Override
    public Subject read(int indexPosition) {
		System.out.print("[INFO] Retieving student record from the list. ");
    	return listofsubjects.get(indexPosition);
    	
    	
    }

	@Override
	public void update(int indexPosition, Subject entity) {
		System.out.println("[INFO] Updating the student record in the list. ");
		listofsubjects.remove(indexPosition);
		listofsubjects.add(indexPosition, entity);
		System.out.println("[INFO] You have successfully update of the subjects");
		
	}

	@Override
	public void delete(int indexPosition) {
		System.out.println("[INFO] Deleting a subject from the list. ");
		listofsubjects.remove(indexPosition);
		System.out.println("[INFO] You have successfully deleted the subject. ");
		
	}

	@Override
	public List<Subject> readAll() {
		System.out.println("[INFO] Retrieving the list of subjects. ");
		System.out.println("[INFO]" + listofsubjects.size() + "Teacher(s) found in your list. ");
		return listofsubjects;
	
	}
}


