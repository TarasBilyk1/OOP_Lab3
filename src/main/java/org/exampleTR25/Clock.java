/*----------------------------------------------------
                        Завдання 3
-----------------------------------------------------*/
package org.exampleTR25;

public class Clock
{
    public static void main(String[] args)
    {
        int hour = 2 ;
        int minute = 60 ;

        int i = 0 ;
        while (i < hour )
        {
            int l = 0 ;
            while (l < minute )
            {
                System.out.println( "hour " + (i + 1) + " minute " + (l + 1));
                l++;
            }
            i++;
        }

    }
}
