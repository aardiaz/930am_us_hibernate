package appsoft.mavendemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Test {
	
	public static void main(String[] args) {
		add();
	}
	
	//add student
	static void add() {
		
		SessionFactory  sf = new Configuration().configure().buildSessionFactory();
		Session  session = sf.openSession();
		session.beginTransaction();
		
		Student  s = new Student();
		s.setFname("Pawan");
		s.setLname("Sharma");
		s.setAge(25);
		s.setCollege("IHIT");
		s.setCity("Kathmandu");
		
		session.save(s);//insert sql write
		session.getTransaction().commit(); //execute sql
		session.close();
	}

}
