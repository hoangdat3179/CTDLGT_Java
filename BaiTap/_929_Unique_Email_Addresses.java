import java.util.HashSet;
import java.util.Set;

public class _929_Unique_Email_Addresses {
    public static int numUniqueEmails(String[] emails) {
        
        HashSet<String> set=new HashSet<>();
        
        for(int i=0;i<emails.length;i++){
            String local=emails[i].split("@")[0];
            String domain=emails[i].split("@")[1];
            
            if(local.contains("+")){
                local=local.split("\\+")[0];
            }
            
            local=local.replaceAll("\\.", ""); 
            set.add(local+"@"+domain);
        }
        return set.size();
    }
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }
}
