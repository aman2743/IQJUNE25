package accessModifierInJava;

public class AccessModifer1 {
    private int x=10;
        public void publicMethod() {
            privateMethod();
            System.out.println(x);
            System.out.println("inside public method");
        }

        void defaultMethod() {
            System.out.println("inside default method");
        }

        protected void protectedMethod() {
            System.out.println("inside protected method");
        }

        private void privateMethod() {
            defaultMethod();
            System.out.println("inside private method");
        }
    }

