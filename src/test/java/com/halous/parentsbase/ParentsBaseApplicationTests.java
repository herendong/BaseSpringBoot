package com.halous.parentsbase;

import com.halous.parentsbase.Iservice.UserDao;
import com.halous.parentsbase.component.HelloSender;
import com.halous.parentsbase.component.MailServiceImpl;
import com.halous.parentsbase.controller.HelloWorldController;
import com.halous.parentsbase.dtos.req.Student;
import com.halous.parentsbase.dtos.req.UserEntity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

@RunWith(SpringRunner.class)//测试时可以自动启动容器
@SpringBootTest
public class ParentsBaseApplicationTests {

	private MockMvc mockMvc;

	@Autowired
	private RedisTemplate redisTemplate;

    @Autowired
    private HelloSender helloSender;

	@Autowired
	private AmqpTemplate rabbitTemplate;

    @Autowired
    private MailServiceImpl mailService;

	@Autowired
	private UserDao userDao;


	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
	}

	@Test
	public void getHello() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andDo(MockMvcResultHandlers.print())
				.andReturn();

	}

	@Test
	public void set() {
//        redisTemplate.opsForValue().set("test:set","testValue1");
		redisTemplate.delete("test:set");
	}


	@Test
	public void hello() throws Exception {
		helloSender.send();
	}

	@Test
	public void testSaveUser() throws Exception {
		UserEntity user=new UserEntity();
//		user.setId(22);
//		user.setUserName("小刚3");
//		user.setPassWord("fffooo123");
//		userDao.saveUser(user);
        Student student = new Student();
        student.setStudentClass("九年级十一班");
        student.setStudentId("110711312");
        student.setStudentName("马三三");
        userDao.saveUser(student);
    }

    @Test
    public void findUserByUserName(){
        UserEntity byUserName = userDao.findUserByUserName("小刚");
        System.out.println("user is ====="+byUserName);
    }

}