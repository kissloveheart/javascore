package finalkeywork;

public class TestExtend {
    private Integer number;
    private String string;

    public TestExtend(Integer number) {
        this.number = number;
    }

    public final void testOverriding(){
        System.out.println("Can not overriding");
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
