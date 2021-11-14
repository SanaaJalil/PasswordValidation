package com.sanaa.passwordvalidation;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sanaa");
		int len=0;
        String pw="";
        String lowerCase="abcdefghijklmnopqrstuvwxyz";
        String UpperCase=lowerCase.toUpperCase();
        String Speacial="@#$%&*^";
        String numbers="0123456789";
        Boolean l=false;
        Boolean lc=false;
        boolean uc=false;
        Boolean s=false;
        Boolean n=false;


        ///////////////////////////////////////////////////////////////
        System.out.println("Valid Password");
        Scanner scan=new Scanner(System.in);
        pw=scan.nextLine();
        len=pw.length();

        ///////////////////////////////////////////////////////
        if(len>9)
        {
            l = true;
            for (int i = 0; i < pw.length(); i++)
            {
                System.out.println("At Index" + i + "Character " + pw.charAt(i));
                String a=String.valueOf(pw.charAt(i));
                if(lowerCase.contains(a))
                {
                    lc=true;
                }
                if(UpperCase.contains(a))
                {
                    uc=true;
                }
                if(Speacial.contains(a))
                {
                    s=true;
                }
                if(numbers.contains(a))
                {
                    n=true;
                }
                if(!lc)System.out.println("No Lowercase");
                if(!s)System.out.println("No Special character");
                if(!uc)System.out.println("No Upper Case");
                if(!n)System.out.println("No Numbers");
                if(lc && uc && s && n)
                    System.out.println("Password Valid ");
            }
        }

        else
            {
                System.out.println("Password too short");
            }

	}

}
