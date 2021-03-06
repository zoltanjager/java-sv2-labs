package lambdacollectors.honey;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BeeKeeper {
    private List<Honey> honeys;

    public BeeKeeper(List<Honey> honeys) {
        this.honeys = honeys;
    }

    public List<Honey> getHoneys() {
        return new ArrayList<>(honeys);
    }

    public int getTotalValueOfGivenGlasses(GlassSize size) {
        return honeys.stream()
                .filter(honey -> honey.getGlassSize().equals(size))
                .collect(Collectors.summingDouble(Honey -> Honey.getHoneyType().getPricePerKg() * size.getSizePerKg())).intValue();

    }

    public Map<GlassSize, Long> getAmountsOfGivenType(HoneyType type) {
        return honeys.stream()
                .filter(honey -> honey.getHoneyType().equals(type))
                .collect(Collectors.groupingBy(Honey::getGlassSize, Collectors.counting()));
    }

    public Map<Boolean, List<Honey>> getGroupsByGivenTypeAndSize(HoneyType type, GlassSize size) {
        return honeys.stream()
                .collect(Collectors.partitioningBy(honey -> honey.getHoneyType().equals(type) && honey.getGlassSize().equals(size)));
    }

    public void addHoney(Honey honey) {
        honeys.add(honey);
    }
}
