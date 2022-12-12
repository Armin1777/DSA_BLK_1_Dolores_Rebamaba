package ph.edu.sorsu.dao.impl;

import java.util.ArrayList;
import java.util.List;

import ph.edu.sorsu.entity.Schedule;
import ph.edu.sorsu.dao.scheduleDAO;


public class scheduleDAOImpl implements scheduleDAO<Schedule> {

private List<Schedule> listofschedules = new ArrayList<>();
    
@Override
public void create(Schedule entity) {
   		boolean IsAdded = listofschedules.add(entity);
    
    if(IsAdded) {
    	System.out.println( "[INFO] You have successfully added a new schedule. ");
    }else {
    	System.out.println("[ERROR] You have not suceessfully added a new schedule. ");
    	
    }
}

@Override
public Schedule read(int indexPosition) {
	System.out.print("[INFO] Retieving schedule record from the list. ");
	return listofschedules.get(indexPosition);
	
	
}

@Override
public void update(int indexPosition, Schedule entity) {
	System.out.println("[INFO] Updating the schedule record in the list. ");
	listofschedules.remove(indexPosition);
	listofschedules.add(indexPosition, entity);
	System.out.println("[INFO] You have successfully update of the courses");
	
}

@Override
public void delete(int indexPosition) {
	System.out.println("[INFO] Deleting course record from the list. ");
	listofschedules.remove(indexPosition);
	System.out.println("[INFO] You have successfully deleted the course. ");
	
}

@Override
public List<Schedule> readAll() {
	System.out.println("[INFO] Retrieving the list of course. ");
	System.out.println("[INFO]" + listofschedules.size() + "Teacher(s) found in your list. ");
	return listofschedules;

}
}
