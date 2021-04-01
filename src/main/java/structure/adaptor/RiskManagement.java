package main.java.structure.adaptor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/1 15:30
 * @Description:
 */
public class RiskManagement {
    private ASensitiveWordsFilter filterA = new ASensitiveWordsFilter();
    private BSensitiveWordsFilter filterB = new BSensitiveWordsFilter();
    private CSensitiveWordsFilter filterC = new CSensitiveWordsFilter();

    private List<SensitiveWordsFilter> list = new ArrayList<>();

    public String filterSensitiveWords1(String text){
        String maskedText = filterA.filterSexyWords(text);
        maskedText = filterA.filterPoliticalWords(maskedText);
        maskedText = filterB.filter(maskedText);
        maskedText = filterC.filterPoliticalC(maskedText);
        return maskedText;
    }

    public void filterSensitiveWords2(String text){
        String maskedText = null;
        for(SensitiveWordsFilter filter : list){
            maskedText = filter.filter(text);
        }
        System.out.println(maskedText);
    }

    public void addFilter(SensitiveWordsFilter filter){
        list.add(filter);
    }

//    public static void main(String[] args) {
//        RiskManagement management = new RiskManagement();
//        management.filterSensitiveWords("minganciguolv...");
//        System.out.println();
//    }


    public static void main(String[] args) {
        RiskManagement management = new RiskManagement();
        management.addFilter(new BSensitiveWordsFilterAdaptor());
        management.addFilter(new CSensitiveWordsFilterAdaptor());
        management.filterSensitiveWords2("minganciguolv...");
        System.out.println();
    }

}
