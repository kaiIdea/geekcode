package main.java.structure.adaptor;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/1 15:37
 * @Description:
 */
public class ASensitiveWordsFilterAdaptor implements SensitiveWordsFilter{

    private ASensitiveWordsFilter aSensitiveWordsFilter;

    public ASensitiveWordsFilterAdaptor() {
        this.aSensitiveWordsFilter = new ASensitiveWordsFilter();
    }

    @Override
    public String filter(String text) {
        String maskedText = aSensitiveWordsFilter.filterSexyWords(text);
        return aSensitiveWordsFilter.filterPoliticalWords(maskedText);
    }
}
