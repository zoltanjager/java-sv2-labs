package algorithmsmax;

public class Plane {
    public int getLongestOcean (String map) {
        int maxOcean = 0;
        int tempOcean = 0;
        for  (int i = 0; i < map.length(); i++) {
            if ( map.charAt(i) == '0') {
                tempOcean++;
                if (tempOcean > maxOcean) {
                    maxOcean = tempOcean;
                }
            } else {
                tempOcean = 0;
            }
        }

        return maxOcean;
    }
}
