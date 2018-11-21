/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import MODEL_HR.Departements;

/**
 *
 * @author admin
 */
public class TestDepartments {
    public static void main(String[] args) {
        Departements dept = new Departements(10,"Administration");
        dept.readEmployees();
        for (int i = 0; i < dept.getListEmployees().size(); i++) {
            System.out.println(dept.getListEmployees().get(i).toString());
        }
        
        Departements dept1 = new Departements(20,"Marketing");
        dept1.readEmployees();
        for (int i = 0; i < dept1.getListEmployees().size(); i++) {
            System.out.println(dept1.getListEmployees().get(i).toString());
        }
}
}
