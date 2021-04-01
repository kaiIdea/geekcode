package main.java.structure.adaptor;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/1 15:39
 * @Description:
 */
public class BSensitiveWordsFilterAdaptor implements SensitiveWordsFilter {

    private BSensitiveWordsFilter bSensitiveWordsFilter;

    public BSensitiveWordsFilterAdaptor() {
        this.bSensitiveWordsFilter = new BSensitiveWordsFilter();
    }

    @Override
    public String filter(String text) {
        String maskedText = bSensitiveWordsFilter.filter(text);
        return bSensitiveWordsFilter.filterPolitical(maskedText);
    }
}
