public class LibraryRefactor {

  private String id;
  private String name;
  private String artist;
  private String album;

  public Track(
    final String id,
    final String name,
    final String artist,
    final String album
  ) {
    this.id = id;
    this.name = name;
    this.artist = artist;
    this.album = album;
  }
  public String getTrackInfo() {
    return this.id + this.name + this.artist + this.album;
  }
}
final Track t01 = ("t01", "Code Monkey", "Jonathon Coulton", "Thing a Week Three");
track.getTrackInfo();
