/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

/**
 *
 * @author arpitarai
 */
public class Validations {

    public static boolean isValid(String email) {
        String regex = "^(.+)@(.+)$";
        return email.matches(regex);
    }

}
