# Lab 03 - AnnounceTournament

Project Java mô phỏng đơn giản UC `AnnounceTournament` của ARENA.

## Chạy
Yêu cầu JDK 17+.

```bash
javac -d out src/arena/*.java
java -cp out arena.Main
```

## Mapping chính
- `TournamentForm`: boundary object.
- `AnnounceTournamentControl`: control object.
- `Arena`, `League`, `Tournament`: entity objects.
- `Advertiser`, `SponsorshipRequest`, `SponsorshipReply`, `SponsorNotice`: phần sponsorship mô phỏng.
- `InterestGroup`, `InterestGroupNotice`: phần thông báo nhóm quan tâm.

Luồng tạo tournament bám theo sequence diagram: form -> control -> `checkMaxTournament()` -> league -> tournament.
