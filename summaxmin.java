/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectap;
import java.util.*;

/**
 *
 * @author Pishgaman
 */

public class summaxmin {
    
   public static String sum(String m,String n){
       powzarb dh=new powzarb();
       if((m.contains("sin^2") && n.contains("cos^2"))||(n.contains("sin^2") && m.contains("cos^2"))){
           if(m.substring(m.indexOf("(")+1, m.indexOf(")")).equals(n.substring(n.indexOf("(")+1, n.indexOf(")")))){
               return "1";
           }
       }
       if(m.contains("sin")||m.contains("cos")||m.contains("sinh")||m.contains("cosh")||m.contains("tan")||m.contains("cot")||m.contains("tanh")||m.contains("coth")){
           if(m.equals(n)){
               return "2"+m;
           }
           return m+"+"+n;
       }
            if(m.contains("e") && n.contains("e")){
                if(m.substring(m.indexOf("(")+1, m.indexOf(")")).equals(n.substring(n.indexOf("(")+1, n.indexOf(")")))){
                    return "2e^"+"("+m.substring(m.indexOf("(")+1, m.indexOf(")"))+")";
                }
                return "e^("+m.substring(m.indexOf("(")+1, m.indexOf(")"))+")"+"+"+"e^("+n.substring(n.indexOf("(")+1, n.indexOf(")"))+")";
            }
       if(m.contains("log") && n.contains("log")){
           String k=dh.zarb(m.substring(m.indexOf("(")+1, m.indexOf(")")),n.substring(n.indexOf("(")+1, n.indexOf(")")));
           return "log"+k;
       }
       HashMap<String,Double> d=new HashMap<>();
       HashMap<String,Double> l=new HashMap<>();
       HashMap<String,Double> javab=new HashMap<>();
       String k="";
       String[] h=m.split("\\+");
       for(String s:h){
          if(!(s.contains("x^"))){
              s+="x^0";
          }
          d.put(s.substring(s.indexOf("x"), s.length()), Double.parseDouble(s.substring(0, s.indexOf("x"))));
       }
       String[] ss=n.split("\\+");
       for(String s:ss){
           if(!(s.contains("x^"))){
              s+="x^0";
          }
          l.put(s.substring(s.indexOf("x"), s.length()), Double.parseDouble(s.substring(0, s.indexOf("x"))));
       }
       for(String o:d.keySet()){
           if((l.keySet().contains(o))){
               javab.put(o,l.get(o)+d.get(o));
           }else{
               javab.put(o, d.get(o));
           }
       }
        for(String o:l.keySet()){
           if((d.keySet().contains(o))){
               continue;
           }else{
               javab.put(o, l.get(o));
           }
       }
        for(String o:javab.keySet()){
            k+=javab.get(o)+o+"+";
        }
       return k.substring(0,k.length()-1);
   }
   public static double sum(double...m){
       double k=0;
       for(double s:m){
           k+=s;
       }
       return k;
   }
   public static double max(double...m){
       double k=m[0];
       for(double s:m){
           k= Math.max(k, s);
       }
       return k;
   }
    public static double min(double...m){
        double k=m[0];
       for(double s:m){
           k= Math.min(k, s);
       }
       return k;
   }
}
