package exam02;

public class Box<T extends Fruit> {
    //T -> 타입의 약자, 타입을 투입
    //Box<T> -> T는 원래 문법 오류이기 때문에 제거(컴파일러가 컴파일하기 위해서)
    //그렇기 때문에 T부분이 Object로 대체된다.

    //& Eatable가 나오면 '인터페이스 제한이다'라고만 이해하면 된다.
    private T item;  //T item -> Apple(인스턴스 생성)

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }


    public String toString() { //T -> Fruit
        //Object item으로 밖에 인식못함

        //Fruit item
        //String itemNm = item.getItemNm(); //오류발생
        // ㄴ 출처(범위)를 명확하게 해주면 사용이 가능하다.
        //Fruit -> getItemNm();

        //return itemNm;
        return null;
    }
}
