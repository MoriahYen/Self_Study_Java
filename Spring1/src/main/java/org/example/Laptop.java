package org.example;

public class Laptop implements Computer {
//    public Laptop() {
//        System.out.println("Laptop Obj Crestes");
//    }
    @Override
    public void compile() {
        System.out.println("Compiling using laptop");
    }
}
