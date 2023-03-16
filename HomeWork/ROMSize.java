package Sem3.HomeWork;

public enum ROMSize {
    
    FOUR(4),
    EIGHT(8),
    SIXTEEN(16),
    THIRTYTWO(32);

    private final int size;

    private ROMSize(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }
}


