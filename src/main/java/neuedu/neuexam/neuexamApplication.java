package neuedu.neuexam;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class neuexamApplication {

	@Bean
	public Queue queue1(){
		  //定义一个点对点队列  ,名称为demo.queue
		return new ActiveMQQueue("demo.queue");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(neuexamApplication.class, args);
	}

}
