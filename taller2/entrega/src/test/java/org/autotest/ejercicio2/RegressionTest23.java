package org.autotest.ejercicio2;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

    public static boolean debug = false;

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1151");
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
        int int49 = stackAr30.size();
        java.lang.Class<?> wildcardClass50 = stackAr30.getClass();
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1152");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1153");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.Object obj7 = null;
        stackAr0.push(obj7);
        java.lang.Object obj9 = stackAr0.pop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1154");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        java.lang.String str2 = stackAr0.toString();
        java.lang.Class<?> wildcardClass3 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1155");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1156");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1157");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        int int7 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1158");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        int int6 = stackAr1.size();
        java.lang.String str7 = stackAr1.toString();
        java.lang.String str8 = stackAr1.toString();
        int int9 = stackAr1.size();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
        boolean boolean11 = stackAr10.isFull();
        boolean boolean13 = stackAr10.equals((java.lang.Object) (byte) -1);
        java.lang.String str14 = stackAr10.toString();
        boolean boolean16 = stackAr10.equals((java.lang.Object) 10L);
        java.lang.String str17 = stackAr10.toString();
        boolean boolean19 = stackAr10.equals((java.lang.Object) (byte) 0);
        boolean boolean20 = stackAr10.isFull();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '#');
        stackAr10.push((java.lang.Object) stackAr22);
        boolean boolean24 = stackAr10.isFull();
        java.lang.Object obj25 = stackAr10.pop();
        java.lang.Class<?> wildcardClass26 = stackAr10.getClass();
        stackAr1.push((java.lang.Object) stackAr10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "[]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1159");
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
        boolean boolean25 = stackAr1.isEmpty();
        java.lang.Object obj26 = stackAr1.top();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) 'a');
        boolean boolean29 = stackAr28.isFull();
        boolean boolean30 = stackAr28.isEmpty();
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) 'a');
        boolean boolean34 = stackAr32.equals((java.lang.Object) (-1.0f));
        boolean boolean36 = stackAr32.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr();
        boolean boolean38 = stackAr37.isFull();
        stackAr32.push((java.lang.Object) stackAr37);
        java.lang.String str40 = stackAr32.toString();
        boolean boolean41 = stackAr28.equals((java.lang.Object) stackAr32);
        boolean boolean42 = stackAr1.equals((java.lang.Object) stackAr28);
        java.lang.String str43 = stackAr1.toString();
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr((int) '4');
        java.lang.String str46 = stackAr45.toString();
        stackAr45.push((java.lang.Object) 0);
        java.lang.Object obj49 = stackAr45.top();
        stackAr1.push(obj49);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[[]]" + "'", str40, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[[],[]]" + "'", str43, "[[],[]]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[]" + "'", str46, "[]");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0 + "'", obj49, 0);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1160");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1161");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        boolean boolean12 = stackAr6.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        int int15 = stackAr14.size();
        stackAr14.push((java.lang.Object) 0);
        stackAr6.push((java.lang.Object) stackAr14);
        boolean boolean19 = stackAr6.isEmpty();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) 'a');
        boolean boolean23 = stackAr21.equals((java.lang.Object) (-1.0f));
        boolean boolean25 = stackAr21.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        stackAr21.push((java.lang.Object) stackAr26);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        java.lang.String str33 = stackAr32.toString();
        boolean boolean34 = stackAr30.equals((java.lang.Object) stackAr32);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr();
        boolean boolean36 = stackAr35.isFull();
        boolean boolean38 = stackAr35.equals((java.lang.Object) (byte) -1);
        java.lang.String str39 = stackAr35.toString();
        boolean boolean41 = stackAr35.equals((java.lang.Object) 10L);
        java.lang.String str42 = stackAr35.toString();
        stackAr32.push((java.lang.Object) stackAr35);
        stackAr21.push((java.lang.Object) stackAr35);
        boolean boolean45 = stackAr35.isFull();
        boolean boolean47 = stackAr35.equals((java.lang.Object) (short) 10);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean50 = stackAr49.isFull();
        java.lang.String str51 = stackAr49.toString();
        java.lang.String str52 = stackAr49.toString();
        boolean boolean53 = stackAr35.equals((java.lang.Object) stackAr49);
        stackAr6.push((java.lang.Object) stackAr35);
        boolean boolean55 = stackAr1.equals((java.lang.Object) stackAr35);
        org.autotest.StackAr stackAr57 = new org.autotest.StackAr((int) '4');
        boolean boolean58 = stackAr57.isFull();
        int int59 = stackAr57.size();
        org.autotest.StackAr stackAr60 = new org.autotest.StackAr();
        boolean boolean61 = stackAr60.isFull();
        int int62 = stackAr60.size();
        java.lang.Class<?> wildcardClass63 = stackAr60.getClass();
        boolean boolean64 = stackAr57.equals((java.lang.Object) wildcardClass63);
        stackAr1.push((java.lang.Object) stackAr57);
        java.lang.Class<?> wildcardClass66 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1162");
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
        java.lang.String str36 = stackAr4.toString();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[null,[]]" + "'", str36, "[null,[]]");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1163");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) (byte) -1);
        stackAr1.push((java.lang.Object) boolean6);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        java.lang.String str12 = stackAr8.toString();
        boolean boolean14 = stackAr8.equals((java.lang.Object) 10L);
        java.lang.String str15 = stackAr8.toString();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (-1.0f));
        boolean boolean21 = stackAr17.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr();
        boolean boolean23 = stackAr22.isFull();
        stackAr17.push((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) '4');
        java.lang.String str29 = stackAr28.toString();
        boolean boolean30 = stackAr26.equals((java.lang.Object) stackAr28);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        boolean boolean32 = stackAr31.isFull();
        boolean boolean34 = stackAr31.equals((java.lang.Object) (byte) -1);
        java.lang.String str35 = stackAr31.toString();
        boolean boolean37 = stackAr31.equals((java.lang.Object) 10L);
        java.lang.String str38 = stackAr31.toString();
        stackAr28.push((java.lang.Object) stackAr31);
        stackAr17.push((java.lang.Object) stackAr31);
        boolean boolean41 = stackAr8.equals((java.lang.Object) stackAr31);
        boolean boolean42 = stackAr1.equals((java.lang.Object) stackAr31);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) 'a');
        boolean boolean46 = stackAr44.equals((java.lang.Object) (-1.0f));
        int int47 = stackAr44.size();
        boolean boolean49 = stackAr44.equals((java.lang.Object) (byte) 100);
        boolean boolean50 = stackAr44.isFull();
        int int51 = stackAr44.size();
        boolean boolean52 = stackAr44.isEmpty();
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) '4');
        boolean boolean55 = stackAr54.isFull();
        int int56 = stackAr54.size();
        stackAr44.push((java.lang.Object) stackAr54);
        stackAr1.push((java.lang.Object) stackAr54);
        int int59 = stackAr54.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1164");
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
        java.lang.Object obj29 = null;
        boolean boolean30 = stackAr1.equals(obj29);
        java.lang.String str31 = stackAr1.toString();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[0]" + "'", str31, "[0]");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1165");
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
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        java.lang.String str17 = stackAr16.toString();
        java.lang.String str18 = stackAr16.toString();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr();
        boolean boolean20 = stackAr19.isFull();
        boolean boolean22 = stackAr19.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) '4');
        boolean boolean25 = stackAr19.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) 'a');
        boolean boolean29 = stackAr27.equals((java.lang.Object) (-1.0f));
        boolean boolean31 = stackAr27.equals((java.lang.Object) "");
        boolean boolean32 = stackAr19.equals((java.lang.Object) "");
        boolean boolean33 = stackAr19.isFull();
        boolean boolean34 = stackAr16.equals((java.lang.Object) stackAr19);
        java.lang.Object obj35 = null;
        stackAr19.push(obj35);
        java.lang.Object obj37 = stackAr19.top();
        java.lang.String str38 = stackAr19.toString();
        boolean boolean39 = stackAr0.equals((java.lang.Object) stackAr19);
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) 'a');
        java.lang.String str42 = stackAr41.toString();
        boolean boolean43 = stackAr41.isEmpty();
        boolean boolean44 = stackAr0.equals((java.lang.Object) stackAr41);
        boolean boolean45 = stackAr41.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[null]" + "'", str38, "[null]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1166");
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
        boolean boolean52 = stackAr0.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1167");
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
        java.lang.Object obj23 = stackAr4.pop();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        java.lang.String str26 = stackAr25.toString();
        java.lang.String str27 = stackAr25.toString();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
        boolean boolean29 = stackAr28.isFull();
        boolean boolean31 = stackAr28.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) '4');
        boolean boolean34 = stackAr28.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        boolean boolean38 = stackAr36.equals((java.lang.Object) (-1.0f));
        boolean boolean40 = stackAr36.equals((java.lang.Object) "");
        boolean boolean41 = stackAr28.equals((java.lang.Object) "");
        boolean boolean42 = stackAr28.isFull();
        boolean boolean43 = stackAr25.equals((java.lang.Object) stackAr28);
        int int44 = stackAr28.size();
        boolean boolean45 = stackAr28.isEmpty();
        boolean boolean46 = stackAr28.isEmpty();
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) '4');
        int int49 = stackAr48.size();
        stackAr48.push((java.lang.Object) 0);
        boolean boolean52 = stackAr48.isFull();
        stackAr28.push((java.lang.Object) stackAr48);
        boolean boolean54 = stackAr4.equals((java.lang.Object) stackAr48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = stackAr4.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1168");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        int int6 = stackAr5.size();
        stackAr5.push((java.lang.Object) 0);
        boolean boolean9 = stackAr5.isFull();
        boolean boolean10 = stackAr5.isFull();
        java.lang.String str11 = stackAr5.toString();
        boolean boolean12 = stackAr1.equals((java.lang.Object) str11);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) 'a');
        boolean boolean15 = stackAr14.isFull();
        boolean boolean16 = stackAr14.isEmpty();
        boolean boolean17 = stackAr1.equals((java.lang.Object) stackAr14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackAr14.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0]" + "'", str11, "[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1169");
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
        stackAr4.push((java.lang.Object) 1.0f);
        boolean boolean26 = stackAr4.isFull();
        java.lang.Object obj27 = stackAr4.pop();
        boolean boolean28 = stackAr4.isFull();
        java.lang.Object obj29 = stackAr4.pop();
        int int30 = stackAr4.size();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0f + "'", obj27, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1170");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        java.lang.String str6 = stackAr1.toString();
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        int int9 = stackAr1.size();
        java.lang.String str10 = stackAr1.toString();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        int int17 = stackAr16.size();
        stackAr16.push((java.lang.Object) 0);
        boolean boolean20 = stackAr16.isFull();
        boolean boolean21 = stackAr16.isFull();
        java.lang.String str22 = stackAr16.toString();
        boolean boolean23 = stackAr12.equals((java.lang.Object) str22);
        stackAr1.push((java.lang.Object) boolean23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[0]" + "'", str22, "[0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1171");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) 'a');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (-1.0f));
        boolean boolean13 = stackAr9.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        boolean boolean15 = stackAr14.isFull();
        stackAr9.push((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) '4');
        java.lang.String str21 = stackAr20.toString();
        boolean boolean22 = stackAr18.equals((java.lang.Object) stackAr20);
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr();
        boolean boolean24 = stackAr23.isFull();
        boolean boolean26 = stackAr23.equals((java.lang.Object) (byte) -1);
        java.lang.String str27 = stackAr23.toString();
        boolean boolean29 = stackAr23.equals((java.lang.Object) 10L);
        java.lang.String str30 = stackAr23.toString();
        stackAr20.push((java.lang.Object) stackAr23);
        stackAr9.push((java.lang.Object) stackAr23);
        boolean boolean33 = stackAr0.equals((java.lang.Object) stackAr23);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) 'a');
        boolean boolean37 = stackAr35.equals((java.lang.Object) (-1.0f));
        boolean boolean39 = stackAr35.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr40 = new org.autotest.StackAr();
        boolean boolean41 = stackAr40.isFull();
        stackAr35.push((java.lang.Object) stackAr40);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) 'a');
        boolean boolean45 = stackAr44.isFull();
        boolean boolean46 = stackAr44.isEmpty();
        int int47 = stackAr44.size();
        boolean boolean48 = stackAr40.equals((java.lang.Object) int47);
        boolean boolean49 = stackAr40.isEmpty();
        boolean boolean50 = stackAr0.equals((java.lang.Object) stackAr40);
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr((int) '4');
        int int53 = stackAr52.size();
        stackAr52.push((java.lang.Object) 0);
        java.lang.String str56 = stackAr52.toString();
        java.lang.Object obj57 = stackAr52.pop();
        stackAr0.push(obj57);
        boolean boolean59 = stackAr0.isFull();
        int int60 = stackAr0.size();
        boolean boolean61 = stackAr0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[0]" + "'", str56, "[0]");
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 0 + "'", obj57, 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1172");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) (byte) -1);
        stackAr1.push((java.lang.Object) boolean6);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        java.lang.String str12 = stackAr8.toString();
        boolean boolean14 = stackAr8.equals((java.lang.Object) 10L);
        java.lang.String str15 = stackAr8.toString();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (-1.0f));
        boolean boolean21 = stackAr17.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr();
        boolean boolean23 = stackAr22.isFull();
        stackAr17.push((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) '4');
        java.lang.String str29 = stackAr28.toString();
        boolean boolean30 = stackAr26.equals((java.lang.Object) stackAr28);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        boolean boolean32 = stackAr31.isFull();
        boolean boolean34 = stackAr31.equals((java.lang.Object) (byte) -1);
        java.lang.String str35 = stackAr31.toString();
        boolean boolean37 = stackAr31.equals((java.lang.Object) 10L);
        java.lang.String str38 = stackAr31.toString();
        stackAr28.push((java.lang.Object) stackAr31);
        stackAr17.push((java.lang.Object) stackAr31);
        boolean boolean41 = stackAr8.equals((java.lang.Object) stackAr31);
        boolean boolean42 = stackAr1.equals((java.lang.Object) stackAr31);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) 'a');
        boolean boolean46 = stackAr44.equals((java.lang.Object) (-1.0f));
        int int47 = stackAr44.size();
        boolean boolean49 = stackAr44.equals((java.lang.Object) (byte) 100);
        boolean boolean50 = stackAr44.isFull();
        int int51 = stackAr44.size();
        boolean boolean52 = stackAr44.isEmpty();
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) '4');
        boolean boolean55 = stackAr54.isFull();
        int int56 = stackAr54.size();
        stackAr44.push((java.lang.Object) stackAr54);
        stackAr1.push((java.lang.Object) stackAr54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = stackAr54.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1173");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        boolean boolean2 = stackAr1.isFull();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (-1.0f));
        boolean boolean9 = stackAr5.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
        boolean boolean11 = stackAr10.isFull();
        stackAr5.push((java.lang.Object) stackAr10);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        java.lang.String str17 = stackAr16.toString();
        boolean boolean18 = stackAr14.equals((java.lang.Object) stackAr16);
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr();
        boolean boolean20 = stackAr19.isFull();
        boolean boolean22 = stackAr19.equals((java.lang.Object) (byte) -1);
        java.lang.String str23 = stackAr19.toString();
        boolean boolean25 = stackAr19.equals((java.lang.Object) 10L);
        java.lang.String str26 = stackAr19.toString();
        stackAr16.push((java.lang.Object) stackAr19);
        stackAr5.push((java.lang.Object) stackAr19);
        boolean boolean29 = stackAr19.isFull();
        boolean boolean31 = stackAr19.equals((java.lang.Object) (short) 10);
        stackAr1.push((java.lang.Object) boolean31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1174");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 0);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) 'a');
        boolean boolean5 = stackAr3.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = stackAr3.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        stackAr3.push((java.lang.Object) stackAr8);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        java.lang.String str15 = stackAr14.toString();
        boolean boolean16 = stackAr12.equals((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        boolean boolean18 = stackAr17.isFull();
        boolean boolean20 = stackAr17.equals((java.lang.Object) (byte) -1);
        java.lang.String str21 = stackAr17.toString();
        boolean boolean23 = stackAr17.equals((java.lang.Object) 10L);
        java.lang.String str24 = stackAr17.toString();
        stackAr14.push((java.lang.Object) stackAr17);
        stackAr3.push((java.lang.Object) stackAr17);
        java.lang.Object obj27 = stackAr3.pop();
        boolean boolean28 = stackAr1.equals((java.lang.Object) stackAr3);
        int int29 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1175");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        int int9 = stackAr8.size();
        stackAr8.push((java.lang.Object) 0);
        stackAr0.push((java.lang.Object) stackAr8);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        boolean boolean15 = stackAr14.isEmpty();
        boolean boolean16 = stackAr0.equals((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) 'a');
        boolean boolean20 = stackAr18.equals((java.lang.Object) (-1.0f));
        boolean boolean22 = stackAr18.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr();
        boolean boolean24 = stackAr23.isFull();
        stackAr18.push((java.lang.Object) stackAr23);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) '4');
        java.lang.String str30 = stackAr29.toString();
        boolean boolean31 = stackAr27.equals((java.lang.Object) stackAr29);
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr();
        boolean boolean33 = stackAr32.isFull();
        boolean boolean35 = stackAr32.equals((java.lang.Object) (byte) -1);
        java.lang.String str36 = stackAr32.toString();
        boolean boolean38 = stackAr32.equals((java.lang.Object) 10L);
        java.lang.String str39 = stackAr32.toString();
        stackAr29.push((java.lang.Object) stackAr32);
        stackAr18.push((java.lang.Object) stackAr32);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean44 = stackAr43.isEmpty();
        boolean boolean45 = stackAr43.isFull();
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) '4');
        java.lang.String str50 = stackAr49.toString();
        boolean boolean51 = stackAr47.equals((java.lang.Object) stackAr49);
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr((int) '4');
        stackAr53.push((java.lang.Object) (-1L));
        java.lang.Object obj56 = stackAr53.pop();
        stackAr47.push((java.lang.Object) stackAr53);
        boolean boolean58 = stackAr43.equals((java.lang.Object) stackAr47);
        stackAr32.push((java.lang.Object) stackAr47);
        org.autotest.StackAr stackAr61 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean62 = stackAr61.isFull();
        int int63 = stackAr61.size();
        int int64 = stackAr61.size();
        stackAr47.push((java.lang.Object) stackAr61);
        org.autotest.StackAr stackAr67 = new org.autotest.StackAr((int) '4');
        java.lang.String str68 = stackAr67.toString();
        stackAr67.push((java.lang.Object) 0);
        stackAr47.push((java.lang.Object) 0);
        stackAr14.push((java.lang.Object) stackAr47);
        java.lang.String str73 = stackAr47.toString();
        java.lang.Class<?> wildcardClass74 = stackAr47.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[]" + "'", str50, "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (-1L) + "'", obj56, (-1L));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[]" + "'", str68, "[]");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "[[],[],0]" + "'", str73, "[[],[],0]");
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1176");
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
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr((int) '4');
        java.lang.String str54 = stackAr53.toString();
        java.lang.String str55 = stackAr53.toString();
        org.autotest.StackAr stackAr56 = new org.autotest.StackAr();
        boolean boolean57 = stackAr56.isFull();
        boolean boolean59 = stackAr56.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr61 = new org.autotest.StackAr((int) '4');
        boolean boolean62 = stackAr56.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr64 = new org.autotest.StackAr((int) 'a');
        boolean boolean66 = stackAr64.equals((java.lang.Object) (-1.0f));
        boolean boolean68 = stackAr64.equals((java.lang.Object) "");
        boolean boolean69 = stackAr56.equals((java.lang.Object) "");
        boolean boolean70 = stackAr56.isFull();
        boolean boolean71 = stackAr53.equals((java.lang.Object) stackAr56);
        int int72 = stackAr56.size();
        boolean boolean73 = stackAr56.isEmpty();
        boolean boolean74 = stackAr56.isEmpty();
        org.autotest.StackAr stackAr76 = new org.autotest.StackAr((int) '4');
        int int77 = stackAr76.size();
        stackAr76.push((java.lang.Object) 0);
        boolean boolean80 = stackAr76.isFull();
        stackAr56.push((java.lang.Object) stackAr76);
        stackAr0.push((java.lang.Object) stackAr56);
        java.lang.Object obj83 = stackAr0.pop();
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
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[]" + "'", str54, "[]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[]" + "'", str55, "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertEquals(obj83.toString(), "[[0]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj83), "[[0]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj83), "[[0]]");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1177");
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
        java.lang.String str49 = stackAr30.toString();
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) '4');
        java.lang.String str52 = stackAr51.toString();
        java.lang.Class<?> wildcardClass53 = stackAr51.getClass();
        stackAr30.push((java.lang.Object) stackAr51);
        java.lang.String str55 = stackAr30.toString();
        java.lang.String str56 = stackAr30.toString();
        java.lang.String str57 = stackAr30.toString();
        int int58 = stackAr30.size();
        org.autotest.StackAr stackAr60 = new org.autotest.StackAr((int) '4');
        java.lang.String str61 = stackAr60.toString();
        org.autotest.StackAr stackAr62 = new org.autotest.StackAr();
        boolean boolean63 = stackAr62.isFull();
        boolean boolean65 = stackAr62.equals((java.lang.Object) false);
        boolean boolean66 = stackAr62.isEmpty();
        boolean boolean67 = stackAr60.equals((java.lang.Object) stackAr62);
        boolean boolean68 = stackAr62.isEmpty();
        org.autotest.StackAr stackAr69 = new org.autotest.StackAr();
        boolean boolean71 = stackAr69.equals((java.lang.Object) 1.0f);
        boolean boolean72 = stackAr69.isEmpty();
        boolean boolean73 = stackAr62.equals((java.lang.Object) boolean72);
        boolean boolean74 = stackAr30.equals((java.lang.Object) boolean72);
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[[],[]]" + "'", str49, "[[],[]]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[[],[],[]]" + "'", str55, "[[],[],[]]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[[],[],[]]" + "'", str56, "[[],[],[]]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[[],[],[]]" + "'", str57, "[[],[],[]]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[]" + "'", str61, "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1178");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '4');
        int int5 = stackAr4.size();
        stackAr4.push((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass8 = stackAr4.getClass();
        boolean boolean9 = stackAr1.equals((java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1179");
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
        boolean boolean17 = stackAr12.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackAr12.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1180");
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
        java.lang.Object obj23 = stackAr4.top();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
        stackAr24.push((java.lang.Object) 0.0f);
        stackAr24.push((java.lang.Object) true);
        stackAr4.push((java.lang.Object) stackAr24);
        java.lang.String str30 = stackAr4.toString();
        boolean boolean31 = stackAr4.isEmpty();
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
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[null,[0.0,true]]" + "'", str30, "[null,[0.0,true]]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1181");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        boolean boolean6 = stackAr3.isFull();
        boolean boolean8 = stackAr3.equals((java.lang.Object) "hi!");
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        boolean boolean11 = stackAr10.isFull();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        boolean boolean13 = stackAr12.isFull();
        boolean boolean15 = stackAr12.equals((java.lang.Object) (byte) -1);
        stackAr10.push((java.lang.Object) boolean15);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) 'a');
        boolean boolean19 = stackAr18.isFull();
        boolean boolean20 = stackAr10.equals((java.lang.Object) boolean19);
        java.lang.String str21 = stackAr10.toString();
        java.lang.Object obj22 = stackAr10.top();
        boolean boolean23 = stackAr3.equals((java.lang.Object) stackAr10);
        int int24 = stackAr10.size();
        java.lang.String str25 = stackAr10.toString();
        java.lang.Object obj26 = stackAr10.top();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[false]" + "'", str21, "[false]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[false]" + "'", str25, "[false]");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1182");
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
        java.lang.Object obj14 = stackAr0.top();
        java.lang.String str15 = stackAr0.toString();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[0.0,[]]" + "'", str15, "[0.0,[]]");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1183");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.push((java.lang.Object) true);
        java.lang.Object obj5 = stackAr0.pop();
        boolean boolean6 = stackAr0.isEmpty();
        int int7 = stackAr0.size();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1184");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        int int3 = stackAr0.size();
        int int4 = stackAr0.size();
        boolean boolean5 = stackAr0.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1185");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) false);
        boolean boolean7 = stackAr3.isEmpty();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr3);
        boolean boolean9 = stackAr3.isFull();
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
        boolean boolean35 = stackAr25.isFull();
        boolean boolean37 = stackAr25.equals((java.lang.Object) (short) 10);
        boolean boolean38 = stackAr25.isEmpty();
        boolean boolean39 = stackAr25.isFull();
        stackAr3.push((java.lang.Object) boolean39);
        java.lang.Class<?> wildcardClass41 = stackAr3.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1186");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean5 = stackAr0.isFull();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        java.lang.String str10 = stackAr9.toString();
        boolean boolean11 = stackAr7.equals((java.lang.Object) stackAr9);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        stackAr13.push((java.lang.Object) (-1L));
        java.lang.Object obj16 = stackAr13.pop();
        stackAr7.push((java.lang.Object) stackAr13);
        stackAr0.push((java.lang.Object) stackAr7);
        boolean boolean19 = stackAr7.isEmpty();
        java.lang.Object obj20 = stackAr7.pop();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        boolean boolean22 = stackAr21.isFull();
        boolean boolean24 = stackAr21.equals((java.lang.Object) (byte) -1);
        java.lang.String str25 = stackAr21.toString();
        boolean boolean27 = stackAr21.equals((java.lang.Object) 10L);
        java.lang.String str28 = stackAr21.toString();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) 'a');
        boolean boolean32 = stackAr30.equals((java.lang.Object) (-1.0f));
        boolean boolean34 = stackAr30.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr();
        boolean boolean36 = stackAr35.isFull();
        stackAr30.push((java.lang.Object) stackAr35);
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) '4');
        java.lang.String str42 = stackAr41.toString();
        boolean boolean43 = stackAr39.equals((java.lang.Object) stackAr41);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr();
        boolean boolean45 = stackAr44.isFull();
        boolean boolean47 = stackAr44.equals((java.lang.Object) (byte) -1);
        java.lang.String str48 = stackAr44.toString();
        boolean boolean50 = stackAr44.equals((java.lang.Object) 10L);
        java.lang.String str51 = stackAr44.toString();
        stackAr41.push((java.lang.Object) stackAr44);
        stackAr30.push((java.lang.Object) stackAr44);
        boolean boolean54 = stackAr21.equals((java.lang.Object) stackAr44);
        boolean boolean55 = stackAr44.isFull();
        stackAr7.push((java.lang.Object) stackAr44);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1L) + "'", obj16, (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1187");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        int int6 = stackAr1.size();
        boolean boolean7 = stackAr1.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        int int10 = stackAr9.size();
        boolean boolean11 = stackAr9.isEmpty();
        int int12 = stackAr9.size();
        stackAr1.push((java.lang.Object) int12);
        java.lang.Object obj14 = stackAr1.top();
        java.lang.String str15 = stackAr1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[0]" + "'", str15, "[0]");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1188");
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
        boolean boolean34 = stackAr1.isFull();
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr();
        boolean boolean36 = stackAr35.isFull();
        boolean boolean38 = stackAr35.equals((java.lang.Object) false);
        stackAr35.push((java.lang.Object) (byte) 100);
        boolean boolean42 = stackAr35.equals((java.lang.Object) 100L);
        java.lang.Object obj43 = stackAr35.top();
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr((int) '4');
        java.lang.String str48 = stackAr47.toString();
        boolean boolean49 = stackAr45.equals((java.lang.Object) stackAr47);
        stackAr47.push((java.lang.Object) (-1));
        boolean boolean52 = stackAr35.equals((java.lang.Object) stackAr47);
        stackAr1.push((java.lang.Object) stackAr35);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 100 + "'", obj43, (byte) 100);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1189");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) false);
        stackAr0.push((java.lang.Object) (byte) 100);
        java.lang.Object obj6 = stackAr0.top();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 100 + "'", obj6, (byte) 100);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1190");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        int int6 = stackAr1.size();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1191");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) (byte) -1);
        stackAr1.push((java.lang.Object) boolean6);
        int int8 = stackAr1.size();
        boolean boolean9 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass10 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1192");
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
        boolean boolean25 = stackAr1.isFull();
        boolean boolean26 = stackAr1.isFull();
        java.lang.Object obj27 = stackAr1.top();
        java.lang.Class<?> wildcardClass28 = stackAr1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1193");
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
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        boolean boolean18 = stackAr15.equals((java.lang.Object) (byte) -1);
        java.lang.String str19 = stackAr15.toString();
        boolean boolean20 = stackAr15.isFull();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) '4');
        java.lang.String str25 = stackAr24.toString();
        boolean boolean26 = stackAr22.equals((java.lang.Object) stackAr24);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) '4');
        stackAr28.push((java.lang.Object) (-1L));
        java.lang.Object obj31 = stackAr28.pop();
        stackAr22.push((java.lang.Object) stackAr28);
        stackAr15.push((java.lang.Object) stackAr22);
        boolean boolean34 = stackAr0.equals((java.lang.Object) stackAr22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1L) + "'", obj31, (-1L));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1194");
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
        boolean boolean16 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        stackAr17.push((java.lang.Object) 0.0f);
        int int20 = stackAr17.size();
        stackAr0.push((java.lang.Object) stackAr17);
        boolean boolean22 = stackAr0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1195");
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
        boolean boolean34 = stackAr1.isFull();
        java.lang.String str35 = stackAr1.toString();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[[-1]]" + "'", str35, "[[-1]]");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1196");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        stackAr7.push((java.lang.Object) (-1L));
        java.lang.Object obj10 = stackAr7.pop();
        stackAr1.push((java.lang.Object) stackAr7);
        boolean boolean12 = stackAr1.isEmpty();
        boolean boolean14 = stackAr1.equals((java.lang.Object) "[[]]");
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean17 = stackAr16.isFull();
        java.lang.String str18 = stackAr16.toString();
        int int19 = stackAr16.size();
        stackAr1.push((java.lang.Object) int19);
        boolean boolean21 = stackAr1.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1L) + "'", obj10, (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1197");
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
        boolean boolean25 = stackAr15.isFull();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        boolean boolean29 = stackAr26.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        boolean boolean32 = stackAr26.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) 'a');
        boolean boolean36 = stackAr34.equals((java.lang.Object) (-1.0f));
        boolean boolean38 = stackAr34.equals((java.lang.Object) "");
        boolean boolean39 = stackAr26.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass40 = stackAr26.getClass();
        stackAr15.push((java.lang.Object) stackAr26);
        java.lang.String str42 = stackAr15.toString();
        java.lang.String str43 = stackAr15.toString();
        java.lang.Object obj44 = stackAr15.pop();
        boolean boolean45 = stackAr15.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[[]]" + "'", str42, "[[]]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[[]]" + "'", str43, "[[]]");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1198");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        java.lang.String str4 = stackAr1.toString();
        int int5 = stackAr1.size();
        boolean boolean6 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean9 = stackAr8.isFull();
        stackAr1.push((java.lang.Object) stackAr8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1199");
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
        boolean boolean17 = stackAr12.isFull();
        boolean boolean18 = stackAr12.isFull();
        int int19 = stackAr12.size();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean22 = stackAr12.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1200");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(100);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        int int4 = stackAr3.size();
        stackAr3.push((java.lang.Object) 0);
        java.lang.Object obj7 = stackAr3.pop();
        boolean boolean8 = stackAr3.isFull();
        java.lang.Class<?> wildcardClass9 = stackAr3.getClass();
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackAr3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }
}

