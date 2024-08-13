import java.util.Scanner;

class main {
   
    float  productNo;
    String productName;
    String activationKey;
    float priceofProduct;

    Scanner sc = new Scanner(System.in);
    //if you want to go far go alone , if you want to go 
   
    String getProductName() {
        System.out.print("ENTER PRODUCT NAME : ");
        productName = sc.nextLine();
        return productName;
    }
 
    String getActivationKey() {
        System.out.print("ENTER PRODUCT ACTIVATION KEY : ");    
        activationKey = sc.nextLine();
        return activationKey;
    }

    float getProductNo() {
        System.out.print("ENTER PRODUCT No : ");    
        productNo = sc.nextFloat();
        sc.nextLine(); // Consume the newline character
        return productNo;
    }

    float getPriceOfProduct() {
        System.out.print("ENTER PRODUCT PRICE : ");    
        priceofProduct = sc.nextFloat();
        sc.nextLine(); // Consume the newline character
        return priceofProduct;
    }

    void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }  

    void display() {
        System.out.println("\nYOUR PRODUCT NAME : " + productName);  
        System.out.println("YOUR PRODUCT ACTIVATION KEY : " + activationKey);
        System.out.println("YOUR PRODUCT No : " + productNo);
        System.out.println("YOUR PRODUCT PRICE : " + priceofProduct);
    }
   
    public static void main(String[] args) {
       
        main[] key = new main[5];
         
        for(int i = 0; i < 5; i++) {
            key[i] = new main();
            key[i].getProductName();
            key[i].getActivationKey();
            key[i].getProductNo();
            key[i].getPriceOfProduct();
            // No need to call setActivationKey here
        }

        for(int i = 0; i < 5; i++) {
            key[i].display();
        }
    }
}
