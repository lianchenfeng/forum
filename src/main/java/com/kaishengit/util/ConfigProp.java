package com.kaishengit.util;

import java.io.IOException;
import java.util.Properties;

/**
 * 读取config.properties文件的工具类
 * @author chen
 */

public class ConfigProp {

    private static Properties Prop = new Properties();
    static {
        try {
            Prop.load(ConfigProp.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("读取config.properties文件异常");
        }
    }

    /**
     * 读取properties文件的值
     * @param key 键
     * @return 键对应的值
     */

    public static String get(String key){
        return Prop.getProperty(key);
    }
}
