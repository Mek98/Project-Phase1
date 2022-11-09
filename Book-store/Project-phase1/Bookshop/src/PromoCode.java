import java.util.*;
abstract class PromoCode {
    private Map<String, Integer> PromoCodes;
    private void AddCode(String code, int percentage){

        PromoCodes.put(code, percentage);
    }
    private double GetCode(String code)
    {
        return PromoCodes.getOrDefault(code, 0);
    }

}
