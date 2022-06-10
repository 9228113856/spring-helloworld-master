import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanKiss = (Cat) applicationContext.getBean("Cat");
        Cat beanKissa = (Cat) applicationContext.getBean("Cat");


        System.out.println("Test for HelloWorld: " + (bean == beanTwo));
        System.out.println("Test for Cat: " + (beanKiss == beanKissa));
    }
}