import com.javaloping.homr.controller.RentController;
import com.javaloping.homr.test.init.TestApp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author victormiranda@gmail.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = { TestApp.class})
public class PropertyTestITCase {

    @Autowired
    private WebApplicationContext wac;
    protected MockMvc mock;

    @Before
    public void setUp() throws Exception {
        mock = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Autowired
    private RentController rentController;

    @Test
    public void testAddRent() throws Exception {
        String json = "\n" +
                "{\n" +
                "  \"name\" : \"My home\",\n" +
                "    \"description\" : \"My home\",\n" +
                "  \"price\": 1100,\n" +
                "  \"deposit\": 1650,\n" +
                "  \"period\" : \"YEAR\",\n" +
                "  \"sqMeters\": 55,\n" +
                "  \"lift\": false,\n" +
                "  \"floor\": 2,\n" +
                "  \"type\": \"FLAT\",\n" +
                "  \"owner\": {\n" +
                "    \"id\" : 1\n" +
                "  },\n" +
                "  \"furniture\" : true,\n" +
                "  \"pets\" : true,\n" +
                "  \"dishwasher\" : true,\n" +
                "  \"address\" : {\n" +
                "    \"street\" : \"Dundrum wood\",\n" +
                "    \"number\": 17,\n" +
                "    \"area\" : {\n" +
                "      \"id\" :  2,\n" +
                "      \"name\": \"Dundrum\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
        mock.perform(
                post("/renting/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json)
                        .accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk());
    }
}
