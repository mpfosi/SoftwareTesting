package exercise01_10s;

import junit.framework.*;

public class RandoopTest3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test1");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    int var8 = var7.size();
    java.util.Iterator var9 = var7.iterator();
    boolean var10 = var7.isEmpty();
    boolean var11 = var7.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var12 = var7.new RingBufferIterator();
    int var13 = var7.size();
    java.util.Spliterator var14 = var7.spliterator();
    var1.enqueue((java.lang.Object)var7);
    boolean var16 = var1.isEmpty();
    exercise01.RingBuffer var18 = new exercise01.RingBuffer(0);
    java.util.Iterator var19 = var18.iterator();
    int var20 = var18.size();
    int var21 = var18.size();
    java.util.Spliterator var22 = var18.spliterator();
    java.util.Iterator var23 = var18.iterator();
    int var24 = var18.size();
    java.util.Iterator var25 = var18.iterator();
    java.util.Spliterator var26 = var18.spliterator();
    var1.enqueue((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test2");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test3");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    boolean var9 = var8.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test4");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test5");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    java.util.Spliterator var9 = var8.spliterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var8.new RingBufferIterator();
    java.util.Spliterator var11 = var8.spliterator();
    var6.enqueue((java.lang.Object)var8);
    var1.enqueue((java.lang.Object)var6);
    java.util.Spliterator var14 = var6.spliterator();
    int var15 = var6.size();
    int var16 = var6.size();
    exercise01.RingBuffer.RingBufferIterator var17 = var6.new RingBufferIterator();
    boolean var18 = var6.isEmpty();
    boolean var19 = var6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test6");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    boolean var7 = var6.isEmpty();
    java.util.Iterator var8 = var6.iterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var6.new RingBufferIterator();
    boolean var10 = var6.isEmpty();
    java.util.Spliterator var11 = var6.spliterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var6.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var6);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test7");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test8");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    java.util.Iterator var10 = var9.iterator();
    java.util.Spliterator var11 = var9.spliterator();
    java.util.Spliterator var12 = var9.spliterator();
    exercise01.RingBuffer var14 = new exercise01.RingBuffer(0);
    int var15 = var14.size();
    java.util.Iterator var16 = var14.iterator();
    var9.enqueue((java.lang.Object)var14);
    exercise01.RingBuffer.RingBufferIterator var18 = var14.new RingBufferIterator();
    java.util.Spliterator var19 = var14.spliterator();
    var1.enqueue((java.lang.Object)var19);
    exercise01.RingBuffer.RingBufferIterator var21 = var1.new RingBufferIterator();
    java.lang.Object var22 = var1.dequeue();
    java.util.Spliterator var23 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test9");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var9 = var8.new RingBufferIterator();
    java.util.Iterator var10 = var8.iterator();
    var1.enqueue((java.lang.Object)var8);
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    boolean var13 = var12.hasNext();
    boolean var14 = var12.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test10");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    java.util.Spliterator var8 = var1.spliterator();
    java.util.Spliterator var9 = var1.spliterator();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test11");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(100);
    java.util.Iterator var6 = var5.iterator();
    java.util.Spliterator var7 = var5.spliterator();
    java.util.Spliterator var8 = var5.spliterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(0);
    int var11 = var10.size();
    java.util.Iterator var12 = var10.iterator();
    var5.enqueue((java.lang.Object)var10);
    java.util.Spliterator var14 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var10.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test12");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test13");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test14");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test15");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    int var8 = var7.size();
    java.util.Iterator var9 = var7.iterator();
    boolean var10 = var7.isEmpty();
    boolean var11 = var7.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var12 = var7.new RingBufferIterator();
    int var13 = var7.size();
    java.util.Spliterator var14 = var7.spliterator();
    var1.enqueue((java.lang.Object)var7);
    java.util.Spliterator var16 = var7.spliterator();
    java.util.Spliterator var17 = var7.spliterator();
    java.util.Spliterator var18 = var7.spliterator();
    boolean var19 = var7.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test16");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(10);
    int var6 = var5.size();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    java.util.Spliterator var9 = var5.spliterator();
    java.util.Iterator var10 = var5.iterator();
    java.util.Iterator var11 = var5.iterator();
    java.util.Spliterator var12 = var5.spliterator();
    var1.enqueue((java.lang.Object)var5);
    java.lang.Object var14 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test17");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    boolean var10 = var1.isEmpty();
    java.lang.Object var11 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + (-1.0f)+ "'", var11.equals((-1.0f)));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test18");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Spliterator var7 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test19");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    java.util.Iterator var5 = var4.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var4.new RingBufferIterator();
    int var7 = var4.size();
    var1.enqueue((java.lang.Object)var4);
    java.util.Spliterator var9 = var4.spliterator();
    boolean var10 = var4.isEmpty();
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(10);
    int var13 = var12.size();
    boolean var14 = var12.isEmpty();
    java.util.Iterator var15 = var12.iterator();
    boolean var16 = var12.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var17 = var12.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var12.new RingBufferIterator();
    int var19 = var12.size();
    exercise01.RingBuffer.RingBufferIterator var20 = var12.new RingBufferIterator();
    boolean var21 = var20.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.enqueue((java.lang.Object)var20);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test20");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    java.util.Spliterator var10 = var6.spliterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var6.new RingBufferIterator();
    int var12 = var6.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test21");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(0);
    java.util.Spliterator var6 = var5.spliterator();
    int var7 = var5.size();
    java.util.Spliterator var8 = var5.spliterator();
    java.util.Iterator var9 = var5.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.util.Spliterator var11 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test22");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    int var11 = var1.size();
    int var12 = var1.size();
    java.util.Spliterator var13 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test23");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var9 = var8.new RingBufferIterator();
    java.util.Iterator var10 = var8.iterator();
    var1.enqueue((java.lang.Object)var8);
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    boolean var13 = var12.hasNext();
    boolean var14 = var12.hasNext();
    boolean var15 = var12.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test24");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    boolean var10 = var1.isEmpty();
    java.util.Iterator var11 = var1.iterator();
    int var12 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test25");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var6.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test26");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(10);
    int var12 = var11.size();
    boolean var13 = var11.isEmpty();
    java.util.Iterator var14 = var11.iterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var11.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var11.new RingBufferIterator();
    int var17 = var11.size();
    exercise01.RingBuffer var19 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var21 = new exercise01.RingBuffer(0);
    java.util.Spliterator var22 = var21.spliterator();
    exercise01.RingBuffer.RingBufferIterator var23 = var21.new RingBufferIterator();
    java.util.Spliterator var24 = var21.spliterator();
    var19.enqueue((java.lang.Object)var21);
    exercise01.RingBuffer var27 = new exercise01.RingBuffer(100);
    java.util.Spliterator var28 = var27.spliterator();
    var19.enqueue((java.lang.Object)var28);
    java.util.Iterator var30 = var19.iterator();
    var11.enqueue((java.lang.Object)var19);
    java.util.Iterator var32 = var19.iterator();
    java.util.Iterator var33 = var19.iterator();
    exercise01.RingBuffer var35 = new exercise01.RingBuffer(10);
    int var36 = var35.size();
    boolean var37 = var35.isEmpty();
    java.util.Iterator var38 = var35.iterator();
    exercise01.RingBuffer.RingBufferIterator var39 = var35.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var40 = var35.new RingBufferIterator();
    exercise01.RingBuffer var42 = new exercise01.RingBuffer(0);
    int var43 = var42.size();
    java.util.Iterator var44 = var42.iterator();
    boolean var45 = var42.isEmpty();
    boolean var46 = var42.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var47 = var42.new RingBufferIterator();
    var35.enqueue((java.lang.Object)var42);
    exercise01.RingBuffer.RingBufferIterator var49 = var42.new RingBufferIterator();
    var19.enqueue((java.lang.Object)var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var19);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test27");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    int var7 = var3.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var3.new RingBufferIterator();
    java.util.Iterator var9 = var3.iterator();
    var1.enqueue((java.lang.Object)var9);
    exercise01.RingBuffer.RingBufferIterator var11 = var1.new RingBufferIterator();
    boolean var12 = var11.hasNext();
    boolean var13 = var11.hasNext();
    java.lang.Object var14 = var11.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test28");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Spliterator var6 = var1.spliterator();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Spliterator var12 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test29");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    java.util.Spliterator var9 = var1.spliterator();
    int var10 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var11 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test30");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    int var8 = var6.size();
    var1.enqueue((java.lang.Object)var8);
    boolean var10 = var1.isEmpty();
    java.lang.Object var11 = var1.dequeue();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(0);
    java.util.Spliterator var14 = var13.spliterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var13.new RingBufferIterator();
    java.util.Spliterator var16 = var13.spliterator();
    int var17 = var13.size();
    int var18 = var13.size();
    boolean var19 = var13.isEmpty();
    int var20 = var13.size();
    java.util.Spliterator var21 = var13.spliterator();
    java.util.Iterator var22 = var13.iterator();
    exercise01.RingBuffer.RingBufferIterator var23 = var13.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var23);
    boolean var25 = var1.isEmpty();
    java.util.Iterator var26 = var1.iterator();
    exercise01.RingBuffer var28 = new exercise01.RingBuffer(0);
    int var29 = var28.size();
    int var30 = var28.size();
    int var31 = var28.size();
    java.util.Iterator var32 = var28.iterator();
    java.util.Spliterator var33 = var28.spliterator();
    java.util.Spliterator var34 = var28.spliterator();
    var1.enqueue((java.lang.Object)var28);
    boolean var36 = var28.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0+ "'", var11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test31");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test32");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    java.util.Spliterator var7 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test33");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 10+ "'", var8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test34");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test35");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var7 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    int var9 = var6.size();
    java.util.Iterator var10 = var6.iterator();
    java.util.Spliterator var11 = var6.spliterator();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    int var14 = var6.size();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(3);
    java.util.Iterator var17 = var16.iterator();
    java.util.Iterator var18 = var16.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.enqueue((java.lang.Object)var16);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test36");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    java.util.Spliterator var12 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var1.new RingBufferIterator();
    java.util.Spliterator var14 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0f)+ "'", var9.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test37");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Iterator var12 = var1.iterator();
    int var13 = var1.size();
    java.util.Spliterator var14 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test38");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test39");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test40");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test41");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    java.util.Iterator var8 = var7.iterator();
    int var9 = var7.size();
    int var10 = var7.size();
    java.util.Spliterator var11 = var7.spliterator();
    java.util.Spliterator var12 = var7.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var7.new RingBufferIterator();
    java.util.Spliterator var14 = var7.spliterator();
    var1.enqueue((java.lang.Object)var14);
    java.util.Iterator var16 = var1.iterator();
    int var17 = var1.size();
    boolean var18 = var1.isEmpty();
    java.util.Spliterator var19 = var1.spliterator();
    int var20 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test42");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    int var9 = var8.size();
    java.util.Iterator var10 = var8.iterator();
    boolean var11 = var8.isEmpty();
    boolean var12 = var8.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var13 = var8.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var8);
    boolean var15 = var1.isEmpty();
    int var16 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var17 = var1.new RingBufferIterator();
    java.lang.Object var18 = var17.next();
    boolean var19 = var17.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test43");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    int var3 = var1.size();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var6.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test44");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var3.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var3);
    java.lang.Object var9 = var1.dequeue();
    boolean var10 = var1.isEmpty();
    boolean var11 = var1.isEmpty();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(100);
    java.util.Iterator var14 = var13.iterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var13.new RingBufferIterator();
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var19 = new exercise01.RingBuffer(0);
    java.util.Spliterator var20 = var19.spliterator();
    exercise01.RingBuffer.RingBufferIterator var21 = var19.new RingBufferIterator();
    java.util.Spliterator var22 = var19.spliterator();
    exercise01.RingBuffer.RingBufferIterator var23 = var19.new RingBufferIterator();
    var17.enqueue((java.lang.Object)var19);
    java.lang.Object var25 = var17.dequeue();
    exercise01.RingBuffer var27 = new exercise01.RingBuffer(0);
    java.util.Spliterator var28 = var27.spliterator();
    exercise01.RingBuffer.RingBufferIterator var29 = var27.new RingBufferIterator();
    java.util.Iterator var30 = var27.iterator();
    exercise01.RingBuffer.RingBufferIterator var31 = var27.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var32 = var27.new RingBufferIterator();
    var17.enqueue((java.lang.Object)var32);
    java.util.Spliterator var34 = var17.spliterator();
    var13.enqueue((java.lang.Object)var17);
    var1.enqueue((java.lang.Object)var13);
    java.util.Spliterator var37 = var13.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test45");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(10);
    int var11 = var10.size();
    java.util.Spliterator var12 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var10.new RingBufferIterator();
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(0);
    java.util.Spliterator var18 = var17.spliterator();
    exercise01.RingBuffer.RingBufferIterator var19 = var17.new RingBufferIterator();
    java.util.Spliterator var20 = var17.spliterator();
    var15.enqueue((java.lang.Object)var17);
    var10.enqueue((java.lang.Object)var15);
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var24 = var10.dequeue();
    int var25 = var10.size();
    java.util.Spliterator var26 = var10.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test46");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test47");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test48");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    java.util.Spliterator var8 = var1.spliterator();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test49");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test50");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    int var3 = var1.size();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var6.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var6.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test51");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    java.util.Spliterator var12 = var1.spliterator();
    java.util.Iterator var13 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0f)+ "'", var9.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test52");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(10);
    int var9 = var8.size();
    boolean var10 = var8.isEmpty();
    java.util.Iterator var11 = var8.iterator();
    java.util.Spliterator var12 = var8.spliterator();
    java.util.Iterator var13 = var8.iterator();
    boolean var14 = var8.isEmpty();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(0);
    int var17 = var16.size();
    java.util.Iterator var18 = var16.iterator();
    exercise01.RingBuffer.RingBufferIterator var19 = var16.new RingBufferIterator();
    boolean var20 = var16.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var21 = var16.new RingBufferIterator();
    boolean var22 = var21.hasNext();
    var8.enqueue((java.lang.Object)var22);
    int var24 = var8.size();
    java.util.Spliterator var25 = var8.spliterator();
    var1.enqueue((java.lang.Object)var25);
    java.util.Iterator var27 = var1.iterator();
    java.lang.Object var28 = var1.dequeue();
    exercise01.RingBuffer var30 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var31 = var30.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var32 = var30.new RingBufferIterator();
    int var33 = var30.size();
    java.util.Iterator var34 = var30.iterator();
    java.util.Spliterator var35 = var30.spliterator();
    exercise01.RingBuffer.RingBufferIterator var36 = var30.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test53");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(100);
    java.util.Iterator var8 = var7.iterator();
    java.util.Spliterator var9 = var7.spliterator();
    java.util.Spliterator var10 = var7.spliterator();
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(0);
    int var13 = var12.size();
    java.util.Iterator var14 = var12.iterator();
    var7.enqueue((java.lang.Object)var12);
    boolean var16 = var7.isEmpty();
    int var17 = var7.size();
    java.util.Iterator var18 = var7.iterator();
    java.lang.Object var19 = var7.dequeue();
    int var20 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    boolean var22 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test54");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    int var8 = var6.size();
    var1.enqueue((java.lang.Object)var8);
    boolean var10 = var1.isEmpty();
    java.lang.Object var11 = var1.dequeue();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(0);
    java.util.Spliterator var14 = var13.spliterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var13.new RingBufferIterator();
    java.util.Spliterator var16 = var13.spliterator();
    int var17 = var13.size();
    int var18 = var13.size();
    boolean var19 = var13.isEmpty();
    int var20 = var13.size();
    java.util.Spliterator var21 = var13.spliterator();
    java.util.Iterator var22 = var13.iterator();
    exercise01.RingBuffer.RingBufferIterator var23 = var13.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var23);
    boolean var25 = var1.isEmpty();
    exercise01.RingBuffer var27 = new exercise01.RingBuffer(10);
    int var28 = var27.size();
    java.util.Spliterator var29 = var27.spliterator();
    exercise01.RingBuffer.RingBufferIterator var30 = var27.new RingBufferIterator();
    exercise01.RingBuffer var32 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var34 = new exercise01.RingBuffer(0);
    java.util.Spliterator var35 = var34.spliterator();
    exercise01.RingBuffer.RingBufferIterator var36 = var34.new RingBufferIterator();
    java.util.Spliterator var37 = var34.spliterator();
    var32.enqueue((java.lang.Object)var34);
    var27.enqueue((java.lang.Object)var32);
    exercise01.RingBuffer.RingBufferIterator var40 = var32.new RingBufferIterator();
    boolean var41 = var32.isEmpty();
    var1.enqueue((java.lang.Object)var41);
    java.util.Iterator var43 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0+ "'", var11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test55");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test56");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    boolean var12 = var10.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test57");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(10);
    int var5 = var4.size();
    java.util.Spliterator var6 = var4.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var4.new RingBufferIterator();
    int var8 = var4.size();
    java.util.Spliterator var9 = var4.spliterator();
    java.util.Spliterator var10 = var4.spliterator();
    java.util.Iterator var11 = var4.iterator();
    var1.enqueue((java.lang.Object)var11);
    java.util.Iterator var13 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test58");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    var1.enqueue((java.lang.Object)var3);
    java.lang.Object var8 = var1.dequeue();
    java.util.Iterator var9 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var10.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test59");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    var1.enqueue((java.lang.Object)var3);
    java.lang.Object var8 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(10);
    int var12 = var11.size();
    boolean var13 = var11.isEmpty();
    java.util.Iterator var14 = var11.iterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var11.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var11.new RingBufferIterator();
    int var17 = var11.size();
    exercise01.RingBuffer.RingBufferIterator var18 = var11.new RingBufferIterator();
    exercise01.RingBuffer var20 = new exercise01.RingBuffer(10);
    int var21 = var20.size();
    java.util.Spliterator var22 = var20.spliterator();
    exercise01.RingBuffer.RingBufferIterator var23 = var20.new RingBufferIterator();
    exercise01.RingBuffer var25 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var27 = new exercise01.RingBuffer(0);
    java.util.Spliterator var28 = var27.spliterator();
    exercise01.RingBuffer.RingBufferIterator var29 = var27.new RingBufferIterator();
    java.util.Spliterator var30 = var27.spliterator();
    var25.enqueue((java.lang.Object)var27);
    var20.enqueue((java.lang.Object)var25);
    var11.enqueue((java.lang.Object)var20);
    exercise01.RingBuffer.RingBufferIterator var34 = var20.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var34);
    boolean var36 = var34.hasNext();
    boolean var37 = var34.hasNext();
    java.lang.Object var38 = var34.next();
    boolean var39 = var34.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test60");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test61");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    java.util.Spliterator var9 = var1.spliterator();
    java.util.Spliterator var10 = var1.spliterator();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(10);
    int var14 = var13.size();
    boolean var15 = var13.isEmpty();
    java.util.Iterator var16 = var13.iterator();
    exercise01.RingBuffer.RingBufferIterator var17 = var13.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var13.new RingBufferIterator();
    int var19 = var13.size();
    exercise01.RingBuffer.RingBufferIterator var20 = var13.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var21 = var13.new RingBufferIterator();
    boolean var22 = var13.isEmpty();
    java.util.Iterator var23 = var13.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var13);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test62");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var7.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var7.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test63");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    boolean var5 = var3.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test64");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test65");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test66");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(2);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(10);
    int var6 = var5.size();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var5.new RingBufferIterator();
    java.util.Spliterator var10 = var5.spliterator();
    int var11 = var5.size();
    java.util.Iterator var12 = var5.iterator();
    var1.enqueue((java.lang.Object)var12);
    exercise01.RingBuffer.RingBufferIterator var14 = var1.new RingBufferIterator();
    int var15 = var1.size();
    int var16 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test67");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var1.new RingBufferIterator();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(10);
    int var14 = var13.size();
    boolean var15 = var13.isEmpty();
    java.util.Iterator var16 = var13.iterator();
    java.util.Spliterator var17 = var13.spliterator();
    exercise01.RingBuffer var19 = new exercise01.RingBuffer(1);
    boolean var20 = var19.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var21 = var19.new RingBufferIterator();
    java.util.Spliterator var22 = var19.spliterator();
    var13.enqueue((java.lang.Object)var19);
    boolean var24 = var19.isEmpty();
    java.util.Spliterator var25 = var19.spliterator();
    var1.enqueue((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0f)+ "'", var9.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test68");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Iterator var7 = var6.iterator();
    int var8 = var6.size();
    java.util.Iterator var9 = var6.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var9);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test69");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var3.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test70");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    java.util.Spliterator var8 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test71");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    java.util.Spliterator var6 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test72");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    java.util.Spliterator var8 = var7.spliterator();
    java.util.Spliterator var9 = var7.spliterator();
    java.util.Spliterator var10 = var7.spliterator();
    java.util.Spliterator var11 = var7.spliterator();
    int var12 = var7.size();
    var1.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var1.dequeue();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(0);
    java.util.Spliterator var17 = var16.spliterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var16.new RingBufferIterator();
    java.util.Iterator var19 = var16.iterator();
    int var20 = var16.size();
    int var21 = var16.size();
    java.util.Spliterator var22 = var16.spliterator();
    var1.enqueue((java.lang.Object)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var24 = var16.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test73");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var6.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var6.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test74");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test75");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test76");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(byte)1);
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(0);
    java.util.Spliterator var10 = var9.spliterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var9.new RingBufferIterator();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    java.util.Iterator var14 = var9.iterator();
    java.util.Iterator var15 = var9.iterator();
    var1.enqueue((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test77");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Spliterator var5 = var1.spliterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test78");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var3.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var3);
    java.lang.Object var9 = var1.dequeue();
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Iterator var14 = var11.iterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var11.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var11.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var16);
    boolean var18 = var16.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test79");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Spliterator var5 = var1.spliterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    int var8 = var1.size();
    int var9 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test80");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Spliterator var6 = var1.spliterator();
    int var7 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test81");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    int var8 = var6.size();
    var1.enqueue((java.lang.Object)var8);
    boolean var10 = var1.isEmpty();
    java.lang.Object var11 = var1.dequeue();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(0);
    java.util.Spliterator var14 = var13.spliterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var13.new RingBufferIterator();
    java.util.Spliterator var16 = var13.spliterator();
    int var17 = var13.size();
    int var18 = var13.size();
    boolean var19 = var13.isEmpty();
    int var20 = var13.size();
    java.util.Spliterator var21 = var13.spliterator();
    java.util.Iterator var22 = var13.iterator();
    exercise01.RingBuffer.RingBufferIterator var23 = var13.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var23);
    boolean var25 = var1.isEmpty();
    java.util.Iterator var26 = var1.iterator();
    exercise01.RingBuffer var28 = new exercise01.RingBuffer(0);
    int var29 = var28.size();
    int var30 = var28.size();
    int var31 = var28.size();
    java.util.Iterator var32 = var28.iterator();
    java.util.Spliterator var33 = var28.spliterator();
    java.util.Spliterator var34 = var28.spliterator();
    var1.enqueue((java.lang.Object)var28);
    exercise01.RingBuffer.RingBufferIterator var36 = var28.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0+ "'", var11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test82");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(10);
    int var8 = var7.size();
    boolean var9 = var7.isEmpty();
    java.util.Iterator var10 = var7.iterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var7.new RingBufferIterator();
    var7.enqueue((java.lang.Object)(-1.0f));
    exercise01.RingBuffer.RingBufferIterator var15 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var7.new RingBufferIterator();
    boolean var17 = var16.hasNext();
    var1.enqueue((java.lang.Object)var17);
    java.lang.Object var19 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + true+ "'", var19.equals(true));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test83");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    int var5 = var4.size();
    var1.enqueue((java.lang.Object)var5);
    java.lang.Object var7 = var1.dequeue();
    java.util.Spliterator var8 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    boolean var13 = var12.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0+ "'", var7.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test84");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    int var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test85");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    var1.enqueue((java.lang.Object)(short)1);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (short)1+ "'", var8.equals((short)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test86");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test87");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    boolean var8 = var7.isEmpty();
    java.util.Iterator var9 = var7.iterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var7.new RingBufferIterator();
    boolean var11 = var7.isEmpty();
    boolean var12 = var7.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var13 = var7.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var13);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test88");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(100);
    java.util.Iterator var9 = var8.iterator();
    java.util.Spliterator var10 = var8.spliterator();
    java.util.Spliterator var11 = var8.spliterator();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(0);
    int var14 = var13.size();
    java.util.Iterator var15 = var13.iterator();
    var8.enqueue((java.lang.Object)var13);
    exercise01.RingBuffer.RingBufferIterator var17 = var13.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var13.new RingBufferIterator();
    int var19 = var13.size();
    int var20 = var13.size();
    var1.enqueue((java.lang.Object)var13);
    java.util.Iterator var22 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test89");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(10);
    int var11 = var10.size();
    java.util.Spliterator var12 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var10.new RingBufferIterator();
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(0);
    java.util.Spliterator var18 = var17.spliterator();
    exercise01.RingBuffer.RingBufferIterator var19 = var17.new RingBufferIterator();
    java.util.Spliterator var20 = var17.spliterator();
    var15.enqueue((java.lang.Object)var17);
    var10.enqueue((java.lang.Object)var15);
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var24 = var10.dequeue();
    exercise01.RingBuffer.RingBufferIterator var25 = var10.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test90");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var1.isEmpty();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(0);
    java.util.Spliterator var11 = var10.spliterator();
    java.util.Spliterator var12 = var10.spliterator();
    java.util.Spliterator var13 = var10.spliterator();
    java.util.Spliterator var14 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var10.new RingBufferIterator();
    boolean var16 = var15.hasNext();
    boolean var17 = var15.hasNext();
    var1.enqueue((java.lang.Object)var15);
    java.lang.Object var19 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var20 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var20.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test91");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test92");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(10);
    int var13 = var12.size();
    int var14 = var12.size();
    exercise01.RingBuffer.RingBufferIterator var15 = var12.new RingBufferIterator();
    int var16 = var12.size();
    java.util.Spliterator var17 = var12.spliterator();
    var1.enqueue((java.lang.Object)var12);
    exercise01.RingBuffer.RingBufferIterator var19 = var12.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var20 = var12.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test93");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(10);
    int var6 = var5.size();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    java.util.Spliterator var9 = var5.spliterator();
    java.util.Iterator var10 = var5.iterator();
    java.util.Iterator var11 = var5.iterator();
    java.util.Spliterator var12 = var5.spliterator();
    var1.enqueue((java.lang.Object)var5);
    exercise01.RingBuffer.RingBufferIterator var14 = var5.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var14.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test94");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    exercise01.RingBuffer.RingBufferIterator var10 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var6.new RingBufferIterator();
    int var12 = var6.size();
    java.util.Iterator var13 = var6.iterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var6.new RingBufferIterator();
    java.util.Spliterator var15 = var6.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test95");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    java.lang.Object var8 = var1.dequeue();
    var1.enqueue((java.lang.Object)"hi!");
    java.lang.Object var11 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    boolean var13 = var12.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 10+ "'", var8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test96");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    java.util.Spliterator var8 = var1.spliterator();
    java.util.Spliterator var9 = var1.spliterator();
    java.util.Spliterator var10 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test97");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    int var5 = var1.size();
    int var6 = var1.size();
    int var7 = var1.size();
    int var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test98");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    java.util.Spliterator var9 = var1.spliterator();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    java.util.Spliterator var13 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test99");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(0);
    int var10 = var9.size();
    java.util.Iterator var11 = var9.iterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var9.new RingBufferIterator();
    boolean var13 = var9.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var14 = var9.new RingBufferIterator();
    boolean var15 = var14.hasNext();
    var1.enqueue((java.lang.Object)var15);
    int var17 = var1.size();
    int var18 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test100");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    int var11 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test101");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(0);
    java.util.Spliterator var14 = var13.spliterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var13.new RingBufferIterator();
    java.util.Spliterator var16 = var13.spliterator();
    int var17 = var13.size();
    exercise01.RingBuffer.RingBufferIterator var18 = var13.new RingBufferIterator();
    java.util.Iterator var19 = var13.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var13);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test102");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    java.util.Iterator var9 = var1.iterator();
    java.lang.Object var10 = var1.dequeue();
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(100);
    java.util.Iterator var13 = var12.iterator();
    java.util.Spliterator var14 = var12.spliterator();
    java.util.Spliterator var15 = var12.spliterator();
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(0);
    int var18 = var17.size();
    java.util.Iterator var19 = var17.iterator();
    var12.enqueue((java.lang.Object)var17);
    exercise01.RingBuffer.RingBufferIterator var21 = var17.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var22 = var17.new RingBufferIterator();
    java.util.Spliterator var23 = var17.spliterator();
    var1.enqueue((java.lang.Object)var17);
    boolean var25 = var1.isEmpty();
    java.lang.Object var26 = var1.dequeue();
    java.util.Spliterator var27 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0f)+ "'", var10.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test103");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(10);
    int var9 = var8.size();
    boolean var10 = var8.isEmpty();
    java.util.Iterator var11 = var8.iterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var8.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var8.new RingBufferIterator();
    java.util.Iterator var14 = var8.iterator();
    int var15 = var8.size();
    java.util.Iterator var16 = var8.iterator();
    var1.enqueue((java.lang.Object)var8);
    boolean var18 = var1.isEmpty();
    boolean var19 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test104");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var7.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var7.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test105");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    java.util.Spliterator var12 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0f)+ "'", var9.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test106");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(100);
    java.util.Iterator var11 = var10.iterator();
    java.util.Spliterator var12 = var10.spliterator();
    int var13 = var10.size();
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(0);
    java.util.Spliterator var16 = var15.spliterator();
    exercise01.RingBuffer.RingBufferIterator var17 = var15.new RingBufferIterator();
    java.util.Spliterator var18 = var15.spliterator();
    int var19 = var15.size();
    int var20 = var15.size();
    boolean var21 = var15.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var22 = var15.new RingBufferIterator();
    var10.enqueue((java.lang.Object)var22);
    int var24 = var10.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var10);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test107");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Iterator var12 = var1.iterator();
    java.util.Spliterator var13 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test108");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var3.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var3);
    exercise01.RingBuffer.RingBufferIterator var9 = var3.new RingBufferIterator();
    boolean var10 = var9.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test109");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test110");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    int var2 = var1.size();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var4.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var4.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test111");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    int var8 = var7.size();
    int var9 = var7.size();
    int var10 = var7.size();
    java.util.Iterator var11 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    java.util.Spliterator var13 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var1.new RingBufferIterator();
    boolean var16 = var15.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test112");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test113");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test114");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var3.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var3);
    exercise01.RingBuffer.RingBufferIterator var9 = var3.new RingBufferIterator();
    boolean var10 = var3.isEmpty();
    java.util.Iterator var11 = var3.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test115");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    java.util.Spliterator var8 = var1.spliterator();
    java.util.Spliterator var9 = var1.spliterator();
    int var10 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test116");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    exercise01.RingBuffer.RingBufferIterator var10 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var6.new RingBufferIterator();
    boolean var12 = var6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test117");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test118");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test119");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    int var5 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var6.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test120");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    boolean var10 = var1.isEmpty();
    java.util.Iterator var11 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test121");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test122");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var9.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test123");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var22 = var9.iterator();
    boolean var23 = var9.isEmpty();
    java.lang.Object var24 = var9.dequeue();
    exercise01.RingBuffer.RingBufferIterator var25 = var9.new RingBufferIterator();
    java.util.Iterator var26 = var9.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test124");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.lang.Object var22 = var1.dequeue();
    int var23 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var24 = var1.new RingBufferIterator();
    boolean var25 = var24.hasNext();
    boolean var26 = var24.hasNext();
    boolean var27 = var24.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test125");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var1.isEmpty();
    java.util.Spliterator var8 = var1.spliterator();
    boolean var9 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test126");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var6.hasNext();
    boolean var8 = var6.hasNext();
    boolean var9 = var6.hasNext();
    boolean var10 = var6.hasNext();
    boolean var11 = var6.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test127");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(10);
    int var14 = var13.size();
    boolean var15 = var13.isEmpty();
    java.util.Iterator var16 = var13.iterator();
    exercise01.RingBuffer.RingBufferIterator var17 = var13.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var13.new RingBufferIterator();
    int var19 = var13.size();
    exercise01.RingBuffer var21 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var23 = new exercise01.RingBuffer(0);
    java.util.Spliterator var24 = var23.spliterator();
    exercise01.RingBuffer.RingBufferIterator var25 = var23.new RingBufferIterator();
    java.util.Spliterator var26 = var23.spliterator();
    var21.enqueue((java.lang.Object)var23);
    exercise01.RingBuffer var29 = new exercise01.RingBuffer(100);
    java.util.Spliterator var30 = var29.spliterator();
    var21.enqueue((java.lang.Object)var30);
    java.util.Iterator var32 = var21.iterator();
    var13.enqueue((java.lang.Object)var21);
    java.util.Iterator var34 = var21.iterator();
    boolean var35 = var21.isEmpty();
    java.lang.Object var36 = var21.dequeue();
    exercise01.RingBuffer.RingBufferIterator var37 = var21.new RingBufferIterator();
    exercise01.RingBuffer var39 = new exercise01.RingBuffer(0);
    java.util.Iterator var40 = var39.iterator();
    int var41 = var39.size();
    int var42 = var39.size();
    java.util.Spliterator var43 = var39.spliterator();
    java.util.Iterator var44 = var39.iterator();
    boolean var45 = var39.isEmpty();
    java.util.Spliterator var46 = var39.spliterator();
    var21.enqueue((java.lang.Object)var39);
    java.util.Spliterator var48 = var39.spliterator();
    var1.enqueue((java.lang.Object)var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test128");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(0);
    java.util.Spliterator var11 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var10.new RingBufferIterator();
    java.util.Spliterator var13 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var10.new RingBufferIterator();
    boolean var15 = var14.hasNext();
    var1.enqueue((java.lang.Object)var14);
    exercise01.RingBuffer var18 = new exercise01.RingBuffer(0);
    java.util.Spliterator var19 = var18.spliterator();
    java.util.Spliterator var20 = var18.spliterator();
    java.util.Spliterator var21 = var18.spliterator();
    int var22 = var18.size();
    boolean var23 = var18.isEmpty();
    int var24 = var18.size();
    exercise01.RingBuffer.RingBufferIterator var25 = var18.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var25);
    int var27 = var1.size();
    java.util.Iterator var28 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var29 = var1.new RingBufferIterator();
    boolean var30 = var29.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test129");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test130");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    int var8 = var7.size();
    java.util.Iterator var9 = var7.iterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var7.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    boolean var12 = var10.hasNext();
    var1.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var1.dequeue();
    boolean var15 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var16 = var1.new RingBufferIterator();
    exercise01.RingBuffer var18 = new exercise01.RingBuffer(0);
    java.util.Spliterator var19 = var18.spliterator();
    exercise01.RingBuffer.RingBufferIterator var20 = var18.new RingBufferIterator();
    java.util.Spliterator var21 = var18.spliterator();
    int var22 = var18.size();
    int var23 = var18.size();
    boolean var24 = var18.isEmpty();
    boolean var25 = var18.isEmpty();
    java.util.Iterator var26 = var18.iterator();
    exercise01.RingBuffer.RingBufferIterator var27 = var18.new RingBufferIterator();
    boolean var28 = var18.isEmpty();
    var1.enqueue((java.lang.Object)var18);
    java.util.Spliterator var30 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + false+ "'", var14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test131");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    java.util.Spliterator var5 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test132");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    int var9 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test133");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Iterator var7 = var1.iterator();
    java.util.Spliterator var8 = var1.spliterator();
    java.util.Iterator var9 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test134");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test135");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    int var5 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test136");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test137");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    int var5 = var4.size();
    java.util.Iterator var6 = var4.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var4.new RingBufferIterator();
    boolean var8 = var7.hasNext();
    boolean var9 = var7.hasNext();
    var1.enqueue((java.lang.Object)var7);
    boolean var11 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test138");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.lang.Object var22 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var23 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var24 = var23.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test139");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var1.isEmpty();
    java.util.Spliterator var7 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test140");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    boolean var10 = var1.isEmpty();
    int var11 = var1.size();
    java.util.Spliterator var12 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test141");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    boolean var11 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    boolean var13 = var12.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test142");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    java.util.Spliterator var9 = var8.spliterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var8.new RingBufferIterator();
    java.util.Spliterator var11 = var8.spliterator();
    var6.enqueue((java.lang.Object)var8);
    var1.enqueue((java.lang.Object)var6);
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(0);
    java.util.Spliterator var16 = var15.spliterator();
    java.util.Spliterator var17 = var15.spliterator();
    java.util.Spliterator var18 = var15.spliterator();
    java.util.Iterator var19 = var15.iterator();
    java.util.Spliterator var20 = var15.spliterator();
    java.util.Spliterator var21 = var15.spliterator();
    var1.enqueue((java.lang.Object)var21);
    exercise01.RingBuffer var24 = new exercise01.RingBuffer(10);
    int var25 = var24.size();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    java.util.Spliterator var28 = var24.spliterator();
    var24.enqueue((java.lang.Object)(short)1);
    int var31 = var24.size();
    exercise01.RingBuffer var33 = new exercise01.RingBuffer(100);
    java.util.Iterator var34 = var33.iterator();
    java.util.Spliterator var35 = var33.spliterator();
    java.util.Spliterator var36 = var33.spliterator();
    exercise01.RingBuffer var38 = new exercise01.RingBuffer(0);
    int var39 = var38.size();
    java.util.Iterator var40 = var38.iterator();
    var33.enqueue((java.lang.Object)var38);
    boolean var42 = var33.isEmpty();
    int var43 = var33.size();
    boolean var44 = var33.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var45 = var33.new RingBufferIterator();
    java.lang.Object var46 = var45.next();
    var24.enqueue(var46);
    exercise01.RingBuffer var49 = new exercise01.RingBuffer(0);
    java.util.Spliterator var50 = var49.spliterator();
    java.util.Spliterator var51 = var49.spliterator();
    java.util.Spliterator var52 = var49.spliterator();
    java.util.Iterator var53 = var49.iterator();
    boolean var54 = var49.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var55 = var49.new RingBufferIterator();
    var24.enqueue((java.lang.Object)var49);
    var1.enqueue((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test143");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var1.new RingBufferIterator();
    java.lang.Object var12 = var11.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0f)+ "'", var12.equals((-1.0f)));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test144");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    boolean var10 = var1.isEmpty();
    int var11 = var1.size();
    java.util.Iterator var12 = var1.iterator();
    java.util.Iterator var13 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var1.new RingBufferIterator();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(100);
    java.util.Iterator var17 = var16.iterator();
    java.util.Spliterator var18 = var16.spliterator();
    java.util.Spliterator var19 = var16.spliterator();
    exercise01.RingBuffer var21 = new exercise01.RingBuffer(0);
    int var22 = var21.size();
    java.util.Iterator var23 = var21.iterator();
    var16.enqueue((java.lang.Object)var21);
    boolean var25 = var16.isEmpty();
    int var26 = var16.size();
    java.util.Iterator var27 = var16.iterator();
    java.util.Iterator var28 = var16.iterator();
    var1.enqueue((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test145");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test146");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    java.util.Iterator var11 = var1.iterator();
    int var12 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var13 = var1.new RingBufferIterator();
    boolean var14 = var13.hasNext();
    boolean var15 = var13.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test147");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test148");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    boolean var12 = var11.isEmpty();
    int var13 = var11.size();
    var1.enqueue((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test149");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test150");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    java.util.Spliterator var9 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    int var11 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test151");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var4.hasNext();
    boolean var6 = var4.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test152");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var7.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test153");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Spliterator var5 = var1.spliterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(0);
    java.util.Spliterator var13 = var12.spliterator();
    java.util.Spliterator var14 = var12.spliterator();
    java.util.Spliterator var15 = var12.spliterator();
    java.util.Iterator var16 = var12.iterator();
    boolean var17 = var12.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var18 = var12.new RingBufferIterator();
    java.util.Iterator var19 = var12.iterator();
    exercise01.RingBuffer.RingBufferIterator var20 = var12.new RingBufferIterator();
    boolean var21 = var12.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var21);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test154");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    int var11 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test155");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    java.util.Spliterator var9 = var8.spliterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var8.new RingBufferIterator();
    java.util.Spliterator var11 = var8.spliterator();
    var6.enqueue((java.lang.Object)var8);
    var1.enqueue((java.lang.Object)var6);
    java.util.Spliterator var14 = var6.spliterator();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(0);
    java.util.Iterator var17 = var16.iterator();
    int var18 = var16.size();
    int var19 = var16.size();
    java.util.Spliterator var20 = var16.spliterator();
    java.util.Iterator var21 = var16.iterator();
    int var22 = var16.size();
    java.util.Iterator var23 = var16.iterator();
    java.util.Spliterator var24 = var16.spliterator();
    int var25 = var16.size();
    exercise01.RingBuffer.RingBufferIterator var26 = var16.new RingBufferIterator();
    var6.enqueue((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test156");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    java.util.Iterator var5 = var4.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var4.new RingBufferIterator();
    int var7 = var4.size();
    var1.enqueue((java.lang.Object)var4);
    java.util.Spliterator var9 = var4.spliterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var4.new RingBufferIterator();
    java.util.Spliterator var11 = var4.spliterator();
    java.util.Iterator var12 = var4.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test157");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Iterator var7 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test158");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(byte)1);
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    java.lang.Object var8 = var7.next();
    boolean var9 = var7.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (byte)1+ "'", var8.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test159");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    boolean var10 = var1.isEmpty();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test160");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(100);
    java.util.Iterator var4 = var3.iterator();
    java.util.Spliterator var5 = var3.spliterator();
    int var6 = var3.size();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    int var9 = var8.size();
    int var10 = var8.size();
    int var11 = var8.size();
    exercise01.RingBuffer.RingBufferIterator var12 = var8.new RingBufferIterator();
    boolean var13 = var12.hasNext();
    var3.enqueue((java.lang.Object)var12);
    int var15 = var3.size();
    java.lang.Object var16 = var3.dequeue();
    var1.enqueue((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test161");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(10);
    int var9 = var8.size();
    boolean var10 = var8.isEmpty();
    java.util.Iterator var11 = var8.iterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var8.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var8.new RingBufferIterator();
    java.util.Iterator var14 = var8.iterator();
    int var15 = var8.size();
    java.util.Iterator var16 = var8.iterator();
    var1.enqueue((java.lang.Object)var8);
    boolean var18 = var8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test162");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(1);
    boolean var8 = var7.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var9 = var7.new RingBufferIterator();
    java.util.Spliterator var10 = var7.spliterator();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var12 = var1.iterator();
    int var13 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test163");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    java.util.Spliterator var10 = var1.spliterator();
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(10);
    int var13 = var12.size();
    java.util.Spliterator var14 = var12.spliterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var12.new RingBufferIterator();
    int var16 = var12.size();
    java.util.Spliterator var17 = var12.spliterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var12.new RingBufferIterator();
    boolean var19 = var12.isEmpty();
    exercise01.RingBuffer var21 = new exercise01.RingBuffer(0);
    java.util.Spliterator var22 = var21.spliterator();
    java.util.Spliterator var23 = var21.spliterator();
    java.util.Spliterator var24 = var21.spliterator();
    java.util.Spliterator var25 = var21.spliterator();
    exercise01.RingBuffer.RingBufferIterator var26 = var21.new RingBufferIterator();
    boolean var27 = var26.hasNext();
    boolean var28 = var26.hasNext();
    var12.enqueue((java.lang.Object)var26);
    java.lang.Object var30 = var12.dequeue();
    var1.enqueue(var30);
    java.lang.Object var32 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test164");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    java.util.Spliterator var9 = var8.spliterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var8.new RingBufferIterator();
    java.util.Spliterator var11 = var8.spliterator();
    var6.enqueue((java.lang.Object)var8);
    var1.enqueue((java.lang.Object)var6);
    exercise01.RingBuffer.RingBufferIterator var14 = var6.new RingBufferIterator();
    int var15 = var6.size();
    exercise01.RingBuffer.RingBufferIterator var16 = var6.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test165");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var7 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    int var9 = var6.size();
    java.util.Iterator var10 = var6.iterator();
    java.util.Spliterator var11 = var6.spliterator();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    int var14 = var6.size();
    java.util.Iterator var15 = var6.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test166");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    java.util.Iterator var5 = var4.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var4.new RingBufferIterator();
    int var7 = var4.size();
    var1.enqueue((java.lang.Object)var4);
    int var9 = var4.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test167");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test168");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test169");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    var1.enqueue((java.lang.Object)(short)1);
    int var8 = var1.size();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(100);
    java.util.Iterator var11 = var10.iterator();
    java.util.Spliterator var12 = var10.spliterator();
    java.util.Spliterator var13 = var10.spliterator();
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(0);
    int var16 = var15.size();
    java.util.Iterator var17 = var15.iterator();
    var10.enqueue((java.lang.Object)var15);
    boolean var19 = var10.isEmpty();
    int var20 = var10.size();
    boolean var21 = var10.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var22 = var10.new RingBufferIterator();
    java.lang.Object var23 = var22.next();
    var1.enqueue(var23);
    int var25 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var26 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test170");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var22 = var9.iterator();
    java.lang.Object var23 = var9.dequeue();
    exercise01.RingBuffer.RingBufferIterator var24 = var9.new RingBufferIterator();
    java.lang.Object var25 = var9.dequeue();
    int var26 = var9.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test171");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var3.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var3);
    int var9 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test172");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test173");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test174");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    var1.enqueue((java.lang.Object)var3);
    java.lang.Object var8 = var1.dequeue();
    java.util.Iterator var9 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test175");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    int var8 = var6.size();
    var1.enqueue((java.lang.Object)var8);
    boolean var10 = var1.isEmpty();
    java.lang.Object var11 = var1.dequeue();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(0);
    java.util.Spliterator var14 = var13.spliterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var13.new RingBufferIterator();
    java.util.Spliterator var16 = var13.spliterator();
    int var17 = var13.size();
    int var18 = var13.size();
    boolean var19 = var13.isEmpty();
    int var20 = var13.size();
    java.util.Spliterator var21 = var13.spliterator();
    java.util.Iterator var22 = var13.iterator();
    exercise01.RingBuffer.RingBufferIterator var23 = var13.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var23);
    boolean var25 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var26 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0+ "'", var11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test176");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    int var8 = var7.size();
    java.util.Iterator var9 = var7.iterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var7.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    boolean var12 = var10.hasNext();
    boolean var13 = var10.hasNext();
    boolean var14 = var10.hasNext();
    var1.enqueue((java.lang.Object)var10);
    boolean var16 = var10.hasNext();
    boolean var17 = var10.hasNext();
    boolean var18 = var10.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test177");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test178");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    java.util.Spliterator var9 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    int var11 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test179");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(0);
    java.util.Iterator var14 = var13.iterator();
    int var15 = var13.size();
    exercise01.RingBuffer.RingBufferIterator var16 = var13.new RingBufferIterator();
    boolean var17 = var13.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var18 = var13.new RingBufferIterator();
    boolean var19 = var18.hasNext();
    boolean var20 = var18.hasNext();
    var1.enqueue((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test180");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test181");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    exercise01.RingBuffer.RingBufferIterator var10 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var6.new RingBufferIterator();
    int var12 = var6.size();
    int var13 = var6.size();
    exercise01.RingBuffer.RingBufferIterator var14 = var6.new RingBufferIterator();
    boolean var15 = var14.hasNext();
    boolean var16 = var14.hasNext();
    boolean var17 = var14.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test182");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    int var8 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Iterator var12 = var11.iterator();
    int var13 = var11.size();
    int var14 = var11.size();
    java.util.Spliterator var15 = var11.spliterator();
    java.util.Iterator var16 = var11.iterator();
    int var17 = var11.size();
    java.util.Iterator var18 = var11.iterator();
    java.util.Spliterator var19 = var11.spliterator();
    int var20 = var11.size();
    int var21 = var11.size();
    var1.enqueue((java.lang.Object)var11);
    int var23 = var11.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test183");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(10);
    int var8 = var7.size();
    boolean var9 = var7.isEmpty();
    java.util.Iterator var10 = var7.iterator();
    java.util.Spliterator var11 = var7.spliterator();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(1);
    boolean var14 = var13.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var15 = var13.new RingBufferIterator();
    java.util.Spliterator var16 = var13.spliterator();
    var7.enqueue((java.lang.Object)var13);
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var19 = var1.iterator();
    java.util.Iterator var20 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test184");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var22 = var9.size();
    int var23 = var9.size();
    int var24 = var9.size();
    java.util.Spliterator var25 = var9.spliterator();
    java.util.Spliterator var26 = var9.spliterator();
    exercise01.RingBuffer.RingBufferIterator var27 = var9.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test185");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(0);
    int var13 = var12.size();
    java.util.Iterator var14 = var12.iterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var12.new RingBufferIterator();
    boolean var16 = var12.isEmpty();
    boolean var17 = var12.isEmpty();
    int var18 = var12.size();
    var1.enqueue((java.lang.Object)var12);
    java.util.Spliterator var20 = var12.spliterator();
    boolean var21 = var12.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test186");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(10);
    int var9 = var8.size();
    boolean var10 = var8.isEmpty();
    java.util.Iterator var11 = var8.iterator();
    boolean var12 = var8.isEmpty();
    boolean var13 = var8.isEmpty();
    java.util.Iterator var14 = var8.iterator();
    boolean var15 = var8.isEmpty();
    boolean var16 = var8.isEmpty();
    exercise01.RingBuffer var18 = new exercise01.RingBuffer(0);
    java.util.Iterator var19 = var18.iterator();
    exercise01.RingBuffer.RingBufferIterator var20 = var18.new RingBufferIterator();
    int var21 = var18.size();
    int var22 = var18.size();
    exercise01.RingBuffer.RingBufferIterator var23 = var18.new RingBufferIterator();
    int var24 = var18.size();
    var8.enqueue((java.lang.Object)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var8);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test187");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Spliterator var6 = var1.spliterator();
    int var7 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var8.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test188");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    java.util.Spliterator var9 = var6.spliterator();
    int var10 = var6.size();
    int var11 = var6.size();
    boolean var12 = var6.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var13 = var6.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var13);
    int var15 = var1.size();
    boolean var16 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var17 = var1.new RingBufferIterator();
    java.lang.Object var18 = var17.next();
    boolean var19 = var17.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var20 = var17.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test189");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    int var8 = var7.size();
    java.util.Iterator var9 = var7.iterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var7.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    boolean var12 = var10.hasNext();
    boolean var13 = var10.hasNext();
    boolean var14 = var10.hasNext();
    var1.enqueue((java.lang.Object)var10);
    boolean var16 = var10.hasNext();
    boolean var17 = var10.hasNext();
    boolean var18 = var10.hasNext();
    boolean var19 = var10.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test190");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    int var9 = var8.size();
    java.util.Iterator var10 = var8.iterator();
    boolean var11 = var8.isEmpty();
    boolean var12 = var8.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var13 = var8.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var8);
    boolean var15 = var8.isEmpty();
    int var16 = var8.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test191");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    java.util.Iterator var10 = var9.iterator();
    java.util.Spliterator var11 = var9.spliterator();
    java.util.Spliterator var12 = var9.spliterator();
    exercise01.RingBuffer var14 = new exercise01.RingBuffer(0);
    int var15 = var14.size();
    java.util.Iterator var16 = var14.iterator();
    var9.enqueue((java.lang.Object)var14);
    exercise01.RingBuffer.RingBufferIterator var18 = var14.new RingBufferIterator();
    java.util.Spliterator var19 = var14.spliterator();
    var1.enqueue((java.lang.Object)var19);
    exercise01.RingBuffer.RingBufferIterator var21 = var1.new RingBufferIterator();
    java.lang.Object var22 = var1.dequeue();
    java.util.Iterator var23 = var1.iterator();
    int var24 = var1.size();
    java.util.Spliterator var25 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var26 = var1.new RingBufferIterator();
    boolean var27 = var26.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test192");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test193");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    java.util.Spliterator var6 = var1.spliterator();
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test194");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test195");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test196");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    boolean var9 = var8.hasNext();
    boolean var10 = var8.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test197");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    java.util.Spliterator var11 = var1.spliterator();
    int var12 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test198");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(10);
    int var7 = var6.size();
    boolean var8 = var6.isEmpty();
    java.util.Iterator var9 = var6.iterator();
    boolean var10 = var6.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var11 = var6.new RingBufferIterator();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(10);
    int var14 = var13.size();
    boolean var15 = var13.isEmpty();
    java.util.Iterator var16 = var13.iterator();
    java.util.Spliterator var17 = var13.spliterator();
    java.util.Iterator var18 = var13.iterator();
    boolean var19 = var13.isEmpty();
    exercise01.RingBuffer var21 = new exercise01.RingBuffer(0);
    int var22 = var21.size();
    java.util.Iterator var23 = var21.iterator();
    exercise01.RingBuffer.RingBufferIterator var24 = var21.new RingBufferIterator();
    boolean var25 = var21.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var26 = var21.new RingBufferIterator();
    boolean var27 = var26.hasNext();
    var13.enqueue((java.lang.Object)var27);
    int var29 = var13.size();
    java.util.Spliterator var30 = var13.spliterator();
    var6.enqueue((java.lang.Object)var30);
    java.util.Iterator var32 = var6.iterator();
    boolean var33 = var6.isEmpty();
    java.util.Iterator var34 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test199");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var22 = var9.size();
    int var23 = var9.size();
    boolean var24 = var9.isEmpty();
    boolean var25 = var9.isEmpty();
    java.util.Iterator var26 = var9.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test200");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    int var9 = var8.size();
    java.util.Iterator var10 = var8.iterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var8.new RingBufferIterator();
    boolean var12 = var8.isEmpty();
    int var13 = var8.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var8);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test201");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    int var5 = var1.size();
    int var6 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test202");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    boolean var22 = var9.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var23 = var9.new RingBufferIterator();
    exercise01.RingBuffer var25 = new exercise01.RingBuffer(0);
    int var26 = var25.size();
    java.util.Iterator var27 = var25.iterator();
    var9.enqueue((java.lang.Object)var25);
    java.util.Iterator var29 = var9.iterator();
    exercise01.RingBuffer var31 = new exercise01.RingBuffer(0);
    boolean var32 = var31.isEmpty();
    java.util.Iterator var33 = var31.iterator();
    exercise01.RingBuffer.RingBufferIterator var34 = var31.new RingBufferIterator();
    boolean var35 = var31.isEmpty();
    java.util.Spliterator var36 = var31.spliterator();
    exercise01.RingBuffer.RingBufferIterator var37 = var31.new RingBufferIterator();
    var9.enqueue((java.lang.Object)var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var37.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test203");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test204");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var7.hasNext();
    boolean var9 = var7.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test205");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test206");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test207");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    java.util.Spliterator var11 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 10+ "'", var8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test208");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Iterator var12 = var1.iterator();
    java.util.Spliterator var13 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test209");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    java.util.Spliterator var12 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var1.new RingBufferIterator();
    boolean var14 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0f)+ "'", var9.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test210");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    int var5 = var1.size();
    int var6 = var1.size();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(100);
    java.util.Spliterator var9 = var8.spliterator();
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Iterator var12 = var11.iterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    int var14 = var11.size();
    var8.enqueue((java.lang.Object)var11);
    java.util.Spliterator var16 = var8.spliterator();
    java.util.Spliterator var17 = var8.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var8);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test211");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Spliterator var7 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(0);
    java.util.Spliterator var11 = var10.spliterator();
    int var12 = var10.size();
    java.util.Spliterator var13 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var10.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var10);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test212");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    java.util.Iterator var9 = var1.iterator();
    java.lang.Object var10 = var1.dequeue();
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(100);
    java.util.Iterator var13 = var12.iterator();
    java.util.Spliterator var14 = var12.spliterator();
    java.util.Spliterator var15 = var12.spliterator();
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(0);
    int var18 = var17.size();
    java.util.Iterator var19 = var17.iterator();
    var12.enqueue((java.lang.Object)var17);
    exercise01.RingBuffer.RingBufferIterator var21 = var17.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var22 = var17.new RingBufferIterator();
    java.util.Spliterator var23 = var17.spliterator();
    var1.enqueue((java.lang.Object)var17);
    boolean var25 = var17.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0f)+ "'", var10.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test213");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 10+ "'", var8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test214");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(1);
    exercise01.RingBuffer.RingBufferIterator var10 = var9.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var9.new RingBufferIterator();
    java.util.Spliterator var12 = var9.spliterator();
    boolean var13 = var9.isEmpty();
    int var14 = var9.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var14);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test215");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Iterator var7 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test216");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(10);
    int var9 = var8.size();
    exercise01.RingBuffer.RingBufferIterator var10 = var8.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var8);
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(0);
    java.util.Iterator var14 = var13.iterator();
    int var15 = var13.size();
    int var16 = var13.size();
    int var17 = var13.size();
    java.util.Spliterator var18 = var13.spliterator();
    java.util.Iterator var19 = var13.iterator();
    var1.enqueue((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test217");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    int var8 = var1.size();
    int var9 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test218");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(10);
    int var12 = var11.size();
    java.util.Spliterator var13 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var11.new RingBufferIterator();
    int var15 = var11.size();
    var11.enqueue((java.lang.Object)10);
    int var18 = var11.size();
    java.util.Spliterator var19 = var11.spliterator();
    java.lang.Object var20 = var11.dequeue();
    var1.enqueue((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 10+ "'", var20.equals(10));

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test219");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var4.hasNext();
    boolean var6 = var4.hasNext();
    boolean var7 = var4.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var4.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test220");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    java.util.Spliterator var8 = var1.spliterator();
    int var9 = var1.size();
    int var10 = var1.size();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Spliterator var12 = var1.spliterator();
    java.util.Iterator var13 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test221");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    int var8 = var7.size();
    int var9 = var7.size();
    int var10 = var7.size();
    java.util.Iterator var11 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    exercise01.RingBuffer var14 = new exercise01.RingBuffer(0);
    java.util.Spliterator var15 = var14.spliterator();
    java.util.Spliterator var16 = var14.spliterator();
    java.util.Spliterator var17 = var14.spliterator();
    int var18 = var14.size();
    boolean var19 = var14.isEmpty();
    int var20 = var14.size();
    exercise01.RingBuffer.RingBufferIterator var21 = var14.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test222");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    java.util.Spliterator var9 = var1.spliterator();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    exercise01.RingBuffer var14 = new exercise01.RingBuffer(10);
    int var15 = var14.size();
    boolean var16 = var14.isEmpty();
    java.util.Iterator var17 = var14.iterator();
    boolean var18 = var14.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var19 = var14.new RingBufferIterator();
    exercise01.RingBuffer var21 = new exercise01.RingBuffer(10);
    int var22 = var21.size();
    boolean var23 = var21.isEmpty();
    java.util.Iterator var24 = var21.iterator();
    java.util.Spliterator var25 = var21.spliterator();
    java.util.Iterator var26 = var21.iterator();
    boolean var27 = var21.isEmpty();
    exercise01.RingBuffer var29 = new exercise01.RingBuffer(0);
    int var30 = var29.size();
    java.util.Iterator var31 = var29.iterator();
    exercise01.RingBuffer.RingBufferIterator var32 = var29.new RingBufferIterator();
    boolean var33 = var29.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var34 = var29.new RingBufferIterator();
    boolean var35 = var34.hasNext();
    var21.enqueue((java.lang.Object)var35);
    int var37 = var21.size();
    java.util.Spliterator var38 = var21.spliterator();
    var14.enqueue((java.lang.Object)var38);
    java.util.Iterator var40 = var14.iterator();
    java.lang.Object var41 = var14.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var14);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test223");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var22 = var9.iterator();
    java.util.Iterator var23 = var9.iterator();
    exercise01.RingBuffer var25 = new exercise01.RingBuffer(10);
    int var26 = var25.size();
    boolean var27 = var25.isEmpty();
    java.util.Iterator var28 = var25.iterator();
    exercise01.RingBuffer.RingBufferIterator var29 = var25.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var30 = var25.new RingBufferIterator();
    exercise01.RingBuffer var32 = new exercise01.RingBuffer(0);
    int var33 = var32.size();
    java.util.Iterator var34 = var32.iterator();
    boolean var35 = var32.isEmpty();
    boolean var36 = var32.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var37 = var32.new RingBufferIterator();
    var25.enqueue((java.lang.Object)var32);
    exercise01.RingBuffer.RingBufferIterator var39 = var32.new RingBufferIterator();
    var9.enqueue((java.lang.Object)var32);
    java.util.Spliterator var41 = var32.spliterator();
    java.util.Iterator var42 = var32.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test224");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var4.hasNext();
    boolean var6 = var4.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test225");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    var1.enqueue((java.lang.Object)(short)1);
    int var8 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    boolean var10 = var9.hasNext();
    java.lang.Object var11 = var9.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + (short)1+ "'", var11.equals((short)1));

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test226");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    int var9 = var8.size();
    java.util.Iterator var10 = var8.iterator();
    boolean var11 = var8.isEmpty();
    boolean var12 = var8.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var13 = var8.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var8);
    boolean var15 = var1.isEmpty();
    int var16 = var1.size();
    exercise01.RingBuffer var18 = new exercise01.RingBuffer(100);
    java.util.Iterator var19 = var18.iterator();
    java.util.Spliterator var20 = var18.spliterator();
    int var21 = var18.size();
    java.util.Iterator var22 = var18.iterator();
    exercise01.RingBuffer var24 = new exercise01.RingBuffer(0);
    int var25 = var24.size();
    java.util.Iterator var26 = var24.iterator();
    exercise01.RingBuffer.RingBufferIterator var27 = var24.new RingBufferIterator();
    boolean var28 = var27.hasNext();
    boolean var29 = var27.hasNext();
    boolean var30 = var27.hasNext();
    boolean var31 = var27.hasNext();
    var18.enqueue((java.lang.Object)var27);
    java.lang.Object var33 = var18.dequeue();
    var1.enqueue((java.lang.Object)var18);
    exercise01.RingBuffer.RingBufferIterator var35 = var18.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test227");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(0);
    java.util.Spliterator var10 = var9.spliterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var9.new RingBufferIterator();
    java.util.Spliterator var12 = var9.spliterator();
    var7.enqueue((java.lang.Object)var9);
    java.lang.Object var14 = var7.dequeue();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(1);
    exercise01.RingBuffer.RingBufferIterator var17 = var16.new RingBufferIterator();
    var7.enqueue((java.lang.Object)var17);
    var1.enqueue((java.lang.Object)var17);
    boolean var20 = var17.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test228");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var1.isEmpty();
    java.util.Spliterator var9 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test229");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(10);
    int var11 = var10.size();
    java.util.Spliterator var12 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var10.new RingBufferIterator();
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(0);
    java.util.Spliterator var18 = var17.spliterator();
    exercise01.RingBuffer.RingBufferIterator var19 = var17.new RingBufferIterator();
    java.util.Spliterator var20 = var17.spliterator();
    var15.enqueue((java.lang.Object)var17);
    var10.enqueue((java.lang.Object)var15);
    var1.enqueue((java.lang.Object)var10);
    int var24 = var10.size();
    java.util.Iterator var25 = var10.iterator();
    exercise01.RingBuffer var27 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var28 = var27.new RingBufferIterator();
    java.util.Iterator var29 = var27.iterator();
    exercise01.RingBuffer var31 = new exercise01.RingBuffer(10);
    int var32 = var31.size();
    boolean var33 = var31.isEmpty();
    java.util.Iterator var34 = var31.iterator();
    boolean var35 = var31.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var36 = var31.new RingBufferIterator();
    boolean var37 = var36.hasNext();
    var27.enqueue((java.lang.Object)var36);
    int var39 = var27.size();
    java.lang.Object var40 = var27.dequeue();
    var10.enqueue(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test230");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test231");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    java.util.Spliterator var9 = var8.spliterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var8.new RingBufferIterator();
    java.util.Spliterator var11 = var8.spliterator();
    var6.enqueue((java.lang.Object)var8);
    var1.enqueue((java.lang.Object)var6);
    exercise01.RingBuffer.RingBufferIterator var14 = var6.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test232");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    java.util.Spliterator var9 = var6.spliterator();
    int var10 = var6.size();
    int var11 = var6.size();
    boolean var12 = var6.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var13 = var6.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var13);
    int var15 = var1.size();
    boolean var16 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var17 = var1.new RingBufferIterator();
    java.lang.Object var18 = var17.next();
    boolean var19 = var17.hasNext();
    boolean var20 = var17.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test233");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    java.util.Iterator var10 = var9.iterator();
    java.util.Spliterator var11 = var9.spliterator();
    java.util.Spliterator var12 = var9.spliterator();
    exercise01.RingBuffer var14 = new exercise01.RingBuffer(0);
    int var15 = var14.size();
    java.util.Iterator var16 = var14.iterator();
    var9.enqueue((java.lang.Object)var14);
    exercise01.RingBuffer.RingBufferIterator var18 = var14.new RingBufferIterator();
    java.util.Spliterator var19 = var14.spliterator();
    var1.enqueue((java.lang.Object)var19);
    exercise01.RingBuffer.RingBufferIterator var21 = var1.new RingBufferIterator();
    java.lang.Object var22 = var1.dequeue();
    java.util.Iterator var23 = var1.iterator();
    int var24 = var1.size();
    java.util.Spliterator var25 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var26 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var27 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test234");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test235");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    boolean var10 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var11 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test236");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    java.util.Iterator var8 = var7.iterator();
    int var9 = var7.size();
    int var10 = var7.size();
    java.util.Spliterator var11 = var7.spliterator();
    java.util.Spliterator var12 = var7.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var7.new RingBufferIterator();
    java.util.Spliterator var14 = var7.spliterator();
    var1.enqueue((java.lang.Object)var14);
    java.util.Iterator var16 = var1.iterator();
    int var17 = var1.size();
    boolean var18 = var1.isEmpty();
    java.util.Spliterator var19 = var1.spliterator();
    java.util.Iterator var20 = var1.iterator();
    java.lang.Object var21 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test237");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    java.util.Spliterator var9 = var1.spliterator();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    boolean var12 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test238");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var7 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    int var9 = var6.size();
    java.util.Iterator var10 = var6.iterator();
    java.util.Spliterator var11 = var6.spliterator();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    boolean var14 = var6.isEmpty();
    boolean var15 = var6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test239");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    int var8 = var6.size();
    var1.enqueue((java.lang.Object)var8);
    java.lang.Object var10 = var1.dequeue();
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(0);
    java.util.Iterator var13 = var12.iterator();
    int var14 = var12.size();
    int var15 = var12.size();
    java.util.Spliterator var16 = var12.spliterator();
    java.util.Iterator var17 = var12.iterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var12.new RingBufferIterator();
    java.util.Spliterator var19 = var12.spliterator();
    java.util.Iterator var20 = var12.iterator();
    var1.enqueue((java.lang.Object)var20);
    java.lang.Object var22 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 0+ "'", var10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test240");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var7.hasNext();
    boolean var9 = var7.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test241");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(2);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(10);
    int var6 = var5.size();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var5.new RingBufferIterator();
    java.util.Spliterator var10 = var5.spliterator();
    int var11 = var5.size();
    java.util.Iterator var12 = var5.iterator();
    var1.enqueue((java.lang.Object)var12);
    int var14 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test242");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.lang.Object var22 = var1.dequeue();
    int var23 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var24 = var1.new RingBufferIterator();
    boolean var25 = var24.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var24.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test243");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(10);
    int var9 = var8.size();
    boolean var10 = var8.isEmpty();
    java.util.Iterator var11 = var8.iterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var8.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var8.new RingBufferIterator();
    java.util.Iterator var14 = var8.iterator();
    int var15 = var8.size();
    java.util.Iterator var16 = var8.iterator();
    var1.enqueue((java.lang.Object)var8);
    exercise01.RingBuffer.RingBufferIterator var18 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test244");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(0);
    java.util.Spliterator var6 = var5.spliterator();
    int var7 = var5.size();
    java.util.Spliterator var8 = var5.spliterator();
    java.util.Iterator var9 = var5.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var11 = var5.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test245");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    java.util.Spliterator var9 = var8.spliterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var8.new RingBufferIterator();
    java.util.Spliterator var11 = var8.spliterator();
    var6.enqueue((java.lang.Object)var8);
    var1.enqueue((java.lang.Object)var6);
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(100);
    java.util.Iterator var16 = var15.iterator();
    java.util.Spliterator var17 = var15.spliterator();
    java.util.Spliterator var18 = var15.spliterator();
    exercise01.RingBuffer var20 = new exercise01.RingBuffer(0);
    int var21 = var20.size();
    java.util.Iterator var22 = var20.iterator();
    var15.enqueue((java.lang.Object)var20);
    java.util.Spliterator var24 = var20.spliterator();
    exercise01.RingBuffer.RingBufferIterator var25 = var20.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var26 = var20.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test246");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Spliterator var5 = var1.spliterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    int var8 = var1.size();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test247");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    boolean var10 = var6.isEmpty();
    java.util.Iterator var11 = var6.iterator();
    boolean var12 = var6.isEmpty();
    java.util.Spliterator var13 = var6.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test248");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test249");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    java.util.Iterator var10 = var9.iterator();
    java.util.Spliterator var11 = var9.spliterator();
    java.util.Spliterator var12 = var9.spliterator();
    exercise01.RingBuffer var14 = new exercise01.RingBuffer(0);
    int var15 = var14.size();
    java.util.Iterator var16 = var14.iterator();
    var9.enqueue((java.lang.Object)var14);
    exercise01.RingBuffer.RingBufferIterator var18 = var14.new RingBufferIterator();
    java.util.Spliterator var19 = var14.spliterator();
    var1.enqueue((java.lang.Object)var19);
    exercise01.RingBuffer.RingBufferIterator var21 = var1.new RingBufferIterator();
    boolean var22 = var21.hasNext();
    boolean var23 = var21.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var21.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test250");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.lang.Object var22 = var1.dequeue();
    java.util.Iterator var23 = var1.iterator();
    java.util.Spliterator var24 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test251");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    java.util.Spliterator var9 = var8.spliterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var8.new RingBufferIterator();
    java.util.Spliterator var11 = var8.spliterator();
    var6.enqueue((java.lang.Object)var8);
    var1.enqueue((java.lang.Object)var6);
    java.util.Spliterator var14 = var6.spliterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var6.new RingBufferIterator();
    int var16 = var6.size();
    exercise01.RingBuffer.RingBufferIterator var17 = var6.new RingBufferIterator();
    exercise01.RingBuffer var19 = new exercise01.RingBuffer(0);
    java.util.Iterator var20 = var19.iterator();
    int var21 = var19.size();
    int var22 = var19.size();
    java.util.Spliterator var23 = var19.spliterator();
    java.util.Spliterator var24 = var19.spliterator();
    int var25 = var19.size();
    java.util.Iterator var26 = var19.iterator();
    boolean var27 = var19.isEmpty();
    java.util.Iterator var28 = var19.iterator();
    var6.enqueue((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test252");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(10);
    int var8 = var7.size();
    boolean var9 = var7.isEmpty();
    java.util.Iterator var10 = var7.iterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var7.new RingBufferIterator();
    java.util.Iterator var13 = var7.iterator();
    int var14 = var7.size();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(0);
    java.util.Spliterator var17 = var16.spliterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var16.new RingBufferIterator();
    java.util.Spliterator var19 = var16.spliterator();
    exercise01.RingBuffer.RingBufferIterator var20 = var16.new RingBufferIterator();
    boolean var21 = var20.hasNext();
    var7.enqueue((java.lang.Object)var20);
    java.util.Spliterator var23 = var7.spliterator();
    exercise01.RingBuffer.RingBufferIterator var24 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var25 = var7.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var7);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test253");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    java.util.Spliterator var8 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test254");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var22 = var9.iterator();
    boolean var23 = var9.isEmpty();
    java.util.Spliterator var24 = var9.spliterator();
    boolean var25 = var9.isEmpty();
    java.util.Iterator var26 = var9.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test255");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    int var10 = var6.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var6.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test256");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Iterator var12 = var1.iterator();
    int var13 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test257");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test258");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    boolean var10 = var1.isEmpty();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(0);
    java.util.Spliterator var16 = var15.spliterator();
    exercise01.RingBuffer.RingBufferIterator var17 = var15.new RingBufferIterator();
    java.util.Spliterator var18 = var15.spliterator();
    int var19 = var15.size();
    exercise01.RingBuffer.RingBufferIterator var20 = var15.new RingBufferIterator();
    java.util.Iterator var21 = var15.iterator();
    var13.enqueue((java.lang.Object)var21);
    boolean var23 = var13.isEmpty();
    java.util.Iterator var24 = var13.iterator();
    boolean var25 = var13.isEmpty();
    java.util.Iterator var26 = var13.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var13);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test259");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(10);
    int var11 = var10.size();
    java.util.Spliterator var12 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var10.new RingBufferIterator();
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(0);
    java.util.Spliterator var18 = var17.spliterator();
    exercise01.RingBuffer.RingBufferIterator var19 = var17.new RingBufferIterator();
    java.util.Spliterator var20 = var17.spliterator();
    var15.enqueue((java.lang.Object)var17);
    var10.enqueue((java.lang.Object)var15);
    var1.enqueue((java.lang.Object)var10);
    int var24 = var10.size();
    exercise01.RingBuffer var26 = new exercise01.RingBuffer(100);
    java.util.Iterator var27 = var26.iterator();
    java.util.Spliterator var28 = var26.spliterator();
    int var29 = var26.size();
    java.util.Iterator var30 = var26.iterator();
    exercise01.RingBuffer.RingBufferIterator var31 = var26.new RingBufferIterator();
    int var32 = var26.size();
    var10.enqueue((java.lang.Object)var26);
    java.util.Iterator var34 = var26.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test260");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    java.util.Spliterator var8 = var1.spliterator();
    int var9 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test261");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test262");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    boolean var22 = var9.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var23 = var9.new RingBufferIterator();
    java.util.Iterator var24 = var9.iterator();
    java.util.Spliterator var25 = var9.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test263");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test264");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    boolean var4 = var1.isEmpty();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Iterator var7 = var6.iterator();
    int var8 = var6.size();
    exercise01.RingBuffer.RingBufferIterator var9 = var6.new RingBufferIterator();
    java.util.Spliterator var10 = var6.spliterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var6.new RingBufferIterator();
    int var12 = var6.size();
    var1.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var1.dequeue();
    boolean var15 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test265");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(10);
    int var6 = var5.size();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    boolean var9 = var5.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var10 = var5.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    var1.enqueue((java.lang.Object)var10);
    int var13 = var1.size();
    java.util.Spliterator var14 = var1.spliterator();
    java.lang.Object var15 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test266");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test267");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    java.util.Spliterator var9 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test268");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    int var2 = var1.size();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    java.util.Spliterator var5 = var4.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var4.new RingBufferIterator();
    java.util.Iterator var7 = var4.iterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var4.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var4.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var4);
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test269");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(0);
    java.util.Iterator var10 = var9.iterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var9.new RingBufferIterator();
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var9.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var9.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test270");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var1.isEmpty();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(0);
    int var11 = var10.size();
    int var12 = var10.size();
    int var13 = var10.size();
    java.util.Iterator var14 = var10.iterator();
    java.util.Spliterator var15 = var10.spliterator();
    java.util.Spliterator var16 = var10.spliterator();
    var1.enqueue((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test271");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test272");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    java.util.Spliterator var9 = var8.spliterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var8.new RingBufferIterator();
    java.util.Spliterator var11 = var8.spliterator();
    var6.enqueue((java.lang.Object)var8);
    var1.enqueue((java.lang.Object)var6);
    java.util.Iterator var14 = var1.iterator();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(0);
    java.util.Iterator var17 = var16.iterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var16.new RingBufferIterator();
    int var19 = var16.size();
    exercise01.RingBuffer.RingBufferIterator var20 = var16.new RingBufferIterator();
    java.util.Spliterator var21 = var16.spliterator();
    var1.enqueue((java.lang.Object)var16);
    int var23 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test273");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    java.util.Spliterator var9 = var8.spliterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var8.new RingBufferIterator();
    java.util.Spliterator var11 = var8.spliterator();
    var6.enqueue((java.lang.Object)var8);
    var1.enqueue((java.lang.Object)var6);
    java.util.Spliterator var14 = var6.spliterator();
    int var15 = var6.size();
    int var16 = var6.size();
    exercise01.RingBuffer.RingBufferIterator var17 = var6.new RingBufferIterator();
    boolean var18 = var17.hasNext();
    boolean var19 = var17.hasNext();
    java.lang.Object var20 = var17.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test274");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var9 = var1.dequeue();
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0f)+ "'", var9.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test275");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test276");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test277");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var9 = var8.new RingBufferIterator();
    java.util.Iterator var10 = var8.iterator();
    var1.enqueue((java.lang.Object)var8);
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    java.util.Spliterator var13 = var1.spliterator();
    int var14 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test278");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    int var2 = var1.size();
    int var3 = var1.size();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(10);
    int var6 = var5.size();
    java.util.Spliterator var7 = var5.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var5.new RingBufferIterator();
    int var9 = var5.size();
    var5.enqueue((java.lang.Object)10);
    java.lang.Object var12 = var5.dequeue();
    java.util.Spliterator var13 = var5.spliterator();
    java.util.Iterator var14 = var5.iterator();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(10);
    int var17 = var16.size();
    boolean var18 = var16.isEmpty();
    java.util.Iterator var19 = var16.iterator();
    java.util.Spliterator var20 = var16.spliterator();
    var5.enqueue((java.lang.Object)var20);
    var1.enqueue((java.lang.Object)var5);
    exercise01.RingBuffer var24 = new exercise01.RingBuffer(10);
    int var25 = var24.size();
    java.util.Spliterator var26 = var24.spliterator();
    exercise01.RingBuffer.RingBufferIterator var27 = var24.new RingBufferIterator();
    int var28 = var24.size();
    var24.enqueue((java.lang.Object)10);
    java.lang.Object var31 = var24.dequeue();
    var24.enqueue((java.lang.Object)"hi!");
    java.util.Spliterator var34 = var24.spliterator();
    var5.enqueue((java.lang.Object)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 10+ "'", var12.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + 10+ "'", var31.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test279");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    boolean var10 = var9.hasNext();
    java.lang.Object var11 = var9.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + (-1.0f)+ "'", var11.equals((-1.0f)));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test280");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(0);
    int var10 = var9.size();
    java.util.Iterator var11 = var9.iterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var9.new RingBufferIterator();
    boolean var13 = var9.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var14 = var9.new RingBufferIterator();
    boolean var15 = var14.hasNext();
    var1.enqueue((java.lang.Object)var15);
    int var17 = var1.size();
    exercise01.RingBuffer var19 = new exercise01.RingBuffer(0);
    java.util.Iterator var20 = var19.iterator();
    int var21 = var19.size();
    int var22 = var19.size();
    java.util.Spliterator var23 = var19.spliterator();
    java.util.Iterator var24 = var19.iterator();
    exercise01.RingBuffer.RingBufferIterator var25 = var19.new RingBufferIterator();
    java.util.Spliterator var26 = var19.spliterator();
    java.util.Iterator var27 = var19.iterator();
    var1.enqueue((java.lang.Object)var27);
    exercise01.RingBuffer var30 = new exercise01.RingBuffer(100);
    java.util.Iterator var31 = var30.iterator();
    java.util.Spliterator var32 = var30.spliterator();
    int var33 = var30.size();
    exercise01.RingBuffer var35 = new exercise01.RingBuffer(0);
    java.util.Spliterator var36 = var35.spliterator();
    exercise01.RingBuffer.RingBufferIterator var37 = var35.new RingBufferIterator();
    java.util.Spliterator var38 = var35.spliterator();
    int var39 = var35.size();
    int var40 = var35.size();
    boolean var41 = var35.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var42 = var35.new RingBufferIterator();
    var30.enqueue((java.lang.Object)var42);
    var1.enqueue((java.lang.Object)var42);
    boolean var45 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test281");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(0);
    java.util.Spliterator var11 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var10.new RingBufferIterator();
    java.util.Spliterator var13 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var10.new RingBufferIterator();
    boolean var15 = var14.hasNext();
    var1.enqueue((java.lang.Object)var14);
    exercise01.RingBuffer var18 = new exercise01.RingBuffer(0);
    java.util.Spliterator var19 = var18.spliterator();
    java.util.Spliterator var20 = var18.spliterator();
    java.util.Spliterator var21 = var18.spliterator();
    int var22 = var18.size();
    boolean var23 = var18.isEmpty();
    int var24 = var18.size();
    exercise01.RingBuffer.RingBufferIterator var25 = var18.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var25);
    int var27 = var1.size();
    java.util.Iterator var28 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var29 = var1.new RingBufferIterator();
    exercise01.RingBuffer var31 = new exercise01.RingBuffer(10);
    int var32 = var31.size();
    java.util.Spliterator var33 = var31.spliterator();
    exercise01.RingBuffer.RingBufferIterator var34 = var31.new RingBufferIterator();
    exercise01.RingBuffer var36 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var38 = new exercise01.RingBuffer(0);
    java.util.Spliterator var39 = var38.spliterator();
    exercise01.RingBuffer.RingBufferIterator var40 = var38.new RingBufferIterator();
    java.util.Spliterator var41 = var38.spliterator();
    var36.enqueue((java.lang.Object)var38);
    var31.enqueue((java.lang.Object)var36);
    java.util.Iterator var44 = var31.iterator();
    exercise01.RingBuffer var46 = new exercise01.RingBuffer(0);
    java.util.Iterator var47 = var46.iterator();
    exercise01.RingBuffer.RingBufferIterator var48 = var46.new RingBufferIterator();
    int var49 = var46.size();
    exercise01.RingBuffer.RingBufferIterator var50 = var46.new RingBufferIterator();
    java.util.Spliterator var51 = var46.spliterator();
    var31.enqueue((java.lang.Object)var46);
    java.util.Iterator var53 = var46.iterator();
    var1.enqueue((java.lang.Object)var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test282");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test283");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    java.util.Spliterator var12 = var1.spliterator();
    int var13 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test284");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    var1.enqueue((java.lang.Object)var3);
    java.lang.Object var8 = var1.dequeue();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(1);
    exercise01.RingBuffer.RingBufferIterator var11 = var10.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var11);
    int var13 = var1.size();
    int var14 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test285");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    int var8 = var7.size();
    int var9 = var7.size();
    int var10 = var7.size();
    java.util.Iterator var11 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    java.util.Spliterator var13 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var1.new RingBufferIterator();
    java.lang.Object var15 = var14.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test286");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.lang.Object var22 = var1.dequeue();
    int var23 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var24 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test287");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var6.hasNext();
    boolean var8 = var6.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test288");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    int var5 = var4.size();
    var1.enqueue((java.lang.Object)var5);
    java.lang.Object var7 = var1.dequeue();
    java.util.Spliterator var8 = var1.spliterator();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    java.util.Spliterator var11 = var1.spliterator();
    boolean var12 = var1.isEmpty();
    java.util.Spliterator var13 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var1.new RingBufferIterator();
    java.util.Spliterator var15 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0+ "'", var7.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test289");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Spliterator var9 = var1.spliterator();
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test290");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Spliterator var7 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    java.util.Spliterator var9 = var1.spliterator();
    boolean var10 = var1.isEmpty();
    boolean var11 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test291");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    boolean var10 = var1.isEmpty();
    int var11 = var1.size();
    java.util.Iterator var12 = var1.iterator();
    java.util.Iterator var13 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var1.new RingBufferIterator();
    boolean var15 = var14.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test292");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    java.util.Spliterator var9 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test293");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(10);
    int var7 = var6.size();
    boolean var8 = var6.isEmpty();
    java.util.Spliterator var9 = var6.spliterator();
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var12 = var11.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    int var14 = var11.size();
    java.util.Iterator var15 = var11.iterator();
    java.util.Spliterator var16 = var11.spliterator();
    boolean var17 = var11.isEmpty();
    var6.enqueue((java.lang.Object)var11);
    boolean var19 = var11.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var20 = var11.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var11);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test294");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    boolean var22 = var9.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var23 = var9.new RingBufferIterator();
    java.util.Iterator var24 = var9.iterator();
    int var25 = var9.size();
    int var26 = var9.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test295");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(10);
    int var12 = var11.size();
    boolean var13 = var11.isEmpty();
    java.util.Iterator var14 = var11.iterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var11.new RingBufferIterator();
    java.util.Spliterator var16 = var11.spliterator();
    int var17 = var11.size();
    java.util.Iterator var18 = var11.iterator();
    boolean var19 = var11.isEmpty();
    boolean var20 = var11.isEmpty();
    exercise01.RingBuffer var22 = new exercise01.RingBuffer(0);
    int var23 = var22.size();
    java.util.Iterator var24 = var22.iterator();
    exercise01.RingBuffer.RingBufferIterator var25 = var22.new RingBufferIterator();
    boolean var26 = var22.isEmpty();
    boolean var27 = var22.isEmpty();
    int var28 = var22.size();
    var11.enqueue((java.lang.Object)var22);
    exercise01.RingBuffer.RingBufferIterator var30 = var22.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var22);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test296");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    boolean var10 = var1.isEmpty();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Iterator var12 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test297");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(10);
    int var6 = var5.size();
    java.util.Spliterator var7 = var5.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var5.new RingBufferIterator();
    int var9 = var5.size();
    var5.enqueue((java.lang.Object)10);
    java.lang.Object var12 = var5.dequeue();
    java.util.Spliterator var13 = var5.spliterator();
    java.util.Iterator var14 = var5.iterator();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(10);
    int var17 = var16.size();
    boolean var18 = var16.isEmpty();
    java.util.Iterator var19 = var16.iterator();
    java.util.Spliterator var20 = var16.spliterator();
    var5.enqueue((java.lang.Object)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var5);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 10+ "'", var12.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test298");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    java.util.Spliterator var7 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    boolean var10 = var9.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var9.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test299");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(0);
    int var13 = var12.size();
    java.util.Iterator var14 = var12.iterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var12.new RingBufferIterator();
    boolean var16 = var12.isEmpty();
    boolean var17 = var12.isEmpty();
    int var18 = var12.size();
    var1.enqueue((java.lang.Object)var12);
    exercise01.RingBuffer.RingBufferIterator var20 = var12.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var21 = var20.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test300");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test301");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var22 = var9.iterator();
    boolean var23 = var9.isEmpty();
    int var24 = var9.size();
    java.lang.Object var25 = var9.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test302");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    java.util.Spliterator var7 = var1.spliterator();
    int var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test303");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    java.util.Spliterator var8 = var7.spliterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var7.new RingBufferIterator();
    java.util.Spliterator var10 = var7.spliterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var7.new RingBufferIterator();
    var5.enqueue((java.lang.Object)var7);
    java.lang.Object var13 = var5.dequeue();
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(0);
    java.util.Spliterator var16 = var15.spliterator();
    exercise01.RingBuffer.RingBufferIterator var17 = var15.new RingBufferIterator();
    java.util.Iterator var18 = var15.iterator();
    exercise01.RingBuffer.RingBufferIterator var19 = var15.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var20 = var15.new RingBufferIterator();
    var5.enqueue((java.lang.Object)var20);
    java.util.Spliterator var22 = var5.spliterator();
    var1.enqueue((java.lang.Object)var5);
    java.lang.Object var24 = var1.dequeue();
    boolean var25 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test304");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    var1.enqueue((java.lang.Object)var3);
    java.lang.Object var8 = var1.dequeue();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test305");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    java.util.Spliterator var9 = var1.spliterator();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test306");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    int var8 = var7.size();
    int var9 = var7.size();
    int var10 = var7.size();
    java.util.Iterator var11 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    java.util.Spliterator var13 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var1.new RingBufferIterator();
    int var16 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var17 = var1.new RingBufferIterator();
    java.lang.Object var18 = var17.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test307");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test308");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    boolean var10 = var1.isEmpty();
    java.util.Spliterator var11 = var1.spliterator();
    boolean var12 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test309");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    int var8 = var1.size();
    java.util.Spliterator var9 = var1.spliterator();
    boolean var10 = var1.isEmpty();
    java.util.Iterator var11 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test310");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    java.util.Spliterator var7 = var6.spliterator();
    int var8 = var6.size();
    var1.enqueue((java.lang.Object)var8);
    boolean var10 = var1.isEmpty();
    java.lang.Object var11 = var1.dequeue();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(0);
    java.util.Spliterator var14 = var13.spliterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var13.new RingBufferIterator();
    java.util.Spliterator var16 = var13.spliterator();
    int var17 = var13.size();
    int var18 = var13.size();
    boolean var19 = var13.isEmpty();
    int var20 = var13.size();
    java.util.Spliterator var21 = var13.spliterator();
    java.util.Iterator var22 = var13.iterator();
    exercise01.RingBuffer.RingBufferIterator var23 = var13.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var23);
    exercise01.RingBuffer.RingBufferIterator var25 = var1.new RingBufferIterator();
    java.util.Spliterator var26 = var1.spliterator();
    java.util.Iterator var27 = var1.iterator();
    java.lang.Object var28 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0+ "'", var11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test311");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    int var6 = var1.size();
    int var7 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test312");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    java.util.Spliterator var8 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    java.util.Spliterator var13 = var1.spliterator();
    java.util.Spliterator var14 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test313");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    int var7 = var3.size();
    exercise01.RingBuffer.RingBufferIterator var8 = var3.new RingBufferIterator();
    java.util.Iterator var9 = var3.iterator();
    var1.enqueue((java.lang.Object)var9);
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(10);
    int var13 = var12.size();
    boolean var14 = var12.isEmpty();
    java.util.Iterator var15 = var12.iterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var12.new RingBufferIterator();
    java.util.Spliterator var17 = var12.spliterator();
    var1.enqueue((java.lang.Object)var17);
    java.util.Iterator var19 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var20 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test314");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Iterator var7 = var1.iterator();
    java.util.Spliterator var8 = var1.spliterator();
    int var9 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test315");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test316");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(100);
    java.util.Iterator var9 = var8.iterator();
    java.util.Spliterator var10 = var8.spliterator();
    java.util.Spliterator var11 = var8.spliterator();
    exercise01.RingBuffer var13 = new exercise01.RingBuffer(0);
    int var14 = var13.size();
    java.util.Iterator var15 = var13.iterator();
    var8.enqueue((java.lang.Object)var13);
    exercise01.RingBuffer.RingBufferIterator var17 = var13.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var13.new RingBufferIterator();
    int var19 = var13.size();
    int var20 = var13.size();
    var1.enqueue((java.lang.Object)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var22 = var13.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test317");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    java.util.Spliterator var8 = var7.spliterator();
    java.util.Spliterator var9 = var7.spliterator();
    java.util.Spliterator var10 = var7.spliterator();
    java.util.Spliterator var11 = var7.spliterator();
    int var12 = var7.size();
    var1.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var1.dequeue();
    boolean var15 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test318");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test319");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    exercise01.RingBuffer.RingBufferIterator var10 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var6.new RingBufferIterator();
    int var12 = var6.size();
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var15 = var6.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test320");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test321");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(1);
    boolean var8 = var7.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var9 = var7.new RingBufferIterator();
    java.util.Spliterator var10 = var7.spliterator();
    var1.enqueue((java.lang.Object)var7);
    java.lang.Object var12 = var1.dequeue();
    int var13 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test322");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    boolean var9 = var6.isEmpty();
    boolean var10 = var6.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var11 = var6.new RingBufferIterator();
    int var12 = var6.size();
    var1.enqueue((java.lang.Object)var12);
    boolean var14 = var1.isEmpty();
    java.lang.Object var15 = var1.dequeue();
    java.util.Spliterator var16 = var1.spliterator();
    boolean var17 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 0+ "'", var15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test323");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    java.lang.Object var8 = var1.dequeue();
    var1.enqueue((java.lang.Object)"hi!");
    java.lang.Object var11 = var1.dequeue();
    int var12 = var1.size();
    boolean var13 = var1.isEmpty();
    boolean var14 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 10+ "'", var8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test324");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test325");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test326");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    int var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test327");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var9.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test328");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Spliterator var7 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test329");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test330");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    var1.enqueue((java.lang.Object)(short)1);
    int var8 = var1.size();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(100);
    java.util.Iterator var11 = var10.iterator();
    java.util.Spliterator var12 = var10.spliterator();
    java.util.Spliterator var13 = var10.spliterator();
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(0);
    int var16 = var15.size();
    java.util.Iterator var17 = var15.iterator();
    var10.enqueue((java.lang.Object)var15);
    boolean var19 = var10.isEmpty();
    int var20 = var10.size();
    boolean var21 = var10.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var22 = var10.new RingBufferIterator();
    java.lang.Object var23 = var22.next();
    var1.enqueue(var23);
    exercise01.RingBuffer.RingBufferIterator var25 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test331");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(0);
    int var8 = var7.size();
    int var9 = var7.size();
    int var10 = var7.size();
    java.util.Iterator var11 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    java.util.Spliterator var13 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var1.new RingBufferIterator();
    int var16 = var1.size();
    java.util.Spliterator var17 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test332");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(0);
    java.util.Iterator var11 = var10.iterator();
    int var12 = var10.size();
    int var13 = var10.size();
    java.util.Spliterator var14 = var10.spliterator();
    java.util.Spliterator var15 = var10.spliterator();
    int var16 = var10.size();
    java.util.Spliterator var17 = var10.spliterator();
    var1.enqueue((java.lang.Object)var10);
    int var19 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test333");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test334");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var22 = var9.iterator();
    boolean var23 = var9.isEmpty();
    java.lang.Object var24 = var9.dequeue();
    exercise01.RingBuffer.RingBufferIterator var25 = var9.new RingBufferIterator();
    boolean var26 = var9.isEmpty();
    java.lang.Object var27 = var9.dequeue();
    exercise01.RingBuffer var29 = new exercise01.RingBuffer(1);
    exercise01.RingBuffer.RingBufferIterator var30 = var29.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var31 = var29.new RingBufferIterator();
    boolean var32 = var31.hasNext();
    var9.enqueue((java.lang.Object)var32);
    java.util.Iterator var34 = var9.iterator();
    int var35 = var9.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test335");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(0);
    int var9 = var8.size();
    java.util.Iterator var10 = var8.iterator();
    boolean var11 = var8.isEmpty();
    boolean var12 = var8.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var13 = var8.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var8);
    boolean var15 = var1.isEmpty();
    java.util.Iterator var16 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test336");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    int var13 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test337");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Spliterator var7 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    java.util.Iterator var9 = var1.iterator();
    java.util.Spliterator var10 = var1.spliterator();
    java.util.Spliterator var11 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test338");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    java.util.Spliterator var8 = var1.spliterator();
    int var9 = var1.size();
    int var10 = var1.size();
    java.util.Spliterator var11 = var1.spliterator();
    boolean var12 = var1.isEmpty();
    java.util.Iterator var13 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test339");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var1.new RingBufferIterator();
    java.util.Spliterator var12 = var1.spliterator();
    exercise01.RingBuffer var14 = new exercise01.RingBuffer(0);
    java.util.Iterator var15 = var14.iterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var14.new RingBufferIterator();
    int var17 = var14.size();
    int var18 = var14.size();
    exercise01.RingBuffer.RingBufferIterator var19 = var14.new RingBufferIterator();
    int var20 = var14.size();
    var1.enqueue((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test340");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    int var3 = var1.size();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test341");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test342");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    java.lang.Object var8 = var1.dequeue();
    var1.enqueue((java.lang.Object)"hi!");
    java.lang.Object var11 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var12.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 10+ "'", var8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test343");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Spliterator var6 = var1.spliterator();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(10);
    int var11 = var10.size();
    boolean var12 = var10.isEmpty();
    java.util.Iterator var13 = var10.iterator();
    java.util.Spliterator var14 = var10.spliterator();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(0);
    int var17 = var16.size();
    int var18 = var16.size();
    int var19 = var16.size();
    java.util.Iterator var20 = var16.iterator();
    var10.enqueue((java.lang.Object)var16);
    boolean var22 = var10.isEmpty();
    java.util.Spliterator var23 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var24 = var10.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var10);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test344");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Spliterator var5 = var1.spliterator();
    var1.enqueue((java.lang.Object)(short)1);
    int var8 = var1.size();
    java.lang.Object var9 = var1.dequeue();
    boolean var10 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)1+ "'", var9.equals((short)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test345");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(2);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(10);
    int var6 = var5.size();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var5.new RingBufferIterator();
    java.util.Spliterator var10 = var5.spliterator();
    int var11 = var5.size();
    java.util.Iterator var12 = var5.iterator();
    var1.enqueue((java.lang.Object)var12);
    exercise01.RingBuffer.RingBufferIterator var14 = var1.new RingBufferIterator();
    java.lang.Object var15 = var14.next();
    boolean var16 = var14.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test346");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(0);
    java.util.Spliterator var4 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    java.util.Spliterator var6 = var3.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var3.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var3);
    java.lang.Object var9 = var1.dequeue();
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Iterator var14 = var11.iterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var11.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var11.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var16);
    java.util.Iterator var18 = var1.iterator();
    java.util.Iterator var19 = var1.iterator();
    boolean var20 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test347");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    java.util.Spliterator var6 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var1.isEmpty();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(0);
    java.util.Spliterator var11 = var10.spliterator();
    java.util.Spliterator var12 = var10.spliterator();
    java.util.Spliterator var13 = var10.spliterator();
    java.util.Spliterator var14 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var10.new RingBufferIterator();
    boolean var16 = var15.hasNext();
    boolean var17 = var15.hasNext();
    var1.enqueue((java.lang.Object)var15);
    java.lang.Object var19 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var20 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var21 = var1.new RingBufferIterator();
    exercise01.RingBuffer var23 = new exercise01.RingBuffer(10);
    int var24 = var23.size();
    java.util.Spliterator var25 = var23.spliterator();
    exercise01.RingBuffer.RingBufferIterator var26 = var23.new RingBufferIterator();
    int var27 = var23.size();
    var23.enqueue((java.lang.Object)10);
    java.lang.Object var30 = var23.dequeue();
    var23.enqueue((java.lang.Object)"hi!");
    java.lang.Object var33 = var23.dequeue();
    exercise01.RingBuffer.RingBufferIterator var34 = var23.new RingBufferIterator();
    exercise01.RingBuffer var36 = new exercise01.RingBuffer(10);
    int var37 = var36.size();
    boolean var38 = var36.isEmpty();
    java.util.Iterator var39 = var36.iterator();
    exercise01.RingBuffer.RingBufferIterator var40 = var36.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var41 = var36.new RingBufferIterator();
    int var42 = var36.size();
    exercise01.RingBuffer var44 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var46 = new exercise01.RingBuffer(0);
    java.util.Spliterator var47 = var46.spliterator();
    exercise01.RingBuffer.RingBufferIterator var48 = var46.new RingBufferIterator();
    java.util.Spliterator var49 = var46.spliterator();
    var44.enqueue((java.lang.Object)var46);
    exercise01.RingBuffer var52 = new exercise01.RingBuffer(100);
    java.util.Spliterator var53 = var52.spliterator();
    var44.enqueue((java.lang.Object)var53);
    java.util.Iterator var55 = var44.iterator();
    var36.enqueue((java.lang.Object)var44);
    int var57 = var44.size();
    int var58 = var44.size();
    int var59 = var44.size();
    java.lang.Object var60 = var44.dequeue();
    var23.enqueue(var60);
    var1.enqueue((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + 10+ "'", var30.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test348");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(0);
    int var5 = var4.size();
    var1.enqueue((java.lang.Object)var5);
    java.lang.Object var7 = var1.dequeue();
    java.util.Spliterator var8 = var1.spliterator();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    java.util.Spliterator var11 = var1.spliterator();
    boolean var12 = var1.isEmpty();
    java.util.Spliterator var13 = var1.spliterator();
    java.util.Iterator var14 = var1.iterator();
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(10);
    int var17 = var16.size();
    boolean var18 = var16.isEmpty();
    java.util.Iterator var19 = var16.iterator();
    java.util.Spliterator var20 = var16.spliterator();
    boolean var21 = var16.isEmpty();
    java.util.Iterator var22 = var16.iterator();
    exercise01.RingBuffer var24 = new exercise01.RingBuffer(0);
    java.util.Iterator var25 = var24.iterator();
    exercise01.RingBuffer.RingBufferIterator var26 = var24.new RingBufferIterator();
    int var27 = var24.size();
    java.util.Iterator var28 = var24.iterator();
    exercise01.RingBuffer.RingBufferIterator var29 = var24.new RingBufferIterator();
    var16.enqueue((java.lang.Object)var24);
    java.util.Iterator var31 = var24.iterator();
    var1.enqueue((java.lang.Object)var31);
    exercise01.RingBuffer.RingBufferIterator var33 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0+ "'", var7.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test349");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(0);
    java.util.Spliterator var11 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var10.new RingBufferIterator();
    java.util.Spliterator var13 = var10.spliterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var10.new RingBufferIterator();
    boolean var15 = var14.hasNext();
    var1.enqueue((java.lang.Object)var14);
    exercise01.RingBuffer var18 = new exercise01.RingBuffer(0);
    java.util.Spliterator var19 = var18.spliterator();
    java.util.Spliterator var20 = var18.spliterator();
    java.util.Spliterator var21 = var18.spliterator();
    int var22 = var18.size();
    boolean var23 = var18.isEmpty();
    int var24 = var18.size();
    exercise01.RingBuffer.RingBufferIterator var25 = var18.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var25);
    exercise01.RingBuffer var28 = new exercise01.RingBuffer(10);
    int var29 = var28.size();
    boolean var30 = var28.isEmpty();
    java.util.Iterator var31 = var28.iterator();
    java.util.Spliterator var32 = var28.spliterator();
    exercise01.RingBuffer var34 = new exercise01.RingBuffer(0);
    int var35 = var34.size();
    int var36 = var34.size();
    int var37 = var34.size();
    java.util.Iterator var38 = var34.iterator();
    var28.enqueue((java.lang.Object)var34);
    var1.enqueue((java.lang.Object)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test350");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    int var4 = var1.size();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test351");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test352");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    int var4 = var1.size();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    java.util.Spliterator var10 = var1.spliterator();
    boolean var11 = var1.isEmpty();
    boolean var12 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test353");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Spliterator var4 = var1.spliterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(0);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    boolean var9 = var6.isEmpty();
    boolean var10 = var6.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var11 = var6.new RingBufferIterator();
    int var12 = var6.size();
    var1.enqueue((java.lang.Object)var12);
    boolean var14 = var1.isEmpty();
    java.lang.Object var15 = var1.dequeue();
    java.util.Spliterator var16 = var1.spliterator();
    java.util.Iterator var17 = var1.iterator();
    java.util.Iterator var18 = var1.iterator();
    boolean var19 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 0+ "'", var15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test354");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(byte)1);
    boolean var6 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test355");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test356");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    int var2 = var1.size();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Spliterator var5 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test357");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    java.util.Iterator var9 = var1.iterator();
    java.lang.Object var10 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var11 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0f)+ "'", var10.equals((-1.0f)));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test358");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    java.util.Spliterator var3 = var1.spliterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)10);
    java.lang.Object var8 = var1.dequeue();
    var1.enqueue((java.lang.Object)"hi!");
    java.lang.Object var11 = var1.dequeue();
    int var12 = var1.size();
    boolean var13 = var1.isEmpty();
    int var14 = var1.size();
    java.util.Spliterator var15 = var1.spliterator();
    java.util.Spliterator var16 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 10+ "'", var8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test359");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(-1.0f));
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    java.util.Iterator var10 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var1.new RingBufferIterator();
    java.util.Iterator var12 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test360");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer var11 = new exercise01.RingBuffer(0);
    java.util.Spliterator var12 = var11.spliterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var11.new RingBufferIterator();
    java.util.Spliterator var14 = var11.spliterator();
    var9.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var17 = new exercise01.RingBuffer(100);
    java.util.Spliterator var18 = var17.spliterator();
    var9.enqueue((java.lang.Object)var18);
    java.util.Iterator var20 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    exercise01.RingBuffer.RingBufferIterator var22 = var1.new RingBufferIterator();
    exercise01.RingBuffer var24 = new exercise01.RingBuffer(10);
    boolean var25 = var24.isEmpty();
    exercise01.RingBuffer var27 = new exercise01.RingBuffer(0);
    int var28 = var27.size();
    java.util.Iterator var29 = var27.iterator();
    exercise01.RingBuffer.RingBufferIterator var30 = var27.new RingBufferIterator();
    boolean var31 = var30.hasNext();
    boolean var32 = var30.hasNext();
    var24.enqueue((java.lang.Object)var30);
    boolean var34 = var24.isEmpty();
    var1.enqueue((java.lang.Object)var24);
    exercise01.RingBuffer.RingBufferIterator var36 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

}