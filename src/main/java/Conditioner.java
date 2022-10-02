public class Conditioner {
    private Boolean status;


    public void TurnOff(){
        this.status=false;
        System.out.println("Кондиционер выключен");
    }
    public void TurnOn() {
        this.status = true;
        System.out.println("Кондиционер включен");
    }
    public void ChangeTemp(int temp) {
        if (temp>24&&this.status ==true)
        System.out.println("Автокондиционирование включено");
    }

}
