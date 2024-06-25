package six;

public class HierarchicalMain {

    public static void main(String[] args) {
        HierarchicalChild1 child1=new HierarchicalChild1();
        child1.showEmployeeName("Rahim");
        child1.showSalary(50000);
        child1.showProvidentFund(1500);
        System.out.println("--------");

        HierarchicalChild2 child2=new HierarchicalChild2();
        child2.showEmployeeName("Mina");
        child2.showBenefits(3000);
        System.out.println("------");


    }
}
