package library.enums;

public enum MemberType {
    STUDENT("s"),
    FACULTY("f");

    private final String type;
    MemberType(String type){
        this.type = type;
    }
}
