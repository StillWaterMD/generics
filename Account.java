package com.company;

public class Account<Type> {


    private Type id;
    private String Name;

    Account(Type id,String Name){

        this.id=id;
        this.Name=Name;

    }

    Account(){

    }

    public void print(){

        System.out.println(id+" "+Name);
    }
}
