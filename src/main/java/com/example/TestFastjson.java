package com.example;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;
import java.util.Set;

public class TestFastjson {
    public static void main(String[] args) {
        String jsonString="{\n" +
                "     package: {\n" +
                "          additionInfo: {\n" +
                "               errorCode: \"0\",\n" +
                "               errorMsg: \"Success\",\n" +
                "               receiverTradeNum: \"\"\n" +
                "          },\n" +
                "          body: [\n" +
                "               {\n" +
                "                    medicalNum: \"15XXXXXX\",\n" +
                "                    queryDate: \"YYYYMMDD\",\n" +
                "                    name: \"XXX\",\n" +
                "                    authorizationNum: \"xxxxx\",\n" +
                "                    pageNum: \"1\"\n" +
                "               }\n" +
                "          ]\n" +
                "     }\n" +
                "}";
        JSONObject jsonObj= JSON.parseObject(jsonString);
        //新建JSONObject对象
        JSONObject object1 = new JSONObject();
        //1.在JSONObject对象中放入键值对
        object1.put("name", "张三");
        object1.put("name1", "张三1");
        object1.put("name2", "张三2");

        Boolean ifContainskey=jsonObj.containsKey("package");
        JSONObject packageJsonObject = jsonObj.getJSONObject("package");// 定位到package json对象
        JSONArray bodyJsonArray = packageJsonObject.getJSONArray("body");//采用getJSONArray方法， 定位到body json集合
        JSONObject targetJsonObject = bodyJsonArray.getJSONObject(0);// 定位到目标json对象

        final String medicalNum = targetJsonObject.getString("medicalNum");// 就诊流水号

        System.out.println("----------------------"+medicalNum+"----------------------");

        Set<Map.Entry<String, Object>> entrySet = object1.entrySet();
        for (Map.Entry<String, Object> entry : entrySet) {
            System.out.println(entry);
            System.out.println("------------");
        }
    }
}
