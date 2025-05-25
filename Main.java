import model.Patient;
import service.PatientService;

import java.util.Scanner;

public class Main {
    private static PatientService service = new PatientService();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Patient\n2. View All\n3. Search\n4. Update\n5. Delete\n6. Exit");
            int ch = Integer.parseInt(sc.nextLine());
            switch (ch) {
                case 1 -> addPatient();
                case 2 -> viewAll();
                case 3 -> searchPatient();
                case 4 -> updatePatient();
                case 5 -> deletePatient();
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void addPatient() {
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Gender (M/F): ");
            String gender = sc.nextLine();
            service.addPatient(new Patient(id, name, age, gender));
            System.out.println("Patient added!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
    }

    private static void viewAll() {
        for (Patient p : service.getAllPatients()) {
            System.out.println(p);
        }
    }

    private static void searchPatient() {
        System.out.print("Enter ID to search: ");
        int id = Integer.parseInt(sc.nextLine());
        Patient p = service.getPatientById(id);
        System.out.println(p != null ? p : "Not found!");
    }

    private static void updatePatient() {
        System.out.print("Enter ID to update: ");
        int id = Integer.parseInt(sc.nextLine());
        Patient p = service.getPatientById(id);
        if (p == null) {
            System.out.println("Patient not found!");
            return;
        }
        System.out.print("Enter New Name: ");
        String name = sc.nextLine();
        System.out.print("Enter New Age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter New Gender: ");
        String gender = sc.nextLine();
        service.updatePatient(new Patient(id, name, age, gender));
        System.out.println("Patient updated!");
    }

    private static void deletePatient() {
        System.out.print("Enter ID to delete: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean removed = service.deletePatient(id);
        System.out.println(removed ? "Deleted!" : "Not found!");
    }
}