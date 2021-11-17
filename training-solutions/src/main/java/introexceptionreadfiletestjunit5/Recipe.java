package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private List<String> ingredients = new ArrayList<>();

    public void addIngredients(Path path) {
        List<String> lines = getFile(path);

        for (String actual: lines) {
            if (actual.length()!=0){
                if (Character.isDigit(actual.charAt(0))){
                    ingredients.add(actual.split(" ")[2]);
                }
            }
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    private List<String> getFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
