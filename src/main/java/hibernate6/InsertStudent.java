package hibernate6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InsertStudent {
    public static void main(String [] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        try (Session session = sf.openSession()) {
            Transaction tx = session.beginTransaction();
            Student student = new Student();
            student.setstudentName("Cindy");
            student.setstudentNumber(1160);
            student.setMarks(91.7);
            session.persist(student);
            tx.commit();
            session.close();
        }

    }

}
