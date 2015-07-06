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
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
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
    public void setUp() {
        mock = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void testAddRent() throws Exception {
        String json = " {   \"name\" : \"My home\",     \"description\" : \"My home\",   \"price\": 1100,   \"deposit\": 1650,   \"period\" : \"YEAR\",   \"sqMeters\": 55,   \"lift\": false,   \"floor\": 2,   \"type\": \"FLAT\",   \"owner\": {     \"id\" : 1   },   \"furniture\" : true,   \"pets\" : true,   \"dishwasher\" : true,   \"centralHeating\" : true,   \"address\" : {     \"street\" : \"Dundrum wood\",     \"number\": 17,     \"area\" : {       \"id\" :  2,       \"name\": \"Dundrum\"     }   } }";
        mock.perform(
                post("/renting/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json)
                        .accept(MediaType.APPLICATION_JSON)
        ).andDo(print()).andExpect(status().isOk());
    }
}
