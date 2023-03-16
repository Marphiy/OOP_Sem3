package Sem3.HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// Создать класс Notebook с полями:
// 1. Стоимость (int)
// 2. Оперативная память (int)
// Нагенерить объектов этого класса, создать список и отсортировать его в трех вариантах:
// 1. По возрастанию цены
// 2. По убыванию цены
// 3. По оперативке по убыванию. Если оперативки равны - по убыванию цены.
// 4.+ придумать свои параметры и отсортировать по ним

public class Main {
    public static void main(String[] args) {
        
        List<Notebook> nbooksList = new ArrayList<>();
        
        nbListCreator(nbooksList);
        sortByPriceUp(nbooksList);
        sortByPriceDown(nbooksList);
        sortByROM(nbooksList);
     
    }

    public static List<Notebook> nbListCreator(List<Notebook> nbooksList) {
    
        for(int i = 0; i < 100; i++){
            nbooksList.add(new Notebook());
        }
        System.out.println("\nСклад ноутбуков:\n" + nbooksList + 
            "\n-------------------------\n");

        return nbooksList;
    }

    public static List<Notebook> sortByPriceUp(List<Notebook> nbooksList){
        Comparator<Notebook> priceCompare01 = (Notebook o1, Notebook o2) -> 
            o1.getPrice() - o2.getPrice();
        Collections.sort(nbooksList, priceCompare01);
        System.out.println("Сортировка по возрастанию цены:\n" + nbooksList + 
            "\n-------------------------\n");
        return nbooksList;
    }

    public static List<Notebook> sortByPriceDown(List<Notebook> nbooksList){
        Comparator<Notebook> priceCompare01 = (Notebook o1, Notebook o2) -> 
            o2.getPrice() - o1.getPrice();
        Collections.sort(nbooksList, priceCompare01);
        System.out.println("Сортировка по убыванию цены:\n" + nbooksList + 
            "\n-------------------------\n");
        return nbooksList;
    }
    
    public static List<Notebook> sortByROM(List<Notebook> nbooksList){
        ROMnPriceComparator romComparator = new ROMnPriceComparator();
        Collections.sort(nbooksList, romComparator);
        System.out.println("Сортировка по объему памяти:\n" + nbooksList + 
            "\n-------------------------\n");
        return nbooksList;
    }
    
}
