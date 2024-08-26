Java GUI Calculator
Description
This Java GUI Calculator is a simple desktop application created using Java Swing. It provides a user-friendly interface for performing basic arithmetic operations, including addition, subtraction, multiplication, and division. The application also supports decimal points and includes features for clearing and deleting input.

Features
Basic Arithmetic Operations: Perform addition, subtraction, multiplication, and division.
Decimal Point: Add decimal points to numeric input.
Clear Input: Clear the display with a single button press.
Delete Last Character: Remove the last character from the input.
User Interface: Utilizes Swing components to create a responsive and interactive interface.
Components
JFrame: The main window of the application.
JTextField: Displays current input and results.
JButton: Buttons for digits (0-9), operations (+, -, *, /), decimal point (.), equals (=), clear (CLEAR), and delete (DEL).
JPanel: Contains the grid layout for the calculator buttons.
Usage
Digits: Click on the number buttons (0-9) to enter numbers.
Decimal Point: Click on the decimal button (.) to add a decimal point to the current number.
Arithmetic Operations: Click on the addition (+), subtraction (-), multiplication (*), or division (/) buttons to select an operation.
Equals Button: Click on the equals (=) button to perform the calculation and display the result.
Clear Button: Click on CLEAR to reset the input field.
Delete Button: Click on DEL to remove the last character from the input field.
Installation
Ensure you have Java Development Kit (JDK) installed on your machine.
Save the provided calculator.java file to your local directory.
Open a terminal or command prompt and navigate to the directory containing calculator.java.
Compile the program using the command:
sh
Copy code
javac calculator.java
Run the program using the command:
sh
Copy code
java calculator
Code Overview
calculator Class: Implements the ActionListener interface to handle button actions and perform calculations.
Constructor (calculator()): Initializes the GUI components, sets up the layout, and adds action listeners.
actionPerformed(ActionEvent e): Handles user interactions with the buttons, performs arithmetic operations, and updates the display.


Example output
![cal s1](https://github.com/user-attachments/assets/3ecdc325-2b90-4885-a0da-1b1876fd6f55)
