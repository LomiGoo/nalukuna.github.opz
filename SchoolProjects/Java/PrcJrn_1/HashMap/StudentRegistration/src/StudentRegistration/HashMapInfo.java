package StudentRegistration;
import java.util.HashMap;

public class HashMapInfo {
	static HashMap<Long, StudentInfo> student = new HashMap<>();
	static Main info = new Main();
	static long studentID = 136743130000L;
	
	static void storeInfo() {
	    student.put(
	        studentID, 
	        new StudentInfo(info.fname, info.lname, info.age, info.year, info.section)
	        );
	    studentID++;
	}
}