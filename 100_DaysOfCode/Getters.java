class myPassword {
    private String Password;
    
    void setPassword(String newPassword) {
        this.Password = newPassword;
    }

    String getPassword() {
        return this.Password;
    }

}


public class Getters {
    public static void main(String[] args) {
        myPassword p = new myPassword();
        p.setPassword("2*&(989*(&9%#*");
        System.out.println(p.getPassword());
    }
}
