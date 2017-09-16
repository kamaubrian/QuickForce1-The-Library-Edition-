package Model;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by root on 9/16/17.
 */
public class mainModelTest {
    @Test
    public void testDbConnect(){
        System.out.println("Trying to Connect to MySql");
        mainModel instance = new mainModelImpl();
        boolean expResult = true;
        boolean result = instance.dbConnect();
        assertEquals(expResult,result);
    }

    @Test
    public void testDisconnect(){
        System.out.println("Disconnecting from Database");
        mainModel instance = new mainModelImpl();
        boolean expResult = true;
        boolean result = instance.dbDisconnect();
        assertEquals(expResult,result);
        System.out.println("Database Disconnected");




    }
    public class mainModelImpl extends mainModel{

       // @Override
        public String getUsername(String username) {
            return null;
        }

       // @Override
        public String getPassword(String password) {
            return null;
        }
    }
}
