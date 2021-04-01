package main.java.create.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/24 11:20
 * @Description:
 */
public class RuleConfigParserFactory {


    private static final Map<String,IRuleConfigParser> cacheParser = new HashMap<>();

    static {
        cacheParser.put("json",new JsonRuleConfigParser());
        cacheParser.put("xml",new XmlRuleConfigParser());
    }


    public static IRuleConfigParser createParser(String ruleConfigFileExtension){
        if("json".equalsIgnoreCase(ruleConfigFileExtension)){
            return new JsonRuleConfigParser();
        }
        else if("xml".equalsIgnoreCase(ruleConfigFileExtension)){
            return  new XmlRuleConfigParser();
        }
        return null;
    }

    public static IRuleConfigParser createCacheParser(String ruleConfigFileExtension){
        if(null == ruleConfigFileExtension){
            return null;
        }
        return cacheParser.get(ruleConfigFileExtension);
    }
}
