package DI2021.Discoteca.utils;

import java.util.List;

import DI2021.Discoteca.models.Album;
import DI2021.Discoteca.services.AlbumRecoveryService;

public class AlbumUtils {
	public static boolean ValidarURLMetadata(String metaInfo) {
		List<Album> myAlbums = AlbumRecoveryService.getAllAlbums();
		
		for(Album album : myAlbums) {
			//Arreglar condicion del if, tengo que comparar si es igual el comienzo, no todo.
			if (album.getMetaInfo() != "https://en.wikipedia.org/wiki/") {
				album.setMetaInfo("https://en.wikipedia.org/wiki/" + album.getMetaInfo());
			}
				
		}
		// debe validar que las url de metadatos de los albums referencian 
		// al sitio web del disco en la wikipedia.
		return (Boolean) null;
	}
}
