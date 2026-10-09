package arena;
import java.time.LocalDate;
import java.util.List;
/**
 * Control object for the AnnounceTournament use case.
 *
 * <p>Coordinates boundary objects and entity objects in the simplified model.</p>
 */
public class AnnounceTournamentControl {
    /** Creates a tournament after checking the ARENA resource limit. */
    public Tournament createTournament(Arena arena, League league, String name,
                                       int maxPlayers, LocalDate start, LocalDate end) {
        if (!arena.checkMaxTournament())
            throw new IllegalStateException("Maximum number of tournaments reached.");
        return league.createTournament(name, maxPlayers, start, end);
    }
    /** Finds advertisers interested in exclusive sponsorship. */
    public List<Advertiser> findInterestedExclusiveSponsors(Arena arena) {
        return arena.findInterestedExclusiveSponsors();
    }
    /** Sends a simple sponsorship request. */
    public SponsorshipRequest requestSponsorship(Advertiser advertiser, Tournament tournament) {
        System.out.println("Sponsorship request sent to " + advertiser.getEmail()
                + " for " + tournament.getName());
        return new SponsorshipRequest(tournament);
    }
    /** Applies an accepted sponsorship reply. */
    public void confirmSponsor(SponsorshipReply reply, Tournament tournament) {
        if (reply.isAccepted()) tournament.setSponsor(reply.getAdvertiser());
    }
    /** Notifies an advertiser about the sponsorship decision. */
    public void notifySponsor(Advertiser advertiser, boolean accepted) {
        new SponsorNotice(advertiser,
                accepted ? "Sponsorship accepted." : "Sponsorship not selected.").send();
    }
    /** Notifies all interest groups about a new tournament. */
    public void notifyInterestGroups(Arena arena, Tournament tournament) {
        for (InterestGroup group : arena.getInterestGroups())
            new InterestGroupNotice(group,
                    "New tournament announced: " + tournament.getName()).send();
    }
}
