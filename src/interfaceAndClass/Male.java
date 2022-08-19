package interfaceAndClass;

public interface Male extends Human{
    public static String SEX = "male";

    @Override
    default String getSex() {
        return Male.SEX;
    }
}
