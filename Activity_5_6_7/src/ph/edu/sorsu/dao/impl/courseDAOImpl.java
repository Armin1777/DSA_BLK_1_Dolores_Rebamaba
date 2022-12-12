package ph.edu.sorsu.dao.impl;

import java.util.ArrayList;
import java.util.List;
import ph.edu.sorsu.entity.Course;
import ph.edu.sorsu.dao.courseDAO;

public class courseDAOImpl implements courseDAO<Course> {
    private List<Course> listOfCourses = new ArrayList<>();
    
    @Override
    public void create(Course entity) {
       		boolean IsAdded = listOfCourses.add(entity);
        
        if(IsAdded) {
        	System.out.println( "[INFO] You have successfully added a new course. ");
        }else {
        	System.out.println("[ERROR] You have not suceessfully added a new course. ");
        	
        }
    }
    
    @Override
    public Course read(int indexPosition) {
		System.out.print("[INFO] Retieving course record from the list. ");
    	return listOfCourses.get(indexPosition);
    	
    	
    }

	@Override
	public void update(int indexPosition, Course entity) {
		System.out.println("[INFO] Updating the course record in the list. ");
		listOfCourses.remove(indexPosition);
		listOfCourses.add(indexPosition, entity);
		System.out.println("[INFO] You have successfully update of the courses");
		
	}

	@Override
	public void delete(int indexPosition) {
		System.out.println("[INFO] Deleting course record from the list. ");
		listOfCourses.remove(indexPosition);
		System.out.println("[INFO] You have successfully deleted the course. ");
		
	}

	@Override
	public List<Course> readAll() {
		System.out.println("[INFO] Retrieving the list of course. ");
		System.out.println("[INFO]" + listOfCourses.size() + "Teacher(s) found in your list. ");
		return listOfCourses;
	
	}

}
