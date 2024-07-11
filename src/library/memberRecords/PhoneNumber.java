package library.memberRecords;

public class PhoneNumber {
    private String phoneNumber;

    // Default (US) number
    public PhoneNumber() {
        this.phoneNumber = "+1";
    }

    // Number provided from user
    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isUSNumber() {
        return phoneNumber.startsWith("+1");
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

