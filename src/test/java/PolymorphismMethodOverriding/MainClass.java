package PolymorphismMethodOverriding;
class PolicyBazaar{
    public void ROI(){
        System.out.println("Policy Bazaar ROI is"+ "API CALL");
    }
}
class HSBC extends PolicyBazaar{
    public void ROI(){
        System.out.println("HSBC ROI is"+ "API CALL");
    }
}
class HDFC extends PolicyBazaar{
    public void ROI(){
        System.out.println("HDFC ROI is"+ "API CALL");
    }
}
class ICICI extends PolicyBazaar{
    public void ROI(){
        System.out.println("Policy Bazaar ROI is"+ "API CALL");
    }
}

public class MainClass {
    public static void main(String[] args) {
        HDFC PB=new HDFC();
        PB.ROI();
    }
}
