import java.util.List;
import java.util.ArrayList;

public class Parent {


    protected String name;

    // Конструктор для приема параметра "Имя"

    public Parent(String name) {

        this.name = name;
        System.out.println(name + ": Выведен текст");
    }

    public Parent() {
    }

    public void message() {
        Parent justName = new Parent("Klaus");
        justName.message();
    }


    public static List<String> main(String[] args) {

            List<String> list = new ArrayList<>();

            list.add("I");
            list.add("love");
            list.add("flowers");
            System.out.println(list);
            return list;
        }
    }
