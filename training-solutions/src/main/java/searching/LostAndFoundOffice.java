package searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LostAndFoundOffice {
    private List<LostProperty> lostPropertyList = new ArrayList<>();

    public LostProperty findLostProperty( LostProperty lostProperty) {
        int index = Collections.binarySearch(lostPropertyList, lostProperty);
        if (index < 0) {
            throw new IllegalArgumentException("Property not found.");
        }
        return lostPropertyList.get(index);

    }

    public void addProperty(LostProperty lostProperty) {
        lostPropertyList.add(lostProperty);
    }
}
