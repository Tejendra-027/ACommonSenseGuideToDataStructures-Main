import java.util.HashMap;
import java.util.Map;

public class VoteCounter {

    
    private static Map<String, Integer> votes = new HashMap<>();

   
    public static void addVote(String candidate) {
        if (votes.containsKey(candidate)) {
            votes.put(candidate, votes.get(candidate) + 1);
        } else {
            votes.put(candidate, 1);
        }
    }

    
    public static Map<String, Integer> countVotes() {
        return votes;
    }

    public static void main(String[] args) {
        
        addVote("Thomas Jefferson");
        addVote("John Adams");
        addVote("John Adams");
        addVote("Thomas Jefferson");
        addVote("John Adams");

       
        System.out.println("Final vote count:");
        for (Map.Entry<String, Integer> entry : countVotes().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
