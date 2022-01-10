package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> results){
        Map<VoteResult, Integer> finalResult = new HashMap<>();
        for (VoteResult actual : results.values() ) {
            if(!finalResult.containsKey(actual)){
                finalResult.put(actual,0);
            }
            finalResult.put(actual, finalResult.get(actual)+1);
        }
        System.out.println(finalResult);
    return finalResult;
    }
}
