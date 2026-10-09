package arena;
import java.util.ArrayList;
import java.util.List;
/** Represents the ARENA root object used by the use case. */
public class Arena {
    private final int maxTournaments;
    private final List<League> leagues = new ArrayList<>();
    private final List<Advertiser> advertisers = new ArrayList<>();
    private final List<InterestGroup> groups = new ArrayList<>();
    /** Creates an ARENA instance. */
    public Arena(int maxTournaments) { this.maxTournaments = maxTournaments; }
    /** Adds a league. */
    public void addLeague(League league) { leagues.add(league); }
    /** Adds an advertiser. */
    public void addAdvertiser(Advertiser advertiser) { advertisers.add(advertiser); }
    /** Adds an interest group. */
    public void addInterestGroup(InterestGroup group) { groups.add(group); }
    /** Checks the resource limit from the analysis model. */
    public boolean checkMaxTournament() { return getTournamentCount() < maxTournaments; }
    /** @return interested advertisers */
    public List<Advertiser> findInterestedExclusiveSponsors() {
        return advertisers.stream().filter(Advertiser::isInterestedInExclusiveSponsorship).toList();
    }
    /** @return interest groups */
    public List<InterestGroup> getInterestGroups() { return List.copyOf(groups); }
    /** @return current tournament count */
    public int getTournamentCount() {
        return leagues.stream().mapToInt(l -> l.getTournaments().size()).sum();
    }
}
