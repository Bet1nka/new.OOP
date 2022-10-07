package geekhomework;

import geekhomework.Base;
import geekhomework.ComfortPlus;

//1. Основываясь на примере с урока продолжить развивать систему классов, описывающих структуру и функционирование легкового автомобиля.
// Добавить сам класс автомобиля, который будет включать созданную нами базу. Помимо базы добавить такие компоненты, как двери, кондиционер, рулевое управление и др.
// Наладить их взаимодействие.
//2***. Поискать места в которых можно было бы использовать абстрактные классы и наследование
//
import java.util.List;
public class Car {

    public static void main(String[] args) {

        Base base = new Base();
        ComfortPlus cp = new ComfortPlus();
        base.start();
        cp.prepairToRide();
        cp.DriverChange();
        base.drive();
        cp.autoconditionbutton();
        base.stop();
        cp.stopRide();

















    }
}