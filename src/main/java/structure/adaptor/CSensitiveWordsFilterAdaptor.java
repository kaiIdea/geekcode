package main.java.structure.adaptor;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/1 15:39
 * @Description:
 */
public class CSensitiveWordsFilterAdaptor implements SensitiveWordsFilter{

    private CSensitiveWordsFilter cSensitiveWordsFilter;


    public CSensitiveWordsFilterAdaptor() {
        this.cSensitiveWordsFilter = new CSensitiveWordsFilter();
    }

    @Override
    public String filter(String text) {
        String maskedText = cSensitiveWordsFilter.filterC(text);
        return cSensitiveWordsFilter.filterPoliticalC(maskedText);
    }
}
