package com.company;

/**
 * Created by Sjodi442 on 3/18/2017.
 */
public class animal {
    public String name;
    int umur;
    //construct
    public animal(String name, int umur){
    this.name = name;
    this.umur = umur;
    }
    //tampil
    public void tampil(){
        System.out.println("nama hewan : "+this.name);
        System.out.println("umur hewan : "+this.umur);
    }
}
