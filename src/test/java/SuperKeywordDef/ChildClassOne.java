package SuperKeywordDef;

public class ChildClassOne extends ParentClassOne {
//    int x=10;
    public void M33(){
        super.ParentClassOne();
//    super.M30();
//    int a=super.x;
////    int b=super.y;
////        System.out.println(a+b);
        System.out.println(super.x+super.y);
//        System.out.println(super.x);
//        System.out.println(super.y);

    }

    public static void main(String[] args) {
        ChildClassOne obj=new ChildClassOne();
        obj.M33();
//        obj.M33();
//        obj.ParentClassOne(10);
    }

}
