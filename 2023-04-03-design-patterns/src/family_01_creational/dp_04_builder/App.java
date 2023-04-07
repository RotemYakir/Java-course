package family_01_creational.dp_04_builder;

import java.sql.Date;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Cat c1 = Cat.yalla()
//                .weight(1235)
                .name("Mitzi")
                .id(1234);
//                .birthday(Date.valueOf(LocalDate.now().minusYears(49)));


        Cat c2 = new Cat();
        c2.setName("Mitzi");
        c2.setWeight(1234);
        c2.setBirthday(Date.valueOf(LocalDate.now().minusYears(49)));
        c2.setId(1235);
    }
}
