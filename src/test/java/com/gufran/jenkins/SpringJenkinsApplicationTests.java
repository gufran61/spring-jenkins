package com.gufran.jenkins;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

    @Test
    public  void contextLoads() {
        logger.info("test case is executig....");
      //  logger.info("test case is executig 2nd log statement....");
        assertEquals(true,true);
    }

}
