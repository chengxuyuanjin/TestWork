package com.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Kafka_parse {
    public static void main(String[] args) {
        String sendMessage="{\n" +
                "     AlarmMsg: {\n" +
                "          AlarmProvince: \"四川省\",\n" +
                "          ClearId: \"1144022692_1509308660_219225740_1496598209\",\n" +
                "          EventTime: \"2022-09-13 13:14:17\",\n" +
                "          NetworkTypeTop: 1,\n" +
                "          SheetNo: \"SC网调【2022】网络故障0913-1171362\",\n" +
                "          UniqueId: \"1144022692_1509308660_219225740_1496598209\"\n" +
                "     },\n" +
                "     SendPreprocessMsg: {\n" +
                "          HwVersion: \"\",\n" +
                "          NeModel: \"\",\n" +
                "          PPAlarmReason: \"1\",\n" +
                "          PPCauseDomain: 7,\n" +
                "          PPCausePosition: \"CDFH7073_新都保利翡翠谷铁塔\",\n" +
                "          PPProcess: \"预处理开始时间：\\r\\n2022-09-13 13:20:51\\r\\n预处理步骤：\\r\\n1.检查License资源不足--状态：正常\\r\\n2.检查射频单元异常和链路异常--状态：不正常\\r\\n3.恢复\\r\\n预处理完成时间：\\r\\n2022-09-13 13:22:47\",\n" +
                "          PPResult: \"诊断概要：小区退服因为0柜0框3槽2端口光模块故障或该模块连接的光纤故障。<br/>诊断建议：请携带备件上站，\\n1、 先尝试插拔对应光模块，如告警不恢复则替换光模块，\\n2、 如果光模块替换后告警未清除，请检查并替换对应的光纤。\",\n" +
                "          PPStatus: 3,\n" +
                "          SwVersion: \"\"\n" +
                "     }\n" +
                "}\n";
        JSONObject parameterJSON = JSON.parseObject(sendMessage);
        System.out.println(parameterJSON.getJSONObject("AlarmMsg").getString("UniqueId"));
        System.out.println(parameterJSON.getJSONObject("SendPreprocessMsg").getString("PPResult"));
    }
}
