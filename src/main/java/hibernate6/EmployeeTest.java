package hibernate6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeTest {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        try (Session session = sf.openSession()) {
            Transaction tx = session.beginTransaction();
            
            Employee emp = new Employee();
            // emp.setEmployeeId(112);
            emp.setEmployeeName("Lucy");
            emp.setEmployeeSalary(8000);
            session.persist(emp);
            tx.commit();
            System.out.println("Data successfully inserted into database");
        }

    }
}
