package day07.encap;

public class Car {

    private String model;
    private int speed;
    private char mode;
    private boolean start;


    //

    Car(String model) {
        this.model = model;
        this.mode = 'P';
    }

    // 엔진에 연료 주입
    void injectGasoline() {

        if (start) {
            System.out.println("엔진에 연료가 주입됩니다.");
        } else {
            System.out.println("시동이 켜지지 않았습니다.");
            System.out.println("자동차가 폭발합니다.");
        }
    }

    // 엔진오일이 순환하는 기능
    void moveEngineOil() {
        System.out.println("엔진오일이 순환합니다.");
    }

    // 엔진 내부에 있는 실린더가 작동하는 기능
    void moveCylinder() {
        System.out.println("엔진 내부 실린더가 왕복으로 움직입니다.");
    }

    // 시동버튼을 누르는 기능
    void startStop() {
        this.start = !this.start;
    }

    //setter 메서드 : 필드값을 안전하게 설정하기 위한 검증메서드
    public void setSpeed(int speed) {

        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            this.speed = 0;
            this.start = false;
            this.mode = 'P';
            System.out.println("제한속도 위반으로 시동이 안전하게 꺼졌습니다.");
        }
    }

    // 현재 속도값을 가져오는 메서드
    // getter 메서드: 정보은닉된 필드를 가져오는 대리 메서드
    public int getSpeed() {
        return this.speed;
    }

    public void setMode(char mode) {
        switch (mode) {
            case 'P':
            case 'N':
            case 'D':
            case 'R':
                this.mode = mode;
                break;
            default:
                this.mode = 'P';
        }
    }

    public char getMode() {
        return mode;
    }
}
