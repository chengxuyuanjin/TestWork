package com.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author: zhanghuijin
 * @date: 2023/05/10/12:48
 * @Description:
 */
public class testStageTime {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date faultOccurTime = new Date();
        int hours =4;
        int flag = 1; //是否按时阶段反馈的标记，如果提前从循环中出来，指标不满足=0
        //算出查询阶段反馈的 开始时间，结束时间
        for(int i=hours;i>=2;i--){
            //计算阶段反馈的时间范围
            String minLimit = "";
            String maxLimit = "";
            //hours,hours-1, ..... 2
            //(hours-1:10,hours:10) 每个阶段的时间
            //计算每个阶段的左侧时间
            //计算每个阶段的右侧时间
            if(i == 2){
                //第一阶段时间特殊，为开始的两个小时
                // faultOccurTime + 0:00
                minLimit = formatter.format(faultOccurTime);

                // faultOccurTime + 2:10
                long mills = faultOccurTime.getTime();
                Date maxDate = new Date();
                maxDate.setTime(mills+1000*60*60*i+1000*60*10);
                maxLimit = formatter.format(maxDate);


            } else{
                // faultOccurTime + hours-1:10
                long mills = faultOccurTime.getTime();
                Date minDate = new Date();
                minDate.setTime(mills+1000*60*60*(i-1)+1000*60*10);
                minLimit = formatter.format(minDate);
                // faultOccurTime + hours:10
                Date maxDate = new Date();
                maxDate.setTime(mills+1000*60*60*i+1000*60*10);
                maxLimit = formatter.format(maxDate);


            }

//            String queryStageFdbkSql = "select * from T_FAULT_STAGE_FEEDBACK f\n" +
//                    "         where f.MAIN_FORM_ID='" +feedbackInfo.getMainFormId()+"'\n"+
//                    "            and f.CREATION_DATE>'" +minLimit+"'\n"+
//                    "            and f.CREATION_DATE<'"+maxLimit+"'";
//            List<Map> stageFdbkList = baseDao.findNativeSQL(queryStageFdbkSql,null);
//            if(stageFdbkList != null && stageFdbkList.size() >0){
//                //该阶段有至少一条阶段反馈
//                flag=1;
//            }else{
//                //该阶段没有一条阶段反馈记录，条件不满足，跳出循环，标记设为 0
//                flag=0;
//                break;
//            }

        }
        if(flag == 1){
            System.out.println("标记为1");
        }
    }
}
