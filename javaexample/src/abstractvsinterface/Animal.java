package abstractvsinterface;

public abstract class Animal {
    private String name;
    private Integer leg;

    public Animal(String name, Integer leg) {
        this.name = name;
        this.leg = leg;
    }

    public abstract void eat();
    public abstract void drink();

    public void whatIsAnimal(){
        if (leg == 4){
            System.out.println("Động vật 4 chân");
        }
        else if (leg == 2){
            System.out.println("Động vật 2 chân");
        } else {
            System.out.println("Chưa xác định");
        }

    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", leg=" + leg +
                '}';
    }
}
