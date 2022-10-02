public class Doors {
    private Boolean doorstatus;
    public void LockDoors(){
        this.doorstatus=true;
        System.out.println("Дверь закрыта");
    }
    public void UnlockDoors(){
        this.doorstatus=false;
        System.out.println("Дверь открыта");
    }

    public Boolean getDoorstatus() {
        return doorstatus;
    }
}

