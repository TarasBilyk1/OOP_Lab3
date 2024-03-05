/*----------------------------------------------------
                        Завдання 5.1
-----------------------------------------------------*/
package org.exampleTR25;

import java.util.Scanner;

public class TabF
{
    public static double function (double i)
    {
        return ((Math.sqrt(i)) / (i + 1));
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in) ;

        int X = scn.nextInt();
        int Y = scn.nextInt();
        double res = 0 ;    // Ліильник
        double step = 0.1 ; // Корк

        for ( double i = X ; i <= Y  ; i +=step )
        {
            double result = function(i);
            System.out.print (" f = ");
            System.out.printf ("%.3f ",i );
            System.out.print ("= ");
            System.out.printf("%.3f \n ",result);
            if ( result <= X && result >= Y )
            {
                res++;
            }
        }

        if (res == 0)
        {
            System.out.println("Немає значень функції у вказаному діапазоні.");
        }
        else
        {
            System.out.println("Кількість значень функції у вказаному діапазоні: " + res);
        }

    }
}