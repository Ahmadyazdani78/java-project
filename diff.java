
package projectap;


public class diff {
         static String diff(String n){
         
         String javab="";
         if(n.contains("*")){
             int b=n.indexOf("(");int h=n.indexOf(")");int l=n.indexOf("(",h);int t=n.indexOf(")",l);
             return n.substring(b+1,h)+"*"+diff(n.substring(l+1,t))+"+"+n.substring(l+1,t)+diff( n.substring(b+1,h));
         }
         if(n.substring(0,4).equals("cot(")){
               return "-("+diff(n.substring(4, n.length()-1))+")"+"(1+cot^2"+n.substring(3,n.length())+")";
         }
         if(n.substring(0, 4).equals("tan(")){
             return diff(n.substring(4, n.length()-1))+"(1+tan^2"+n.substring(3,n.length())+")";
         }
         if(n.substring(0,2).equals("ln")){
             return "("+diff(n.substring(3,n.length()-1))+")"+"/"+"("+n.substring(3,n.length()-1)+")";
         }
         if(n.substring(0,2).equals("e^")){
             return "("+diff(n.substring(3,n.length()-1))+")"+n;
         }
         if(n.substring(0,4).equals("cos(")){
             return "("+"-("+diff(n.substring(4,n.length()-1))+")"+")"+"sin"+n.substring(3,n.length());
         }
         if(n.substring(0, 4).equals("sin(")){
              return "("+"("+diff(n.substring(4,n.length()-1))+")"+")"+"cos"+n.substring(3,n.length());
          }
         n+="+";
           
              String[] zarib=new String[n.length()];
      String[] pow=new String[n.length()];
       for(int i=0;i<n.length();){
                  String k="";
                  int h=n.indexOf('x', i);
                  int ll=n.indexOf("+", i+1);
                  if(!(n.substring(i,ll).contains("x"))){
                      if(ll+2>n.length()){
                          javab+="0";
                      }else{javab+="0+";}
                  }else{
                  k+=n.substring(i,h);
           zarib[i]=k;
                  k="";
                  k+=n.subSequence(h+2, ll);
           pow[i]=k;
            int dd;
            int cc;
            dd=Integer.parseInt(pow[i]);
            cc=Integer.parseInt(zarib[i]);
            float m=(float)dd*cc;
            if(ll+2>n.length()){
                javab+=""+m+"x^"+(dd-1);
            }else{
            javab+=""+m+"x^"+(dd-1)+"+";}}
                      i=ll+1;
       }
        return javab;
     }

   
}

