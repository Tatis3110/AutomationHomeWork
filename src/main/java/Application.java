import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.logging.Handler;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class Application {

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




        //  ClassA empty = new ClassA();
        // ClassA fillIn = new ClassA("Sofie", 1);
    }


        /*

        String[] names = new String[]{"Ann", "Helga", "David", "Marry", "John"};
        ClassA.getNamesList(names);
        /**
         *Метод создает список c List<String> из массива 'names'
         */
        /*
        List<String> namesList = new ArrayList<>();
        ClassB.sort(namesList);
/**
 * Сортрует массив names с помощью  Collections.sort
 */
}

