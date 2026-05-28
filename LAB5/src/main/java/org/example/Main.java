package org.example;
/* Лабораторная №5, Полевщиков максим 247 группа   */

public class Main {
    // метод (функция) Степень
    public static float Step(float osn, int nn) {
        float st = 1;
        for (int i = 1; i <= nn; i++) {
            st = st * osn;
        }
        return st;
    }

    public static float SummaMassiv(float[] mas) {
        float Sum = 0;
        for (int i = 0; i < mas.length; i++) {
            Sum = Sum + mas[i];
        }
        return Sum;
    }
    public static float GetResult(float[] x, int n, float[] y, int m, float c, float j) {
        float[] x_transformed = new float[x.length];
        for (int i = 0; i < x.length; i++) {
            x_transformed[i] = Step(x[i] - c, n);
        }
        float f = SummaMassiv(x_transformed) + (SummaMassiv(y) / Step(c, m));
        return f;
    }
}