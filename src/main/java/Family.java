import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Family {

    private Map<List<Integer>, BigDecimal> rates;

    public Family(Map<List<Integer>, BigDecimal> ratesToSet){
        this.rates = ratesToSet;
    }

    public Map<List<Integer>, BigDecimal> getRates(){
        return this.rates;
    }

}
