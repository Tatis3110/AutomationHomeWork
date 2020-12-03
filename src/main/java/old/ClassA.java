package old;

import java.util.ArrayList;
import java.util.List;

public class ClassA extends Parent {

    String name;
    int number;

    // для пустого экземпляра класса

    public ClassA(){
        System.out.println("Новый пустой экземпляр класса old.ClassA");
    }
// для экземпляра класса с именем и номером
    public ClassA (String name, int number){
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











