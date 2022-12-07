import javax.swing.*;

abstract class methods {
    public static void displayMessage1(String sum){
        JOptionPane.showMessageDialog( null, "The sum is: " + sum, "Result" , JOptionPane.INFORMATION_MESSAGE );
    }
    public static void displayMessage2(String difference){
        JOptionPane.showMessageDialog( null, "The difference is: " + difference, "Result" , JOptionPane.INFORMATION_MESSAGE );
    }
    public static void displayMessage3(String product){
        JOptionPane.showMessageDialog( null, "The product is: " + product, "Result" , JOptionPane.INFORMATION_MESSAGE );
    }
    public static void displayMessage4(String quotient){
        JOptionPane.showMessageDialog( null, "The quotient is: " + quotient, "Result" , JOptionPane.INFORMATION_MESSAGE );
    }
}
