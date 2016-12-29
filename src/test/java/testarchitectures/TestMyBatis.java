package java.testarchitectures;

import com.mouse.moon.pojo.UserPerson;
import com.mouse.moon.service.UserPersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.Logger;

/**
 * Created by wuhao on 16/7/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {


    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(TestMyBatis.class);

    @Autowired
    private UserPersonService userPersonService;


    @Test
    public void testData()
    {
        String id = "1421925823694573";
        UserPerson userPerson = userPersonService.getUserPersonInfoById(id);
        System.out.println(userPerson.getUserName());
    }

}
