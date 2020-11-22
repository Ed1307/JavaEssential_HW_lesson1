package computer;

public class Main {
    public static void main(String[] args) {

    Object[] computers = new Object[5];

    Computer c1 = new Computer();
    Computer c2 = new Computer();
    Computer c3 = new Computer();
    Computer c4 = new Computer();
    Computer c5 = new Computer();

    for (int i = 0; i<5; i++) {
        switch (i) {
            case 0:
                computers[i] = c1;
                break;
            case 1:
                computers[i] = c2;
                break;
            case 2:
                computers[i] = c3;
                break;
            case 3:
                computers[i] = c4;
                break;
            case 4:
                computers[i] = c5;
                break;
        }
    }
    }
}
