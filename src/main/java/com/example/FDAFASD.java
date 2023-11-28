package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: zhanghuijin
 * @date: 2023/04/26/13:02
 * @Description:
 */
public class FDAFASD {
    public static void main(String[] args) {
        String msg="{participantList=#liyuan22#,#baibo7#,#huow#,#yangbo36#,#liangping2#,#tangzh1#,#liuqg1#,#baof3#,#weijia1#,#zhangzh33#,#renys1#,#liuzh1663#,#gaoxiaolin#,#songyj1#,#wying5#,#zhangqz1#,#chenk28#,#sudi1#,#tangle#,#caix#,#xuyy3#,#kangning#,#huangxg2#,#qiaowei7#,#duanzy1#,#pangjing1#,#tianna1#,#" +
                "liuwei359#,#tangda1#,#chenjw7#,#wangjun339#,#zhaoyx129#,#chenlei#,#zhangmiao7#,#liucr2#,#baiqw1#,#zhangww36#,#zhangfu18#,#liupeng90#,#wangmin50#,#guocx36#,#bj-pingtaizx#,#wangyan511#,#zhouna5#,#yuanhd1#,#yinjy1#,#root-bj#,#liuning15#,#wangzq32#,#qinmz3#,#makai5#,#wangzs78#,#zhaoth10#,#liu33nana#,#zhangmeng9#,#dongmh1#,#wangx3#,#liuhui294#,#w" +
                "angjianzx#,#bjwlyxzb#,#xurun1#,#zhaocy113#,#liuj277#,#zhangjq127#,#lihb6#,#liw274#,#zhangn33#,#mengqs23#,#xuxin11#,, orgid=4}," +
                " {participantList=#lixp122#,#mengxb21#,#xury8#,#wanght107#,#liyb212#,#lingbw1#,#dw_chuansygcs#,#yangyj51#,#liyh216#,#tianxing1#,#songxq21#,#tianmin2#,, orgid=4001}";
        String orgid="";
        List<String> orgInfos= Arrays.asList(msg.split("},"));
        for (int i =0;i<orgInfos.size();i++) {
            if(orgInfos.get(i).contains("liyb212")){
                //取值对应的orgid
                orgid=orgInfos.get(i);
                break;
            }
        }
        orgid =  orgid.substring(orgid.indexOf("orgid"));
        String pattern = "(\\D*)(\\d+)(.*)";
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(orgid);
        if (m.find( )) {
            orgid=m.group(2);
            System.out.println("Found value: " + m.group(2) );
        }
//        System.out.println(fds.toString());
    }
}
