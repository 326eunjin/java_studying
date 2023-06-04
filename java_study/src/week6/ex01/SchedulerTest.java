package week6.ex01;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식을 선택 하세요");
        System.out.println("R : 한명씩 차례로 할당");
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P : 우선순위가 높은 고객 먼저 할당");
        int press = System.in.read();
        LeastJob job1 = new LeastJob();
        PriorityAllocation job2 = new PriorityAllocation();
        RoundRobin job3 = new RoundRobin();

        if (press == 'R' || press == 'r') {
            job3.getNextCall();
            job3.sendCallToAgent();
        } else if (press == 'L' || press == 'l') {
            job1.getNextCall();
            job1.sendCallToAgent();
        } else if (press == 'P' || press == 'p') {
            job2.getNextCall();
            job2.sendCallToAgent();
        }
    }
}
