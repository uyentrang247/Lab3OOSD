package arena;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/** Represents a league containing tournaments. */
public class League {
    private final String name;
    private final LeagueOwner owner;
    private final List<Tournament> tournaments = new ArrayList<>();
    /** Creates a league. */
    public League(String name, LeagueOwner owner) { this.name = name; this.owner = owner; }
    /** Creates and stores a tournament. */
    public Tournament createTournament(String name, int maxPlayers,
                                       LocalDate start, LocalDate end) {
        Tournament t = new Tournament(name, maxPlayers, start, end);
        tournaments.add(t); return t;
    }
    /** @return league name */
    public String getName() { return name; }
    /** @return owner */
    public LeagueOwner getOwner() { return owner; }
    /** @return tournaments */
    public List<Tournament> getTournaments() { return List.copyOf(tournaments); }
}
