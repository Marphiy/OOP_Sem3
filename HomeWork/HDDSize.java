package Sem3.HomeWork;

public enum HDDSize {

    SIZE_1(64),
    SIZE_2(128),
    SIZE_3(256),
    SIZE_4(512),
    SIZE_5(1024);

    private final int size;

    private HDDSize(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }
}
