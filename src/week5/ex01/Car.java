package week5.ex01;

public abstract class Car {
    protected void startCar() {
        System.out.println("시동을 켭니다.");
    }

    abstract void drive();

    abstract void stop();

    protected void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    final void run() {
        startCar();
        drive();
        wiper();
        turnOff();
        stop();
    }

    void wiper(){};
}

class AICar extends Car {
    @Override
    void drive() {
        System.out.println("자율주행을 합니다.");
        System.out.println("자동차가 스스로 방향전환을 합니다.");
    }

    @Override
    void stop() {
        System.out.println("스스로 멉춥니다.");
    }

    @Override
    void wiper() {
        System.out.println("비나 눈의 양에 따라 빠르기가 자동으로 조절됩니다.");
    }
}

class ManualCar extends Car {
    @Override
    void drive() {
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들을 조작합니다.");
    }

    @Override
    void stop() {
        System.out.println("브레이크로 정지합니다.");
    }

    @Override
    void wiper() {
        System.out.println("사람이 빠르기를 조절합니다.");
    }
}

