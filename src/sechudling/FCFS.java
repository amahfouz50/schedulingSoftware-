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


public class FCFS {
double start[];
double end[];
  double averagerTurnaround;
double wait[];
double totalwait=0;
double TurnaroundTime[];
double averageTurnaroundTime[];
    public FCFS(double a[],double b[]) {
        TurnaroundTime=new double[a.length];
       averageTurnaroundTime=new double[a.length];
       end=new double[a.length];
        start=new double[a.length];
       double  x=a[0];
        wait=new double[a.length];
        for(int i=0;i<a.length;i++){
            start[i]+=x;
           
            x+=b[i];
       
       end[i]=x;
        
        }
      
       for(int i=0;i<a.length;i++){
         wait[i]=start[i]-a[i];
         totalwait+=wait[i];
        
       }
          for(int i=0;i<a.length;i++){
     
         TurnaroundTime[i]=end[i]-a[i];
       }
      
              for(int i=0;i<a.length;i++){
     
         averageTurnaroundTime[i]=TurnaroundTime[i]/b[i];
        averagerTurnaround+=averageTurnaroundTime[i];
       } 
              
    }
    
}
