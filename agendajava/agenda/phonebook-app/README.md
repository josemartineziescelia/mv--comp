# Phonebook Application

This is a simple phonebook application developed in Java. It allows users to manage their contacts by adding, removing, and searching for phone numbers. The application stores contact information in a binary file for persistence.

## Project Structure

```
phonebook-app
├── src
│   ├── Main.java               # Entry point of the application
│   ├── model
│   │   └── Contact.java        # Represents a contact in the phonebook
│   ├── service
│   │   └── PhonebookService.java # Manages phonebook operations
│   └── util
│       └── FileUtil.java       # Utility methods for file operations
├── data
│   └── phonebook.dat           # Stores serialized contacts
├── build.gradle                 # Gradle build configuration
└── README.md                    # Project documentation
```

## Features

- Add new contacts
- Remove existing contacts
- Search for contacts by name or phone number
- Load and save contacts to a file

## Getting Started

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```
   cd phonebook-app
   ```

3. Build the project using Gradle:
   ```
   ./gradlew build
   ```

4. Run the application:
   ```
   java -cp build/libs/phonebook-app.jar Main
   ```

## Usage

Follow the on-screen instructions to manage your phonebook. You can add, remove, and search for contacts easily.

## License

This project is licensed under the MIT License.