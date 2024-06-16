//import package
import java.util.*;
import java.io.*;
import javax.swing.*;

public class orderList {
    public static void main(String[] args) {
        try {
            //file reader
            BufferedReader in = new BufferedReader(new FileReader("orders.txt"));
            
            //arraylist
            ArrayList <Order> orderList = new ArrayList();
            
            //declare and create object
            Order comm;
            
            //declare indata to read a line in input file
            String inData = null;
            
            while((inData = in.readLine()) !=null) {
                StringTokenizer st = new StringTokenizer(inData, ";");
                String sIdNum = st.nextToken();
                String sCustomerN = st.nextToken();
                String sCustomerAdd = st.nextToken();
                String sProduct = st.nextToken();
                int iQty = Integer.parseInt(st.nextToken());
                double dPricePU = Double.parseDouble(st.nextToken());
                String sStatus = st.nextToken();
                
                //asign token to the object
                comm = new Order(sIdNum, sCustomerN, sCustomerAdd, sProduct, iQty, dPricePU, sStatus);
                                    
                //add object into arraylist
                orderList.add(comm);
            }
            in.close();
            
            int menu = 0;
            String input;
            
            do {
                System.out.println("Menu 1 - Add new order");
                System.out.println("Menu 2 - Update an order");
                System.out.println("Menu 3 - Delete an order");
                System.out.println("Menu 4 - Display order");
                System.out.println("Menu 5 - Exit");
                
                //ask user to enter menu
                input = JOptionPane.showInputDialog("Enter menu");
                menu = Integer.parseInt(input);
                
                if(menu == 1) {
                    //ask user to enter the serial number that they want to edit
                    input = JOptionPane.showInputDialog("Enter ID number");
                    String sIdNum = input;
                    
                    for(int i = 0; i < orderList.size(); i++) {
                        comm = orderList.get(i);
                    
                        if(comm.getIdNum().equalsIgnoreCase(sIdNum)) {
                            System.out.println("\n" + "You have entered an existing ID Number" + "\n");                            
                        }
                    }
                    
                    input = JOptionPane.showInputDialog("Enter name");
                    String sCustomerN = input;
                                    
                    input = JOptionPane.showInputDialog("Enter address");
                    String sCustomerAdd = input;
                                    
                    input = JOptionPane.showInputDialog("Enter product name");
                    String sProduct = input;
                                    
                    input = JOptionPane.showInputDialog("Enter quantity");
                    int iQty = Integer.parseInt(input);
                                    
                    input = JOptionPane.showInputDialog("Enter price per unit");
                    double dPricePU = Double.parseDouble(input);
                                    
                    input = JOptionPane.showInputDialog("Enter the status");
                    String sStatus = input;
                                    
                    //assign token to the object
                    comm = new Order(sIdNum, sCustomerN, sCustomerAdd, sProduct, iQty, dPricePU, sStatus);
                                    
                    //add object into arraylist
                    orderList.add(comm);
                } else if(menu == 2) {
                    //ask user to enter the Order ID number that they want to edit
                    input = JOptionPane.showInputDialog("Enter Order ID");
                    String sIdNum = input;
                        
                    for(int i = 0; i < orderList.size(); i++) {
                        comm = orderList.get(i);
                            
                        if(comm.getIdNum().equalsIgnoreCase(sIdNum)) {
                            //ask user to enter the new price
                            String newStatus;
                                
                            input = JOptionPane.showInputDialog("Enter updated status");
                            newStatus = input;
                                
                            //update new price
                            comm.setStatus(newStatus);
                                
                            //update in arraylist
                            orderList.set(i, comm);
                        }
                    }
                } else if(menu == 3) {
                    //ask user to enter the Order ID number that they want to remove
                    input = JOptionPane.showInputDialog("Enter Order ID");
                    String sIdNum = input;
                    
                    for(int i = 0; i < orderList.size(); i++) {
                        comm = orderList.get(i);
                        
                        if(comm.getIdNum().equalsIgnoreCase(sIdNum)) {
                            orderList.remove(i);
                        }
                    }
                } else if(menu == 4) {
                    System.out.println("\n" + "Details of order");
                    
                    for(int i = 0; i < orderList.size(); i++) {
                        comm = orderList.get(i);
                        System.out.println(comm);
                    }
                } else if(menu > 5) {
                    System.out.println("\n" + "You have entered an invalid menu" + "\n");
                }
            } while(menu != 5);
        }
        catch(FileNotFoundException fnfe) {
            System.out.println("File not found");
        }
        catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    } 
}