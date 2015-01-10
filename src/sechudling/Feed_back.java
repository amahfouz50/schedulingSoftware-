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

import sun.misc.Queue;

public class Feed_back {
    Queue process1;
    Queue start;
    Queue end;
    int v;
    double TurnaroundTime[];
double averageTurnaroundTime[];
double bu[];
int v20=0;
  double averagerTurnaround=0;
    String procees[];     double wait3[];
    int flag1000=0;
    int flag10=0;
    double qu;
    int flag50=0;
    int array[];
    int array2[];
    int an;
    public Feed_back(double burst[],double quatim,String process[],double a[]) {
     process1=new Queue();
     array=new int[a.length];
     array2=new int[a.length];
     start=new Queue();
     qu=quatim;
    int c[]=new int[a.length];
     end=new Queue();
     procees=process;
     int z = 0;
     int y50=0;
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
            double ab = 0;
             int flag3=0;
             if(quatim>1){
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
break;
}
while(flag11==1&&i>0&&burst[i-1]>0){
    i--;
    break;
}

for(int m=i;m<a.length;m++){
    if(m==i){
        an=i;
   
    }
    if(i!=an){
        array[an]=0;
        c[an]=-1;
        y50=1;
    }
    if(x>0&&a[m]==x&&array[m]!=-1){
        i=m;
        flag1000=1;
   
        ab=quatim;
        quatim=1;
        v20=1;
          z=m;
    }
    if(flag50>0&&flag50<=a.length-1&&a[m]<x&&x>0&&array[m]!=-1){
        System.out.println("an"+m+"x"+x);
        quatim=1;
         i=m;
     flag50++;
              z=m;
         flag1000=1;
            v20=1;
    }

}
if(flag50==a.length-1){
    flag50=0;
}
if(flag1000==1&&z!=i&&v20==1||v20==2)
{
  
    if(z>0&&burst[z-1]>0){
   
    System.out.println(z+"wel");
    v20++;
  
    
}  }

if(v20==2){
    quatim=qu;
    v20=0;
    flag50++;
    flag10=1;
    flag1000=0;
}
if(array[i]==-1){
    System.out.println("a2"+i);
    quatim=qu;
}
if(v20==0){
 for(int m=an;m<a.length;m++){
     if(m==an){
         y50++;
     }
   
        if(array[m]==0&&array2[m]==-1){
            i=m;
            quatim=qu;
       
            
            break;
            
        }
    }
 v20=-1;
}
if(array2[i]==-1&&qu>1){
    quatim=qu;  
}
int y20=0;
if(y50==2){
array[an]=-1;
    System.out.println("we"+an);
y50=0;
}
for(int m=0;m<a.length;m++){
    if(array[m]!=-1){
        if(x==14){
            System.out.println("welcome"+i);
        }
     y20=1;   
    }
}
if(y20==0){
    quatim=burst[i];
}


                count++;
                array[i]=-1;
                 array2[i]=-1;
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
            if(v20==-1){
                  for(int mk=0;mk<a.length;mk++){
         if(c[mk]==-1){
         array[mk]=-1;
         }
     }
            }
    }
        if(qu==1){
            quatim=1;
        }}
             else {
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
break;
}
while(flag11==1&&i>0&&burst[i-1]>0){
    i--;
    break;
}

for(int m=i;m<a.length;m++){
    if(x>0&&a[m]==x){
        i=m;
        flag1000=1;
   
        ab=quatim;
        quatim=1;
        v20=1;
          z=m;
    }
    if(flag50>0&&flag50<=a.length-1&&a[m]<x&&x>0&&array[m]!=-1){
        System.out.println("an"+m+"x"+x);
        quatim=1;
         i=m;
     flag50++;
              z=m;
         flag1000=1;
            v20=1;
    }

}
if(flag50==a.length-1){
    flag50=0;
}
if(flag1000==1&&z!=i&&v20==1||v20==2)
{
  
    if(z>0&&burst[z-1]>0){
          i=z-1;
        z++;
    }
    System.out.println(z+"wel");
    v20++;
  
    
}  
if(v20==2){
    quatim=qu;
    v20=0;
    flag50++;
    flag10=1;
    flag1000=0;
}
if(array[i]==-1){
    quatim=qu;
}
                count++;
                array[i]=-1;
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
