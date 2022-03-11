/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectap;

import java.util.HashMap;

/**
 *
 * @author Pishgaman
 */
public class powzarb {
    
    public static String zarb(String m,String n){
        summaxmin sum1=new summaxmin();
        if(m.contains("@") && n.contains("@")){
            if(m.substring(0,m.indexOf("@")).equals(n.substring(0,n.indexOf("@")))){
                return m.substring(0,m.indexOf("@"))+"^(" + sum1.sum(m.substring(m.indexOf("(")+1, m.indexOf(")")),n.substring(n.indexOf("(")+1, n.indexOf(")")))+")";
            }
            if(m.substring(m.indexOf("(")+1, m.indexOf(")")).equals(n.substring(n.indexOf("(")+1, n.indexOf(")")))){
                try{
                    return (Integer.parseInt(m.substring(0,m.indexOf("@")))*Integer.parseInt(n.substring(0,n.indexOf("@")))+"^("+n.substring(n.indexOf("(")+1, n.indexOf(")")))+")";
                }catch(Exception e){
                    return m.substring(0,m.indexOf( "@"))+"*"+n.substring(0,n.indexOf("@"))+"^("+n.substring(n.indexOf("(")+1, n.indexOf(")"))+")";
                }
            }
            return m+"*"+n;
        }
        if(m.contains("log") && n.contains("log")){
            return m+"*"+n;
        }
        HashMap<String,Double> d=new HashMap<>();
       HashMap<String,Double> l=new HashMap<>();
       HashMap<String,Double> javab=new HashMap<>();
       String k="";
       if(!m.contains("+")){
           m+="+";
       }
       if(!n.contains("+")){
           n+="+";
       }
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
       for(String dd:d.keySet()){
           for(String ll:l.keySet()){
               int mm=dd.indexOf("^");
               int nn=ll.indexOf("^");
               int b=Integer.parseInt(dd.substring(mm+1,dd.length()))+Integer.parseInt(ll.substring(nn+1, ll.length()));
               String poww="x^"+b;
               if(javab.keySet().contains(poww)){
                   double mm2=javab.get(poww);
                   javab.put(poww, mm2+(d.get(dd)*l.get(ll)));
               }else{
               javab.put(poww, d.get(dd)*l.get(ll));}
           }
       }
       for(String  jj:javab.keySet()){
          k+=javab.get(jj)+jj+"+";
       }
       return k.substring(0, k.length()-1);
    }
    public static String power(String a){
        String k=a.substring(a.indexOf(")^")+2,a.length());
        int m=Integer.parseInt(k);   
        if( m==1){
            return a;
        }
        a=a.substring(a.indexOf("(")+1,a.indexOf(")"));
        String n=a;
        for(int i=1;i!=m;i++){
             n=zarb(n,a);
        }
        n=n.replace("x^0", "");
        return n;
    }
}
