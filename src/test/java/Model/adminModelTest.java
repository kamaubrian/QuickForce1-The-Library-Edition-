package Model;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Brian Kamau on 9/16/17.
 */
public class adminModelTest {
    @Test
    public void testGetUsername(){
        System.out.println("Getting Username Test");
        String user="admin";
        adminModel instance = new adminModel();
        String expResult= instance.getUsername(user);
        String result=instance.getUsername(user);
        assertEquals(expResult,result);
    }
    @Test
    public void testPassword(){

        System.out.println("Getting Password Test");
        String password="wamatu";
        adminModel instance = new adminModel();
        String expResult = instance.getPassword(password);
        String result =  instance.getPassword(password);
        assertEquals(expResult,result);
    }
}
