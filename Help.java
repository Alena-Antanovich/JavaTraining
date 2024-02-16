/* Simple console help system.
   Here will be the menu with options to select the instruction.
   As soon as you choose one of the menu points you'll see
   a short description of the current instruction.
 */
class Help {
    public static void main(String args[])
        throws java.io.IOException {

        char choice;

        System.out.println("Help:");
        System.out.println("   1. if");
        System.out.println("   2. switch");
        System.out.println("Select the instruction: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch(choice) {
            case '1':
                System.out.println("The instruction if:\n");
                System.out.println("if(condition) instruction;");
                System.out.println("else instruction;");
                break;
            case '2':
                System.out.println("The instruction switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("    case a conctant:");
                System.out.println("        the sequence of instructions");
                System.out.println("        break;");
                System.out.println("      // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Selection was not founded.");
        }
    }
}