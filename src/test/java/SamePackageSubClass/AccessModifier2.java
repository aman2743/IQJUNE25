package SamePackageSubClass;

public class AccessModifier2 {
        private int x=10;
        public int i=20;
        public void publicMethod() {
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
