package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Random rand =new Random();

        rand.nextGaussian();


        Account acc1=new Account<String>("dorou","Dmitrii");
        acc1.print();
        Account acc2=new Account<Double>(356.11,"Kyle");
        acc2.print();

        Account [] acc3= new Account[4];

        acc3[0]= new Account<String>("","Vasya");
        acc3[1]=new Account<Integer>(10,"Kyle");
        acc3[2]=new Account<Double>(35.11,"Inokenty");
        acc3[3]= new Account<String>(""+rand.nextGaussian()+" "+ rand.nextGaussian(),"Petr");



        for(Account i:acc3){
            i.print();
        }

    }
}
