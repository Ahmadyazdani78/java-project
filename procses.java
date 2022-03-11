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
public class procses {
    static HashMap<String , String> memory =new  HashMap<String , String>();
    public static String pr(String b){
             powzarb powzarb1=new powzarb();
        summaxmin sum1=new summaxmin();
        function func=new function();
        Integral Int=new Integral();
        diff diff1=new diff();
           try{
         
          int k=b.indexOf(":");
          if(b.contains("Integral")){
              String dd=b.substring(0,b.indexOf("="));
              memory.put(dd, Int.Integral(b.substring(k+1,b.length())));
               return Int.Integral(b.substring(k+1,b.length()));
          }
          if(b.contains("diff")){
               String dd=b.substring(0,b.indexOf("="));
              memory.put(dd,diff1.diff(b.substring(k+1,b.length())));
                 return diff1.diff(b.substring(k+1,b.length()));
          }
          if(b.contains("subs")){
              String hh=b.substring(b.indexOf("(")+1,b.indexOf(","));
              String kk=b.substring(b.indexOf(",")+1,b.indexOf(")"));
              String uu=memory.get(kk);
             String javab= uu.replace("x","*"+ hh);
              return javab;
          }
          if(b.contains("function:")){
              //func.function(b);
              String hh=b.substring(b.indexOf("=")+1,b.length());
              String kk=b.substring(b.indexOf(":")+1,b.indexOf("="));
              memory.put(kk, hh);
              return "saved to memory";
          }
              if(b.contains("value")){
                 int fg=b.indexOf("(");
                 int dc=b.indexOf(",");
                 String ki=b.substring(fg+1,dc);
                 String kl=b.substring(dc+1,b.length()-1);
                return ""+func.value(Integer.parseInt(ki),memory.get(kl));
              }
              if(b.contains("sum")){
                  try{
                      String[] sss=b.substring(b.indexOf("(")+1,b.indexOf(")")).split(",");
                         double[] hhh=new double[sss.length];
                      int i=0;
                      for(String lll:sss){
                          hhh[i]=Double.parseDouble(lll);
                           i+=1;
                      }
                       return ""+sum1.sum(hhh);
                     
                  }catch(Exception e1){
                      String m=b.substring(b.indexOf("(")+1,b.indexOf(","));
                      String n=b.substring(b.indexOf(",")+1,b.length()-1);
                      if(memory.keySet().contains(m)){
                          m=memory.get(m);
                      }
                      if(memory.keySet().contains(n)){
                          n=memory.get(n);
                      }
                      memory.put(b.substring(0,b.indexOf("=")), sum1.sum(m,n));
                      return sum1.sum(m,n);
                  }
                 
              } if(b.contains("max")){
//                      System.out.print("max=");
                       String[] sss=b.substring(b.indexOf("(")+1,b.indexOf(")")).split(",");
                            double[] hhh=new double[sss.length];
                      int i=0;
                      for(String lll:sss){
                          hhh[i]=Double.parseDouble(lll);
                           i+=1;
                      }
                      return ""+ sum1.max(hhh);
                  }
               if(b.contains("min")){
//                      System.out.print("min=");
                       String[] sss=b.substring(b.indexOf("(")+1,b.indexOf(")")).split(",");
                            double[] hhh=new double[sss.length];
                      int i=0;
                      for(String lll:sss){
                          hhh[i]=Double.parseDouble(lll);
                           i+=1;
                      }
                      return ""+sum1.min(hhh);
                  }
               if(b.contains("zarb")){
                   String m=b.substring(b.indexOf("(")+1,b.indexOf(","));
                      String n=b.substring(b.indexOf(",")+1,b.length()-1);
                      if(memory.keySet().contains(m)){
                          m=memory.get(m);
                      }
                      if(memory.keySet().contains(n)){
                          n=memory.get(n);
                      }
                       memory.put(b.substring(0,b.indexOf("=")), powzarb1.zarb(m,n));
                      return powzarb1.zarb(m,n);
               }
               if(b.contains("print(")){
                   return memory.get(b.subSequence(b.indexOf("(")+1, b.length()-1));
               }
               if(b.contains("power")){
                   
                   String m=b.substring(b.indexOf(":")+2,b.indexOf(")^"));
                      String n=b.substring(b.indexOf(")^")+2,b.length());
                      if(memory.keySet().contains(m)){
                          m=memory.get(m);
                      }
                     memory.put(b.substring(0,b.indexOf("=")), powzarb1.power(("("+m+")"+"^"+n)));
                      return powzarb1.power(("("+m+")"+"^"+n));
               }
               if(b.contains("restart")){
                   memory.clear();
                   return "restart is sucsesfully";
               }
               if(b.contains("the end")){
                   return "Do not be tired";
               }}
          catch(Exception e){
              return "syntax is eror";
          }
           return "not difined";
    }
    
}
