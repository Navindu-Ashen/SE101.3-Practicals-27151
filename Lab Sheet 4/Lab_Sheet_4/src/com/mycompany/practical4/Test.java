package com.mycompany.practical4;

public class Test {
    public static void main(String[] args){
        var mr_Borgan = new Employee();
        var ms_Bride = new Employee();

        mr_Borgan.setEmpID(001);
        mr_Borgan.setEmpName("Mr.Borgan");
        mr_Borgan.setEmpDesignation("Senior software engineer");

        ms_Bride.setEmpID(002);
        ms_Bride.setEmpName("Ms.Bride");
        ms_Bride.setEmpDesignation("Project manager");

        System.out.println("Employee ID: "+mr_Borgan.getEmpID());
        System.out.println("Employee name: "+mr_Borgan.getEmpName());
        System.out.println("Employee Designation: "+mr_Borgan.getEmpDesignation());

        System.out.println(" ");

        System.out.println("Employee ID: "+ms_Bride.getEmpID());
        System.out.println("Employee name: "+ms_Bride.getEmpName());
        System.out.println("Employee Designation: "+ms_Bride.getEmpDesignation());

    }
}
