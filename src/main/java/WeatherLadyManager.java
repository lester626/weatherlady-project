import com.hibernate.services.InsertServices;
import com.hibernate.utilities.HibernateUtil;
import org.hibernate.Session;
import com.hibernate.entities.*;
import org.hibernate.query.Query;

import java.text.DecimalFormat;
import com.hibernate.services.*;
import java.util.List;

public class WeatherLadyManager {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(Math.random() * 1000));

        System.out.println("Location Inserted");

        // Select Query
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//
//        Query<Location> locationQuery = session.createQuery("from Location", Location.class);
//        List<Location> locationList = locationQuery.list();
//        System.out.println("Numbers of list in Location table: " + locationList.size());
//
//        for(Location location: locationList){
//            System.out.println(location.getCountryName());
//        }
//
//        session.close();
    }
}
