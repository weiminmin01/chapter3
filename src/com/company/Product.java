package com.company;

public class Product {
    private  int id;
    private  double price;
    private  int  count;

    //setter  getter
    public  void  setId(int id){
        this.id=id;

    }

    public  int   getId(){
        return this.id;
    }

    public  void  setPrice(int price){
        this.price=price;

    }

    public  double   getPrice(){
        return this.price;
    }


    public  void setCount  (int count){
        this.count=count;

    }

    public  int   getCount(){
        return this.count;
    }
}
