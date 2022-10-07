package geekhomework;

public class Seats extends SalonSettings{
    private int size;

    @Override
    public void change(int size) {
        super.change(getId());
        System.out.println("сидения подвинуты на " + size);
    }

    @Override
    public void DriverAdapter() {
        System.out.println("сидения настроены");
    }
}
