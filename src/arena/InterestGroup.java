package arena;
import java.util.ArrayList;
import java.util.List;
/** Represents a group of users interested in a tournament. */
public class InterestGroup {
    private final String name;
    private final List<Player> players = new ArrayList<>();
    /** Creates an interest group. */
    public InterestGroup(String name) { this.name = name; }
    /** Adds a player. */
    public void addPlayer(Player player) { players.add(player); }
    /** @return group name */
    public String getName() { return name; }
    /** @return players in the group */
    public List<Player> getPlayers() { return List.copyOf(players); }
}
