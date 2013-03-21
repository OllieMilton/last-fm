package examples;

import java.util.Collection;

import de.umass.lastfm.Album;
import de.umass.lastfm.Playlist;
import de.umass.lastfm.Track;

public class AlbumExample {
	public static String key = "e70a5124cf4356f7f4ea774bbe5d5565";
	public static void main(String[] args) {
		//String mbid = "lwHl8fGzJyLXQR33ug60E8jhf4k-";//6c785e6a-b336-41e7-a2a0-638d028c04a1";
		Collection<Album> als = Album.search("the charlatans, the best of bbc", key);//getInfo("", "stax chartbuster, vol. 5", key);
		for (Album al : als) {
			System.out.println(al.getMbid());
			Playlist pl = Playlist.fetchAlbumPlaylist(al.getId(), key);
			for (Track t : pl.getTracks()) {
				System.out.println(t.getName()+" "+t.getPosition());
			}
		}
		
	}
}
