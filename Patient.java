package model;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String gender;

    public Patient(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGender(String gender) { this.gender = gender; }

    @Override
    public String toString() {
        return id + "," + name + "," + age + "," + gender;
    }

    // ✅ Safe parsing of patient from a CSV line
    public static Patient fromString(String line) {
        String[] parts = line.split(",");

        // ⚠️ Check for proper CSV format: exactly 4 parts
        if (parts.length != 4) {
            System.out.println("Skipping malformed line: " + line);
            return null;
        }

        try {
            int id = Integer.parseInt(parts[0].trim());
            String name = parts[1].trim();
            int age = Integer.parseInt(parts[2].trim());
            String gender = parts[3].trim();

            return new Patient(id, name, age, gender);

        } catch (NumberFormatException e) {
            // ⚠️ Log and skip invalid numeric fields
            System.out.println("Skipping line due to number format error: " + line);
            return null;
        }
    }
}
