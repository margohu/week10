package week9.library;

import week9.library.measurements.ConstantSensor;

public class Ex20 {
    public static void main(String[] args) {
        ConstantSensor ten = new ConstantSensor(10);
        ConstantSensor minusFive = new ConstantSensor(-5);

        System.out.println( ten.measure() );
        System.out.println( minusFive.measure() );

        System.out.println( ten.isOn() );
        ten.off();
        System.out.println( ten.isOn() );
    }
}