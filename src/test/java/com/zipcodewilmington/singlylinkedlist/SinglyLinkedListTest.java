package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList testList;


//    @Test
//    public void add() {
//        //GIVEN
//        testList = new SinglyLinkedList(1);
//
//        //WHEN
//        int expected = 5;
//        testList.add(2);
//        testList.add(3);
//        testList.add(4);
//        int actual = testList.size();
//        //THEN
//        Assert.assertEquals(expected,actual);
//    }

    @Test
    public void remove() {
        //GIVEN
        testList = new SinglyLinkedList(1);

        //WHEN
        testList.add("Burger");
        testList.add("Pizza");
        testList.add("Pasta");
        testList.add("Fries");
        Object expected = testList.getTheElement(3);

        testList.remove(2);
        Object actual = testList.getNode(2).getTheElement();

        //THEN
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void contains() {
        //GIVEN
        testList = new SinglyLinkedList(1);
        //WHEN
        testList.add(2);
        testList.add(3);
        testList.add(4);

        //THEN
        Assert.assertFalse(testList.contains(5));
    }
    @Test
    public void containsTest2() {

        testList = new SinglyLinkedList(1);

        testList.add("Burger");
        testList.add("Pizza");
        testList.add("Pasta");

        Assert.assertTrue(testList.contains("Burger"));
    }
//    @Test
//    public void find() {
//        //GIVEN
//        testList = new SinglyLinkedList(1);
//        //WHEN
//        testList.add(2);
//        testList.add(3);
//        testList.add(4);
//        Integer expected =3;
//        Integer actual = testList.find(4);
//        //THEN
//        Assert.assertEquals(expected, actual);


    @Test
    public void size() {
        //GIVEN
        testList = new SinglyLinkedList(1);
        //WHEN
        int expected = 2;
        int actual = testList.size();
        //THEN
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNode() {
        //GIVEN
        testList = new SinglyLinkedList(1);
        //WHEN
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        Object expected = 4;
        Object actual = testList.getNode(3).getTheElement();

        //THEN
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void copy() {
        //GIVEN
        testList = new SinglyLinkedList(1);
        //WHEN
        testList.add("Burger");
        testList.add("Pizza");

        SinglyLinkedList copyList = testList.copy(testList);
        Object expected = testList.getTheElement(1);
        Object actual = copyList.getTheElement(1);
        //THEN
        Assert.assertEquals(expected, actual);
    }
        @Test
        public void getTheElement () {
            //GIVEN
            testList = new SinglyLinkedList(1);
            //WHEN
            testList.add(2);
            testList.add(3);
            Object expected = 2;
            Object actual = testList.getTheElement(1);
            //THEN
            Assert.assertEquals(expected, actual);
        }

    @Test
    public void add1() {
        //GIVEN
        testList = new SinglyLinkedList(1);

        //WHEN
        int expected = 5;
        testList.add(2);
        testList.add(3);
        testList.add(4);
        int actual = testList.size();
        //THEN
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void find1() {
        //GIVEN
        testList = new SinglyLinkedList(1);
        //WHEN
        testList.add(2);
        testList.add(3);
        testList.add(4);
        Integer expected =3;
        Integer actual = testList.find(4);
        //THEN
        Assert.assertEquals(expected, actual);
    }
}
