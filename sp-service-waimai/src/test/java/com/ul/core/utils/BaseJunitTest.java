package com.ul.core.utils;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath*:/spring-servlet.xml","classpath*:/applicationContext.xml"})
@ContextConfiguration(locations = {"classpath*:/applicationContext.xml"})
public class BaseJunitTest {

}
