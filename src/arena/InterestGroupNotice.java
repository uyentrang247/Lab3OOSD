package arena;
/** Represents a notification to an interest group. */
public class InterestGroupNotice {
    private final InterestGroup group;
    private final String message;
    /** Creates a notice. */
    public InterestGroupNotice(InterestGroup group, String message) {
        this.group = group; this.message = message;
    }
    /** Sends the notice using console output. */
    public void send() {
        for (Player p : group.getPlayers())
            System.out.println("Interest notice to " + p.getEmail() + ": " + message);
    }
}
