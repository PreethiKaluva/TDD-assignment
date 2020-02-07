package com.company;

import jdk.swing.interop.SwingInterOpUtils;

class square {


   private static read readnumber=new read();
   private static double s;

    square() throws Exception {
    }

    public void setreadobject(read file){
    this.readnumber=file;
}


   public static boolean isPerfectSquare() throws Exception {
       s=readnumber.reader("test.txt");
       System.out.println( "value from the text file is = " +s);
        // Find floating point value of square root of x.
        double x = Math.sqrt(s);
        int y=(int)x;
        if(x==y)
       System.out.println("the number "+s+" is a perfect square");
        else
            System.out.println("the number "+s+" is  not a perfect square");
        return x==y; //returns true if it the number has a perfect int square root
    }



}
