package initializeBlock;

public class OverInitializedClass {

    private int field = 1;

    public int getField() {
        return field;
    }

    {
        field = 2;
        System.out.println("initialize block " + field);
    }

    public OverInitializedClass() {
        this.field = 3;
        System.out.println("constructor " + field);
    }
}
