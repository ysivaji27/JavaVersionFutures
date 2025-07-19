package com.java.practice.hr.test01;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class TESTClass {
        public static void main(String[] args){
            Class student = new TESMethod().getClass();
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method method : methods){
                methodList.add(method.getName());
            }
            Collections.sort(methodList);
            for(String name : methodList){
                System.out.println(name);
            }
        }
}
class TESMethod{
    public String ahqym() { return ""; }
    public String amftc() { return ""; }
    public String anotherfunction() { return ""; }
    public String atcks() { return ""; }
    public String bwkbd() { return ""; }
    public String cfwyc() { return ""; }
    public String cmkxa() { return ""; }
    public String dnpym() { return ""; }
    public String dnqvo() { return ""; }
    public String dvvwq() { return ""; }
    public String ehjdm() { return ""; }
    public String elyed() { return ""; }
    public String fmyce() { return ""; }
    public String getEmail() { return ""; }
    public String getId() { return ""; }
    public String getName() { return ""; }
    public String ghtlj() { return ""; }
    public String hluvb() { return ""; }
    public String isqdf() { return ""; }
    public String iwhtf() { return ""; }
    public String jmopy() { return ""; }
    public String jnskt() { return ""; }
    public String kbjlt() { return ""; }
    public String kgwku() { return ""; }
    public String khuag() { return ""; }
    public String levtp() { return ""; }
    public String mcgme() { return ""; }
    public String migyc() { return ""; }
    public String moebl() { return ""; }
    public String nixhb() { return ""; }
    public String odyqp() { return ""; }
    public String ogvdl() { return ""; }
    public String ormim() { return ""; }
    public String piwro() { return ""; }
    public String plaob() { return ""; }
    public String pnruo() { return ""; }
    public String pqfct() { return ""; }
    public String ptrup() { return ""; }
    public String pvgyp() { return ""; }
    public String qthde() { return ""; }
    public String rmjig() { return ""; }
    public String setEmail() { return ""; }
    public String setId() { return ""; }
    public String setName() { return ""; }
    public String sumvl() { return ""; }
    public String tkbpp() { return ""; }
    public String tntpj() { return ""; }
    public String toxdp() { return ""; }
    public String twyfa() { return ""; }
    public String uccfq() { return ""; }
    public String ujxei() { return ""; }
    public String vhxoi() { return ""; }
    public String viwuu() { return ""; }
    public String viyog() { return ""; }
    public String whjtj() { return ""; }
    public String ytijy() { return ""; }
}
