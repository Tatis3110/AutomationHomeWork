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
        String[] namesStrings = HomeWork1510.getNamesStrings();
        List<String> namesList = HomeWork1510.getNamesList(namesStrings);
        HomeWork1510 homeWork1510 = new HomeWork1510();
        HomeWork1510For homeWork1510For = new HomeWork1510For();

        homeWork1510.spysok(null);
        System.out.println("========================");
        homeWork1510For.spysok(namesList);
        System.out.println("========================");
        homeWork1510For.spysok(new ArrayList<>());


        //  HomeWork1510 empty = new HomeWork1510();
        // HomeWork1510 fillIn = new HomeWork1510("Sofie", 1);
    }


        /*

        String[] names = new String[]{"Ann", "Helga", "David", "Marry", "John"};
        HomeWork1510.getNamesList(names);
        /**
         *Метод создает список c List<String> из массива 'names'
         */
        /*
        List<String> namesList = new ArrayList<>();
        HomeWork1510For.sort(namesList);
/**
 * Сортрует массив names с помощью  Collections.sort
 */
}

