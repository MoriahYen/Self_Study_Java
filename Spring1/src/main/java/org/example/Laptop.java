package org.example;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Obj Crested");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using laptop");
    }
}
