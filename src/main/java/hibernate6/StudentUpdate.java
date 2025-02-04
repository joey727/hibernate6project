package hibernate6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class StudentUpdate {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        try (Session session = sf.openSession()) {
            Transaction tx = session.beginTransaction();
            
            Student student = session.get(Student.class, 2042);
            student.setstudentName("Kenny");
            session.merge(student);
            tx.commit();
            session.close();
        }
    }
}
