package arena;
/** Runs a small console demonstration of AnnounceTournament. */
public final class Main {
    private Main() {}
    /** Runs the demonstration. */
    public static void main(String[] args) {
        Arena arena = new Arena(5);
        LeagueOwner owner = new LeagueOwner("Nguyen Van A", "owner@arena.test");
        League league = new League("Student League", owner);
        arena.addLeague(league);

        Advertiser advertiser =
                new Advertiser("ABC Company", "sponsor@abc.test", true);
        arena.addAdvertiser(advertiser);

        InterestGroup group = new InterestGroup("Chess Fans");
        group.addPlayer(new Player("Tran Van B", "player@arena.test"));
        arena.addInterestGroup(group);

        AnnounceTournamentControl control = new AnnounceTournamentControl();
        TournamentForm form = TournamentForm.newTournament(league);
        form.setName("ARENA Student Tournament");
        form.setMaxPlayers(16);

        Tournament tournament = form.commit(control, arena, league);

        var sponsors = control.findInterestedExclusiveSponsors(arena);
        if (!sponsors.isEmpty()) {
            Advertiser selected = sponsors.get(0);
            control.requestSponsorship(selected, tournament);
            control.confirmSponsor(new SponsorshipReply(selected, true), tournament);
            control.notifySponsor(selected, true);
        }
        control.notifyInterestGroups(arena, tournament);
        System.out.println("Created: " + tournament);
    }
}
