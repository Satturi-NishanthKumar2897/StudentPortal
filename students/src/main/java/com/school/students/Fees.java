package com.school.students;

public class Fees {
    int receipt_no;
    int admn_no;
    String student_name;
    String father_name;
    String standard;
    double fee;
    
    String date;

    public Fees(){}
    
    public Fees(int receipt_no, int admn_no, String student_name, String father_name, String standard, double fee,String date) {
        this.receipt_no = receipt_no;
        this.admn_no = admn_no;
        this.student_name = student_name;
        this.father_name = father_name;
        this.standard = standard;
        this.fee = fee;
        this.date = date;
    }
    public int getReceipt_no() {
        return receipt_no;
    }
    public void setReceipt_no(int receipt_no) {
        this.receipt_no = receipt_no;
    }
    public int getAdmn_no() {
        return admn_no;
    }
    public void setAdmn_no(int admn_no) {
        this.admn_no = admn_no;
    }
    public String getStudent_name() {
        return student_name;
    }
    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
    public String getFather_name() {
        return father_name;
    }
    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }
    public String getStandard() {
        return standard;
    }
    public void setStandard(String standard) {
        this.standard = standard;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
