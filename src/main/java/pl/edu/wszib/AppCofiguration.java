package pl.edu.wszib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.database.DBInterface;
import pl.edu.wszib.database.SQLDatabase;
import pl.edu.wszib.gui.GUIconsole;

@Configuration
public class AppCofiguration {

    @Bean
    public SQLDatabase SQLdb() {
        return new SQLDatabase();
    }

    @Bean
    public GUIconsole gui_con(DBInterface database) {
        GUIconsole gui_con = new GUIconsole();
        gui_con.dataBase = database;
        return gui_con;
    }
}
