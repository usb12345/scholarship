package com.company;

public class Scholarship {
   public String getScholorshipType (Student std)
   {
       if(!std.getReg_number().isEmpty())
       {

       }
       else
           return "this student is not elligble for any scholarship";
   }
}
