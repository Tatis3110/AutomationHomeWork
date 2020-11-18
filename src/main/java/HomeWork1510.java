import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class HomeWork1510 extends Parent {

    String name;
    int number;

    // для пустого экземпляра класса

    public HomeWork1510(){
        System.out.println("Новый пустой экземпляр класса HomeWork1510");
    }
// для экземпляра класса с именем и номером
    public HomeWork1510 (String name, int number){
        this.name = name;
        this.number = number;
        System.out.println(name + number);
    }

    public static String[] getNamesStrings() {
        return new String[]{"Ann", "Helga", "David", "Marry", "John"};
    }

    public static List<String> getNamesList(String[] names) {
        List<String> namesList = new ArrayList<>();
        int index = 0;
        while (index <= 4) {
            namesList.add(names[index]);

            index++;

        }
        return namesList;
    }

    }











