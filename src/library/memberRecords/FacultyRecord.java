package library.memberRecords;

import library.enums.MemberType;

public class FacultyRecord extends MemberRecord {

    public FacultyRecord(int memberId, MemberType type, String dateOfMembership,
                         String memberName, String memberAddress, PhoneNumber phoneNumber) {
        super(memberId, type, dateOfMembership, memberName, memberAddress, phoneNumber);
    }

    @Override
    public void returnBookMessage() {
        System.out.println("Faculty must return the book within 4 weeks.");
    }

    @Override
    public void printMemberDetails() {
        System.out.println("Faculty Details: ");
        System.out.println("ID: " + getMemberId());
        System.out.println("Type: " + getType());
        System.out.println("Date of Membership: " + getDateOfMembership());
        System.out.println("Number of Books Borrowed: " + getNumberOfBooksBorrowed());
        System.out.println("Name: " + getMemberName());
        System.out.println("Address: " + getMemberAddress());
        System.out.println("Phone: " + getPhoneNumber());
    }
}
