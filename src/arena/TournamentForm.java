package arena;
import java.time.LocalDate;
/** Boundary object used to enter tournament information. */
public class TournamentForm {
    private String name;
    private int maxPlayers;
    /** Creates a form for a league. */
    public static TournamentForm newTournament(League league) { return new TournamentForm(); }
    /** Sets tournament name. */
    public void setName(String name) { this.name = name; }
    /** Sets maximum players. */
    public void setMaxPlayers(int maxPlayers) { this.maxPlayers = maxPlayers; }
    /** Commits the form to the control object. */
    public Tournament commit(AnnounceTournamentControl control, Arena arena, League league) {
        return control.createTournament(arena, league, name, maxPlayers,
                LocalDate.now().plusDays(7), LocalDate.now().plusDays(14));
    }
}
