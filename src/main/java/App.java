import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        boolean helloWord = bean==bean2;
        System.out.println(helloWord);

        Cat catBean = (Cat) applicationContext.getBean("catBean");
        System.out.println(catBean);

        Cat catBean2 = (Cat) applicationContext.getBean("catBean");
        System.out.println(catBean2);

        boolean cat = catBean==catBean2;
        System.out.println(cat);
    }
}