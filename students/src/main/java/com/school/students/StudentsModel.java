package com.school.students;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

@Service
public class StudentsModel {

    @Value("${excel.file}")
    private String path;

    public Map<Integer, List<String>> readJExcel(String fileLocation) 
      throws IOException, BiffException {
        System.out.println(fileLocation);
        Map<Integer, List<String>> data = new HashMap<>();

        Workbook workbook = Workbook.getWorkbook(new File(fileLocation));
        Sheet sheet = workbook.getSheet(0);
        int rows = sheet.getRows();
        int columns = sheet.getColumns();
        int key;
        for (int i = 1; i < rows; i++) {
            key = Integer.parseInt(sheet.getCell(1,i).getContents());
            data.put(key, new ArrayList<String>());
            for (int j = 0; j < columns; j++) {
                data.get(key)
                  .add(sheet.getCell(j, i)
                  .getContents());
            }
        }
        return data;
    }


    public Fees getFees(int id, String term) {
        Map<Integer,List<String>> data = null;
        try {
            data = readJExcel(path);
        } catch (BiffException | IOException e) {
            e.printStackTrace();
        }

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
        Date date = new Date();  
        String dateValue = formatter.format(date);
        List<String> match = data.get(id);
        System.out.println(match);
        String fee = "";
        switch (term) {
            case "term1":
                fee = match.get(5);
                break;
            case "term2":
                fee = match.get(6);
                break;
            case "term3":
                fee = match.get(7);
                break;
            case "term4":
                fee = match.get(8);
                break;
            default:
                break;
        }
        Fees fees = new Fees(1234,id,match.get(2),match.get(3),match.get(4),Double.valueOf(fee),dateValue);
        return fees;
    }
    
}
