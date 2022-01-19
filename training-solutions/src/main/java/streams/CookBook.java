package streams;

import java.util.List;
import java.util.stream.Collectors;

public class CookBook {
    private List<Cake> cakes;

    public CookBook(List<Cake> cakes) {
        this.cakes = cakes;
    }

    public List<String> listCakeNamesWithGivenIngredient(String ingredient) {
        List<String> result = cakes.stream()
                .filter(cake -> cake.getIngredients().contains(ingredient))
                .map(Cake::getName)
                .collect(Collectors.toList());
        return result;
    }


    public List<String> listCakeNamesWithMaxIngredients(int max) {
        List<String> result = cakes.stream()
                .filter(cake -> cake.getIngredients().size() <= max)
                .map(Cake::getName)
                .collect(Collectors.toList());
        return result;
    }
}
