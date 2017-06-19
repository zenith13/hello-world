package com.java.project.euler;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by epaspal on 6/16/2017.
 */
public class EulerPractice1 {

    public static void main(String[] args) {

        getSum();

        fibonaci();

        largestPrimeFactor();
        palindrome();
    }

    private static void palindrome() {

        for(int i=10;i<100;i++ )
        {
            for(int j= 10;j<=100;j++)
            {

                StringBuffer s= new StringBuffer(String.valueOf((i*j)));
              //  StringBuffer reverse= new StringBuffer(s.reverse());
                if(s.equals(new StringBuilder(s).reverse().toString()))
                {
                    System.out.println("Palindrome entries "+ s);
                }
            }
        }
    }

    private static void largestPrimeFactor() {
        long n=600851475143l;
        while(n%2==0)
        {
            System.out.println(2);
            n/=2;
        }
        while(n%3==0)
        {
            System.out.println(3);
            n/=3;
        }
        for(int i=4; i <= Math.sqrt(n) ; i++)
        {
            if(n%i == 0)
            {
                System.out.println(i);
                n/=i;
            }
        }
        if (n > 2)
            System.out.print(n);

    }

    private static void fibonaci() {
        List<Integer> fibonaciSeries=new ArrayList<>();
        fibonaciSeries.add(1);
        fibonaciSeries.add(2);
        Integer sum1 =0;
        for(int i=2, j=1; i<4000000; )
        {
            fibonaciSeries.add(i+j);
            i=i+j;
            j=i-j;
        }


        for (Integer i : fibonaciSeries)
        {
            if(i%2==0)
            {
                sum1+=i;
            }
        }
        System.out.println("The sum of the FiboNaci Series is= "+ sum1);
    }

    private static void getSum() {
        int sum=0;
        for(int i=0;i<1000;i++)
        {
            if((i%3 == 0) || (i%5== 0))
            {
                sum=sum+i;
            }
        }
        System.out.println("The sum of even numbers is= "+sum);
    }
}
