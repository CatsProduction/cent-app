package by.nadia.cent.controller;

import org.aspectj.weaver.ast.Test;

public class Main extends Thread{

    Main(){}

    Main(Runnable r){
        super(r);
    }


    public void run(){

        System.out.println("Inside thread ");
    }


}

class RunnableDemo implements Runnable{

    @Override
    public void run() {
        System.out.println(" Inside Runnable");
    }
}

class b{

    public static void main(String[] args) {

        new Main().start();
        new Main(new RunnableDemo()).start();
    }
}
