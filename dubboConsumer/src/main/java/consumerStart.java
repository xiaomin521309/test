import main.java.helloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Created by Asus on 2017/7/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:dubbo-consumer.xml")
public class consumerStart {

        @Autowired
        private helloService hService;

        @Test
        public void test(){
            System.out.println("dubbo-consumer服务启动，调用！");
            System.out.println("dubbo-consumer服务启动，调用调用！");
            System.out.println("stash测试用！");
            String info=hService.sayHello();
            System.out.println(info);

        }
}
