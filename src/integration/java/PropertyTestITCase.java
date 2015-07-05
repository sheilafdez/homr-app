import com.javaloping.homr.service.PropertyService;
import com.javaloping.homr.test.init.TestApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by victor on 04/07/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = { TestApp.class})
public class PropertyTestITCase {

    @Autowired
    private PropertyService propertyService;

    @Test
    public void testAddRent() {
        System.out.println("hola");
    }
}
