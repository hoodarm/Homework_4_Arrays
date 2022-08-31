package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] given = {5, 4, -7, -2, -1};
        int[] output = new int[given.length];
        for (int index = 0; index < given.length; index++)
            output[given.length - index - 1] = given[index];
        for (int element : output)
        {
            System.out.print(element + " ");
        }
    }
}
