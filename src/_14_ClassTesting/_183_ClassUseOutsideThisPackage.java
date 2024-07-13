package _14_ClassTesting;

import _13_OOPS._182_AStudent;   // import this package i.e 13 oops ke pakage ki Astudent class acees karo

public class _183_ClassUseOutsideThisPackage {
    public static void main(String[] args) {
        _182_AStudent s2=new _182_AStudent();
        s2.name="abcdef";
        System.out.println(s2.name);
    }
}
