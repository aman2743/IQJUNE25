package StaticIdentifierInJava;

public class NoOfViews {
  static int count;
  void view(){
      count++;
  }


    public static void main(String[] args) {
        NoOfViews obj=new NoOfViews();
        obj.view();
        NoOfViews obj1=new NoOfViews();
        obj1.view();
        NoOfViews obj2=new NoOfViews();
        obj2.view();
        NoOfViews obj3=new NoOfViews();
        obj3.view();
        System.out.println(NoOfViews.count);
    }
}
