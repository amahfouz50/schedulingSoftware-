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

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Queue;


public class Rod_robin {
    Queue process1;
    Queue start;
    Queue end;
    int v;
    double TurnaroundTime[];
double averageTurnaroundTime[];
double bu[];
  double averagerTurnaround=0;
    String procees[];     double wait3[];
    public Rod_robin(double burst[],double quatim,String process[],double a[]) {
     process1=new Queue();
     start=new Queue();
     end=new Queue();
     procees=process;
     
    bu=new double[burst.length];
    for(int i=0;i<burst.length;i++){
        bu[i]=burst[i];
    }
       TurnaroundTime=new double[burst.length];
       averageTurnaroundTime=new double[burst.length];
     v=burst.length;
     int x=0;
     int count=0;

     int falg20=-1;
             int flag11=0;
        while (true) {    
           
       
            outer:{
            for(int i=0;i<burst.length;i++){
            System.out.println(burst[0]);
          while(i<burst.length&&burst[i]==0.0){
       
                i++;
           
         
          if(i==burst.length){
              break outer;
          }
            }
while(i>0&&(a[i]>x||i==falg20)&&burst[i-1]>0){
i--;
flag11=1;
}
while(flag11==1&&i>0&&burst[i-1]>0){
    i--;
}

                
                count++;
                if(burst[i]>quatim){
                    start.enqueue(x);
                    burst[i]=burst[i]-quatim;
                    x+=quatim;
                    end.enqueue(x);
                    process1.enqueue(process[i]);
                }
                else {
                   start.enqueue(x);
                   x+=burst[i];
                   end.enqueue(x);
                   burst[i]=0;
                                       process1.enqueue(process[i]);

                  }
                falg20=i;
           flag11=0; }}
            int flag=0;
            for(int i=0;i<burst.length;i++){
                if(burst[i]>0){
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
       System.out.println(count);
        array(process1, start, end, count);
      
       wait3=wait2();
      int flag2 = 0;
       int h=0;
       int flag100[]=new int[end1.length];
       outer:{
       for(int i=0;i<end1.length;i++){
           while(h>0&&(pr[i].equals(pr[flag2])||flag100[i]==-1)){
               i++;
             
               if(i==pr.length-1){
                   break;
               }
           }
       
           for(int j=0;j<end1.length;j++){
     if(pr[i].endsWith(pr[j])){
        flag2=j; 
          flag100[j]=-1;
     }
        
       }
       TurnaroundTime[h]= end1[flag2]-a[h];  
          
        
    h++;
    if(h==v){
        break;
    }
    }}
    for(int i=0;i<v;i++){
  averageTurnaroundTime[i]=TurnaroundTime[i]/bu[i];  
        System.out.println(averageTurnaroundTime[i]+" "+i+" "+bu[i]+"ss");
  averagerTurnaround+=averageTurnaroundTime[i];
        System.out.println(averagerTurnaround+"ev");
    }    
    }
 String pr[];
 double start1[];
 double end1[];
  public void array(Queue pro,Queue start,Queue end,int count){
     pr=new String[count];
     start1=new double[count];
     end1=new double[count];
     for(int i=0;i<count;i++){
         try {
             pr[i]=(String) pro.dequeue();
             start1[i]=Double.parseDouble(start.dequeue().toString());
             end1[i]=Double.parseDouble(end.dequeue().toString());
            
         } catch (InterruptedException ex) {
             System.out.println("eror");
         }
     }
      
      
  }
  double totalwait=0;
  public double []wait2(){
    double wait1[]=new double[v];
    double star[]=new double[start1.length];
    double end2[]=new double[end1.length];
       for(int j=0;j<start1.length;j++){
         star[j]=start1[j];
       end2[j]=end1[j];
        }
    for(int i=0;i<v;i++){
        int flag=i;
           wait1[i]=start1[i];
        for(int j=i+1;j<start1.length;j++){
       
            if(pr[i].equals(pr[j])){
                if(star[j]>0){
               wait1[i]+=star[j]-end2[flag]; 
                   
               flag=j;
            }}
        }
     
       System.out.println(wait1[i]);
   
        totalwait+=wait1[i];
      
    }
        return wait1;
}
    
}