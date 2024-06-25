package six;

public class MultilevelMain {
    public static void main(String[] args) {
        MultilevelGrandParent GrandParent=new MultilevelGrandParent();
        GrandParent.showEmployeeName("Karim");
        GrandParent.showSalary(20000);
        System.out.println("------");

        MultilevelParent Parent=new MultilevelParent();
        Parent.showProvidentFund(5000);
        System.out.println("------");

        MultilevelChild child=new MultilevelChild();
        child.showBenefits(3000);
        System.out.println("---");



    }
}
