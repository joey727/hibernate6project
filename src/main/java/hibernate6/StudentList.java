package hibernate6;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;


public class StudentList {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        try (Session session = sf.openSession()) {
            SelectionQuery<Student> query = session.createSelectionQuery("from Student", Student.class);
            List<Student> studList = query.list();
            for (Student stud : studList) {
                System.out.println(stud);
            }
        }
        
    }
}
