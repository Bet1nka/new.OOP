
package geekhomework;
import java.util.List;
import geekhomework.Handlerbar;

public class ComfortPlus {
    private SalonSettings mirror;
    private SalonSettings seats;
    private Handlerbar handlerbar;
    private Conditioner conditioner;
    private Doors door1;
    private Doors door2;
    private Doors back;
    private List<DriverSettings> driver;
    private Handlerbar handler;


    int temp = 32;

    public ComfortPlus() {
        door1 = new Doors();
        door2 = new Doors();
        back = new Doors();
        conditioner = new Conditioner();
        handlerbar = new Handlerbar();
       mirror=new Mirrors();
        seats=new Seats();
        handler = new Handlerbar();
        driver = List.of(mirror, seats, handler);
    }
    public void prepairToRide() {
        door1.LockDoors();
        door2.LockDoors();
        back.LockDoors();
        handlerbar.Handlebar();

    }
    public void autoconditionbutton(){
        conditioner.TurnOn();
        conditioner.ChangeTemp(temp);
        conditioner.TurnOff();
    }
    public void stopRide(){
        door1.UnlockDoors();
        door2.UnlockDoors();
        }
        public void DriverChange(){
            for (DriverSettings driver: driver )
            {
                driver.DriverAdapter();
            }

        }
}
