package org.autotest.ejercicio2_con_failing;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest34 {

    public static boolean debug = false;

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1701");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) 'a');
        java.lang.String str8 = stackAr7.toString();
        stackAr7.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr7.equals((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        int int17 = stackAr16.size();
        java.lang.Class<?> wildcardClass18 = stackAr16.getClass();
        stackAr12.push((java.lang.Object) stackAr16);
        int int20 = stackAr12.size();
        boolean boolean21 = stackAr1.equals((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '4');
        java.lang.String str24 = stackAr23.toString();
        java.lang.String str25 = stackAr23.toString();
        int int26 = stackAr23.size();
        boolean boolean27 = stackAr23.isFull();
        boolean boolean29 = stackAr23.equals((java.lang.Object) ' ');
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        stackAr23.push((java.lang.Object) wildcardClass31);
        java.lang.Object obj33 = stackAr23.top();
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) '4');
        int int36 = stackAr35.size();
        java.lang.String str37 = stackAr35.toString();
        int int38 = stackAr35.size();
        boolean boolean39 = stackAr35.isEmpty();
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean42 = stackAr41.isFull();
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean45 = stackAr44.isFull();
        boolean boolean46 = stackAr41.equals((java.lang.Object) stackAr44);
        java.lang.Class<?> wildcardClass47 = stackAr44.getClass();
        boolean boolean48 = stackAr35.equals((java.lang.Object) wildcardClass47);
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr((int) '4');
        int int51 = stackAr50.size();
        int int52 = stackAr50.size();
        boolean boolean53 = stackAr50.isFull();
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr();
        boolean boolean55 = stackAr54.isFull();
        boolean boolean57 = stackAr54.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr((int) '4');
        boolean boolean60 = stackAr54.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr62 = new org.autotest.StackAr((int) 'a');
        boolean boolean64 = stackAr62.equals((java.lang.Object) (-1.0f));
        boolean boolean66 = stackAr62.equals((java.lang.Object) "");
        boolean boolean67 = stackAr54.equals((java.lang.Object) "");
        boolean boolean68 = stackAr54.isFull();
        stackAr50.push((java.lang.Object) stackAr54);
        org.autotest.StackAr stackAr71 = new org.autotest.StackAr(0);
        boolean boolean72 = stackAr50.equals((java.lang.Object) stackAr71);
        boolean boolean73 = stackAr35.equals((java.lang.Object) stackAr71);
        boolean boolean74 = stackAr35.isEmpty();
        org.autotest.StackAr stackAr76 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean77 = stackAr76.isFull();
        int int78 = stackAr76.size();
        org.autotest.StackAr stackAr80 = new org.autotest.StackAr((int) 'a');
        java.lang.String str81 = stackAr80.toString();
        stackAr80.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr85 = new org.autotest.StackAr((int) '4');
        java.lang.String str86 = stackAr85.toString();
        boolean boolean87 = stackAr80.equals((java.lang.Object) stackAr85);
        stackAr85.push((java.lang.Object) 1.0f);
        boolean boolean90 = stackAr76.equals((java.lang.Object) stackAr85);
        int int91 = stackAr76.size();
        boolean boolean92 = stackAr35.equals((java.lang.Object) int91);
        boolean boolean93 = stackAr35.isEmpty();
        java.lang.String str94 = stackAr35.toString();
        java.lang.String str95 = stackAr35.toString();
        java.lang.Object obj96 = null;
        stackAr35.push(obj96);
        stackAr23.push(obj96);
        boolean boolean99 = stackAr1.equals((java.lang.Object) stackAr23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "[]" + "'", str81, "[]");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "[]" + "'", str86, "[]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "[]" + "'", str94, "[]");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "[]" + "'", str95, "[]");
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1702");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        boolean boolean4 = stackAr0.isFull();
        boolean boolean5 = stackAr0.isFull();
        boolean boolean6 = stackAr0.isFull();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        int int9 = stackAr8.size();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) 'a');
        stackAr11.push((java.lang.Object) 'a');
        java.lang.Object obj14 = stackAr11.top();
        boolean boolean15 = stackAr11.isEmpty();
        java.lang.Object obj16 = stackAr11.top();
        stackAr8.push(obj16);
        stackAr0.push((java.lang.Object) stackAr8);
        boolean boolean19 = stackAr0.isEmpty();
        java.lang.Object obj20 = stackAr0.top();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[a]");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1703");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        stackAr1.push((java.lang.Object) 'a');
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.String str6 = stackAr1.toString();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isFull();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        boolean boolean12 = stackAr10.equals((java.lang.Object) (-1.0f));
        boolean boolean14 = stackAr10.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        stackAr10.push((java.lang.Object) stackAr15);
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) 'a');
        java.lang.String str20 = stackAr19.toString();
        stackAr19.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) '4');
        java.lang.String str25 = stackAr24.toString();
        boolean boolean26 = stackAr19.equals((java.lang.Object) stackAr24);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) 'a');
        boolean boolean30 = stackAr28.equals((java.lang.Object) (-1.0f));
        boolean boolean32 = stackAr28.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        stackAr28.push((java.lang.Object) stackAr33);
        boolean boolean36 = stackAr24.equals((java.lang.Object) stackAr28);
        boolean boolean37 = stackAr15.equals((java.lang.Object) stackAr24);
        int int38 = stackAr15.size();
        boolean boolean39 = stackAr15.isEmpty();
        int int40 = stackAr15.size();
        boolean boolean42 = stackAr15.equals((java.lang.Object) (byte) 0);
        boolean boolean43 = stackAr1.equals((java.lang.Object) boolean42);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 'a' + "'", obj4, 'a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[a]" + "'", str6, "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[a]" + "'", str7, "[a]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1704");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean7 = stackAr1.equals((java.lang.Object) ' ');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr9.isEmpty();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean15 = stackAr14.isFull();
        java.lang.Class<?> wildcardClass16 = stackAr14.getClass();
        stackAr9.push((java.lang.Object) wildcardClass16);
        boolean boolean18 = stackAr8.equals((java.lang.Object) stackAr9);
        int int19 = stackAr8.size();
        stackAr1.push((java.lang.Object) stackAr8);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) 'a');
        java.lang.String str23 = stackAr22.toString();
        stackAr22.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '4');
        java.lang.String str28 = stackAr27.toString();
        boolean boolean29 = stackAr22.equals((java.lang.Object) stackAr27);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        int int32 = stackAr31.size();
        java.lang.Class<?> wildcardClass33 = stackAr31.getClass();
        stackAr27.push((java.lang.Object) stackAr31);
        int int35 = stackAr27.size();
        boolean boolean36 = stackAr27.isEmpty();
        int int37 = stackAr27.size();
        stackAr1.push((java.lang.Object) int37);
        boolean boolean39 = stackAr1.isFull();
        boolean boolean40 = stackAr1.isEmpty();
        boolean boolean41 = stackAr1.isEmpty();
        int int42 = stackAr1.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1705");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        boolean boolean12 = stackAr10.equals((java.lang.Object) (-1.0f));
        boolean boolean14 = stackAr10.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        stackAr10.push((java.lang.Object) stackAr15);
        boolean boolean18 = stackAr6.equals((java.lang.Object) stackAr10);
        java.lang.Object obj19 = stackAr10.top();
        boolean boolean20 = stackAr10.isEmpty();
        java.lang.Object obj21 = stackAr10.top();
        java.lang.String str22 = stackAr10.toString();
        java.lang.Object obj23 = stackAr10.top();
        boolean boolean24 = stackAr10.isEmpty();
        boolean boolean25 = stackAr10.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[[]]" + "'", str22, "[[]]");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1706");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        java.lang.String str6 = stackAr1.toString();
        boolean boolean7 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) 'a');
        java.lang.String str10 = stackAr9.toString();
        stackAr9.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        java.lang.String str15 = stackAr14.toString();
        boolean boolean16 = stackAr9.equals((java.lang.Object) stackAr14);
        java.lang.String str17 = stackAr14.toString();
        boolean boolean18 = stackAr14.isEmpty();
        boolean boolean19 = stackAr14.isFull();
        boolean boolean20 = stackAr14.isEmpty();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr(10);
        boolean boolean23 = stackAr14.equals((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean26 = stackAr25.isEmpty();
        int int27 = stackAr25.size();
        boolean boolean28 = stackAr25.isFull();
        boolean boolean29 = stackAr25.isFull();
        int int30 = stackAr25.size();
        int int31 = stackAr25.size();
        stackAr14.push((java.lang.Object) stackAr25);
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        boolean boolean36 = stackAr33.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) '4');
        boolean boolean39 = stackAr33.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) 'a');
        boolean boolean43 = stackAr41.equals((java.lang.Object) (-1.0f));
        boolean boolean45 = stackAr41.equals((java.lang.Object) "");
        boolean boolean46 = stackAr33.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean49 = stackAr48.isEmpty();
        boolean boolean50 = stackAr48.isEmpty();
        stackAr33.push((java.lang.Object) stackAr48);
        boolean boolean52 = stackAr33.isFull();
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) 'a');
        boolean boolean56 = stackAr54.equals((java.lang.Object) (-1.0f));
        java.lang.String str57 = stackAr54.toString();
        int int58 = stackAr54.size();
        stackAr33.push((java.lang.Object) int58);
        org.autotest.StackAr stackAr61 = new org.autotest.StackAr((int) ' ');
        boolean boolean62 = stackAr33.equals((java.lang.Object) ' ');
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr();
        boolean boolean64 = stackAr63.isFull();
        int int65 = stackAr63.size();
        boolean boolean66 = stackAr63.isEmpty();
        boolean boolean67 = stackAr63.isFull();
        boolean boolean68 = stackAr63.isFull();
        boolean boolean70 = stackAr63.equals((java.lang.Object) "[0.0,true]");
        stackAr33.push((java.lang.Object) stackAr63);
        stackAr14.push((java.lang.Object) stackAr63);
        stackAr1.push((java.lang.Object) stackAr63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[]" + "'", str57, "[]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1707");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        int int4 = stackAr0.size();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        int int7 = stackAr6.size();
        java.lang.Class<?> wildcardClass8 = stackAr6.getClass();
        boolean boolean9 = stackAr0.equals((java.lang.Object) stackAr6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackAr6.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1708");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr();
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean7 = stackAr6.isFull();
        java.lang.Class<?> wildcardClass8 = stackAr6.getClass();
        stackAr1.push((java.lang.Object) wildcardClass8);
        boolean boolean10 = stackAr0.equals((java.lang.Object) stackAr1);
        int int11 = stackAr0.size();
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean14 = stackAr13.isEmpty();
        boolean boolean15 = stackAr13.isFull();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
        boolean boolean17 = stackAr16.isFull();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean20 = stackAr19.isEmpty();
        boolean boolean21 = stackAr19.isFull();
        boolean boolean22 = stackAr16.equals((java.lang.Object) boolean21);
        boolean boolean23 = stackAr13.equals((java.lang.Object) stackAr16);
        boolean boolean24 = stackAr0.equals((java.lang.Object) boolean23);
        boolean boolean25 = stackAr0.isFull();
        java.lang.String str26 = stackAr0.toString();
        int int27 = stackAr0.size();
        java.lang.String str28 = stackAr0.toString();
        stackAr0.push((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1709");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        java.lang.String str11 = stackAr10.toString();
        stackAr10.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '4');
        java.lang.String str16 = stackAr15.toString();
        boolean boolean17 = stackAr10.equals((java.lang.Object) stackAr15);
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) 'a');
        boolean boolean21 = stackAr19.equals((java.lang.Object) (-1.0f));
        boolean boolean23 = stackAr19.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
        boolean boolean25 = stackAr24.isFull();
        stackAr19.push((java.lang.Object) stackAr24);
        boolean boolean27 = stackAr15.equals((java.lang.Object) stackAr19);
        boolean boolean28 = stackAr6.equals((java.lang.Object) stackAr15);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        int int31 = stackAr30.size();
        java.lang.String str32 = stackAr30.toString();
        int int33 = stackAr30.size();
        boolean boolean34 = stackAr30.isEmpty();
        java.lang.String str35 = stackAr30.toString();
        boolean boolean36 = stackAr30.isFull();
        stackAr6.push((java.lang.Object) boolean36);
        java.lang.String str38 = stackAr6.toString();
        org.autotest.StackAr stackAr40 = new org.autotest.StackAr((int) 'a');
        boolean boolean42 = stackAr40.equals((java.lang.Object) (-1.0f));
        boolean boolean44 = stackAr40.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr();
        boolean boolean46 = stackAr45.isFull();
        stackAr40.push((java.lang.Object) stackAr45);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) 'a');
        java.lang.String str50 = stackAr49.toString();
        stackAr49.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) '4');
        java.lang.String str55 = stackAr54.toString();
        boolean boolean56 = stackAr49.equals((java.lang.Object) stackAr54);
        org.autotest.StackAr stackAr58 = new org.autotest.StackAr((int) 'a');
        boolean boolean60 = stackAr58.equals((java.lang.Object) (-1.0f));
        boolean boolean62 = stackAr58.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr();
        boolean boolean64 = stackAr63.isFull();
        stackAr58.push((java.lang.Object) stackAr63);
        boolean boolean66 = stackAr54.equals((java.lang.Object) stackAr58);
        boolean boolean67 = stackAr45.equals((java.lang.Object) stackAr54);
        java.lang.Class<?> wildcardClass68 = stackAr45.getClass();
        boolean boolean69 = stackAr6.equals((java.lang.Object) wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[false]" + "'", str38, "[false]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[]" + "'", str50, "[]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[]" + "'", str55, "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1710");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        int int6 = stackAr5.size();
        int int7 = stackAr5.size();
        boolean boolean8 = stackAr5.isFull();
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
        stackAr5.push((java.lang.Object) stackAr9);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr();
        int int26 = stackAr25.size();
        int int27 = stackAr25.size();
        stackAr9.push((java.lang.Object) int27);
        boolean boolean29 = stackAr0.equals((java.lang.Object) int27);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        java.lang.String str32 = stackAr31.toString();
        java.lang.String str33 = stackAr31.toString();
        int int34 = stackAr31.size();
        boolean boolean35 = stackAr31.isFull();
        boolean boolean37 = stackAr31.equals((java.lang.Object) ' ');
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        stackAr31.push((java.lang.Object) wildcardClass39);
        stackAr0.push((java.lang.Object) wildcardClass39);
        boolean boolean43 = stackAr0.equals((java.lang.Object) 1.0d);
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean46 = stackAr45.isEmpty();
        int int47 = stackAr45.size();
        java.lang.String str48 = stackAr45.toString();
        boolean boolean49 = stackAr45.isEmpty();
        int int50 = stackAr45.size();
        boolean boolean51 = stackAr45.isEmpty();
        java.lang.Class<?> wildcardClass52 = stackAr45.getClass();
        stackAr0.push((java.lang.Object) wildcardClass52);
        java.lang.String str54 = stackAr0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[class java.lang.Object,class org.autotest.StackAr]" + "'", str54, "[class java.lang.Object,class org.autotest.StackAr]");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1711");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        java.lang.String str1 = stackAr0.toString();
        java.lang.String str2 = stackAr0.toString();
        boolean boolean3 = stackAr0.isEmpty();
        boolean boolean4 = stackAr0.isEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1712");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        java.lang.String str5 = stackAr1.toString();
        java.lang.Object obj6 = null;
        stackAr1.push(obj6);
        boolean boolean8 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1713");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean16 = stackAr15.isEmpty();
        boolean boolean17 = stackAr15.isEmpty();
        stackAr0.push((java.lang.Object) stackAr15);
        boolean boolean19 = stackAr0.isFull();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) 'a');
        java.lang.String str22 = stackAr21.toString();
        stackAr21.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) '4');
        java.lang.String str27 = stackAr26.toString();
        boolean boolean28 = stackAr21.equals((java.lang.Object) stackAr26);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        int int31 = stackAr30.size();
        java.lang.Class<?> wildcardClass32 = stackAr30.getClass();
        stackAr26.push((java.lang.Object) stackAr30);
        int int34 = stackAr26.size();
        boolean boolean35 = stackAr26.isEmpty();
        stackAr0.push((java.lang.Object) stackAr26);
        java.lang.String str37 = stackAr0.toString();
        boolean boolean38 = stackAr0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[[],[[]]]" + "'", str37, "[[],[[]]]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1714");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) (byte) -1);
        java.lang.String str7 = stackAr3.toString();
        boolean boolean9 = stackAr3.equals((java.lang.Object) 10L);
        java.lang.String str10 = stackAr3.toString();
        java.lang.Class<?> wildcardClass11 = stackAr3.getClass();
        boolean boolean12 = stackAr0.equals((java.lang.Object) wildcardClass11);
        java.lang.String str13 = stackAr0.toString();
        java.lang.String str14 = stackAr0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1715");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        java.lang.String str6 = stackAr5.toString();
        stackAr5.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        java.lang.String str11 = stackAr10.toString();
        boolean boolean12 = stackAr5.equals((java.lang.Object) stackAr10);
        stackAr10.push((java.lang.Object) 1.0f);
        boolean boolean15 = stackAr1.equals((java.lang.Object) stackAr10);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        java.lang.String str18 = stackAr17.toString();
        stackAr17.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        java.lang.String str23 = stackAr22.toString();
        boolean boolean24 = stackAr17.equals((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) 'a');
        boolean boolean28 = stackAr26.equals((java.lang.Object) (-1.0f));
        boolean boolean30 = stackAr26.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        boolean boolean32 = stackAr31.isFull();
        stackAr26.push((java.lang.Object) stackAr31);
        boolean boolean34 = stackAr22.equals((java.lang.Object) stackAr26);
        boolean boolean35 = stackAr10.equals((java.lang.Object) stackAr22);
        boolean boolean36 = stackAr22.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = stackAr22.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1716");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        boolean boolean12 = stackAr10.equals((java.lang.Object) (-1.0f));
        boolean boolean14 = stackAr10.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        stackAr10.push((java.lang.Object) stackAr15);
        boolean boolean18 = stackAr6.equals((java.lang.Object) stackAr10);
        java.lang.Object obj19 = stackAr10.top();
        java.lang.Object obj20 = stackAr10.top();
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
        boolean boolean36 = stackAr21.isEmpty();
        boolean boolean37 = stackAr10.equals((java.lang.Object) stackAr21);
        java.lang.String str38 = stackAr21.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[]");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1717");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean5 = stackAr4.isFull();
        boolean boolean6 = stackAr1.equals((java.lang.Object) stackAr4);
        int int7 = stackAr4.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) 'a');
        java.lang.String str10 = stackAr9.toString();
        stackAr9.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean15 = stackAr14.isFull();
        boolean boolean16 = stackAr14.isEmpty();
        stackAr9.push((java.lang.Object) boolean16);
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) '4');
        int int20 = stackAr19.size();
        java.lang.String str21 = stackAr19.toString();
        int int22 = stackAr19.size();
        boolean boolean23 = stackAr19.isEmpty();
        java.lang.String str24 = stackAr19.toString();
        boolean boolean25 = stackAr19.isFull();
        boolean boolean26 = stackAr9.equals((java.lang.Object) boolean25);
        stackAr4.push((java.lang.Object) boolean25);
        java.lang.String str28 = stackAr4.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[false]" + "'", str28, "[false]");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1718");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) (byte) -1);
        java.lang.String str7 = stackAr3.toString();
        boolean boolean9 = stackAr3.equals((java.lang.Object) 10L);
        java.lang.String str10 = stackAr3.toString();
        java.lang.Class<?> wildcardClass11 = stackAr3.getClass();
        boolean boolean12 = stackAr0.equals((java.lang.Object) wildcardClass11);
        java.lang.String str13 = stackAr0.toString();
        java.lang.Class<?> wildcardClass14 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1719");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 100);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.String str4 = stackAr1.toString();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        boolean boolean8 = stackAr5.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        boolean boolean11 = stackAr5.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) 'a');
        boolean boolean15 = stackAr13.equals((java.lang.Object) (-1.0f));
        boolean boolean17 = stackAr13.equals((java.lang.Object) "");
        boolean boolean18 = stackAr5.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean21 = stackAr20.isEmpty();
        boolean boolean22 = stackAr20.isEmpty();
        stackAr5.push((java.lang.Object) stackAr20);
        boolean boolean24 = stackAr5.isFull();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) 'a');
        java.lang.String str27 = stackAr26.toString();
        stackAr26.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        java.lang.String str32 = stackAr31.toString();
        boolean boolean33 = stackAr26.equals((java.lang.Object) stackAr31);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) '4');
        int int36 = stackAr35.size();
        java.lang.Class<?> wildcardClass37 = stackAr35.getClass();
        stackAr31.push((java.lang.Object) stackAr35);
        int int39 = stackAr31.size();
        boolean boolean40 = stackAr31.isEmpty();
        stackAr5.push((java.lang.Object) stackAr31);
        boolean boolean42 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj44 = stackAr5.top();
        int int45 = stackAr5.size();
        java.lang.Object obj46 = stackAr5.top();
        boolean boolean47 = stackAr5.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "[[]]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "[[]]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1720");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean4 = stackAr3.isEmpty();
        boolean boolean5 = stackAr3.isFull();
        boolean boolean6 = stackAr0.equals((java.lang.Object) boolean5);
        boolean boolean7 = stackAr0.isFull();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        boolean boolean14 = stackAr8.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        boolean boolean21 = stackAr8.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean24 = stackAr23.isEmpty();
        boolean boolean25 = stackAr23.isEmpty();
        stackAr8.push((java.lang.Object) stackAr23);
        stackAr8.push((java.lang.Object) 1.0f);
        boolean boolean29 = stackAr0.equals((java.lang.Object) stackAr8);
        boolean boolean30 = stackAr0.isFull();
        boolean boolean31 = stackAr0.isEmpty();
        boolean boolean32 = stackAr0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1721");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean16 = stackAr15.isEmpty();
        boolean boolean17 = stackAr15.isEmpty();
        stackAr0.push((java.lang.Object) stackAr15);
        boolean boolean19 = stackAr15.isFull();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean22 = stackAr21.isEmpty();
        boolean boolean23 = stackAr21.isFull();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
        boolean boolean25 = stackAr24.isFull();
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean28 = stackAr27.isEmpty();
        boolean boolean29 = stackAr27.isFull();
        boolean boolean30 = stackAr24.equals((java.lang.Object) boolean29);
        boolean boolean31 = stackAr21.equals((java.lang.Object) stackAr24);
        java.lang.String str32 = stackAr24.toString();
        boolean boolean33 = stackAr15.equals((java.lang.Object) stackAr24);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean36 = stackAr35.isFull();
        int int37 = stackAr35.size();
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) 'a');
        java.lang.String str40 = stackAr39.toString();
        stackAr39.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) '4');
        java.lang.String str45 = stackAr44.toString();
        boolean boolean46 = stackAr39.equals((java.lang.Object) stackAr44);
        stackAr44.push((java.lang.Object) 1.0f);
        boolean boolean49 = stackAr35.equals((java.lang.Object) stackAr44);
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) 'a');
        java.lang.String str52 = stackAr51.toString();
        stackAr51.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr56 = new org.autotest.StackAr((int) '4');
        java.lang.String str57 = stackAr56.toString();
        boolean boolean58 = stackAr51.equals((java.lang.Object) stackAr56);
        org.autotest.StackAr stackAr60 = new org.autotest.StackAr((int) 'a');
        boolean boolean62 = stackAr60.equals((java.lang.Object) (-1.0f));
        boolean boolean64 = stackAr60.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr65 = new org.autotest.StackAr();
        boolean boolean66 = stackAr65.isFull();
        stackAr60.push((java.lang.Object) stackAr65);
        boolean boolean68 = stackAr56.equals((java.lang.Object) stackAr60);
        boolean boolean69 = stackAr44.equals((java.lang.Object) stackAr56);
        boolean boolean70 = stackAr44.isFull();
        boolean boolean71 = stackAr24.equals((java.lang.Object) boolean70);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[]" + "'", str57, "[]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1722");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        boolean boolean8 = stackAr5.isEmpty();
        stackAr4.push((java.lang.Object) stackAr5);
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr5);
        boolean boolean11 = stackAr5.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackAr5.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1723");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        stackAr11.push((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = stackAr11.equals(obj16);
        boolean boolean18 = stackAr11.isEmpty();
        boolean boolean19 = stackAr11.isEmpty();
        java.lang.String str20 = stackAr11.toString();
        stackAr1.push((java.lang.Object) str20);
        java.lang.String str22 = stackAr1.toString();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) '4');
        int int25 = stackAr24.size();
        java.lang.String str26 = stackAr24.toString();
        int int27 = stackAr24.size();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
        boolean boolean29 = stackAr28.isFull();
        boolean boolean31 = stackAr28.equals((java.lang.Object) (byte) -1);
        boolean boolean32 = stackAr24.equals((java.lang.Object) (byte) -1);
        java.lang.Object obj33 = null;
        stackAr24.push(obj33);
        int int35 = stackAr24.size();
        stackAr1.push((java.lang.Object) int35);
        int int37 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[0]" + "'", str20, "[0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[0,[0]]" + "'", str22, "[0,[0]]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1724");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
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
        stackAr1.push((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        boolean boolean22 = stackAr21.isFull();
        int int23 = stackAr21.size();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) (short) 0);
        stackAr21.push((java.lang.Object) (short) 0);
        java.lang.String str27 = stackAr21.toString();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
        boolean boolean29 = stackAr28.isFull();
        int int30 = stackAr28.size();
        boolean boolean31 = stackAr28.isEmpty();
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean34 = stackAr33.isFull();
        java.lang.Class<?> wildcardClass35 = stackAr33.getClass();
        stackAr28.push((java.lang.Object) wildcardClass35);
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean39 = stackAr38.isEmpty();
        java.lang.Class<?> wildcardClass40 = stackAr38.getClass();
        boolean boolean41 = stackAr28.equals((java.lang.Object) wildcardClass40);
        boolean boolean42 = stackAr21.equals((java.lang.Object) boolean41);
        java.lang.Object obj43 = stackAr21.top();
        stackAr1.push(obj43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[0]" + "'", str27, "[0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) 0 + "'", obj43, (short) 0);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1725");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        java.lang.String str6 = stackAr5.toString();
        stackAr5.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        java.lang.String str11 = stackAr10.toString();
        boolean boolean12 = stackAr5.equals((java.lang.Object) stackAr10);
        stackAr10.push((java.lang.Object) 1.0f);
        boolean boolean15 = stackAr1.equals((java.lang.Object) stackAr10);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        java.lang.String str18 = stackAr17.toString();
        stackAr17.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        java.lang.String str23 = stackAr22.toString();
        boolean boolean24 = stackAr17.equals((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) 'a');
        boolean boolean28 = stackAr26.equals((java.lang.Object) (-1.0f));
        boolean boolean30 = stackAr26.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        boolean boolean32 = stackAr31.isFull();
        stackAr26.push((java.lang.Object) stackAr31);
        boolean boolean34 = stackAr22.equals((java.lang.Object) stackAr26);
        boolean boolean35 = stackAr10.equals((java.lang.Object) stackAr22);
        boolean boolean36 = stackAr10.isEmpty();
        java.lang.String str37 = stackAr10.toString();
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr();
        boolean boolean40 = stackAr39.isFull();
        int int41 = stackAr39.size();
        boolean boolean42 = stackAr39.isEmpty();
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean45 = stackAr44.isFull();
        java.lang.Class<?> wildcardClass46 = stackAr44.getClass();
        stackAr39.push((java.lang.Object) wildcardClass46);
        boolean boolean48 = stackAr38.equals((java.lang.Object) stackAr39);
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean51 = stackAr50.isEmpty();
        boolean boolean52 = stackAr50.isEmpty();
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass54 = stackAr53.getClass();
        boolean boolean55 = stackAr50.equals((java.lang.Object) stackAr53);
        java.lang.Class<?> wildcardClass56 = stackAr53.getClass();
        stackAr38.push((java.lang.Object) wildcardClass56);
        java.lang.Object obj58 = stackAr38.top();
        boolean boolean59 = stackAr38.isEmpty();
        java.lang.Object obj60 = stackAr38.top();
        java.lang.String str61 = stackAr38.toString();
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr((int) 'a');
        boolean boolean65 = stackAr63.equals((java.lang.Object) (-1.0f));
        int int66 = stackAr63.size();
        org.autotest.StackAr stackAr67 = new org.autotest.StackAr();
        boolean boolean68 = stackAr67.isFull();
        int int69 = stackAr67.size();
        boolean boolean70 = stackAr67.isEmpty();
        org.autotest.StackAr stackAr72 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean73 = stackAr72.isFull();
        java.lang.Class<?> wildcardClass74 = stackAr72.getClass();
        stackAr67.push((java.lang.Object) wildcardClass74);
        boolean boolean76 = stackAr63.equals((java.lang.Object) stackAr67);
        org.autotest.StackAr stackAr78 = new org.autotest.StackAr((int) '4');
        java.lang.String str79 = stackAr78.toString();
        boolean boolean80 = stackAr78.isEmpty();
        boolean boolean81 = stackAr78.isFull();
        boolean boolean82 = stackAr67.equals((java.lang.Object) boolean81);
        java.lang.String str83 = stackAr67.toString();
        boolean boolean84 = stackAr38.equals((java.lang.Object) str83);
        stackAr10.push((java.lang.Object) boolean84);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[1.0]" + "'", str37, "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertEquals(obj58.toString(), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj58), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj58), "class org.autotest.StackAr");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[class org.autotest.StackAr]" + "'", str61, "[class org.autotest.StackAr]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "[]" + "'", str79, "[]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "[class org.autotest.StackAr]" + "'", str83, "[class org.autotest.StackAr]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1726");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        boolean boolean9 = stackAr6.isEmpty();
        boolean boolean10 = stackAr6.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackAr6.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1727");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 100);
        boolean boolean7 = stackAr1.equals((java.lang.Object) stackAr6);
        boolean boolean8 = stackAr6.isEmpty();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        boolean boolean12 = stackAr9.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        boolean boolean15 = stackAr9.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (-1.0f));
        boolean boolean21 = stackAr17.equals((java.lang.Object) "");
        boolean boolean22 = stackAr9.equals((java.lang.Object) "");
        java.lang.String str23 = stackAr9.toString();
        java.lang.String str24 = stackAr9.toString();
        stackAr6.push((java.lang.Object) stackAr9);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean28 = stackAr27.isEmpty();
        boolean boolean29 = stackAr27.isEmpty();
        java.lang.String str30 = stackAr27.toString();
        java.lang.String str31 = stackAr27.toString();
        java.lang.String str32 = stackAr27.toString();
        boolean boolean33 = stackAr6.equals((java.lang.Object) stackAr27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1728");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        stackAr1.push((java.lang.Object) 'a');
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Object obj6 = stackAr1.top();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        java.lang.String str9 = stackAr8.toString();
        stackAr8.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        java.lang.String str14 = stackAr13.toString();
        boolean boolean15 = stackAr8.equals((java.lang.Object) stackAr13);
        boolean boolean16 = stackAr1.equals((java.lang.Object) stackAr8);
        boolean boolean17 = stackAr1.isFull();
        boolean boolean18 = stackAr1.isFull();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 'a' + "'", obj4, 'a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1729");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 1);
        stackAr1.push((java.lang.Object) (short) 1);
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        java.lang.String str9 = stackAr8.toString();
        stackAr8.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        java.lang.String str14 = stackAr13.toString();
        boolean boolean15 = stackAr8.equals((java.lang.Object) stackAr13);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (-1.0f));
        boolean boolean21 = stackAr17.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr();
        boolean boolean23 = stackAr22.isFull();
        stackAr17.push((java.lang.Object) stackAr22);
        boolean boolean25 = stackAr13.equals((java.lang.Object) stackAr17);
        java.lang.Object obj26 = stackAr17.top();
        boolean boolean27 = stackAr17.isEmpty();
        java.lang.Object obj28 = stackAr17.top();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        int int31 = stackAr30.size();
        java.lang.String str32 = stackAr30.toString();
        int int33 = stackAr30.size();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr();
        boolean boolean35 = stackAr34.isFull();
        boolean boolean37 = stackAr34.equals((java.lang.Object) (byte) -1);
        boolean boolean38 = stackAr30.equals((java.lang.Object) (byte) -1);
        java.lang.String str39 = stackAr30.toString();
        int int40 = stackAr30.size();
        stackAr17.push((java.lang.Object) stackAr30);
        stackAr1.push((java.lang.Object) stackAr30);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) '4');
        java.lang.String str45 = stackAr44.toString();
        boolean boolean46 = stackAr44.isEmpty();
        boolean boolean47 = stackAr44.isFull();
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr();
        boolean boolean49 = stackAr48.isFull();
        int int50 = stackAr48.size();
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr((int) (short) 0);
        stackAr48.push((java.lang.Object) (short) 0);
        stackAr44.push((java.lang.Object) (short) 0);
        java.lang.Object obj55 = stackAr44.top();
        boolean boolean56 = stackAr44.isFull();
        stackAr30.push((java.lang.Object) boolean56);
        org.autotest.StackAr stackAr58 = new org.autotest.StackAr();
        boolean boolean59 = stackAr58.isFull();
        org.autotest.StackAr stackAr61 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean62 = stackAr61.isEmpty();
        boolean boolean63 = stackAr61.isFull();
        boolean boolean64 = stackAr58.equals((java.lang.Object) boolean63);
        boolean boolean65 = stackAr30.equals((java.lang.Object) stackAr58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj66 = stackAr58.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (short) 0 + "'", obj55, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1730");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 100);
        boolean boolean7 = stackAr1.equals((java.lang.Object) stackAr6);
        int int8 = stackAr1.size();
        boolean boolean9 = stackAr1.isFull();
        java.lang.String str10 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1731");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        stackAr0.push((java.lang.Object) (byte) 0);
        int int16 = stackAr0.size();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean19 = stackAr18.isFull();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) 'a');
        boolean boolean23 = stackAr21.equals((java.lang.Object) (-1.0f));
        boolean boolean25 = stackAr21.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        stackAr21.push((java.lang.Object) stackAr26);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) 'a');
        java.lang.String str31 = stackAr30.toString();
        stackAr30.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) '4');
        java.lang.String str36 = stackAr35.toString();
        boolean boolean37 = stackAr30.equals((java.lang.Object) stackAr35);
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) 'a');
        boolean boolean41 = stackAr39.equals((java.lang.Object) (-1.0f));
        boolean boolean43 = stackAr39.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr();
        boolean boolean45 = stackAr44.isFull();
        stackAr39.push((java.lang.Object) stackAr44);
        boolean boolean47 = stackAr35.equals((java.lang.Object) stackAr39);
        boolean boolean48 = stackAr26.equals((java.lang.Object) stackAr35);
        boolean boolean49 = stackAr26.isEmpty();
        int int50 = stackAr26.size();
        boolean boolean51 = stackAr18.equals((java.lang.Object) int50);
        boolean boolean52 = stackAr0.equals((java.lang.Object) boolean51);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1732");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
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
        stackAr1.push((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        int int22 = stackAr21.size();
        int int23 = stackAr21.size();
        stackAr5.push((java.lang.Object) int23);
        int int25 = stackAr5.size();
        boolean boolean26 = stackAr5.isEmpty();
        java.lang.Class<?> wildcardClass27 = stackAr5.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1733");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.String str6 = stackAr1.toString();
        java.lang.String str7 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1734");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 100);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.String str4 = stackAr1.toString();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        boolean boolean8 = stackAr5.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        boolean boolean11 = stackAr5.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) 'a');
        boolean boolean15 = stackAr13.equals((java.lang.Object) (-1.0f));
        boolean boolean17 = stackAr13.equals((java.lang.Object) "");
        boolean boolean18 = stackAr5.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean21 = stackAr20.isEmpty();
        boolean boolean22 = stackAr20.isEmpty();
        stackAr5.push((java.lang.Object) stackAr20);
        boolean boolean24 = stackAr5.isFull();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) 'a');
        java.lang.String str27 = stackAr26.toString();
        stackAr26.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        java.lang.String str32 = stackAr31.toString();
        boolean boolean33 = stackAr26.equals((java.lang.Object) stackAr31);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) '4');
        int int36 = stackAr35.size();
        java.lang.Class<?> wildcardClass37 = stackAr35.getClass();
        stackAr31.push((java.lang.Object) stackAr35);
        int int39 = stackAr31.size();
        boolean boolean40 = stackAr31.isEmpty();
        stackAr5.push((java.lang.Object) stackAr31);
        boolean boolean42 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj44 = stackAr5.top();
        java.lang.Class<?> wildcardClass45 = stackAr5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "[[]]");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1735");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        int int8 = stackAr6.size();
        boolean boolean9 = stackAr6.isEmpty();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean12 = stackAr11.isFull();
        java.lang.Class<?> wildcardClass13 = stackAr11.getClass();
        stackAr6.push((java.lang.Object) wildcardClass13);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean17 = stackAr16.isEmpty();
        java.lang.Class<?> wildcardClass18 = stackAr16.getClass();
        boolean boolean19 = stackAr6.equals((java.lang.Object) wildcardClass18);
        boolean boolean20 = stackAr6.isFull();
        boolean boolean21 = stackAr6.isEmpty();
        java.lang.Object obj22 = stackAr6.top();
        int int23 = stackAr6.size();
        java.lang.String str24 = stackAr6.toString();
        stackAr1.push((java.lang.Object) str24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class org.autotest.StackAr");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[class org.autotest.StackAr]" + "'", str24, "[class org.autotest.StackAr]");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1736");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        boolean boolean9 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) 'a');
        java.lang.String str12 = stackAr11.toString();
        stackAr11.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        java.lang.String str17 = stackAr16.toString();
        boolean boolean18 = stackAr11.equals((java.lang.Object) stackAr16);
        stackAr16.push((java.lang.Object) 1.0f);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        boolean boolean22 = stackAr21.isFull();
        boolean boolean24 = stackAr21.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) '4');
        boolean boolean27 = stackAr21.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) 'a');
        boolean boolean31 = stackAr29.equals((java.lang.Object) (-1.0f));
        boolean boolean33 = stackAr29.equals((java.lang.Object) "");
        boolean boolean34 = stackAr21.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean37 = stackAr36.isEmpty();
        boolean boolean38 = stackAr36.isEmpty();
        stackAr21.push((java.lang.Object) stackAr36);
        boolean boolean40 = stackAr36.isFull();
        boolean boolean41 = stackAr16.equals((java.lang.Object) boolean40);
        java.lang.Object obj42 = stackAr16.top();
        boolean boolean43 = stackAr1.equals((java.lang.Object) stackAr16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1.0f + "'", obj42, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1737");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 100);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1738");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        int int8 = stackAr7.size();
        boolean boolean9 = stackAr7.isEmpty();
        stackAr7.push((java.lang.Object) (byte) 0);
        java.lang.String str12 = stackAr7.toString();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        int int15 = stackAr14.size();
        int int16 = stackAr14.size();
        boolean boolean17 = stackAr14.isFull();
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
        stackAr14.push((java.lang.Object) stackAr18);
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr();
        int int35 = stackAr34.size();
        int int36 = stackAr34.size();
        stackAr18.push((java.lang.Object) int36);
        boolean boolean38 = stackAr18.isFull();
        stackAr7.push((java.lang.Object) stackAr18);
        boolean boolean40 = stackAr18.isEmpty();
        stackAr1.push((java.lang.Object) stackAr18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0]" + "'", str12, "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1739");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        java.lang.String str1 = stackAr0.toString();
        boolean boolean2 = stackAr0.isEmpty();
        java.lang.Object obj3 = null;
        stackAr0.push(obj3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1740");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        int int6 = stackAr5.size();
        java.lang.String str7 = stackAr5.toString();
        int int8 = stackAr5.size();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr5.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean14 = stackAr13.isFull();
        boolean boolean15 = stackAr13.isEmpty();
        java.lang.String str16 = stackAr13.toString();
        int int17 = stackAr13.size();
        java.lang.String str18 = stackAr13.toString();
        stackAr5.push((java.lang.Object) stackAr13);
        stackAr1.push((java.lang.Object) stackAr13);
        boolean boolean21 = stackAr13.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1741");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) 'a');
        boolean boolean8 = stackAr6.equals((java.lang.Object) (-1.0f));
        int int9 = stackAr6.size();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
        boolean boolean11 = stackAr10.isFull();
        int int12 = stackAr10.size();
        boolean boolean13 = stackAr10.isEmpty();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean16 = stackAr15.isFull();
        java.lang.Class<?> wildcardClass17 = stackAr15.getClass();
        stackAr10.push((java.lang.Object) wildcardClass17);
        boolean boolean19 = stackAr6.equals((java.lang.Object) stackAr10);
        boolean boolean20 = stackAr6.isFull();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        java.lang.String str22 = stackAr21.toString();
        java.lang.String str23 = stackAr21.toString();
        boolean boolean24 = stackAr21.isEmpty();
        stackAr6.push((java.lang.Object) stackAr21);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '4');
        int int28 = stackAr27.size();
        int int29 = stackAr27.size();
        boolean boolean30 = stackAr27.isFull();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        boolean boolean32 = stackAr31.isFull();
        boolean boolean34 = stackAr31.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) '4');
        boolean boolean37 = stackAr31.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) 'a');
        boolean boolean41 = stackAr39.equals((java.lang.Object) (-1.0f));
        boolean boolean43 = stackAr39.equals((java.lang.Object) "");
        boolean boolean44 = stackAr31.equals((java.lang.Object) "");
        boolean boolean45 = stackAr31.isFull();
        stackAr27.push((java.lang.Object) stackAr31);
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr(0);
        boolean boolean49 = stackAr27.equals((java.lang.Object) stackAr48);
        boolean boolean50 = stackAr27.isEmpty();
        java.lang.Object obj51 = stackAr27.top();
        stackAr6.push((java.lang.Object) stackAr27);
        boolean boolean53 = stackAr1.equals((java.lang.Object) stackAr6);
        int int54 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1742");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        stackAr11.push((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = stackAr11.equals(obj16);
        boolean boolean18 = stackAr11.isEmpty();
        boolean boolean19 = stackAr11.isEmpty();
        java.lang.String str20 = stackAr11.toString();
        stackAr1.push((java.lang.Object) str20);
        boolean boolean22 = stackAr1.isFull();
        int int23 = stackAr1.size();
        boolean boolean24 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[0]" + "'", str20, "[0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1743");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        stackAr1.push((java.lang.Object) 'a');
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        int int6 = stackAr1.size();
        boolean boolean7 = stackAr1.isFull();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        int int10 = stackAr8.size();
        boolean boolean11 = stackAr8.isEmpty();
        boolean boolean12 = stackAr8.isFull();
        boolean boolean13 = stackAr1.equals((java.lang.Object) boolean12);
        int int14 = stackAr1.size();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        java.lang.String str17 = stackAr16.toString();
        stackAr16.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) 'a');
        boolean boolean25 = stackAr23.equals((java.lang.Object) (-1.0f));
        boolean boolean27 = stackAr23.equals((java.lang.Object) "");
        stackAr23.push((java.lang.Object) (-1.0d));
        stackAr21.push((java.lang.Object) (-1.0d));
        boolean boolean31 = stackAr16.equals((java.lang.Object) (-1.0d));
        boolean boolean32 = stackAr16.isEmpty();
        boolean boolean33 = stackAr1.equals((java.lang.Object) stackAr16);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 'a' + "'", obj4, 'a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1744");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        stackAr6.push((java.lang.Object) 1.0f);
        int int11 = stackAr6.size();
        boolean boolean12 = stackAr6.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1745");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr();
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean7 = stackAr6.isFull();
        java.lang.Class<?> wildcardClass8 = stackAr6.getClass();
        stackAr1.push((java.lang.Object) wildcardClass8);
        boolean boolean10 = stackAr0.equals((java.lang.Object) stackAr1);
        int int11 = stackAr0.size();
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean14 = stackAr13.isEmpty();
        boolean boolean15 = stackAr13.isFull();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
        boolean boolean17 = stackAr16.isFull();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean20 = stackAr19.isEmpty();
        boolean boolean21 = stackAr19.isFull();
        boolean boolean22 = stackAr16.equals((java.lang.Object) boolean21);
        boolean boolean23 = stackAr13.equals((java.lang.Object) stackAr16);
        boolean boolean24 = stackAr0.equals((java.lang.Object) boolean23);
        java.lang.String str25 = stackAr0.toString();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        int int28 = stackAr26.size();
        boolean boolean29 = stackAr26.isFull();
        int int30 = stackAr26.size();
        stackAr0.push((java.lang.Object) stackAr26);
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean34 = stackAr33.isFull();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean37 = stackAr36.isFull();
        boolean boolean38 = stackAr33.equals((java.lang.Object) stackAr36);
        int int39 = stackAr36.size();
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) '4');
        java.lang.String str42 = stackAr41.toString();
        java.lang.String str43 = stackAr41.toString();
        stackAr36.push((java.lang.Object) stackAr41);
        stackAr0.push((java.lang.Object) stackAr41);
        java.lang.String str46 = stackAr41.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = stackAr41.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[]" + "'", str46, "[]");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1746");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        int int11 = stackAr10.size();
        java.lang.Class<?> wildcardClass12 = stackAr10.getClass();
        stackAr6.push((java.lang.Object) stackAr10);
        boolean boolean14 = stackAr6.isEmpty();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) ' ');
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        boolean boolean19 = stackAr18.isFull();
        int int20 = stackAr18.size();
        boolean boolean21 = stackAr18.isEmpty();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean24 = stackAr23.isFull();
        java.lang.Class<?> wildcardClass25 = stackAr23.getClass();
        stackAr18.push((java.lang.Object) wildcardClass25);
        boolean boolean27 = stackAr17.equals((java.lang.Object) stackAr18);
        java.lang.Class<?> wildcardClass28 = stackAr17.getClass();
        stackAr16.push((java.lang.Object) stackAr17);
        boolean boolean30 = stackAr16.isEmpty();
        java.lang.Class<?> wildcardClass31 = stackAr16.getClass();
        boolean boolean32 = stackAr6.equals((java.lang.Object) stackAr16);
        int int33 = stackAr6.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1747");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        java.lang.String str4 = stackAr1.toString();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean8 = stackAr7.isEmpty();
        boolean boolean10 = stackAr7.equals((java.lang.Object) 0);
        java.lang.String str11 = stackAr7.toString();
        stackAr1.push((java.lang.Object) stackAr7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test1748");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean8 = stackAr7.isFull();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean11 = stackAr10.isFull();
        boolean boolean12 = stackAr7.equals((java.lang.Object) stackAr10);
        java.lang.Class<?> wildcardClass13 = stackAr10.getClass();
        boolean boolean14 = stackAr1.equals((java.lang.Object) wildcardClass13);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        int int17 = stackAr16.size();
        int int18 = stackAr16.size();
        boolean boolean19 = stackAr16.isFull();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        boolean boolean21 = stackAr20.isFull();
        boolean boolean23 = stackAr20.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        boolean boolean26 = stackAr20.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) 'a');
        boolean boolean30 = stackAr28.equals((java.lang.Object) (-1.0f));
        boolean boolean32 = stackAr28.equals((java.lang.Object) "");
        boolean boolean33 = stackAr20.equals((java.lang.Object) "");
        boolean boolean34 = stackAr20.isFull();
        stackAr16.push((java.lang.Object) stackAr20);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr(0);
        boolean boolean38 = stackAr16.equals((java.lang.Object) stackAr37);
        boolean boolean39 = stackAr1.equals((java.lang.Object) stackAr37);
        boolean boolean40 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean43 = stackAr42.isFull();
        int int44 = stackAr42.size();
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr((int) 'a');
        java.lang.String str47 = stackAr46.toString();
        stackAr46.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) '4');
        java.lang.String str52 = stackAr51.toString();
        boolean boolean53 = stackAr46.equals((java.lang.Object) stackAr51);
        stackAr51.push((java.lang.Object) 1.0f);
        boolean boolean56 = stackAr42.equals((java.lang.Object) stackAr51);
        int int57 = stackAr42.size();
        boolean boolean58 = stackAr1.equals((java.lang.Object) int57);
        boolean boolean59 = stackAr1.isEmpty();
        int int60 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }
}

