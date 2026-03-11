package ex_22_OOPs_Super_Abstraction.Abstraction;

public class Lab161_Interview {
}

interface s1{}
interface s2{}
class A1{}
class B1{}
//class Test extends A1, B1{}
class Test2 implements s1{}
class Test3 implements s2, s1{}
class Test4 extends A1 implements s1, s2{}
//class Test5 implements s1 extends s2{}
