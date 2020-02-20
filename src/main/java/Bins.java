import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bins {

    private static final Logger logger = Logger.getLogger(Bins.class.getName());
    private Map<Integer, Integer> binMap = new HashMap<Integer, Integer>();

    public Bins(){
    }

    // Creating keys for values from binMin to binMax
    public Bins(Integer minBin, Integer maxBin){

        for (Integer i = minBin; i <= maxBin; i++){
            this.binMap.put(i, 0);
        }

    }

    public Map<Integer, Integer> getBinMap(){
        return this.binMap;
    }

    public Integer getBinsValue(Integer binNumber){
        return this.binMap.get(binNumber);
    }

    public void incrementBin(Integer binNumber){
        Integer increment = getBinsValue(binNumber) + 1;
        this.binMap.replace(binNumber, increment);
    }
}
