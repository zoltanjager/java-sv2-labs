package lambda;

import java.util.List;

public class TreeNursery {
    private List<Sapling> saplings;

    public TreeNursery(List<Sapling> saplings) {
        this.saplings = saplings;
    }

    public List<Sapling> getSaplings() {
        return saplings;
    }

    public void prune(int maxHeight) {
        saplings.forEach(tree -> tree.cut(maxHeight));
    }

    public void sell(String species, int minHeight) {
        saplings.removeIf(tree -> tree.getSpecies().equals(species) && tree.getHeight() > minHeight);
    }

}
