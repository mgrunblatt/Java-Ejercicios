import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Password {

    private String regex;
    private String password;


    public Password() {
    }

    public Password(String regular){
        this.regex=regular;
        Pattern.compile(this.regex);
    }

    public void setValue(String pwd){
        Pattern pattern = Pattern.compile(this.regex);
        Matcher matcher = pattern.matcher(pwd);
        boolean matchFound = matcher.find();
        if(matchFound){
            this.password=pwd;
        }else{
            throw new IllegalArgumentException();
        }
    }

}
