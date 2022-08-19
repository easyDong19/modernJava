package interfaceAndClass;

public class Worker implements Female, Male {
    public static final String MALE = "male";
    public static final String FEMALE = "female";
    private int age;
    private String name;
    private String sex;

    public Worker(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSex() {
        String returnValue = null;

        if(sex != null && "male".equals(sex)){
            returnValue = Male.super.getSex();
        }
        else if(sex != null && "female".equals(sex)){
            returnValue = Female.super.getSex();
        }
        else {
            returnValue = "N/A";
        }
        return returnValue;
    }

    @Override
    public String getInformation() {
        return Female.super.getInformation();
    }
}
