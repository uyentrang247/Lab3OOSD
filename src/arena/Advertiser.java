package arena;
/** Represents an advertiser that may sponsor a tournament. */
public class Advertiser extends User {
    private final boolean interested;
    /** Creates an advertiser. */
    public Advertiser(String name, String email, boolean interested) {
        super(name, email); this.interested = interested;
    }
    /** @return whether the advertiser is interested in exclusive sponsorship */
    public boolean isInterestedInExclusiveSponsorship() { return interested; }
}
