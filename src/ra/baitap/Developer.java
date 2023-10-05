package ra.baitap;

public class Developer extends Employee{
    private String programLaguage;



    public Developer() {

    }

    public Developer(int id, String name, int age, String programLaguage) {
        super(id, name, age);
        this.programLaguage = programLaguage;
    }

    // Ghi đè của cha

    @Override
    public void work() {
        super.work();
        System.out.println("Đây là Developer.");
    }
    public void fixbug() {
        System.out.println("Đang fixbug.");
    }
}
