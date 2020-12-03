package old;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ClassB extends Parent {

    /*
    public static void sort(List<String> namesList) {

        System.out.println("Before Sorting:");
        for (String str : namesList) {
            System.out.println(str);
        }
        Collections.sort(namesList);

        System.out.println("ArrayList in order:");
        for (String str : namesList) {
            System.out.println(str);
        }
    }

    public static void sort() {
    }

     */

    public static class Application {

        private final static Logger LOG = LogManager.getLogger(Application.class.getName());

        public static void main(String[] args)  {





           LOG.info("info");
           LOG.error("error");
           LOG.debug("debug");
            String[] namesStrings = ClassA.getNamesStrings();
            List<String> namesList = ClassA.getNamesList(namesStrings);
            ClassA ClassA = new ClassA();
            ClassB ClassB = new ClassB();

           ClassA.spysok(null);
            System.out.println("========================");
            ClassB.spysok(namesList);
            System.out.println("========================");
            ClassB.spysok(new ArrayList<>());




            //  old.ClassA empty = new old.ClassA();
            // old.ClassA fillIn = new old.ClassA("Sofie", 1);
        }


            /*

            String[] names = new String[]{"Ann", "Helga", "David", "Marry", "John"};
            old.ClassA.getNamesList(names);
            /**
             *Метод создает список c List<String> из массива 'names'
             */
            /*
            List<String> namesList = new ArrayList<>();
            old.ClassB.sort(namesList);
    /**
     * Сортрует массив names с помощью  Collections.sort
     */
    }
}