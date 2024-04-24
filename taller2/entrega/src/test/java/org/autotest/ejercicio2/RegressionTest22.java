package org.autotest.ejercicio2;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

    public static boolean debug = false;

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1101");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        int int4 = stackAr1.size();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        java.lang.String str8 = stackAr6.toString();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        boolean boolean12 = stackAr9.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        boolean boolean15 = stackAr9.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (-1.0f));
        boolean boolean21 = stackAr17.equals((java.lang.Object) "");
        boolean boolean22 = stackAr9.equals((java.lang.Object) "");
        boolean boolean23 = stackAr9.isFull();
        boolean boolean24 = stackAr6.equals((java.lang.Object) stackAr9);
        int int25 = stackAr9.size();
        stackAr1.push((java.lang.Object) int25);
        java.lang.Object obj27 = stackAr1.top();
        boolean boolean28 = stackAr1.isFull();
        int int29 = stackAr1.size();
        int int30 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1102");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        stackAr7.push((java.lang.Object) (-1L));
        java.lang.Object obj10 = stackAr7.pop();
        stackAr1.push((java.lang.Object) stackAr7);
        int int12 = stackAr7.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackAr7.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1L) + "'", obj10, (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1103");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        boolean boolean9 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr0.toString();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr(100);
        boolean boolean13 = stackAr12.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackAr12.getClass();
        stackAr0.push((java.lang.Object) stackAr12);
        java.lang.Object obj16 = stackAr0.top();
        java.lang.String str17 = stackAr0.toString();
        boolean boolean18 = stackAr0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[[]]" + "'", str17, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1104");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        boolean boolean9 = stackAr0.equals((java.lang.Object) (byte) 0);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) 'a');
        boolean boolean13 = stackAr11.equals((java.lang.Object) (-1.0f));
        boolean boolean15 = stackAr11.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
        boolean boolean17 = stackAr16.isFull();
        stackAr11.push((java.lang.Object) stackAr16);
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        java.lang.String str23 = stackAr22.toString();
        boolean boolean24 = stackAr20.equals((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr();
        boolean boolean26 = stackAr25.isFull();
        boolean boolean28 = stackAr25.equals((java.lang.Object) (byte) -1);
        java.lang.String str29 = stackAr25.toString();
        boolean boolean31 = stackAr25.equals((java.lang.Object) 10L);
        java.lang.String str32 = stackAr25.toString();
        stackAr22.push((java.lang.Object) stackAr25);
        stackAr11.push((java.lang.Object) stackAr25);
        boolean boolean35 = stackAr11.isEmpty();
        boolean boolean36 = stackAr0.equals((java.lang.Object) stackAr11);
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) (short) 100);
        stackAr11.push((java.lang.Object) (short) 100);
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) '4');
        int int42 = stackAr41.size();
        java.lang.String str43 = stackAr41.toString();
        boolean boolean44 = stackAr11.equals((java.lang.Object) stackAr41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = stackAr41.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1105");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0);
        java.lang.String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1106");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (-1.0f));
        boolean boolean9 = stackAr5.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
        boolean boolean11 = stackAr10.isFull();
        stackAr5.push((java.lang.Object) stackAr10);
        java.lang.String str13 = stackAr5.toString();
        boolean boolean14 = stackAr1.equals((java.lang.Object) stackAr5);
        java.lang.String str15 = stackAr5.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[]]" + "'", str13, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[[]]" + "'", str15, "[[]]");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1107");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        int int3 = stackAr0.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isEmpty();
        boolean boolean7 = stackAr5.isEmpty();
        boolean boolean8 = stackAr0.equals((java.lang.Object) stackAr5);
        int int9 = stackAr0.size();
        java.lang.String str10 = stackAr0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0.0]" + "'", str10, "[0.0]");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1108");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        stackAr1.push((java.lang.Object) 0);
        java.lang.String str5 = stackAr1.toString();
        java.lang.Object obj6 = stackAr1.pop();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        java.lang.String str9 = stackAr8.toString();
        java.lang.String str10 = stackAr8.toString();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
        boolean boolean12 = stackAr11.isFull();
        boolean boolean14 = stackAr11.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        boolean boolean17 = stackAr11.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) 'a');
        boolean boolean21 = stackAr19.equals((java.lang.Object) (-1.0f));
        boolean boolean23 = stackAr19.equals((java.lang.Object) "");
        boolean boolean24 = stackAr11.equals((java.lang.Object) "");
        boolean boolean25 = stackAr11.isFull();
        boolean boolean26 = stackAr8.equals((java.lang.Object) stackAr11);
        java.lang.Object obj27 = null;
        stackAr11.push(obj27);
        java.lang.Object obj29 = stackAr11.top();
        boolean boolean30 = stackAr11.isEmpty();
        boolean boolean31 = stackAr11.isFull();
        stackAr1.push((java.lang.Object) stackAr11);
        java.lang.Object obj33 = stackAr11.pop();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1109");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean2 = stackAr0.isFull();
        boolean boolean3 = stackAr0.isFull();
        java.lang.Class<?> wildcardClass4 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1110");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        boolean boolean18 = stackAr4.isFull();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr4);
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        java.lang.Object obj22 = stackAr4.top();
        boolean boolean23 = stackAr4.isEmpty();
        boolean boolean24 = stackAr4.isEmpty();
        int int25 = stackAr4.size();
        boolean boolean26 = stackAr4.isEmpty();
        java.lang.Object obj27 = stackAr4.top();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1111");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        java.lang.String str9 = stackAr8.toString();
        java.lang.String str10 = stackAr8.toString();
        stackAr0.push((java.lang.Object) stackAr8);
        boolean boolean12 = stackAr8.isEmpty();
        java.lang.String str13 = stackAr8.toString();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        stackAr14.push((java.lang.Object) 0.0f);
        java.lang.String str17 = stackAr14.toString();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) 'a');
        boolean boolean21 = stackAr19.equals((java.lang.Object) (-1.0f));
        boolean boolean23 = stackAr19.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
        boolean boolean25 = stackAr24.isFull();
        stackAr19.push((java.lang.Object) stackAr24);
        boolean boolean27 = stackAr19.isFull();
        java.lang.Object obj28 = stackAr19.pop();
        stackAr14.push((java.lang.Object) stackAr19);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr();
        boolean boolean31 = stackAr30.isFull();
        boolean boolean33 = stackAr30.equals((java.lang.Object) (byte) -1);
        java.lang.String str34 = stackAr30.toString();
        boolean boolean36 = stackAr30.equals((java.lang.Object) 10L);
        java.lang.String str37 = stackAr30.toString();
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) 'a');
        boolean boolean41 = stackAr39.equals((java.lang.Object) (-1.0f));
        boolean boolean43 = stackAr39.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr();
        boolean boolean45 = stackAr44.isFull();
        stackAr39.push((java.lang.Object) stackAr44);
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr((int) '4');
        java.lang.String str51 = stackAr50.toString();
        boolean boolean52 = stackAr48.equals((java.lang.Object) stackAr50);
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr();
        boolean boolean54 = stackAr53.isFull();
        boolean boolean56 = stackAr53.equals((java.lang.Object) (byte) -1);
        java.lang.String str57 = stackAr53.toString();
        boolean boolean59 = stackAr53.equals((java.lang.Object) 10L);
        java.lang.String str60 = stackAr53.toString();
        stackAr50.push((java.lang.Object) stackAr53);
        stackAr39.push((java.lang.Object) stackAr53);
        boolean boolean63 = stackAr30.equals((java.lang.Object) stackAr53);
        stackAr19.push((java.lang.Object) boolean63);
        stackAr8.push((java.lang.Object) boolean63);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[0.0]" + "'", str17, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[]" + "'", str57, "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[]" + "'", str60, "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1112");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
        boolean boolean8 = stackAr7.isFull();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr7.isEmpty();
        stackAr0.push((java.lang.Object) stackAr7);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '#');
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        boolean boolean15 = stackAr14.isFull();
        boolean boolean17 = stackAr14.equals((java.lang.Object) false);
        boolean boolean18 = stackAr14.isEmpty();
        boolean boolean19 = stackAr13.equals((java.lang.Object) boolean18);
        boolean boolean20 = stackAr13.isFull();
        stackAr0.push((java.lang.Object) stackAr13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = stackAr13.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1113");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        stackAr1.push((java.lang.Object) 0);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass10 = stackAr6.getClass();
        boolean boolean11 = stackAr1.equals((java.lang.Object) stackAr6);
        java.lang.Object obj12 = stackAr1.top();
        int int13 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1114");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) 10);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        java.lang.String str6 = stackAr5.toString();
        java.lang.String str7 = stackAr5.toString();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        boolean boolean14 = stackAr8.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        boolean boolean21 = stackAr8.equals((java.lang.Object) "");
        boolean boolean22 = stackAr8.isFull();
        boolean boolean23 = stackAr5.equals((java.lang.Object) stackAr8);
        java.lang.Object obj24 = null;
        stackAr8.push(obj24);
        java.lang.Object obj26 = stackAr8.top();
        java.lang.String str27 = stackAr8.toString();
        java.lang.Object obj28 = stackAr8.pop();
        boolean boolean29 = stackAr0.equals(obj28);
        java.lang.String str30 = stackAr0.toString();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        stackAr31.push((java.lang.Object) 0.0f);
        java.lang.String str34 = stackAr31.toString();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        boolean boolean38 = stackAr36.equals((java.lang.Object) (-1.0f));
        boolean boolean40 = stackAr36.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr();
        boolean boolean42 = stackAr41.isFull();
        stackAr36.push((java.lang.Object) stackAr41);
        boolean boolean44 = stackAr36.isFull();
        java.lang.Object obj45 = stackAr36.pop();
        stackAr31.push((java.lang.Object) stackAr36);
        stackAr0.push((java.lang.Object) stackAr36);
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr();
        boolean boolean49 = stackAr48.isFull();
        boolean boolean51 = stackAr48.equals((java.lang.Object) (byte) -1);
        java.lang.String str52 = stackAr48.toString();
        boolean boolean53 = stackAr48.isEmpty();
        org.autotest.StackAr stackAr55 = new org.autotest.StackAr((int) 'a');
        boolean boolean57 = stackAr55.equals((java.lang.Object) (-1.0f));
        boolean boolean58 = stackAr55.isEmpty();
        boolean boolean59 = stackAr48.equals((java.lang.Object) stackAr55);
        boolean boolean60 = stackAr55.isFull();
        stackAr0.push((java.lang.Object) stackAr55);
        java.lang.Object obj62 = stackAr0.top();
        java.lang.Object obj63 = stackAr0.pop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[null]" + "'", str27, "[null]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[0.0]" + "'", str34, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "[]");
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertEquals(obj63.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj63), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj63), "[]");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1115");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        boolean boolean22 = stackAr21.isFull();
        stackAr16.push((java.lang.Object) stackAr21);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '4');
        java.lang.String str28 = stackAr27.toString();
        boolean boolean29 = stackAr25.equals((java.lang.Object) stackAr27);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr();
        boolean boolean31 = stackAr30.isFull();
        boolean boolean33 = stackAr30.equals((java.lang.Object) (byte) -1);
        java.lang.String str34 = stackAr30.toString();
        boolean boolean36 = stackAr30.equals((java.lang.Object) 10L);
        java.lang.String str37 = stackAr30.toString();
        stackAr27.push((java.lang.Object) stackAr30);
        stackAr16.push((java.lang.Object) stackAr30);
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean42 = stackAr41.isEmpty();
        boolean boolean43 = stackAr41.isFull();
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr((int) '4');
        java.lang.String str48 = stackAr47.toString();
        boolean boolean49 = stackAr45.equals((java.lang.Object) stackAr47);
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) '4');
        stackAr51.push((java.lang.Object) (-1L));
        java.lang.Object obj54 = stackAr51.pop();
        stackAr45.push((java.lang.Object) stackAr51);
        boolean boolean56 = stackAr41.equals((java.lang.Object) stackAr45);
        stackAr30.push((java.lang.Object) stackAr45);
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean60 = stackAr59.isFull();
        int int61 = stackAr59.size();
        int int62 = stackAr59.size();
        stackAr45.push((java.lang.Object) stackAr59);
        org.autotest.StackAr stackAr64 = new org.autotest.StackAr();
        boolean boolean65 = stackAr64.isEmpty();
        boolean boolean66 = stackAr45.equals((java.lang.Object) stackAr64);
        boolean boolean67 = stackAr45.isEmpty();
        stackAr3.push((java.lang.Object) boolean67);
        int int69 = stackAr3.size();
        int int70 = stackAr3.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (-1L) + "'", obj54, (-1L));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1116");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) 10);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        java.lang.String str6 = stackAr5.toString();
        java.lang.String str7 = stackAr5.toString();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        boolean boolean14 = stackAr8.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        boolean boolean21 = stackAr8.equals((java.lang.Object) "");
        boolean boolean22 = stackAr8.isFull();
        boolean boolean23 = stackAr5.equals((java.lang.Object) stackAr8);
        java.lang.Object obj24 = null;
        stackAr8.push(obj24);
        java.lang.Object obj26 = stackAr8.top();
        java.lang.String str27 = stackAr8.toString();
        java.lang.Object obj28 = stackAr8.pop();
        boolean boolean29 = stackAr0.equals(obj28);
        java.lang.String str30 = stackAr0.toString();
        int int31 = stackAr0.size();
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr();
        boolean boolean33 = stackAr32.isFull();
        boolean boolean35 = stackAr32.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) '4');
        boolean boolean38 = stackAr32.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr40 = new org.autotest.StackAr((int) '4');
        int int41 = stackAr40.size();
        stackAr40.push((java.lang.Object) 0);
        stackAr32.push((java.lang.Object) stackAr40);
        boolean boolean45 = stackAr32.isFull();
        boolean boolean46 = stackAr32.isEmpty();
        boolean boolean47 = stackAr32.isEmpty();
        stackAr0.push((java.lang.Object) boolean47);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[null]" + "'", str27, "[null]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1117");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        int int4 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        boolean boolean7 = stackAr5.isFull();
        boolean boolean8 = stackAr5.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1118");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.push((java.lang.Object) true);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) 'a');
        boolean boolean8 = stackAr6.equals((java.lang.Object) (-1.0f));
        boolean boolean10 = stackAr6.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
        boolean boolean12 = stackAr11.isFull();
        stackAr6.push((java.lang.Object) stackAr11);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        java.lang.String str18 = stackAr17.toString();
        boolean boolean19 = stackAr15.equals((java.lang.Object) stackAr17);
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        boolean boolean21 = stackAr20.isFull();
        boolean boolean23 = stackAr20.equals((java.lang.Object) (byte) -1);
        java.lang.String str24 = stackAr20.toString();
        boolean boolean26 = stackAr20.equals((java.lang.Object) 10L);
        java.lang.String str27 = stackAr20.toString();
        stackAr17.push((java.lang.Object) stackAr20);
        stackAr6.push((java.lang.Object) stackAr20);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean32 = stackAr31.isEmpty();
        boolean boolean33 = stackAr31.isFull();
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) '4');
        java.lang.String str38 = stackAr37.toString();
        boolean boolean39 = stackAr35.equals((java.lang.Object) stackAr37);
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) '4');
        stackAr41.push((java.lang.Object) (-1L));
        java.lang.Object obj44 = stackAr41.pop();
        stackAr35.push((java.lang.Object) stackAr41);
        boolean boolean46 = stackAr31.equals((java.lang.Object) stackAr35);
        stackAr20.push((java.lang.Object) stackAr35);
        boolean boolean48 = stackAr20.isEmpty();
        java.lang.Object obj49 = stackAr20.pop();
        stackAr0.push((java.lang.Object) stackAr20);
        boolean boolean51 = stackAr0.isFull();
        boolean boolean52 = stackAr0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (-1L) + "'", obj44, (-1L));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "[[]]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1119");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(100);
        boolean boolean2 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr4.equals((java.lang.Object) stackAr6);
        int int9 = stackAr4.size();
        boolean boolean10 = stackAr4.isFull();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isEmpty();
        boolean boolean14 = stackAr12.isEmpty();
        stackAr4.push((java.lang.Object) stackAr12);
        boolean boolean16 = stackAr1.equals((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        int int19 = stackAr18.size();
        stackAr18.push((java.lang.Object) 0);
        boolean boolean22 = stackAr18.isFull();
        boolean boolean23 = stackAr18.isFull();
        boolean boolean24 = stackAr18.isFull();
        boolean boolean25 = stackAr1.equals((java.lang.Object) stackAr18);
        boolean boolean26 = stackAr18.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1120");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        java.lang.String str4 = stackAr1.toString();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1121");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        boolean boolean14 = stackAr0.isFull();
        java.lang.String str15 = stackAr0.toString();
        int int16 = stackAr0.size();
        boolean boolean17 = stackAr0.isFull();
        boolean boolean18 = stackAr0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1122");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) false);
        stackAr0.push((java.lang.Object) (byte) 100);
        boolean boolean7 = stackAr0.equals((java.lang.Object) 100L);
        java.lang.Object obj8 = stackAr0.top();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr10.equals((java.lang.Object) stackAr12);
        stackAr12.push((java.lang.Object) (-1));
        boolean boolean17 = stackAr0.equals((java.lang.Object) stackAr12);
        java.lang.String str18 = stackAr0.toString();
        boolean boolean19 = stackAr0.isEmpty();
        java.lang.String str20 = stackAr0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 100 + "'", obj8, (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[100]" + "'", str18, "[100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[100]" + "'", str20, "[100]");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1123");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        java.lang.String str8 = stackAr7.toString();
        boolean boolean9 = stackAr5.equals((java.lang.Object) stackAr7);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        stackAr11.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackAr11.pop();
        stackAr5.push((java.lang.Object) stackAr11);
        boolean boolean16 = stackAr1.equals((java.lang.Object) stackAr5);
        java.lang.Object obj17 = stackAr5.pop();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1124");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        int int3 = stackAr0.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isEmpty();
        boolean boolean7 = stackAr5.isEmpty();
        boolean boolean8 = stackAr0.equals((java.lang.Object) stackAr5);
        int int9 = stackAr0.size();
        boolean boolean10 = stackAr0.isFull();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        java.lang.String str15 = stackAr14.toString();
        boolean boolean16 = stackAr12.equals((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        stackAr18.push((java.lang.Object) (-1L));
        java.lang.Object obj21 = stackAr18.pop();
        stackAr12.push((java.lang.Object) stackAr18);
        boolean boolean23 = stackAr12.isEmpty();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
        boolean boolean25 = stackAr24.isFull();
        boolean boolean27 = stackAr24.equals((java.lang.Object) (byte) -1);
        java.lang.String str28 = stackAr24.toString();
        boolean boolean30 = stackAr24.equals((java.lang.Object) 10L);
        java.lang.String str31 = stackAr24.toString();
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) 'a');
        boolean boolean35 = stackAr33.equals((java.lang.Object) (-1.0f));
        boolean boolean37 = stackAr33.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr();
        boolean boolean39 = stackAr38.isFull();
        stackAr33.push((java.lang.Object) stackAr38);
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) '4');
        java.lang.String str45 = stackAr44.toString();
        boolean boolean46 = stackAr42.equals((java.lang.Object) stackAr44);
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
        boolean boolean48 = stackAr47.isFull();
        boolean boolean50 = stackAr47.equals((java.lang.Object) (byte) -1);
        java.lang.String str51 = stackAr47.toString();
        boolean boolean53 = stackAr47.equals((java.lang.Object) 10L);
        java.lang.String str54 = stackAr47.toString();
        stackAr44.push((java.lang.Object) stackAr47);
        stackAr33.push((java.lang.Object) stackAr47);
        boolean boolean57 = stackAr24.equals((java.lang.Object) stackAr47);
        boolean boolean58 = stackAr12.equals((java.lang.Object) stackAr24);
        org.autotest.StackAr stackAr60 = new org.autotest.StackAr((int) '4');
        stackAr60.push((java.lang.Object) (-1L));
        java.lang.Object obj63 = stackAr60.pop();
        stackAr60.push((java.lang.Object) (-1));
        stackAr12.push((java.lang.Object) (-1));
        boolean boolean67 = stackAr0.equals((java.lang.Object) (-1));
        boolean boolean68 = stackAr0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1L) + "'", obj21, (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[]" + "'", str54, "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (-1L) + "'", obj63, (-1L));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1125");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) 10);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        java.lang.String str6 = stackAr5.toString();
        java.lang.String str7 = stackAr5.toString();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        boolean boolean14 = stackAr8.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        boolean boolean21 = stackAr8.equals((java.lang.Object) "");
        boolean boolean22 = stackAr8.isFull();
        boolean boolean23 = stackAr5.equals((java.lang.Object) stackAr8);
        java.lang.Object obj24 = null;
        stackAr8.push(obj24);
        java.lang.Object obj26 = stackAr8.top();
        java.lang.String str27 = stackAr8.toString();
        java.lang.Object obj28 = stackAr8.pop();
        boolean boolean29 = stackAr0.equals(obj28);
        java.lang.String str30 = stackAr0.toString();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        stackAr31.push((java.lang.Object) 0.0f);
        java.lang.String str34 = stackAr31.toString();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        boolean boolean38 = stackAr36.equals((java.lang.Object) (-1.0f));
        boolean boolean40 = stackAr36.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr();
        boolean boolean42 = stackAr41.isFull();
        stackAr36.push((java.lang.Object) stackAr41);
        boolean boolean44 = stackAr36.isFull();
        java.lang.Object obj45 = stackAr36.pop();
        stackAr31.push((java.lang.Object) stackAr36);
        stackAr0.push((java.lang.Object) stackAr36);
        boolean boolean48 = stackAr36.isFull();
        boolean boolean49 = stackAr36.isEmpty();
        java.lang.String str50 = stackAr36.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = stackAr36.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[null]" + "'", str27, "[null]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[0.0]" + "'", str34, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[]" + "'", str50, "[]");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1126");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean7 = stackAr6.isFull();
        java.lang.String str8 = stackAr6.toString();
        int int9 = stackAr6.size();
        boolean boolean10 = stackAr1.equals((java.lang.Object) int9);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
        boolean boolean12 = stackAr11.isFull();
        boolean boolean14 = stackAr11.equals((java.lang.Object) (byte) -1);
        stackAr1.push((java.lang.Object) stackAr11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackAr11.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1127");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.String str4 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1128");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1129");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.String str3 = stackAr0.toString();
        boolean boolean4 = stackAr0.isEmpty();
        int int5 = stackAr0.size();
        java.lang.Object obj6 = stackAr0.pop();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
        boolean boolean8 = stackAr7.isFull();
        boolean boolean10 = stackAr7.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        boolean boolean13 = stackAr7.equals((java.lang.Object) '4');
        int int14 = stackAr7.size();
        int int15 = stackAr7.size();
        boolean boolean16 = stackAr7.isFull();
        stackAr0.push((java.lang.Object) stackAr7);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        boolean boolean19 = stackAr18.isFull();
        boolean boolean21 = stackAr18.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '4');
        boolean boolean24 = stackAr18.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) 'a');
        boolean boolean28 = stackAr26.equals((java.lang.Object) (-1.0f));
        boolean boolean30 = stackAr26.equals((java.lang.Object) "");
        boolean boolean31 = stackAr18.equals((java.lang.Object) "");
        boolean boolean32 = stackAr18.isFull();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) '4');
        java.lang.String str35 = stackAr34.toString();
        java.lang.String str36 = stackAr34.toString();
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr();
        boolean boolean38 = stackAr37.isFull();
        boolean boolean40 = stackAr37.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) '4');
        boolean boolean43 = stackAr37.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr((int) 'a');
        boolean boolean47 = stackAr45.equals((java.lang.Object) (-1.0f));
        boolean boolean49 = stackAr45.equals((java.lang.Object) "");
        boolean boolean50 = stackAr37.equals((java.lang.Object) "");
        boolean boolean51 = stackAr37.isFull();
        boolean boolean52 = stackAr34.equals((java.lang.Object) stackAr37);
        java.lang.Object obj53 = null;
        stackAr37.push(obj53);
        java.lang.Object obj55 = stackAr37.top();
        java.lang.String str56 = stackAr37.toString();
        boolean boolean57 = stackAr18.equals((java.lang.Object) stackAr37);
        int int58 = stackAr18.size();
        boolean boolean59 = stackAr0.equals((java.lang.Object) int58);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0.0]" + "'", str3, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[null]" + "'", str56, "[null]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1130");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) false);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean5 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) 'a');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (-1.0f));
        boolean boolean11 = stackAr7.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        boolean boolean13 = stackAr12.isFull();
        stackAr7.push((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean17 = stackAr16.isFull();
        boolean boolean18 = stackAr16.isEmpty();
        int int19 = stackAr16.size();
        boolean boolean20 = stackAr12.equals((java.lang.Object) int19);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) 'a');
        boolean boolean24 = stackAr22.equals((java.lang.Object) (-1.0f));
        boolean boolean26 = stackAr22.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr();
        boolean boolean28 = stackAr27.isFull();
        stackAr22.push((java.lang.Object) stackAr27);
        java.lang.Class<?> wildcardClass30 = stackAr22.getClass();
        boolean boolean31 = stackAr12.equals((java.lang.Object) stackAr22);
        java.lang.String str32 = stackAr12.toString();
        java.lang.String str33 = stackAr12.toString();
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) 'a');
        boolean boolean36 = stackAr35.isFull();
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr();
        boolean boolean38 = stackAr37.isFull();
        boolean boolean40 = stackAr37.equals((java.lang.Object) (byte) -1);
        stackAr35.push((java.lang.Object) boolean40);
        boolean boolean42 = stackAr35.isEmpty();
        java.lang.Object obj43 = stackAr35.top();
        boolean boolean45 = stackAr35.equals((java.lang.Object) (-1L));
        boolean boolean46 = stackAr35.isEmpty();
        boolean boolean47 = stackAr12.equals((java.lang.Object) stackAr35);
        boolean boolean48 = stackAr0.equals((java.lang.Object) stackAr12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + false + "'", obj43, false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1131");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) 10);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        java.lang.String str6 = stackAr5.toString();
        java.lang.String str7 = stackAr5.toString();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        boolean boolean14 = stackAr8.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        boolean boolean21 = stackAr8.equals((java.lang.Object) "");
        boolean boolean22 = stackAr8.isFull();
        boolean boolean23 = stackAr5.equals((java.lang.Object) stackAr8);
        java.lang.Object obj24 = null;
        stackAr8.push(obj24);
        java.lang.Object obj26 = stackAr8.top();
        java.lang.String str27 = stackAr8.toString();
        java.lang.Object obj28 = stackAr8.pop();
        boolean boolean29 = stackAr0.equals(obj28);
        java.lang.String str30 = stackAr0.toString();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        stackAr31.push((java.lang.Object) 0.0f);
        java.lang.String str34 = stackAr31.toString();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        boolean boolean38 = stackAr36.equals((java.lang.Object) (-1.0f));
        boolean boolean40 = stackAr36.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr();
        boolean boolean42 = stackAr41.isFull();
        stackAr36.push((java.lang.Object) stackAr41);
        boolean boolean44 = stackAr36.isFull();
        java.lang.Object obj45 = stackAr36.pop();
        stackAr31.push((java.lang.Object) stackAr36);
        stackAr0.push((java.lang.Object) stackAr36);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) '4');
        boolean boolean50 = stackAr49.isFull();
        stackAr0.push((java.lang.Object) stackAr49);
        java.lang.Object obj52 = stackAr0.pop();
        java.lang.Class<?> wildcardClass53 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[null]" + "'", str27, "[null]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[0.0]" + "'", str34, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "[]");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1132");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 10);
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
        boolean boolean3 = stackAr2.isFull();
        boolean boolean5 = stackAr2.equals((java.lang.Object) 10);
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        java.lang.String str8 = stackAr7.toString();
        java.lang.String str9 = stackAr7.toString();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
        boolean boolean11 = stackAr10.isFull();
        boolean boolean13 = stackAr10.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '4');
        boolean boolean16 = stackAr10.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) 'a');
        boolean boolean20 = stackAr18.equals((java.lang.Object) (-1.0f));
        boolean boolean22 = stackAr18.equals((java.lang.Object) "");
        boolean boolean23 = stackAr10.equals((java.lang.Object) "");
        boolean boolean24 = stackAr10.isFull();
        boolean boolean25 = stackAr7.equals((java.lang.Object) stackAr10);
        java.lang.Object obj26 = null;
        stackAr10.push(obj26);
        java.lang.Object obj28 = stackAr10.top();
        java.lang.String str29 = stackAr10.toString();
        java.lang.Object obj30 = stackAr10.pop();
        boolean boolean31 = stackAr2.equals(obj30);
        java.lang.String str32 = stackAr2.toString();
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        stackAr33.push((java.lang.Object) 0.0f);
        java.lang.String str36 = stackAr33.toString();
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) 'a');
        boolean boolean40 = stackAr38.equals((java.lang.Object) (-1.0f));
        boolean boolean42 = stackAr38.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr();
        boolean boolean44 = stackAr43.isFull();
        stackAr38.push((java.lang.Object) stackAr43);
        boolean boolean46 = stackAr38.isFull();
        java.lang.Object obj47 = stackAr38.pop();
        stackAr33.push((java.lang.Object) stackAr38);
        stackAr2.push((java.lang.Object) stackAr38);
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) '4');
        boolean boolean52 = stackAr51.isFull();
        stackAr2.push((java.lang.Object) stackAr51);
        java.lang.Object obj54 = stackAr2.pop();
        java.lang.Object obj55 = stackAr2.top();
        java.lang.Object obj56 = stackAr2.pop();
        java.lang.Class<?> wildcardClass57 = stackAr2.getClass();
        stackAr1.push((java.lang.Object) stackAr2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[null]" + "'", str29, "[null]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[0.0]" + "'", str36, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "[]");
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "[]");
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "[]");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1133");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean5 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) 'a');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (-1.0f));
        boolean boolean10 = stackAr7.isEmpty();
        boolean boolean11 = stackAr0.equals((java.lang.Object) stackAr7);
        boolean boolean12 = stackAr7.isFull();
        boolean boolean13 = stackAr7.isFull();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) 'a');
        boolean boolean16 = stackAr15.isFull();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        java.lang.String str19 = stackAr18.toString();
        java.lang.String str20 = stackAr18.toString();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        boolean boolean22 = stackAr21.isFull();
        boolean boolean24 = stackAr21.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) '4');
        boolean boolean27 = stackAr21.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) 'a');
        boolean boolean31 = stackAr29.equals((java.lang.Object) (-1.0f));
        boolean boolean33 = stackAr29.equals((java.lang.Object) "");
        boolean boolean34 = stackAr21.equals((java.lang.Object) "");
        boolean boolean35 = stackAr21.isFull();
        boolean boolean36 = stackAr18.equals((java.lang.Object) stackAr21);
        int int37 = stackAr21.size();
        stackAr15.push((java.lang.Object) int37);
        int int39 = stackAr15.size();
        java.lang.Object obj40 = stackAr15.top();
        boolean boolean41 = stackAr7.equals(obj40);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) '4');
        java.lang.String str44 = stackAr43.toString();
        java.lang.String str45 = stackAr43.toString();
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr();
        boolean boolean47 = stackAr46.isFull();
        boolean boolean49 = stackAr46.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) '4');
        boolean boolean52 = stackAr46.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) 'a');
        boolean boolean56 = stackAr54.equals((java.lang.Object) (-1.0f));
        boolean boolean58 = stackAr54.equals((java.lang.Object) "");
        boolean boolean59 = stackAr46.equals((java.lang.Object) "");
        boolean boolean60 = stackAr46.isFull();
        boolean boolean61 = stackAr43.equals((java.lang.Object) stackAr46);
        java.lang.Object obj62 = null;
        stackAr46.push(obj62);
        java.lang.Object obj64 = stackAr46.top();
        java.lang.String str65 = stackAr46.toString();
        int int66 = stackAr46.size();
        boolean boolean67 = stackAr7.equals((java.lang.Object) stackAr46);
        org.autotest.StackAr stackAr69 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean70 = stackAr69.isFull();
        java.lang.String str71 = stackAr69.toString();
        java.lang.String str72 = stackAr69.toString();
        java.lang.Class<?> wildcardClass73 = stackAr69.getClass();
        stackAr7.push((java.lang.Object) stackAr69);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0 + "'", obj40, 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[null]" + "'", str65, "[null]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "[]" + "'", str71, "[]");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[]" + "'", str72, "[]");
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1134");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        boolean boolean11 = stackAr10.isFull();
        boolean boolean12 = stackAr10.isEmpty();
        int int13 = stackAr10.size();
        boolean boolean14 = stackAr6.equals((java.lang.Object) int13);
        java.lang.String str15 = stackAr6.toString();
        java.lang.String str16 = stackAr6.toString();
        boolean boolean17 = stackAr6.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1135");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr10.equals((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        boolean boolean18 = stackAr15.equals((java.lang.Object) (byte) -1);
        java.lang.String str19 = stackAr15.toString();
        boolean boolean21 = stackAr15.equals((java.lang.Object) 10L);
        java.lang.String str22 = stackAr15.toString();
        stackAr12.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr15);
        java.lang.Object obj25 = stackAr1.pop();
        boolean boolean26 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1136");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        int int3 = stackAr0.size();
        java.lang.Object obj4 = stackAr0.top();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        java.lang.String str9 = stackAr8.toString();
        boolean boolean10 = stackAr6.equals((java.lang.Object) stackAr8);
        boolean boolean11 = stackAr6.isEmpty();
        stackAr0.push((java.lang.Object) stackAr6);
        java.lang.String str13 = stackAr0.toString();
        java.lang.Object obj14 = stackAr0.pop();
        java.lang.String str15 = stackAr0.toString();
        java.lang.Object obj16 = stackAr0.top();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0f + "'", obj4, 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0.0,[]]" + "'", str13, "[0.0,[]]");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[0.0]" + "'", str15, "[0.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1137");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        boolean boolean18 = stackAr4.isFull();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr4);
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        java.lang.Object obj22 = stackAr4.top();
        java.lang.String str23 = stackAr4.toString();
        int int24 = stackAr4.size();
        boolean boolean25 = stackAr4.isEmpty();
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean28 = stackAr27.isFull();
        int int29 = stackAr27.size();
        int int30 = stackAr27.size();
        int int31 = stackAr27.size();
        int int32 = stackAr27.size();
        stackAr4.push((java.lang.Object) stackAr27);
        boolean boolean34 = stackAr4.isFull();
        java.lang.String str35 = stackAr4.toString();
        java.lang.Class<?> wildcardClass36 = stackAr4.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[null]" + "'", str23, "[null]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[null,[]]" + "'", str35, "[null,[]]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1138");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr10.equals((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        boolean boolean18 = stackAr15.equals((java.lang.Object) (byte) -1);
        java.lang.String str19 = stackAr15.toString();
        boolean boolean21 = stackAr15.equals((java.lang.Object) 10L);
        java.lang.String str22 = stackAr15.toString();
        stackAr12.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr15);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean27 = stackAr26.isEmpty();
        boolean boolean28 = stackAr26.isFull();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        java.lang.String str33 = stackAr32.toString();
        boolean boolean34 = stackAr30.equals((java.lang.Object) stackAr32);
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) '4');
        stackAr36.push((java.lang.Object) (-1L));
        java.lang.Object obj39 = stackAr36.pop();
        stackAr30.push((java.lang.Object) stackAr36);
        boolean boolean41 = stackAr26.equals((java.lang.Object) stackAr30);
        stackAr15.push((java.lang.Object) stackAr30);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean45 = stackAr44.isFull();
        int int46 = stackAr44.size();
        int int47 = stackAr44.size();
        stackAr30.push((java.lang.Object) stackAr44);
        java.lang.Object obj49 = stackAr30.top();
        java.lang.Object obj50 = stackAr30.top();
        java.lang.Object obj51 = stackAr30.pop();
        java.lang.Object obj52 = stackAr30.pop();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "[]");
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "[]");
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "[]");
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "[]");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1139");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.String str9 = stackAr1.toString();
        boolean boolean10 = stackAr1.isEmpty();
        java.lang.Object obj11 = stackAr1.top();
        boolean boolean12 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[]]" + "'", str9, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1140");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        boolean boolean8 = stackAr5.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        boolean boolean11 = stackAr5.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) 'a');
        boolean boolean15 = stackAr13.equals((java.lang.Object) (-1.0f));
        boolean boolean17 = stackAr13.equals((java.lang.Object) "");
        boolean boolean18 = stackAr5.equals((java.lang.Object) "");
        boolean boolean19 = stackAr5.isFull();
        boolean boolean20 = stackAr5.isFull();
        java.lang.String str21 = stackAr5.toString();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj23 = stackAr1.pop();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '4');
        java.lang.String str28 = stackAr27.toString();
        boolean boolean29 = stackAr25.equals((java.lang.Object) stackAr27);
        stackAr27.push((java.lang.Object) (-1));
        boolean boolean32 = stackAr27.isFull();
        stackAr1.push((java.lang.Object) stackAr27);
        java.lang.Object obj34 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "[-1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "[-1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "[-1]");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1141");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr10.equals((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        boolean boolean18 = stackAr15.equals((java.lang.Object) (byte) -1);
        java.lang.String str19 = stackAr15.toString();
        boolean boolean21 = stackAr15.equals((java.lang.Object) 10L);
        java.lang.String str22 = stackAr15.toString();
        stackAr12.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr15);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean27 = stackAr26.isEmpty();
        boolean boolean28 = stackAr26.isFull();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        java.lang.String str33 = stackAr32.toString();
        boolean boolean34 = stackAr30.equals((java.lang.Object) stackAr32);
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) '4');
        stackAr36.push((java.lang.Object) (-1L));
        java.lang.Object obj39 = stackAr36.pop();
        stackAr30.push((java.lang.Object) stackAr36);
        boolean boolean41 = stackAr26.equals((java.lang.Object) stackAr30);
        stackAr15.push((java.lang.Object) stackAr30);
        boolean boolean43 = stackAr15.isEmpty();
        java.lang.Object obj44 = stackAr15.pop();
        java.lang.String str45 = stackAr15.toString();
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr();
        stackAr46.push((java.lang.Object) 0.0f);
        java.lang.String str49 = stackAr46.toString();
        boolean boolean50 = stackAr46.isEmpty();
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr((int) '#');
        stackAr46.push((java.lang.Object) stackAr52);
        boolean boolean54 = stackAr15.equals((java.lang.Object) stackAr46);
        org.autotest.StackAr stackAr56 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr58 = new org.autotest.StackAr((int) '4');
        java.lang.String str59 = stackAr58.toString();
        boolean boolean60 = stackAr56.equals((java.lang.Object) stackAr58);
        org.autotest.StackAr stackAr61 = new org.autotest.StackAr();
        boolean boolean62 = stackAr61.isFull();
        boolean boolean64 = stackAr61.equals((java.lang.Object) (byte) -1);
        java.lang.String str65 = stackAr61.toString();
        boolean boolean67 = stackAr61.equals((java.lang.Object) 10L);
        java.lang.String str68 = stackAr61.toString();
        stackAr58.push((java.lang.Object) stackAr61);
        org.autotest.StackAr stackAr70 = new org.autotest.StackAr();
        boolean boolean71 = stackAr70.isFull();
        java.lang.String str72 = stackAr70.toString();
        stackAr61.push((java.lang.Object) str72);
        boolean boolean74 = stackAr61.isFull();
        boolean boolean75 = stackAr46.equals((java.lang.Object) boolean74);
        int int76 = stackAr46.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "[[]]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[0.0]" + "'", str49, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "[]" + "'", str59, "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[]" + "'", str65, "[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[]" + "'", str68, "[]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[]" + "'", str72, "[]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1142");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        java.lang.String str8 = stackAr7.toString();
        boolean boolean9 = stackAr5.equals((java.lang.Object) stackAr7);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        stackAr11.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackAr11.pop();
        stackAr5.push((java.lang.Object) stackAr11);
        boolean boolean16 = stackAr1.equals((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        stackAr17.push((java.lang.Object) 0.0f);
        java.lang.String str20 = stackAr17.toString();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) 'a');
        boolean boolean24 = stackAr22.equals((java.lang.Object) (-1.0f));
        boolean boolean26 = stackAr22.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr();
        boolean boolean28 = stackAr27.isFull();
        stackAr22.push((java.lang.Object) stackAr27);
        boolean boolean30 = stackAr22.isFull();
        java.lang.Object obj31 = stackAr22.pop();
        stackAr17.push((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) '4');
        stackAr34.push((java.lang.Object) (-1L));
        stackAr17.push((java.lang.Object) stackAr34);
        boolean boolean38 = stackAr1.equals((java.lang.Object) stackAr34);
        boolean boolean39 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[0.0]" + "'", str20, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1143");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean2 = stackAr0.isFull();
        int int3 = stackAr0.size();
        java.lang.Class<?> wildcardClass4 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1144");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        boolean boolean15 = stackAr3.isFull();
        java.lang.Object obj16 = stackAr3.top();
        boolean boolean17 = stackAr3.isFull();
        java.lang.Object obj18 = stackAr3.pop();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr();
        stackAr19.push((java.lang.Object) 0.0f);
        java.lang.String str22 = stackAr19.toString();
        boolean boolean23 = stackAr19.isEmpty();
        int int24 = stackAr19.size();
        java.lang.Object obj25 = stackAr19.pop();
        stackAr3.push(obj25);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[0.0]" + "'", str22, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0f + "'", obj25, 0.0f);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1145");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        boolean boolean18 = stackAr4.isFull();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr4);
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        boolean boolean22 = stackAr4.isFull();
        int int23 = stackAr4.size();
        boolean boolean24 = stackAr4.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1146");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        stackAr1.push((java.lang.Object) 0);
        java.lang.String str5 = stackAr1.toString();
        java.lang.Object obj6 = stackAr1.pop();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        java.lang.String str9 = stackAr8.toString();
        java.lang.String str10 = stackAr8.toString();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
        boolean boolean12 = stackAr11.isFull();
        boolean boolean14 = stackAr11.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        boolean boolean17 = stackAr11.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) 'a');
        boolean boolean21 = stackAr19.equals((java.lang.Object) (-1.0f));
        boolean boolean23 = stackAr19.equals((java.lang.Object) "");
        boolean boolean24 = stackAr11.equals((java.lang.Object) "");
        boolean boolean25 = stackAr11.isFull();
        boolean boolean26 = stackAr8.equals((java.lang.Object) stackAr11);
        java.lang.Object obj27 = null;
        stackAr11.push(obj27);
        java.lang.Object obj29 = stackAr11.top();
        boolean boolean30 = stackAr11.isEmpty();
        boolean boolean31 = stackAr11.isFull();
        stackAr1.push((java.lang.Object) stackAr11);
        boolean boolean33 = stackAr11.isFull();
        java.lang.Class<?> wildcardClass34 = stackAr11.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1147");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        int int6 = stackAr3.size();
        boolean boolean7 = stackAr3.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1148");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        boolean boolean15 = stackAr3.isFull();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean18 = stackAr17.isFull();
        int int19 = stackAr17.size();
        stackAr3.push((java.lang.Object) stackAr17);
        boolean boolean21 = stackAr3.isFull();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr();
        stackAr22.push((java.lang.Object) 0.0f);
        stackAr22.push((java.lang.Object) true);
        java.lang.Object obj27 = stackAr22.pop();
        stackAr3.push((java.lang.Object) stackAr22);
        int int29 = stackAr3.size();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) 'a');
        boolean boolean33 = stackAr31.equals((java.lang.Object) (-1.0f));
        boolean boolean35 = stackAr31.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr();
        boolean boolean37 = stackAr36.isFull();
        stackAr31.push((java.lang.Object) stackAr36);
        org.autotest.StackAr stackAr40 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) '4');
        java.lang.String str43 = stackAr42.toString();
        boolean boolean44 = stackAr40.equals((java.lang.Object) stackAr42);
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr();
        boolean boolean46 = stackAr45.isFull();
        boolean boolean48 = stackAr45.equals((java.lang.Object) (byte) -1);
        java.lang.String str49 = stackAr45.toString();
        boolean boolean51 = stackAr45.equals((java.lang.Object) 10L);
        java.lang.String str52 = stackAr45.toString();
        stackAr42.push((java.lang.Object) stackAr45);
        stackAr31.push((java.lang.Object) stackAr45);
        boolean boolean55 = stackAr31.isEmpty();
        java.lang.Object obj56 = stackAr31.top();
        org.autotest.StackAr stackAr58 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr60 = new org.autotest.StackAr((int) '4');
        java.lang.String str61 = stackAr60.toString();
        boolean boolean62 = stackAr58.equals((java.lang.Object) stackAr60);
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr();
        boolean boolean64 = stackAr63.isFull();
        boolean boolean66 = stackAr63.equals((java.lang.Object) (byte) -1);
        java.lang.String str67 = stackAr63.toString();
        boolean boolean69 = stackAr63.equals((java.lang.Object) 10L);
        java.lang.String str70 = stackAr63.toString();
        stackAr60.push((java.lang.Object) stackAr63);
        java.lang.Class<?> wildcardClass72 = stackAr60.getClass();
        boolean boolean73 = stackAr31.equals((java.lang.Object) wildcardClass72);
        java.lang.String str74 = stackAr31.toString();
        boolean boolean75 = stackAr3.equals((java.lang.Object) str74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + true + "'", obj27, true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "[]");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[]" + "'", str61, "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "[]" + "'", str67, "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[]" + "'", str70, "[]");
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "[[],[]]" + "'", str74, "[[],[]]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1149");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        boolean boolean15 = stackAr3.isFull();
        java.lang.String str16 = stackAr3.toString();
        java.lang.Object obj17 = stackAr3.top();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[]]" + "'", str16, "[[]]");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[]");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test1150");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr();
        boolean boolean2 = stackAr1.isFull();
        boolean boolean4 = stackAr1.equals((java.lang.Object) false);
        stackAr1.push((java.lang.Object) (byte) 100);
        stackAr0.push((java.lang.Object) stackAr1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }
}

