//The parameter weekday is true if it is a weekday, 
//and the parameter vacation is true if we are on 
//vacation. We sleep in if it is not a weekday or 
//we're on vacation. Return true if we sleep in.

import java.util.*;
import java.lang.*;
import java.io.*;

class warmup1_ex1{
    
    public static boolean sleepIn(boolean weekday, boolean vacation) {
      if ((weekday==false)||(vacation==true)){
        return true;
      } else {
        return false;
      }
      
    }
    
    public static void main(String[] args) throws java.lang.Exception {
    	if (
            (sleepIn(false, false)==true) &&
            (sleepIn(true, false) ==false)&&
            (sleepIn(false, true) ==true) &&
            (sleepIn(true, true)  ==true)) 
        {
          System.out.println("test passed");
        } else {
          System.out.println("test failed");
        }
    }

}