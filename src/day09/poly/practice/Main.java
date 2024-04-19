package day09.poly.practice;

import java.util.Arrays;

// 기본 클래스 ComputerPart
class ComputerPart {

    protected String partName;
    protected double partPrice;

    public ComputerPart(String partName, double partPrice) {
        this.partName = partName;
        this.partPrice = partPrice;
    }

    public void describePart() {
        System.out.println("Part: " + partName + ", Price: " + partPrice);
    }
}

// 서브 클래스 Processor
class Processor extends ComputerPart {

    public Processor(String partName, double partPrice) {
        super(partName, partPrice);
    }

    @Override
    public void describePart() {
        System.out.println("Processor: " + partName + ", Price: " + partPrice);
    }
}

// 서브 클래스 Memory
class Memory extends ComputerPart {

    public Memory(String partName, double partPrice) {
        super(partName, partPrice);
    }

    @Override
    public void describePart() {
        System.out.println("Memory: " + partName + ", Price: " + partPrice);
    }
}

// 서브 클래스 HardDrive
class HardDrive extends ComputerPart {

    public HardDrive(String partName, double partPrice) {
        super(partName, partPrice);
    }

    @Override
    public void describePart() {
        System.out.println("Hard Drive: " + partName + ", Price: " + partPrice);
    }
}

// 부품 관리 클래스 Computer
class Computer {
    private ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[0];
    }

    public void addPart(ComputerPart part) {
        // ComputerPart[] 에 부품 추가
        ComputerPart[] temp = new ComputerPart[parts.length + 1];
        for (int i = 0; i < parts.length; i++) {
            temp[i] = parts[i];
        }
        temp[parts.length] = part;
        parts = temp;
    }

    public void showParts() {
        // 모든 부품 정보 출력
        for (ComputerPart part : parts) {
            part.describePart();

        }
    }
}

// Main 클래스
public class Main {
    public static void main(String[] args) {
        Computer myComputer = new Computer();
        myComputer.addPart(new Processor("Intel i7", 320000));
        myComputer.addPart(new Memory("Corsair Vengeance 16GB", 90000));
        myComputer.addPart(new HardDrive("Samsung SSD 1TB", 150000));

        myComputer.showParts();
    }
}