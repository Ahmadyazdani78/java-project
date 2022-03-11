/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectap;

/**
 *
 * @author Pishgaman
 */
import java.util.*;
public class function {
    static String function(String n) {
        return n;
    } 
    static Double value(double s,String n){
                   ArrayList<String> zarib=new ArrayList<String>();
      ArrayList<String> pow=new ArrayList<String>();
      ArrayList<Double> x=new ArrayList<Double>();
      n+="+";
      double javab=0;
      if(n.contains("sin")){
         return Math.sin(value(s,n.substring(n.indexOf("(")+1, n.indexOf(")"))));
      }
       for(int i=0;i<n.length();){
                  String k="";
                  int h=n.indexOf("x", i);
                  int ll=n.indexOf("+", h);
                  k+=n.substring(i,h);
           zarib.add(k);
          double z= Double.parseDouble(k);
                  k="";
                  k+=n.subSequence(h+2, ll);
           pow.add(k);
             double tt=Double.parseDouble(k);
               double d=(double) Math.pow(s, tt);
             javab+=(float)z*d;
                      i=ll+1;
       }

       return javab;
    }
}

