/*
 *   I am Ahmed Reda Mahfouz
 *   Student at the Faculty of Computing and Information Menoufia University 
 *   Department of Computer Science
 *
 *   *       Please Visit us at www.github.com/amahfouz50     *
 *  This Program was Developed by www.github.com/amahfouz50 forums Team
 *  *           Please Don't Remove This Comment       *
 */  

/**
 *
 *   @author Ahmed Mahfouz
 */
package sechudling;


public class Short_process_next {
 double start[];
double end[];
  double averagerTurnaround;
double wait[];
double totalwait=0;
double TurnaroundTime[];
double averageTurnaroundTime[];
    public Short_process_next(double a[],double b[],String pro[]) {
        TurnaroundTime=new double[a.length];
       averageTurnaroundTime=new double[a.length];
       end=new double[a.length];
        start=new double[a.length];
       double  x=0;
        wait=new double[a.length];
        for(int i=0;i<a.length;i++){
         
            int z=i;
            int flag=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<=x){
                       System.out.println(z);
                    z++;
                    
                }
            }
          
         int out;
        int in;
          
        for(out=z;out>=i;out--){
           
            for(in=i;in<out;in++){
               if(b[in]>b[in+1]){
                double temp=b[in];
                  double temp1=a[in];
                  String temp3=pro[in];
                   b[in]=b[in+1];
                   b[in+1]=temp;
                     a[in]=a[in+1];
                 a[in+1]=temp1;
                    pro[in]=pro[in+1];
                   pro[in+1]=temp3;
               } 
            }
        }
            
            start[i]+=x;
           
            x+=b[i];
       
       end[i]=x;
        
        
        }
          System.out.println("asdd");
       for(int i=0;i<a.length;i++){
         wait[i]=start[i]-a[i];
         totalwait+=wait[i];
        
       }
        System.out.println("aggg");
          for(int i=0;i<a.length;i++){
     
         TurnaroundTime[i]=end[i]-a[i];
       }
      
              for(int i=0;i<a.length;i++){
     
         averageTurnaroundTime[i]=TurnaroundTime[i]/b[i];
         averagerTurnaround+=averageTurnaroundTime[i];
       }
              System.out.println("j");
              
    }
   
}
