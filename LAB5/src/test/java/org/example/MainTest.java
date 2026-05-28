package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    float delta = 0.001f;

    @Test
    public void test1() {
        float[] x = new float[]{3.0f, 4.0f};
        float[] y = new float[]{8.0f, 16.0f};
        float expected = 8.0f;
        float actual = Main.GetResult(x, 2, y, 3, 2.0f, 0.0f);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void test2() {
        float[] x = new float[]{0.0f, 0.0f};
        float[] y = new float[]{0.0f};
        float expected = 8.0f;
        float actual = Main.GetResult(x, 2, y, 1, 2.0f, 0.0f);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void test3() {
        float[] x = new float[]{5.0f, 10.0f};
        float[] y = new float[]{3.0f, 6.0f};
        float expected = 12.0f;
        float actual = Main.GetResult(x, 1, y, 1, 3.0f, 0.0f);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void test4() {
        float[] x = new float[]{5.0f, 12.0f, 100.0f};
        float[] y = new float[]{4.0f, 5.0f};
        float expected = 12.0f;
        float actual = Main.GetResult(x, 0, y, 0, 5.0f, 0.0f);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void test5() {
        float[] x = new float[]{-1.0f, -2.0f};
        float[] y = new float[]{-10.0f, -20.0f};
        float expected = -17.0f;
        float actual = Main.GetResult(x, 2, y, 1, 1.0f, 0.0f);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void test6() {
        float[] x = new float[]{};
        float[] y = new float[]{};
        float expected = 0.0f;
        float actual = Main.GetResult(x, 0, y, 2, 4.0f, 0.0f);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void test7() {
        float[] x = new float[]{2.0f};
        float[] y = new float[]{5.0f};
        float expected = 15.375f;
        float actual = Main.GetResult(x, 2, y, 3, -2.0f, 0.0f);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void test8() {
        float[] x = new float[]{4.0f};
        float[] y = new float[]{-4.0f};
        float expected = 2.0f;
        float actual = Main.GetResult(x, 2, y, 1, 2.0f, 0.0f);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void test9() {
        float[] x = new float[]{10.0f};
        float[] y = new float[]{50.0f};
        float expected = 7.0f;
        float actual = Main.GetResult(x, 1, y, 2, 5.0f, 0.0f);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void test10() {
        float[] x = new float[]{100.0f};
        float[] y = new float[]{5000.0f};
        float expected = 90.5f;
        float actual = Main.GetResult(x, 1, y, 4, 10.0f, 0.0f);
        Assert.assertEquals(expected, actual, delta);
    }
}
