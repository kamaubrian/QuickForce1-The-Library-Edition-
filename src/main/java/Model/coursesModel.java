package Model;
import java.util.*;
/**
 * Created by root on 9/16/17.
 */
public class coursesModel extends mainModel{

    public ArrayList<ArrayList<String>> getCourses(){
        ArrayList courses = new ArrayList();
        dbConnect();
        String sql;
        try{
            sql="Select * from Courses";
            stat=conn.createStatement();
            rst=stat.executeQuery(sql);
            while(rst.next()){

                courses.add(rst.getString("CourseName"));
            }

        }catch (Exception ex){
            System.out.println("Getting Courses Exception");
        }



        return  courses;

    }


}
