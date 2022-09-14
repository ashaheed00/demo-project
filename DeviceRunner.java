package com.aksh.interfaceeg;

public class DeviceRunner {

    public static void main(String[] args) {
        // Anonymous inner class
//        Device device = new Device() {
//            @Override
//            public void start(int a) {
//                System.out.println("in device");
//            }
//        };

        // lambda expression (->)
        Device device = (int a) -> {
            System.out.println("in device");
            System.out.println("in device");
            System.out.println("in device");
            System.out.println("in device");
        };
        device.start(2);
    }
}
