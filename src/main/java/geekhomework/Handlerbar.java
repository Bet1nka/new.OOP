package geekhomework;

public class Handlerbar  implements DriverSettings{
    public void Handlebar(){
        System.out.println("Руль разблокирован");
    }

    @Override
    public void DriverAdapter() {
        System.out.println("руль настроен");
    }
}
