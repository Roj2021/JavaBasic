package class20_1;

import class20.JavaTeacher;

public class University {

    public static void main(String[] args) {
        JavaTeacher jt=new JavaTeacher();

        jt.homework();// public
        //jt.grade();// protected not visible in diff package

    }
}
