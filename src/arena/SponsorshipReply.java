package arena;
/** Represents an advertiser's sponsorship reply. */
public class SponsorshipReply {
    private final Advertiser advertiser;
    private final boolean accepted;
    /** Creates a reply. */
    public SponsorshipReply(Advertiser advertiser, boolean accepted) {
        this.advertiser = advertiser; this.accepted = accepted;
    }
    /** @return advertiser */
    public Advertiser getAdvertiser() { return advertiser; }
    /** @return whether accepted */
    public boolean isAccepted() { return accepted; }
}
