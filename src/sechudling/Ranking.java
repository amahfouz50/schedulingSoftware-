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


public class Ranking {

    public Ranking(double x[],double a[],String c[]) {
           int out;
        int in;
        for(out=a.length-1;out>=1;out--){
            for(in=0;in<out;in++){
               if(a[in]>a[in+1]){
                double temp=a[in];
                  double temp1=x[in];
                  String temp3=c[in];
                   a[in]=a[in+1];
                   a[in+1]=temp;
                     x[in]=x[in+1];
                   x[in+1]=temp1;
                    c[in]=c[in+1];
                   c[in+1]=temp3;
               } 
            }
        }
    }
    
}
