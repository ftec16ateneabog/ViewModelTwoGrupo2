package com.atenea.viewmodeltwo.Persistencia;

public class Model {
    private static int i = 0;
    public static int aumentar(int data)
    {
        i = i + 1;
        return i;
    }
}
