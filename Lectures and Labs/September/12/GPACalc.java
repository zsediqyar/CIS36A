
class GPACalc {
    public static void main(String[] args) throws java.io.IOException
    {
        char grade;
        double gpa;

        System.out.println("Enter your grade as [A, B, C, D, F]");
        grade = (char) System.in.read();

        switch(grade) {
            case 'A':
                gpa = 4.0;
                break;
            case 'B':
                gpa = 3.0;
                break;
            case 'C':
                gpa = 2.0;
                break;
            case 'D':
                gpa = 1.0;
                break;
            case 'F':
                gpa = 0.0;
                break;
            default:
            gpa = 0.0;
            System.out.println("Invalid Entry");
        }
    
    System.out.println("Your GPA is: " +  gpa);
    }
}