package edu.cnm.deepdive.chap3;

public class HelpSystem {
  public static void main(String args[])
  /**
   * Help System
   * Asks user to input help for either if statement or switch statement
   * throws exception clause is necessary to handle input errors
   * throws is required when using the system.in.read
   */
    throws java.io.IOException {
    char choice;

    System.out.println("Help on:");
    System.out.println(" 1. if");
    System.out.println(" 2. switch");
    System.out.println("Choose one: ");

    //system input works with throw.
    choice = (char) System.in.read();

    switch(choice) {
      case '1':
        System.out.println("The if:\n");
        System.out.println("if(condition) statement;");
        System.out.println("else statement;");
        break;
      case '2':
        System.out.println("The switch:\n");
        System.out.println("switch(expression) {");
        System.out.println("  case constant:");
        System.out.println("    statement sequence");
        System.out.println("    break;");
        System.out.println("  // ...");
        System.out.println("}");
        break;
      default:
        System.out.print("Selection not found");
    }
  }

}
