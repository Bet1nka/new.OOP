package geekhomework;

public abstract class SalonSettings implements DriverSettings {
    protected int id;

    protected int size;
    public void change( int id){
        System.out.println("change driver" + id);
    }

    public int getId() {
        return id;
    }
}
