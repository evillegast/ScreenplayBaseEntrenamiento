
package utils;

public enum UserEnum {
    USER_NAME("Admin"),
    USER_PASSWORD("admin123"),
    FIRTS_NAME1("Edison"),
    MIDDLE_NAME("Ferney"),
    LASTNAME("Villegas"),
    INP_LICENCIA_TXT("71704555");





    private String value;

    public String getValue() {
        return value;
    }

    UserEnum(String value) {
        this.value = value;
    }


}
