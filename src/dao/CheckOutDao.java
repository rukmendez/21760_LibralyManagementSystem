
package dao;

import model.CheckOutModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class CheckOutDao {
    static SessionFactory sf;
   static Transaction trans;
   public CheckOutModel SaveCheckOut(CheckOutModel client){
     sf=HibernateUtil.getSessionFactory();
     Session ses=sf.openSession();
       try {
           trans=ses.beginTransaction();
           ses.save(client);
           trans.commit();
       } catch (Exception e) {
       }
     finally{
           ses.close();
       }
       return null;
   }
      public CheckOutModel UpdateCheckOut(CheckOutModel client){
     sf=HibernateUtil.getSessionFactory();
     Session ses=sf.openSession();
       try {
           trans=ses.beginTransaction();
           ses.update(client);
           trans.commit();
       } catch (Exception e) {
       }
     finally{
           ses.close();
       }
       return null;
   }
      public CheckOutModel DeleteCheckOut(CheckOutModel client){
     sf=HibernateUtil.getSessionFactory();
     Session ses=sf.openSession();
       try {
           trans=ses.beginTransaction();
           ses.delete(client);
           trans.commit();
       } catch (Exception e) {
       }
     finally{
           ses.close();
       }
       return null;
   }
    
}
