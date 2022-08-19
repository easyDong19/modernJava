package interfaceAndClass;

public interface Human {
    public int getAge();

    public String getName();

    public String getSex();

    default String getInformation() {
        return "Human";
    }
}
