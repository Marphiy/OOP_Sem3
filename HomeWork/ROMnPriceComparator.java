package Sem3.HomeWork;
import java.util.Comparator;

/**
 * Компаратор сравнивает ноутбуки по объему памяти.
 * Если объем совпадает - сравнивает по цене.
 */
public class ROMnPriceComparator implements Comparator<Notebook>{

    @Override
    public int compare(Notebook o1, Notebook o2) {

        if (o1.getROMSize() > o2.getROMSize()) {
            return 1;
        }
        if (o1.getROMSize() < o2.getROMSize()) {
        return -1;
        }         
        else {
            if (o1.getPrice() > o2.getPrice()) {
                return 1;
            }
            if (o1.getPrice() < o2.getPrice()) {
                return -1;
            }
            else {
                return 0;
            }
        }
    }
}