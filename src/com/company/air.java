package com.company;

/**
 * Created by Sjodi442 on 3/18/2017.
 */
public class air extends animal {
    public String jenis;
    //construct
    public air (String name, int umur, String jenis){
        super(name, umur);
        this.jenis = jenis;
    }
    //tampil
    public void tampil(){
        System.out.println("nama hewan : "+this.name);
        System.out.println("umur hewan : "+this.umur);
        System.out.println("jenis air : "+this.jenis);
    }
}
