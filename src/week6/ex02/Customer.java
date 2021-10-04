package week6.ex02;

class Customer implements Buy, Sell {
    @Override
    public void buy() {
        System.out.println("물건을 구매합니다.");
    }

    @Override
    public void order() {
//        Buy.super.order();
        System.out.println("구매자가 주문합니다.");
    }

    @Override
    public void sell() {
        System.out.println("물건을 판매합니다.");
    }
}
