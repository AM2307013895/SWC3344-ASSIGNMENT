//import package
import java.util.*;
import javax.swing.*;

public class eCommMain {
    public static void main(String[] args) {
        //declare attributes
        String sIdNum;
        String sCustomerN;
        String sCustomerAdd;
        String sProduct;
        int iQty;
        double dPricePU;
        double dTprice;
        String sStatus;
        String input;
        String eComm;
        
        //create an array
        Order[] eC = new Order[20];
        
        for(int i = 0; i<20 ; i++) {
            eC[i] = new Order();
            
            input = JOptionPane.showInputDialog("Enter order ID Number");
            sIdNum = input;
            
            input = JOptionPane.showInputDialog("Enter name for the order");
            sCustomerN = input;
            
            input = JOptionPane.showInputDialog("Enter address for the order");
            sCustomerAdd = input;
            
            input = JOptionPane.showInputDialog("Enter the product name");
            sProduct = input;
            
            input = JOptionPane.showInputDialog("Enter the quantity");
            iQty = Integer.parseInt(input);
            
            input = JOptionPane.showInputDialog("Enter the price per unit");
            dPricePU = Double.parseDouble(input);
                
            input = JOptionPane.showInputDialog("Enter the status");
            sStatus = input;
            
            //call for mutator
            eC[i].setIDNumber(sIdNum);
            eC[i].setCustomerName(sCustomerN);
            eC[i].setCustomerAddress(sCustomerAdd);
            eC[i].setProduct(sProduct);
            eC[i].setQuantity(iQty);
            eC[i].setPrice(dPricePU);
            eC[i].setStatus(sStatus);
                            
            //print information
            System.out.println(eC[i]);
        }
    }
}