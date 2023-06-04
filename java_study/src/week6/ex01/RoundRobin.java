package week6.ex01;

class RoundRobin implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("모든 상담원이 동일한 상담 건수를 처리하도록 합니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("들어오는 전화 순서대로 상담원에게 하나씩 배분합니다.");

    }
}
