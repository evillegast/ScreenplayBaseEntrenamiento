
package utils;

public enum UserEnum {
    USER_NAME("Admin"),
    USER_PASSWORD("admin123");

    private String value;

    public String getValue() {
        return value;
    }

    UserEnum(String value) {
        this.value = value;
    }
}
