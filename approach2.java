package com.samples;

 public class approach2 {
   String batsman="virat";
   static String bowler="siraj";
   public void dispaly()
   {
	   System.out.println("this is dispaly method");
   }
   static String show()
   {
	   return "this is show method:";
   }
public static void main(String[] args) 

	{
		approach2 a2 =new approach2();
		
		a2.dispaly();
		System.out.println(approach2.show());
		System.out.println(a2.batsman);
		System.out.println(approach2.bowler);
		 
	}
}

