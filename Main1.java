public class Main1 {
private static final Scanner sc = new Scanner(System.in);
private static Member member = new Member("blabla","blabla","bla");
public static void main(String[] args) {

    boolean exitRequested = false;
    while(!exitRequested) {
        System.out.println("Press: " + "\n" +
                        "\r" + "1.Register" + "\n" +
                        "\r" + "2.Log in" + "\n" +
                        "\r" + "3.Exit.");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                register();
                break;

            case 2:
                login();
                break;

            case 3:
                exitRequested = true;
                break;

            default:
                System.out.println("?");
                break;
        }
    }

}
public static void register() {
    System.out.println("What's your first name?");
    String firstName = sc.next();
    System.out.println("Please enter username");
    String username = sc.next();
    System.out.println("Please enter password");
    String password = sc.next();
    Member newMember = new Member(username,password,firstName);
    member.register(newMember);
}

public static void login(){ // here I got stuck I seriously dont know how to continue...
    System.out.println("Username:");
    String username = sc.next();
    System.out.println("Password:");
    String password = sc.next();

}