package arena;
import java.time.LocalDate;
/** Represents a tournament announced in a league. */
public class Tournament {
    private final String name;
    private final int maxPlayers;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private Advertiser sponsor;
    /** Creates a tournament. */
    public Tournament(String name, int maxPlayers, LocalDate startDate, LocalDate endDate) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name is required.");
        if (maxPlayers <= 0) throw new IllegalArgumentException("Max players must be positive.");
        this.name = name; this.maxPlayers = maxPlayers;
        this.startDate = startDate; this.endDate = endDate;
    }
    /** @return tournament name */
    public String getName() { return name; }
    /** @return maximum players */
    public int getMaxPlayers() { return maxPlayers; }
    /** @return start date */
    public LocalDate getStartDate() { return startDate; }
    /** @return end date */
    public LocalDate getEndDate() { return endDate; }
    /** @return sponsor or null */
    public Advertiser getSponsor() { return sponsor; }
    /** Sets the sponsor. */
    public void setSponsor(Advertiser sponsor) { this.sponsor = sponsor; }
    @Override public String toString() {
        return "Tournament{name='%s', maxPlayers=%d, start=%s, end=%s}"
                .formatted(name, maxPlayers, startDate, endDate);
    }
}
