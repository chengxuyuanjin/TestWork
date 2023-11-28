package com.example;

public class Test {


    /**
     *去掉字符串前后的指定字符
     */
    public static String trimBothChars(String str, String splitter) {
        String regex = "^[" + splitter + "]*|[" + splitter + "]*$";
        return str.replaceAll(regex, "");
    }

    public static void main(String[] args) {
        String s="";
        String []shuzu=null;
//        if(!s.equals("")) {
        shuzu = s.split(",");
        System.out.println("shuzu[0]:" + shuzu[0] + "shuzu.length:" + shuzu.length);
//            System.out.println(s.split(":|,")[1].trim());
//        }
        String oldStr="·,.haha.·this ..is text，hha ..,·";
        System.out.println("oldStr:"+oldStr);
        String splitter="\\.,，·";
        oldStr=trimBothChars(oldStr,splitter);
        System.out.println("newStr:"+oldStr);

    }
}
