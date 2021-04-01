package main.java.create.factory;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/24 10:45
 * @Description:
 */
public class XmlRuleConfigParser implements IRuleConfigParser{

    @Override
    public RuleConfig parser(String configText) {
        return new RuleConfig(configText);
    }
}
