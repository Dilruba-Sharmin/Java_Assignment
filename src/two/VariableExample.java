package two;

public class VariableExample {

        // Static variable
        static int staticVariable = 10;

        // Instance variable
        int instanceVariable = 20;

        public void method() {
            // Local variable
            int localVariable = 30;
            System.out.println("Local variable: " + localVariable);
            System.out.println("Instance variable: " + instanceVariable);
            System.out.println("Static variable: " + staticVariable);
        }

        public static void main(String[] args) {
            VariableExample obj = new VariableExample();
            obj.method();
        }
    }


