package interfaceAndClass;

public interface HouseAddress {
    public static final String DefaultCountry = "Korea";

    public String getPostCode();

    public String getAddress();

    public String getDetailAddress();


    default public String getCountryCode() {
        return HouseAddress.DefaultCountry;
    }
    private String getDefaultCountryCode() {
        return HouseAddress.DefaultCountry;
    }
}
