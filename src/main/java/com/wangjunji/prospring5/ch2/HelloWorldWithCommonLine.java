package com.wangjunji.prospring5.ch2;

public class HelloWorldWithCommonLine {
    public static void main(String[] args) {
        if (args.length > 0){
            System.out.println(args[0]);
        }else{
            System.out.println("Hello world");
        }
    }
}
