package com.company;
/*
* 类的封装
*
* 1 把属性私有化   2用方法对外提供访问或设置
* */
public class Person {


        private String name;
        private int  age;
        private double hight;

        //getter   setter
        public void setName(String name){

            this.name=name;
        }
        public String getName(){

            return  this.name;
        }


        public  void  setAge(int age){
            this.age=age;

        }

        public  double   getAge(){

            return this.age;
        }


      public  void  setHight(double hight){
        this.hight=hight;

     }

      public  double   getHight(){
        return this.hight;
     }

}
