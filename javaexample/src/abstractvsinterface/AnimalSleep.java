package abstractvsinterface;

public interface AnimalSleep extends AnimalBreath {
    String time = "8h";

    void sleep();

    @Override
    void breath();
}
