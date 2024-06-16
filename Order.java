//class definition
public class Order {
    //attributes declaration
    private String sIdNum;
    private String sCustomerN;
    private String sCustomerAdd;
    private String sProduct;
    private int iQty;
    private double dPricePU;
    private double dTprice;
    private String sStatus;
    
    //constructor without parameter
    public Order() {
        sIdNum = null;
        sCustomerN = null;
        sCustomerAdd = null;
        sProduct = null;
        iQty = 0;
        dPricePU = 0.0;
        sStatus = null;
    }
    
    //constructor with parameter
    public Order(String sId, String sName, String sAddress, String sPro, 
    int iQ, double dPrice, String sStat) {
        sIdNum = sId;
        sCustomerN = sName;
        sCustomerAdd = sAddress;
        sProduct = sPro;
        iQty = iQ;
        dPricePU = dPrice;
        sStatus = sStat;
    }
    
    //mutator for each attributes
    public void setIDNumber(String sId) {
        sIdNum = sId;
    }
    public void setCustomerName(String sName) {
        sCustomerN = sName;
    }
    public void setCustomerAddress(String sAddress) {
        sCustomerAdd = sAddress;
    }
    public void setProduct(String sPro) {
        sProduct = sPro;
    }
    public void setQuantity(int iQ) {
        iQty = iQ;
    }
    public void setPrice(double dPrice) {
        dPricePU = dPrice;
    }
    public void setTotal(double dTotal) {
        dTprice = dTotal;
    }
    public void setStatus(String sStat) {
        sStatus = sStat;
    }
    
    //mutator for all attributes
    public void setAll(String sId, String sName, String sAddress, String
    sPro, int iQ, double dPrice, double dTotal, String sStat) {
        sIdNum = sId;
        sCustomerN = sName;
        sCustomerAdd = sAddress;
        sProduct = sPro;
        iQty = iQ;
        dPricePU = dPrice;
        dTprice = dTotal;
        sStatus = sStat;
    }
    
    //accessor
    public String getIdNum() {
        return sIdNum;
    }
    public String getName() {
        return sCustomerN;
    }
    public String getAddress() {
        return sCustomerAdd;
    }
    public String getProduct() {
        return sProduct;
    }
    public int getQuantity() {
        return iQty;
    }
    public double getPrice() {
        return dPricePU;
    }
    public double getTotal() {
        return dTprice;
    }
    public String getStatus() {
        return sStatus;
    }
    
    //display information
    public String toString() {
        return( "Order ID           : " + sIdNum + "\n" + 
                "Customer Name      : " + sCustomerN + "\n" +
                "Customer Address   : " + sCustomerAdd + "\n" +
                "Product Name       : " + sProduct + "\n" +
                "Quantity Ordered   : " + iQty + "\n" +
                "Price per unit     : " + dPricePU + "\n" +
                "Total Price        : " + dPricePU * iQty + "\n" +
                "Order Status       : " + sStatus + "\n");
    }
}