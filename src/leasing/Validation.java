/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing;

import javax.swing.JTextField;

/**
 *
 * @author Sandali
 */
public class Validation {

    public static void validateNIC(JTextField nicText) {
        String text = nicText.getText();
        boolean matches = text.matches("[\\d]{0,9}");
        if (!matches) {
            nicText.setText(text.substring(0, text.length() - 1));
        }
        boolean matches1 = text.matches("[\\d]{9}");
        if (matches1) {
            nicText.setText(nicText.getText() + "V");
        }
    }
}
