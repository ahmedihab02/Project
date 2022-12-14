public class Member {
private final String username;
private final String password;
private final String firstName;

private static final Map<String, String> loginMember = new HashMap<>();


public Member(String username, String password, String firstName) {
    this.username = username;
    this.password = password;
    this.firstName = firstName;
}

public String getUsername() {
    return this.username + "";
}

public String getPassword() {
    return this.password + "";
}

public String getFirstName() {
    return this.firstName + "";
}

public boolean isMemberExist(Member member){
    if(loginMember.containsKey(member.getUserName()) && loginMember.containsValue(member.getPassword())){
        return true;
    } else {
        System.out.println("No member in the list!");
    }
    return false;
}