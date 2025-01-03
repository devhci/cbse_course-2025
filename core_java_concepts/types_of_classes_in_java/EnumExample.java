package types_of_classes_in_java;// Enum
// Description: Represents a group of fixed constants.
// Use Case: Used for representing predefined sets of values like days of the week, states, or configurations.

public enum EnumExample {
    ONE, TWO, THREE;

    public static void main(String[] args) {
        EnumExample value = EnumExample.TWO;
        System.out.println("Selected value: " + value); // Using the enum
    }
}
