import library.enums.MemberType;
import library.memberRecords.PhoneNumber;
import library.memberRecords.StudentRecord;

public class Main {
    public static void main(String[] args) {

        // Varsayılan US numarası ile öğrenci kaydı oluşturma
        StudentRecord defaultStudent = new StudentRecord();
        defaultStudent.setMemberId(123);
        defaultStudent.setType(MemberType.STUDENT);
        defaultStudent.setDateOfMembership("2023-01-01");
        defaultStudent.setMemberName("John Doe");
        defaultStudent.setMemberAddress("123 Main St, Anytown, USA");
        System.out.println(defaultStudent);
        defaultStudent.printMemberDetails();

        // Kullanıcı tarafından sağlanan telefon numarası ile öğrenci kaydı oluşturma
        PhoneNumber customPhoneNumber = new PhoneNumber("+44-20-7946-0958");
        StudentRecord customStudent = new StudentRecord(456, MemberType.STUDENT, "2023-02-01",
                "Jane Smith", "456 Elm St, Othertown, UK", customPhoneNumber);
        System.out.println(customStudent);
        customStudent.printMemberDetails();
    }
    }
