package week6.ex01;

class LeastJob implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("고객 대기 시간을 줄이고자 합니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("쉬고 있거나 가장 짧은 대기열을 보유한 상담원에게 배분합니다.");
    }
}
