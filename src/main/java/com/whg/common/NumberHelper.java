package com.whg.common;

/**
 * @author: whg
 * date: 2018/8/8 10:42
 * email: whgcxq@sina.com
 * des:
 */
public class NumberHelper {

    /**为数字的正则*/
    private static final String NUM_REGEX = "^(\\+|\\-)?(0+\\.[\\d]+|[1-9]+[\\d]*\\.[\\d]+|[\\d]+)$";

    /**
     * 判断传进来的字符串是否为数字
     * @param str 要判断的字符串
     * @return true or false
     */
    public static boolean isNum(String str){
        if(str == null || str.isEmpty()){
            return false;
        }else{
            return str.matches(NUM_REGEX);
        }
    }
}
