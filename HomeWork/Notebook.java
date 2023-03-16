package Sem3.HomeWork;

import java.util.concurrent.ThreadLocalRandom;

public class Notebook{
    private static int id = 1000;
    private int price;
    private int ROM;
    private int HDD;
    private CPU CPU;
    private Brand brand;
    private int idNum;

    public Notebook(){
        this.idNum = ++id;
        this.price = ThreadLocalRandom.current().nextInt(100, 2000);
        this.ROM = ROMSize.values()[ThreadLocalRandom.current().nextInt(4)].getSize();
        this.HDD = HDDSize.values()[ThreadLocalRandom.current().nextInt(5)].getSize();
        this.CPU = CPU.values()[ThreadLocalRandom.current().nextInt(10)];
        this.brand = Brand.values()[ThreadLocalRandom.current().nextInt(6)];
    }

    public int getPrice(){
        return price;
    }

    public int getROMSize(){
        return ROM;
    }

    public String getBrand(){
        return "" + brand;
    }

    public String getCPU(){
        return "" + CPU;
    }

    public int getHDD(){
        return HDD;
    }

    @Override
    public String toString() {
        return String.format("\nNotebook_%d, %s, %s, ROM %d, HDD %d, price $%d", this.idNum,
            brand, CPU, ROM, HDD, price);
    }

    
}
