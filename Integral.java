package projectap;
public class Integral {
    
    static diff s=new diff();
    static String Integral(String n){
         
         String javab="";
          if(n.substring(0, 5).equals("cot^2")){
             return "((-1/"+s.diff(n.substring(6,n.length()-1))+")"+"cot"+n.substring(5,n.length())+")"+"-x";
         }
         if(n.substring(0, 5).equals("tan^2")){
             return "((1/"+s.diff(n.substring(6,n.length()-1))+")"+"tan"+n.substring(5,n.length())+")"+"-x";
         }
         if(n.substring(0, 4).equals("coth")){
               return "(1/"+"("+s.diff(n.substring(5,n.length()-1))+"))"+"ln|"+"sinh"+n.substring(4,n.length())+"|"+"   if degree power great than 1 ,is wrong answer";
         }
          if(n.substring(0, 4).equals("tanh")){
               return "(1/"+"("+s.diff(n.substring(5,n.length()-1))+"))"+"ln|"+"cosh"+n.substring(4,n.length())+"|"+"   if degree power great than 1 ,is wrong answer";
         }
         if(n.substring(0, 4).equals("cosh")){
             return "(1/"+"("+s.diff(n.substring(5,n.length()-1))+")"+")"+"sinh"+n.substring(4,n.length())+"   if degree power great than 1 ,is wrong answer";
         }
         if(n.substring(0, 4).equals("sinh")){
             return "(-1/"+"("+s.diff(n.substring(5,n.length()-1))+")"+")"+"cosh"+n.substring(4,n.length())+"   if degree power great than 1 ,is wrong answer";
         }
         if(n.substring(0, 2).equals("e^")){
             return n+"/"+"("+s.diff(n.substring(3,n.length()-1))+")";
         }
         if(n.substring(0, 3).equals("cot")){
             return "(-1/"+"("+s.diff(n.substring(4,n.length()-1))+"))"+"ln|"+"sin"+n.substring(3,n.length())+"|"+"   if degree power great than 1 ,is wrong answer";
         }
         if(n.substring(0, 3).equals("tan")){
             return  "(1/"+"("+s.diff(n.substring(4,n.length()-1))+"))"+"ln|"+"cos"+n.substring(3,n.length())+"|"+"   if degree power great than 1 ,is wrong answer";
         }
         if(n.substring(0,3).equals("cos")){
             return "(1/"+"("+s.diff(n.substring(4,n.length()-1))+")"+")"+"sin"+n.substring(3,n.length())+"   if degree power great than 1 ,is wrong answer";
         }
          if(n.substring(0,3).equals("sin")){
              return "(-1/"+"("+s.diff(n.substring(4,n.length()-1))+")"+")"+"cos"+n.substring(3,n.length())+"   if degree power great than 1 ,is wrong answer";
          }
          n+="+";
           String[] zarib=new String[n.length()];
      String[] pow=new String[n.length()];
for(int i=0;i<n.length();){
                  String k="";
                  int h=n.indexOf('x', i);
                  int ll=n.indexOf("+", i+1);
                  if(!(n.substring(i, ll).contains("x"))){
                      javab+=""+n.substring(i,ll)+"x^1"+"+";
                  }
                  else{
                  k+=n.substring(i,h);
           zarib[i]=k;
                  k="";
                  k+=n.substring(h+2, ll);
           pow[i]=k;
            int dd;
            int cc;
            dd=Integer.parseInt(pow[i]);
            cc=Integer.parseInt(zarib[i]);
            if(dd==-1){
                javab+=""+cc+"ln(x) +";
            }else{
            float m=(float)cc/(dd+1);
            javab+=""+m+"x^"+(dd+1)+"+";}}
                      i=ll+1;
       }
        javab+="c";
        return javab;
     }
}
