/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computecommission;

/**
 *
 * @author aaronphawkins
 */
public class ComputeCommission {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    char vType = 'S';
    int value = 23000;
    double commRate = .08;
    computeCommission(value, commRate, vType);
    computeCommission(40000, 0.10, 'L');
    double salaryAmount = predictRaise(1000);
    System.out.println("Predicted salary: " + salaryAmount);
    }
    //main
    public static void computeCommission(int value,
            double rate, char vehicle)
    {
    double commission;
    commission = value * rate;
    System.out.println("\nThe " + vehicle + 
            " type vehicle is worth $" + value);
    System.out.println("With " + (rate * 100) + "% commission rate, "
            + "the commission is $" + commission);
    
}
    public static double predictRaise(double salary)
    {
        double newAmount;
        final double RAISE = 1.10;
        newAmount = salary * RAISE;
        return newAmount;
    }
} //class
