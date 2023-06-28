package com.itProgerT2L3;

public class     Main  {
    public static void main(String[] args) {
        BMW m5 = new BMW(true, "M5", 4444.00f, "СИНИЙ", true, (short) 55);
        m5.printAll();
        m5.startEnine();

        Audi obj = new Audi() {
            private boolean isWork;

            public void isDrive() {
                this.isWork = true;
            }
            public void printAll() {
                System.out.println(isWork);
            }
        };
        obj.printAll();
        obj.isDrive();
        obj.printAll();

    }

    private static class Audi {
        public void printAll() {

        }

        public void isDrive() {

        };
    }
}
