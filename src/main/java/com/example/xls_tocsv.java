package com.example;

import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class xls_tocsv {
    public static void main(String[] args) {
        File file=new File("D:\\迅雷下载\\2022-11-24故障单列表-日报(河北省分公司).xls");
        // 设置读文件编码
        WorkbookSettings setEncode = new WorkbookSettings();
        setEncode.setEncoding("GB2312");
        String buffer = "";
        try{
            Workbook wb = Workbook.getWorkbook(file, setEncode);
            jxl.Sheet sheet = wb.getSheet(0);
            String dest = "";

            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            for (int m = 0; m < sheet.getRows(); m++) {
                for (int j = 0; j < sheet.getColumns(); j++) {
                    Boolean ifDate=true;
                    jxl.Cell cell = sheet.getCell(j, m);
                    try {
                        sdf.parse(cell.getContents());
                    }catch (Exception e){
                        ifDate=false;
                    }
                    if(ifDate){
                        dest=cell.getContents();
                    }else{
                        Pattern p = Pattern.compile("\\s*|\t|\r|\n");
                        Matcher matcher = p.matcher(cell.getContents());
                        dest = matcher.replaceAll("");
                    }

                    buffer += dest.replaceAll("\\|\\|", "") + "||";
                }
                buffer = buffer.substring(0, buffer.lastIndexOf("||")).toString();
                buffer += "\n";
            }
            //write the string into the file
            String savePath = "2022-11-24故障单列表-日报(河北省分公司).csv";
            File saveCSV = new File(savePath);
            try {
                if (!saveCSV.exists())
                    saveCSV.createNewFile();
                BufferedWriter writer = new BufferedWriter(new FileWriter(saveCSV));
                writer.write(buffer);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
