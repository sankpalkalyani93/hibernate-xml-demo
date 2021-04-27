package hibernatexmldemothree;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateXMLDemoThree {

    public static void main(String[] args) {
        Configuration cfg1 = new Configuration();
        Configuration cfg2 = cfg1.configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg2.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        
        Stud04 s1 = new Stud04();
        s1.setRollno(3);
        s1.setName("Snehanki");
        s1.setCourse("Electrical");
        s1.setDept("E&TC");
        s1.setPercent(67);
        
        session.save(s1);
        t.commit();
        System.out.println("Record saved Successfully...");
        session.close();
    }
    
}
