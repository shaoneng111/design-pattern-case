package Flyweight;

public class Flyweight {

    private String intrinsicState;

    //内部状态instrinsicState作为成员变量
    public Flyweight (String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }


    //外部状态extrinsicState在使用时由外部设置
    public void opration(String extrinsicState) {
        System.out.println(extrinsicState);
    }
}
