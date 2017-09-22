package com.zl.Maill;

import java.io.*;
import java.util.Properties;

/**
 * Created by Administrator on 2017/9/22.
 */
public class ConfigUtil {

    public static Properties properties;
    public static Properties bilud(String path){
        synchronized (ConfigUtil.class){
            if(properties==null) {
                synchronized (ConfigUtil.class) {
                    try {
                        InputStream inutstream = new FileInputStream(new File(path));
                        properties = new Properties();
                        properties.load(inutstream);
                        return properties;
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return null;
    }

    public static String getString(String key) {
        return properties.getProperty(key);
    }

    public static Integer getInteger(String key) {
        return Integer.valueOf(properties.getProperty(key));
    }

    public static Double getDouble(String key) {
        return Double.valueOf(properties.getProperty(key));
    }
}
