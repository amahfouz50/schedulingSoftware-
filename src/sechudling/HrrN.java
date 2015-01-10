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


public class HrrN {
   double start[];
double end[];
  double averagerTurnaround;
double wait[];
int flag2[];
int flag=0;
double totalwait=0;
double TurnaroundTime[];
double averageTurnaroundTime[];
    public HrrN(double a[],double b[],String pro[]) {
        double wait2[]=new double[a.length];
        double r=0;
        for(int i=0;i<a.length;i++){
            wait2[i]=r;
            wait2[i]=wait2[i]-a[i];
            System.out.println("qh"+wait2[i]);
            r+=b[i];
        }
        flag2=new int[a.length];
        TurnaroundTime=new double[a.length];
       averageTurnaroundTime=new double[a.length];
       double ratio[]=new double[a.length];
       end=new double[a.length];
        start=new double[a.length];
       double  x=0;
        wait=new double[a.length];
        for(int i=0;i<a.length;i++){
         
            int z=i;
            int flag=i;
           
            for(int j=i;j<a.length;j++){
                if(a[j]<=x){
                   
                       
                    z++;
           flag=1;         
                }
            }
            
          
          for(int m=i;m<z;m++){
            ratio[m]=(wait2[m]+b[m])/b[m];
              System.out.println(wait2[m]+"k");   
             
          }
          
         int out;
        int in;
          
        for(out=z-1;out>=i;out--){
           
            for(in=i;in<out;in++){
               if(ratio[in]<ratio[in+1]){
                double temp=b[in];
                  double temp1=a[in];
                    double temp14=wait2[in];
                  String temp3=pro[in];
                   double temp4=ratio[in];
                   b[in]=b[in+1];
                   b[in+1]=temp;
                     a[in]=a[in+1];
                 a[in+1]=temp1;
                    pro[in]=pro[in+1];
                   pro[in+1]=temp3;
                    ratio[in]=ratio[in+1];
                   ratio[in+1]=temp4;
                   wait2[in]=wait2[in+1];
                   wait2[in+1]=temp14;
                   
               } 
            }
        }
            
     
            start[i]+=x;
           
            x+=b[i];
       
       end[i]=x;
        
        
        }
          System.out.println("asdd"+x);
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
