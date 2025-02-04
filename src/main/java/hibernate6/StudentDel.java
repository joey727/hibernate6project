package hibernate6;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;


public class StudentDel {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        try (Session session = sf.openSession()) {
            Transaction tx = session.beginTransaction();
            
            // To delete a single object with set method
            /*  Student student = new Student();
            session.remove(student);
            tx.commit();
            session.close();
            
            
            // Deleting with getEntity type method
            Student student = session.get(Student.class, 1160);
            session.remove(student);
            tx.commit();
            session.close();
            */
            
            // To delete more than one object from database table
            SelectionQuery<Student> query = session.createSelectionQuery("from Student where marks <= :marks", Student.class);
            query.setParameter("marks", 50);
            List<Student> studList = query.list();
            for (Student stud : studList) {
                session.remove(stud);
            }
            tx.commit();
        }
        System.out.println("Successfully deleted from database");
    }
}
