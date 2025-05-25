package util;

import model.Patient;

import java.io.*;
import java.util.*;

public class FileUtil {
    private static final String FILE_PATH = "data/patients.txt";

    public static List<Patient> loadPatients() {
        List<Patient> list = new ArrayList<>();
        File file = new File(FILE_PATH);
        try {
            if (!file.exists()) file.createNewFile();
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                list.add(Patient.fromString(line));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
        return list;
    }

    public static void savePatients(List<Patient> patients) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (Patient p : patients) {
                pw.println(p.toString());
            }
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
}