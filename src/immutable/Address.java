package immutable;

public class Address {
    private int code;
    private String city;
    private String state;


    public Address(int code, String city, String state) {
        this.code = code;
        this.city = city;
        this.state = state;
    }

    public int getCode() {
        return code;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "code=" + code +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
