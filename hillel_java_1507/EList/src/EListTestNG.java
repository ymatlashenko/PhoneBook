

import org.testng.annotations.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.testng.annotations.DataProvider;

public class EListTestNG {
  @DataProvider
  public Object[][] getData()
  {
   return new Object[][] { 
    { new AList0() }, 
    { new AList1() },
    { new AList2() }, 
    { new LList1() }, 
    { new LList2() }, 
   };
  }

  @Test (dataProvider = "getData") 
  public void size_1(EList rr)
  {
   int[] zz = {10};

   rr.init(zz);
   int res = rr.size();
   assertEquals(1, res);
  }

  @Test (dataProvider = "getData")
  public void size_2(EList rr)
  {
   int[] zz = {10,20};

   rr.init(zz);
   int act = rr.size();
   assertEquals(2, act);
  }

  @Test (dataProvider = "getData")
  public void size_many_7(EList rr)
  {
   int[] zz = { 10, 20, 77, 11, 24, 99, 32 };

   rr.init(zz);
   int res = rr.size();
   assertEquals(7, res);
  }
  @Test (dataProvider = "getData")

  public void size_many_8(EList rr)
  {
   int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0 };

   rr.init(zz);
   int res = rr.size();
   assertEquals(8, res);
  }

 //==============================================
 //init
 //============================================== 
 @Test (dataProvider = "getData")
 public void testInit(EList rr) 
 {
  int[] zz = {10,30,54,77,11,22,99,3};
  int[] exp = {10,30,54,77,11,22,99,3};
  rr.init( zz ); 
  int[] act = rr.toArray();
  assertArrayEquals(exp, act);
 }

 //=====================================
 // Get
 //=====================================
 @Test (dataProvider = "getData",expectedExceptions = NullPointerException.class)
  public void Get_null(EList rr)
  {
   
   int[] ini = null;
   rr.init(ini);
   rr.get(0);
  }
  @Test (dataProvider = "getData",expectedExceptions = ListIsEmptyException.class)
  public void Get_0(EList rr) 
  {
   int[] ini = {};
   rr.init(ini);
   rr.get(0);
  }
  @Test (dataProvider = "getData")
  public void Get_1(EList rr) 
  {
   
   int[] ini = {10};
   rr.init(ini);
   rr.get(0);
   assertEquals(1, rr.size());
   assertEquals(10, rr.get(0));
   int[] exp = {10};
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }
  @Test (dataProvider = "getData")
  public void Get_2(EList rr) 
  {
   
   int[] ini = {10,20};
   rr.init(ini);
   rr.get(0);
   assertEquals(2, rr.size());
   assertEquals(10, rr.get(0));
   int[] exp = {10,20};
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }
  @Test (dataProvider = "getData")
  public void Get_many(EList rr) 
  {
   
   int[] ini = {10,20,33,77,11,24,19};
   rr.init(ini);
   rr.get(2);
   assertEquals(7, rr.size());
   assertEquals(33, rr.get(2));
   int[] exp = {10,20,33,77,11,24,19};
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }
 //=====================================
 // Set
 //=====================================
   @Test (dataProvider = "getData",expectedExceptions = NullPointerException.class)
   public void Set_null(EList rr)
   {
    int[] ini = null;
    rr.init(ini);
    rr.set(0, 2);
   }
   @Test (dataProvider = "getData")
   public void Set_0(EList rr) 
   {
    
    int[] ini = {};
    rr.init(ini);
    assertEquals(0, rr.size());
    int[] exp = {};
    int[] act = rr.toArray();
    assertArrayEquals(exp, act);
   }
   @Test (dataProvider = "getData")
   public void Set_1(EList rr) 
   {
    
    int[] ini = {10};
    rr.init(ini);
    rr.set(0, 5);
    assertEquals(1, rr.size());
    assertEquals(5, rr.get(0));
    int[] exp = {5};
    int[] act = rr.toArray();
    assertArrayEquals(exp, act);
   }
   @Test (dataProvider = "getData")
   public void Set_2(EList rr) 
   {
    
    int[] ini = {10,20};
    rr.init(ini);
    rr.set(1, 55);
    assertEquals(2, rr.size());
    assertEquals(55, rr.get(1));
    int[] exp = {10,55};
    int[] act = rr.toArray();
    assertArrayEquals(exp, act);
   }
   @Test (dataProvider = "getData")
   public void Set_many(EList rr) 
   {
    
    int[] ini = {10,20,33,77,11,24,19};
    rr.init(ini);
    rr.set(3, 111);
    assertEquals(7, rr.size());
    assertEquals(111, rr.get(3));
    int[] exp = {10,20,33,111,11,24,19};
    int[] act = rr.toArray();
    assertArrayEquals(exp, act);
   }
  //==============================================
  //addStart
  //==============================================

  @Test (dataProvider = "getData",expectedExceptions = NullPointerException.class)
  public void testAddStart_null(EList rr)
  {
   int[] zz = null;
   rr.init(zz);
   rr.addStart(99);
  }

  @Test (dataProvider = "getData")
  public void testAddStart_0(EList rr)
  {
   int[] zz = {};
   rr.init(zz);
   rr.addStart(99);
   
   int[] exp = {99};
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }

  @Test (dataProvider = "getData")
  public void testAddStart_1(EList rr)
  {
   int[] zz = {156};
   rr.init(zz);
   rr.addStart(35);
  
   int[] exp = {35,156};
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }

  @Test (dataProvider = "getData")
  public void testAddStart_2(EList rr)
  {
   int[] zz = {34,54};
   rr.init(zz);
   rr.addStart(4);
   int[] exp = {4,34,54};
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }

  @Test (dataProvider = "getData")
  public void testAddStart_many(EList rr)
  {
   int[] zz = {1,2,4,5,6,8};
   rr.init(zz);
   rr.addStart(5);   
   int[] exp = {5,1,2,4,5,6,8};
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }

  
 //==============================================
 //addEnd
 //==============================================
 @Test (dataProvider = "getData",expectedExceptions = NullPointerException.class)
 public void testAddEnd_null(EList rr)
 {
  int[] zz = null;
  rr.init(zz);
  rr.addEnd(5);
 }

 @Test (dataProvider = "getData")
 public void testAddEnd_0(EList rr)
 {
  int[] zz = {};
  rr.init(zz);
  rr.addEnd(15);
  int[] exp = {15};
  int[] act = rr.toArray();
  assertArrayEquals(exp, act);
 }

 @Test (dataProvider = "getData")
 public void testAddEnd_1(EList rr)
 {
  int[] zz = {66};
  rr.init(zz);
  rr.addEnd(5);
  int[] exp = {66,5};
  int[] act = rr.toArray();
  assertArrayEquals(exp, act);
 }

 @Test (dataProvider = "getData")
 public void testAddEnd_2(EList rr)
 {
  int[] zz = {66,5};
  rr.init(zz);
  rr.addEnd(7);
  int[] exp = {66,5,7};
  int[] act = rr.toArray();
  assertArrayEquals(exp, act);
 }

 

 @Test (dataProvider = "getData")
 public void testAddEnd_many(EList rr)
 {
  int[] zz = {1,5,3,4,7,56,3,5,76};
  rr.init(zz);
  rr.addEnd(777);
  int[] exp = {1,5,3,4,7,56,3,5,76,777};
  int[] act = rr.toArray();
  assertArrayEquals(exp, act);
 }

 
 //==============================================
 //addPos
 //==============================================
 @Test (dataProvider = "getData",expectedExceptions = NullPointerException.class)
 public void testaddPos_null(EList rr)
 {
  int[] zz = null;
  rr.init(zz);
  rr.addPos(0,3);
  int[] exp = {3};
  int[] act = rr.toArray();
  assertArrayEquals(exp, act);
 }

 @Test (dataProvider = "getData")
 public void testaddPos_0(EList rr)
 {
  int[] zz = {};
  rr.init(zz);
  rr.addPos(0, 33);
  int[] exp = {33};
  int[] act = rr.toArray();
  assertArrayEquals(exp, act);
 }

 @Test (dataProvider = "getData")
 public void testaddPos_1(EList rr)
 {
  int[] zz = {66};
  rr.init(zz);
  rr.addPos(0, 55);
  int[] exp = {55,66};
  int[] res = rr.toArray();
  assertArrayEquals(exp, res);
 }

 @Test (dataProvider = "getData")
 public void testaddPos_2(EList rr)
 {
  int[] zz = { 10, 20 };
  rr.init(zz);
  rr.addPos(1, 5);
  int[] exp = {10,5,20};
  int[] act = rr.toArray();
  assertArrayEquals(exp, act);
 }

 
 @Test (dataProvider = "getData")
 public void testaddPos_many(EList rr)
 {
  int[] zz = {1,4,76,4,2,5,7,8};
  rr.init(zz);
  rr.addPos(5, 12);
  int[] exp = {1,4,76,4,2,12,5,7,8};
  int[] act = rr.toArray();
  assertArrayEquals(exp, act);
 }

 
 //
 //delStart
 //==============================================

 @Test (dataProvider = "getData",expectedExceptions = NullPointerException.class)
 public void testDelStart_null(EList rr)
 {
  int[] zz = null;
  rr.init(zz);
  rr.delStart();
 }

 @Test (dataProvider = "getData")
 public void testDelStart_0(EList rr)
 {
  int[] zz = {5};
  int[] exp = {};

  rr.init(zz);
  rr.delStart();
  int[] res = rr.toArray();
  assertArrayEquals(exp, res);
 }

 @Test (dataProvider = "getData")
 public void testDelStart_1(EList rr)
 {
  int[] zz = {56};
  rr.init(zz);
  rr.delStart();
  int[] exp = {};
  int[] res = rr.toArray();
  assertArrayEquals(exp, res);
 }

 @Test (dataProvider = "getData")
 public void testDelStart_2(EList rr)
 {
  int[] zz = {45,76};
  rr.init(zz);
  rr.delStart();
  int[] exp = {76};
  int[] res = rr.toArray();
  assertArrayEquals(exp, res);
 }

 
 @Test (dataProvider = "getData")
 public void testDelStartMany(EList rr)
 {
  int[] zz = {1,2,4,6,8,98,6,11,45,6};
  rr.init(zz);
  rr.delStart();
  int[] exp = {2,4,6,8,98,6,11,45,6};
  int[] res = rr.toArray();
  assertArrayEquals(exp, res);
 }

 //==============================================
 //delEnd
 //==============================================

 @Test (dataProvider = "getData",expectedExceptions = NullPointerException.class)
 public void testDelEnd_null(EList rr)
 {
  int[] zz = null;
  rr.init(zz);
  rr.delEnd();
 }

 @Test (dataProvider = "getData",expectedExceptions = ListIsEmptyException.class)
 public void testDelEnd_0(EList rr)
 {
  int[] zz = {};
  rr.init(zz);
  rr.delEnd();
 }

 @Test (dataProvider = "getData") 
 public void testDelEnd_1(EList rr)
 {
  int[] zz = {12,12};
  rr.init(zz);
  rr.delEnd();
  int[] exp = {12};
  int[] res = rr.toArray();
  assertArrayEquals(exp, res);
 }

 @Test (dataProvider = "getData")
 public void testDelEnd_2(EList rr)
 {
  int[] zz = {10,20};
  rr.init(zz);
  rr.delEnd();
  int[] exp =  {10};
  int[] res = rr.toArray();
  assertArrayEquals(exp, res);
 }


 @Test (dataProvider = "getData")
 public void testDelEndMany(EList rr)
 {
  int[] zz = {1,2,3,5,6,78,9,0,7,6,4};
  rr.init(zz);
  rr.delEnd();
  int[] exp =  {1,2,3,5,6,78,9,0,7,6};
  int[] res = rr.toArray();
  assertArrayEquals(exp, res);
 }

 //==============================================
 //delPos
 //==============================================

 @Test (dataProvider = "getData",expectedExceptions = NullPointerException.class)
 public void testDelPos_null(EList rr)
 {
  int[] zz = null;
  rr.init(zz);
  rr.delPos(0);
 }

 @Test (dataProvider = "getData",expectedExceptions = ListIsEmptyException.class)
 public void testDelPos_0(EList rr)
 {
  int[] zz = {};
  rr.init(zz);
  rr.delPos(0);
 }

 @Test (dataProvider = "getData")
 public void testDelPos_1(EList rr)
 {
  int[] zz = {11,22};
  rr.init(zz);
  rr.delPos(1);
  int[] exp = {11};
  int[] res = rr.toArray();
  assertArrayEquals(exp, res);
 }

 @Test (dataProvider = "getData")
 public void testDelPos_2(EList rr)
 {
  int[] zz = {10, 20};
  rr.init(zz);
  rr.delPos(1);
  int[] exp = { 10};
  int[] res = rr.toArray();
  assertArrayEquals(exp, res);
 }

 @Test (dataProvider = "getData")
 public void testDelPosMany(EList rr)
 {
  int[] zz = {1,2,3,4,5,6,7,8,9};
  rr.init(zz);
  rr.delPos(4);
  int[] exp = {1,2,3,4,6,7,8,9};
  int[] res = rr.toArray();
  assertArrayEquals(exp, res);
 }
 //==============================================
 //min
 //==============================================

 @Test (dataProvider = "getData",expectedExceptions = NullPointerException.class) 
 public void testMin_null(EList rr)
 {
  int[] zz = null;

  rr.init(zz);
  rr.min();
 }

 @Test (dataProvider = "getData")
 public void testMin_1(EList rr)
 {
  int[] zz = {55};
  rr.init(zz);
  int act = rr.min();
  int exp =55;
  assertEquals(exp, act);
 }

 @Test (dataProvider = "getData")
 public void testMin_2(EList rr)
 {
  int[] zz = {10,20};
  rr.init(zz);
  int act = rr.min();
  int exp = 10;
  assertEquals(exp, act);
 }

 
 @Test (dataProvider = "getData")
 public void testMinMany(EList rr)
 {
  int[] zz = {1,3,4,56,7,89,7,5,3,55};
  rr.init(zz);
  int act = rr.min();
  int exp = 1;
  assertEquals(exp, act);
 }
  //==============================================
  //max
  //==============================================
  @Test (dataProvider = "getData",expectedExceptions = NullPointerException.class) 
  public void testMax_null(EList rr)
  {
   int[] zz = null;

   rr.init(zz);
   rr.max();
  }

  @Test (dataProvider = "getData")
  public void testMax_1(EList rr)
  {
   int[] zz = {11};
   rr.init(zz);
   int act = rr.max();
   int exp = 11;
   assertEquals(exp, act);
  }

  @Test (dataProvider = "getData")
  public void testMax_2(EList rr)
  {
   int[] zz = {11,12};
   rr.init(zz);
   int act = rr.max();
   int exp = 12;
   assertEquals(exp, act);
  }

  @Test (dataProvider = "getData")
  public void testMaxMany(EList rr)
  {
   int[] zz = {23,4,6,8,86,4,3,5,7,91,1};

   rr.init(zz);
   int act = rr.max();
   int exp = 91;
   assertEquals(exp, act);
  }
  //==============================================
  //minIndex
  //==============================================

  @Test (dataProvider = "getData",expectedExceptions = NullPointerException.class) 
  public void minIndex_null(EList rr)
  {
   int[] zz = null;

   rr.init(zz);
   rr.minInd();
  }

  @Test (dataProvider = "getData",expectedExceptions = ListIsEmptyException.class)
  public void minInd_0(EList rr)
  {
   int[] zz = {};
   rr.init(zz);
   rr.minInd();
  }

  @Test (dataProvider = "getData")
  public void minInd_1(EList rr)
  {
   int[] zz = {1};

   rr.init(zz);
   int act = rr.minInd();
   int exp = 0;
   assertEquals(exp, act);
  }

  @Test (dataProvider = "getData")
  public void minInd_2(EList rr)
  {
   int[] zz = {10,20};
   rr.init(zz);
   int act = rr.minInd();
   int exp = 0;
   assertEquals(exp, act);
  }

  @Test (dataProvider = "getData")
  public void minInd_many(EList rr)
  {
   int[] zz = {33,21,34,5,76,8,9,87,6,3};
   rr.init(zz);
   int act = rr.minInd();
   int exp = 9;
   assertEquals(exp, act);
  }
  
  //==============================================
  //maxInd
  //==============================================

  @Test (dataProvider = "getData",expectedExceptions = NullPointerException.class)
  public void maxInd_null(EList rr)
  {
   int[] zz = null;
   rr.init(zz);
   rr.maxInd();
  }

  @Test (dataProvider = "getData",expectedExceptions = ListIsEmptyException.class)
  public void maxInd_0(EList rr)
  {
   int[] zz = {};

   rr.init(zz);
   rr.maxInd();
  }

  @Test (dataProvider = "getData")
  public void maxInd_1(EList rr)
  {
   int[] zz = {11};
   rr.init(zz);
   int act = rr.maxInd();
   int exp = 0;
   assertEquals(exp, act);
  }

  @Test (dataProvider = "getData")
  public void maxInd_2(EList rr)
  {
   int[] zz = {44,22};

   rr.init(zz);
   int act = rr.maxInd();
   int exp = 0;
   assertEquals(exp, act);
  }

  @Test (dataProvider = "getData")

  public void maxInd_many_8(EList rr)
  {
   int[] zz = {2,3,4,5,78,9,66,443,2};
   rr.init(zz);
   int act = rr.maxInd();
   int exp = 7;
   assertEquals(exp, act);
  }
  //==============================================
  //sort
  //==============================================


  @Test (dataProvider = "getData",expectedExceptions = NullPointerException.class)
  public void testSort_null(EList rr)
  {
   int[] zz = null;

   rr.init(zz);
   rr.sort();
  }

  @Test (dataProvider = "getData",expectedExceptions = ListIsEmptyException.class)
  public void testSort_0(EList rr)
  {
   int[] zz = {};
   rr.init(zz);
   rr.sort();
  }

  @Test (dataProvider = "getData")
  public void testSort_1(EList rr)
  {
   int[] zz = {10};
   rr.init(zz);
   rr.sort();
   int[] exp = {10};
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }

  @Test (dataProvider = "getData")
  public void testSort_2(EList rr)
  {
   int[] zz = {1,2};
   rr.init(zz);
   rr.sort();
   int[] exp = {1,2};
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }

  @Test (dataProvider = "getData")
  public void testSortMany_7(EList rr)
  {
   int[] zz = { 10, 20, 77, 11, 24, 99, 32 };   
   rr.init(zz);
   rr.sort();
   int[] exp = { 10, 11, 20, 24, 32, 77, 99 };
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }

  @Test (dataProvider = "getData")
  public void testSort_many_8(EList rr)
  {
   int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0 };
   rr.init(zz);
   rr.sort();
   int[] exp = { 0, 10, 11, 20, 24, 32, 77, 99 };
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }
  //==============================================
  //reverse
  //==============================================


  @Test (dataProvider = "getData",expectedExceptions = NullPointerException.class)
  public void testReverse_null(EList rr)
  {
   int[] zz = null;

   rr.init(zz);
   rr.reverse();
  }

  @Test (dataProvider = "getData",expectedExceptions = ListIsEmptyException.class)
  public void testReverse_0(EList rr)
  {
   int[] zz = {};
   rr.init(zz);
   rr.reverse(); 
  }

  @Test (dataProvider = "getData")
  public void testReverse_1(EList rr)
  {
   int[] zz = {2};
   rr.init(zz);
   rr.reverse();
   int[] exp = {2};
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }
  @Test (dataProvider = "getData")
  public void testReverse_2(EList rr)
  {
   int[] zz = {2,3};
   rr.init(zz);
   rr.reverse();
   int[] exp = {3,2};
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }

  @Test (dataProvider = "getData")
  public void testReverse_many_7(EList rr)
  {
   int[] zz = {1,2,3,4,5,6,7};
   rr.init(zz);
   rr.reverse();
   int[] exp = {7,6,5,4,3,2,1};
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }

  @Test (dataProvider = "getData")
  public void testReverse_many_8(EList rr)
  {
   int[] zz = {1,2,3,4,5,6,7,8};
   rr.init(zz);
   rr.reverse();
   int[] exp = {8,7,6,5,4,3,2,1};
   int[] acts = rr.toArray();
   assertArrayEquals(exp, acts);
  }
  //==============================================
  //halfreverse
  //==============================================

  
  @Test (dataProvider = "getData",expectedExceptions = NullPointerException.class)
  public void testHalfreverse_null(EList rr)
  {
   int[] zz = null;
   rr.init(zz);
   rr.halfReverse();
  }

  @Test (dataProvider = "getData",expectedExceptions = ListIsEmptyException.class)
  public void testHalfreverse_0(EList rr)
  {
   int[] zz = {};
   rr.init(zz);
   rr.halfReverse();
   
  }

  @Test (dataProvider = "getData")
  public void testHalfreverse_1(EList rr)
  {
   int[] zz = {1};
   rr.init(zz);
   rr.halfReverse();
   int[] exp = {1};
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }

  @Test (dataProvider = "getData")
  public void testHalfreverse_2(EList rr)
  {
   int[] zz = {1,2};

   rr.init(zz);
   rr.halfReverse();
   int[] exp = {2,1};
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }

  @Test (dataProvider = "getData")
  public void testHalfreverse_many_7(EList rr)
  {
   int[] zz = {1,2,3,4,5,6,7};
   rr.init(zz);
   rr.halfReverse();
   int[] exp = {5,6,7,4,1,2,3};
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }

  @Test (dataProvider = "getData")
  public void testHalfreverse_many_8(EList rr)
  {
   int[] zz = {1,2,3,4,5,6,7,8};
   int[] exp = {5,6,7,8,1,2,3,4};

   rr.init(zz);
   rr.halfReverse();
   int[] act = rr.toArray();
   assertArrayEquals(exp, act);
  }
}