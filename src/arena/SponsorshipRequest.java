package arena;
/** Represents a simple sponsorship request. */
public class SponsorshipRequest {
    private final Tournament tournament;
    /** Creates a request. */
    public SponsorshipRequest(Tournament tournament) { this.tournament = tournament; }
    /** @return tournament */
    public Tournament getTournament() { return tournament; }
}
