package pl.edu.wszib;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.edu.wszib.gui.GUIconsole;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppCofiguration.class);
        GUIconsole guicon = context.getBean(GUIconsole.class);
        guicon.showMainMenu();
    }
}
