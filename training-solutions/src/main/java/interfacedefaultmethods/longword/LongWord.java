package interfacedefaultmethods.longword;

import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class LongWord implements FileOperations{

    private Path path;

    public LongWord(Path path) {
        this.path = path;
    }


    @Override
    public String getLongWord() {
        List<String> lines = readFromFile(path);
        StringBuilder sb = new StringBuilder();

        for (String actual : lines ) {
            sb.append(actual.charAt(0));
        }

        char[] temp = lines.get(lines.size()-1).toCharArray();

        for (int i = 1; i < temp.length ; i++) {
            sb.append(temp[i]);
        }

        return sb.toString();
    }
}
