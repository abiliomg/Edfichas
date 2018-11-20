package com.company;

import java.sql.Array;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	    String conta ="1 2 3 3 + + + 3 +";
	    String[] tudo=conta.split(" ");
        LinkedStack teste=new LinkedStack();
        for(int i=0;i<tudo.length;i++){
            int aux=0;
            if(tudo[i].equals("+") || tudo[i].equals("-") || tudo[i].equals("/") || tudo[i].equals("*")){
                aux=Integer.parseInt((String)teste.pop());
                if(tudo[i].equals("+"))
                    aux+=Integer.parseInt((String)teste.pop());
                else if(tudo[i].equals("-"))
                    aux-=Integer.parseInt((String)teste.pop());
                else if(tudo[i].equals("/"))
                    aux/=Integer.parseInt((String)teste.pop());
                else if(tudo[i].equals("*"))
                    aux*=Integer.parseInt((String)teste.pop());
                teste.push(""+aux);
            }else{
                teste.push(tudo[i]);
            }
        }
        System.out.println(teste.toString());



    }
}
