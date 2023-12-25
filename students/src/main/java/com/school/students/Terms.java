package com.school.students;

public class Terms {
    private boolean term1;
    private boolean term2;
    private boolean term3;
    private boolean term4;

    public Terms() {
    }

    public Terms(boolean term1, boolean term2, boolean term3, boolean term4) {
        this.term1 = term1;
        this.term2 = term2;
        this.term3 = term3;
        this.term4 = term4;
    }

    public Terms(Terms term){
        this.term1 = isTerm1();
        this.term2 = isTerm2();
        this.term3 = isTerm3();
        this.term4 = isTerm4();
    }

    public boolean isTerm1() {
        return term1;
    }

    public void setTerm1(boolean term1) {
        this.term1 = term1;
    }

    public boolean isTerm2() {
        return term2;
    }

    public void setTerm2(boolean term2) {
        this.term2 = term2;
    }

    public boolean isTerm3() {
        return term3;
    }

    public void setTerm3(boolean term3) {
        this.term3 = term3;
    }

    public boolean isTerm4() {
        return term4;
    }

    public void setTerm4(boolean term4) {
        this.term4 = term4;
    }

    public String toString(){
        return ""+isTerm1()+isTerm2()+isTerm3()+isTerm4();
    }
}
