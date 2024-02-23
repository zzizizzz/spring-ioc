package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context-autowired.xml"); //스프링 컨테이너
		
		UserDao userDao = ctx.getBean(UserDao.class);
		UserService userService = ctx.getBean(UserService.class);
		
		System.out.println(userDao);
		System.out.println(userService);
		

	}
}
