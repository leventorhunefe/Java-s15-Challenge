package library.memberRecords;

import library.enums.MemberType;

import java.util.Objects;

public abstract class MemberRecord {
    private int memberId;
    private MemberType type;
    private String dateOfMembership;
    private int numberOfBooksBorrowed = 0;
    private final int maxNumberOfBooksBorrowed = 5;
    private String memberName;
    private String memberAddress;
    private PhoneNumber phoneNumber;

    // Default constructor
    public MemberRecord() {
        this.phoneNumber = new PhoneNumber(); // Varsayılan US numarası ile başlat
    }

    // Constructor with parameter
    public MemberRecord(int memberId, MemberType type, String dateOfMembership,
                        String memberName, String memberAddress, PhoneNumber phoneNumber) {
        this.memberId = memberId;
        this.type = type;
        this.dateOfMembership = dateOfMembership;
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        this.phoneNumber = phoneNumber;
    }

    public abstract void returnBookMessage();

    // Abstract method to be implemented by subclasses
    public abstract void printMemberDetails();


    // Getter ve Setter methods
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public MemberType getType() {
        return type;
    }

    public void setType(MemberType type) {
        this.type = type;
    }

    public String getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(String dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public int getNumberOfBooksBorrowed() {
        return numberOfBooksBorrowed;
    }

    public void setNumberOfBooksBorrowed(int numberOfBooksBorrowed) {
        if (numberOfBooksBorrowed <= maxNumberOfBooksBorrowed) {
            this.numberOfBooksBorrowed = numberOfBooksBorrowed;
        } else {
            throw new IllegalArgumentException("Number of borrowed books cannot exceed " + maxNumberOfBooksBorrowed);
        }
    }

    public int getMaxNumberOfBooksBorrowed() {
        return maxNumberOfBooksBorrowed;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "MemberRecord{" +
                "memberId=" + memberId +
                ", type=" + type +
                ", dateOfMembership='" + dateOfMembership + '\'' +
                ", numberOfBooksBorrowed=" + numberOfBooksBorrowed +
                ", memberName='" + memberName + '\'' +
                ", memberAddress='" + memberAddress + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberRecord that = (MemberRecord) o;
        return memberId == that.memberId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(memberId);
    }
}
