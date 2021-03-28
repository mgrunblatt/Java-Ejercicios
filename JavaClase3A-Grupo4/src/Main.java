public class Main {

    public static void main(String[] args) {
        Password password= new Password("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@!])\\S{6,12}$");

        Password password1= new Password("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@!])\\S{6,12}$");

        Password password2=new PasswordFuerte();

        System.out.println(password);
    }
}
