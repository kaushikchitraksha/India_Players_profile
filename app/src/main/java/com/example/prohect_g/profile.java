package com.example.prohect_g;

public class profile {

    private int pImg;
    private String pName;
    private String pRole;
    private String ptestRank;
    private String pOdiRank;
    private String ptRank;


    public profile(int Img,String Name,String Role,String testRank,String OdiRank,String tRank){
        pImg  = Img;
        pName = Name;
        pRole = Role;
        ptestRank = testRank;
        pOdiRank = OdiRank;
        ptRank = tRank;
    }

    public int getpImg() {
        return pImg;
    }
    public String getpName(){
        return pName;
    }
    public String getpRole(){
        return pRole;
    }
    public String getPtestRank(){
        return ptestRank;
    }
    public String getpOdiRank(){
        return pOdiRank;
    }
    public String getPtRank(){
        return ptRank;
    }
}
