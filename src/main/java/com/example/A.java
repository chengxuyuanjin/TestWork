package com.example;

public class A {
    private String aaa;
    private String bbb;
    private String ccc;
    public A(String aaa,String bbb){
        this.aaa=aaa;
        this.bbb=bbb;
    }
    public A(String ccc){
        this.ccc=ccc;
    }
    public A(){

    }

    public String getAaa() {
        return aaa;
    }

    public void setAaa(String aaa) {
        this.aaa = aaa;
    }

    public String getBbb() {
        return bbb;
    }

    public void setBbb(String bbb) {
        this.bbb = bbb;
    }

    public String getCcc() {
        return ccc;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }
}
