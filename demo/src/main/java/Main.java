import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.bean.User;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringTest.xml");
		User user = (User) applicationContext.getBean("user");
		System.out.println(user);
	}
}