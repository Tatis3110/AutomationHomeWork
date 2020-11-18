import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Parent {


    protected String name;

    // Конструктор для приема параметра "Имя"

    public Parent(String name) {

        this.name = name;
    }

    public Parent() {
    }

    public void message() {
        System.out.println(name + ":Выведен текст");
    }

    public void spysok (List<String> args) {
        try {

            for (String element :
                    args) {
                for (String bukva :
                        element.split("(?!^)")) {
                    System.out.println(bukva);
                }
            }
        }
        catch (NullPointerException e){
           System.out.println("Массив не	определён. Пожалуйста проверьте корректность вводимых значений"
           );
        }
        catch (Exception e){
            System.out.println("Произошла неизвестная ошибка. Подробнее:" + e.toString());
        }

        }
    }
