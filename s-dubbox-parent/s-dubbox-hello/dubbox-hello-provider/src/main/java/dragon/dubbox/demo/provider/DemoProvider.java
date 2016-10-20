package dragon.dubbox.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Dragon
 * @version V1.0
 * @Title: dragon.dubbox.demo.provider.DemoProvider
 * @Description:
 * @date 2016/10/13 19:23
 */
public class DemoProvider {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/*.xml");//注意路径
		context.start();
		//UserService userService = context.getBean("userService", UserService.class);
		//System.out.println(userService.getUser(5201314L).toString());
		System.out.println("服务已经启动...");
		System.in.read();
	}
}
