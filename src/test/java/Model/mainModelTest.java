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
    public class mainModelImpl extends mainModel{

    }
}
