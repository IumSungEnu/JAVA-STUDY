package exam02;

public enum Tansportation {
    //관례로 대문자를 사용한다.
    SUBWAY(1450){
        @Override
        public int totalFare(int persons) {
            return persons * getBasicFare();
        }
    }, BUS(1350){
        @Override
        public int totalFare(int persons) {
            return persons * getBasicFare();
        }
    }, TAXI(4000){
        @Override
        public int totalFare(int persons) {
            return persons * getBasicFare();
        }
    }, TRAIN(10000){
        @Override
        public int totalFare(int persons) {
            return persons * getBasicFare();
        }
    };

    private int basicFare;  //생성자 메서드 추가
    Tansportation(int basicFare){
        this.basicFare = basicFare;
    }
    public int getBasicFare(){
        return basicFare;
    }
    public abstract int totalFare(int persons);  //추상메서드
}
