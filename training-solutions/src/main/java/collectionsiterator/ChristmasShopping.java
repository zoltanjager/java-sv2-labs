package collectionsiterator;

import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {
    List<ChristmasPresent> presents;

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = presents;
    }


    public void removeTooExpensivePresent(int maxPrice) {
        Iterator<ChristmasPresent> iterator = presents.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getPrice() > maxPrice) {
                iterator.remove();
            }
        }
    }
}
