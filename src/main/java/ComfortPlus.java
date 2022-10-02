public class ComfortPlus {
    private Handlerbar handlerbar;
    private Conditioner conditioner;
    private Doors door1;
    private Doors door2;
    private Doors back;

    int temp = 32;

    public ComfortPlus() {
        door1 = new Doors();
        door2 = new Doors();
        back = new Doors();
        conditioner = new Conditioner();
        handlerbar = new Handlerbar();
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


}
