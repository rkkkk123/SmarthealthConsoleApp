# SmarthealthConsoleApp
A simple console-based Java application that allows you to create, view, search, and delete patient records using file I/O operations. This project is built according to the GUVI Galgotias 2nd Semester Marking Rubric and includes all required features for Review 1.

👨‍💻 Author
Roshan Kushwaha
B.Tech CSE with AI & ML
Galgotias University
Email: roshank70073@gmail.com

📋 Project Description
This application simulates a basic Smart Health Portal that can:

Add new patients

Display the list of all patients

Search patients by ID

Delete patient records

Store and manage data using file-based CRUD operations (no database)

🏗️ Project Structure
css
Copy
Edit
SmartHealthConsoleApp/
├── src/
│   └── main/
│       └── java/
│           └── SmartHealthApp/
│               ├── Main.java
│               ├── Patient.java
│               └── PatientService.java
├── patients.txt         <- Auto-created file to store patient data
├── README.md            <- This file
🧰 Technologies Used
Java 17

IntelliJ IDEA (Recommended IDE)

File I/O for CRUD

Object-Oriented Programming (OOP)

✅ Review 1 Rubric Fulfilled
Deliverable	Description	Status
JDK & IDE Setup	Project created in IntelliJ with Java 17	✅
Project Structure	Proper directory and class structure	✅
File Structure	Maintained clean src/main/java structure	✅
Auto File Creation	patients.txt auto-generated if not present	✅
File I/O Operations	Read/write patients using Java File I/O	✅
Layered Architecture	Model (Patient), Service (PatientService), Main class	✅
Input Validation	Checks for empty or invalid inputs	✅
Output Accuracy	Well-formatted, meaningful outputs	✅
Error Handling	Handles I/O and input errors gracefully	✅

🚀 How to Run This Project
Step 1: Prerequisites
Java JDK 17+

IntelliJ IDEA (or any Java IDE)

No external libraries required

Step 2: Setup Project
Extract the ZIP file.

Open IntelliJ IDEA.

Select Open > SmartHealthConsoleApp directory.

Set JDK:
Go to File > Project Structure > Project SDK → Choose Java 17 or higher.

Step 3: Run the App
Go to src/main/java/SmartHealthApp/Main.java

Right-click Main.java → Click Run 'Main.main()'

Use the console menu:

markdown
Copy
Edit
--- Smart Health Portal ---
1. Add Patient
2. View Patients
3. Search Patient by ID
4. Delete Patient by ID
5. Exit
Enter your choice:
📂 Data Storage
All patient data is stored in patients.txt (auto-created in project folder).

The file is human-readable and separated by commas.

💡 Features to Add in Future
GUI version using Java Swing

MySQL database integration

Login/authentication for admins

Report generation

📬 Contact
If you have any issues or suggestions:

📧 Email: roshank70073@gmail.com

This project is developed as part of Semester 2 Console Project - Galgotias University 2028 Passout Batch and reviewed by GUVI (An HCL Group Company).
