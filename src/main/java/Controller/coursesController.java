package Controller;
import Model.coursesModel;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by root on 9/16/17.
 */
public class coursesController {
    static coursesModel coursemodel = new coursesModel();
    ArrayList list = new ArrayList();

    public coursesController(){
        super();
    }

    public void displaycourses() throws IOException{

        for(String i:coursemodel.getCourses()){
            System.out.println(i);
        }
    }

}
