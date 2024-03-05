/*----------------------------------------------------
                        Завдання 1
-----------------------------------------------------*/
package org.exampleTR25;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println( " Тут через цикл For");

        String a = "Hallo";

         for (int i = 0; i < 50 ; i ++ )
        {
            System.out.println( a );
        }

        System.out.println( " Тут через цикл While");

         int b = 0;
        while ( b < 50 )
        {
            System.out.println(a);
            b++ ;
        }


    }
}