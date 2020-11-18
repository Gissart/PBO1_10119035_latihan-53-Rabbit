package com.tugasPBO;

/*
* Nama      : Argya Aulia Fauzandika
* NIM       : 10119035
* Kelas     : PBO1 / IF1
* Deskripsi : Menampilkan child class yang mengextend parent class serta menerapkan overriding
*
* */
public class Main {
    public static void main(String[] args){
        Rabbit rab = new Rabbit("Peter",false,"grass",4,"grey");
        System.out.println("Hello, His name is "+rab.getName());
        System.out.println(rab.getName()+" is vegetarian ? "+rab.isVegetarian());
        System.out.println(rab.getName()+" eats "+rab.getEats());
        System.out.println(rab.getName()+" has "+rab.getNoOfLegs()+" legs");
        System.out.println(rab.getName()+" color is "+rab.getColor());
    }
}
