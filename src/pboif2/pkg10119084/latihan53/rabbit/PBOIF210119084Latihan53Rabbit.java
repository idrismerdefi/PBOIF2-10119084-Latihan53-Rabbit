/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan53.rabbit;
/**
NAMA : MUHAMMAD IDRIS MERDEFI
KELAS : PBOIF2
NIM : 10119084
DESKRIPSI PROGAM : PROGRAM INI BERISI PROGRAM Rabbit
 */
public class PBOIF210119084Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rabbit rabbit = new Rabbit("Peter", false,"grass", 4,"grey");
       System.out.println("Hello, his name is "+rabbit.getName());
       System.out.println(rabbit.getName()+" is vegetarian? "+rabbit.isVegetarian());
       System.out.println(rabbit.getName()+" has "+rabbit.getNoOfLegs()+" legs");
       System.out.println(rabbit.getName()+" color is "+rabbit.getColor());
    }
    
}
