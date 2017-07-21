package main.java.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Asus on 2017/7/21.
 */
public class providerStart {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        context.start();
        System.out.print("这里是提供方按任意键退出");
        System.out.print("真的吗？");
        try{
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
