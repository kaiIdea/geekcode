package main.java.create.factory;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/24 10:44
 * @Description:
 */
public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath) throws Exception {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = RuleConfigParserFactory.createParser(ruleConfigFileExtension);
        String configText = "";
        RuleConfig ruleConfig = parser.parser(configText);
        return ruleConfig;
    }


    private static String getFileExtension(String ruleConfigFilePath) {
        int index = ruleConfigFilePath.lastIndexOf(".");
        if(-1 == index){
            return null;
        }
        return ruleConfigFilePath.substring(index+1);
    }

    public static void main(String[] args) {
        getFileExtension("rule.json");
    }
}
