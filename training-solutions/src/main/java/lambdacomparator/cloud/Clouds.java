package lambdacomparator.cloud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clouds {
    private List<Clouds> clouds;


    public CloudStorage alphabeticallyFirst(List<CloudStorage> clouds) {
        clouds.sort(Comparator.comparing(CloudStorage::getProvider, (s, t) ->
                s.trim().toLowerCase().compareTo(t.trim().toLowerCase())));
        return clouds.get(0);
    }


    public CloudStorage bestPriceForShortestPeriod(List<CloudStorage> clouds) {

        return Collections.min(clouds, Comparator.comparing(CloudStorage::getPeriod,
                Comparator.nullsFirst(Comparator.comparingInt(PayPeriod::getLength))).thenComparingDouble(CloudStorage::getPrice));

    }

    public List<CloudStorage> worstOffers(List<CloudStorage> clouds) {
        List<CloudStorage> result = new ArrayList<>(clouds);
        result.sort(Comparator.reverseOrder());
        return result.subList(0, Math.min(result.size(), 3));

    }

    public List<Clouds> getClouds() {
        return new ArrayList<>(clouds);
    }
}
