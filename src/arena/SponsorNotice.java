package arena;
/** Represents a notification to an advertiser. */
public class SponsorNotice {
    private final Advertiser advertiser;
    private final String message;
    /** Creates a notice. */
    public SponsorNotice(Advertiser advertiser, String message) {
        this.advertiser = advertiser; this.message = message;
    }
    /** Sends the notice using console output. */
    public void send() {
        System.out.println("Sponsor notice to " + advertiser.getEmail() + ": " + message);
    }
}
