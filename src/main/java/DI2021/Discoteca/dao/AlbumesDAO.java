package DI2021.Discoteca.dao;

import java.util.ArrayList;
import java.util.List;

import DI2021.Discoteca.models.Album;
import DI2021.Discoteca.services.AlbumRecoveryService;

public class AlbumesDAO implements DAO{

	@Override
	public Object get(long id) {
		
		return null;
	}

	@Override
	public List getAll() {		
		List<Album> miAlbum = AlbumRecoveryService.getAllAlbums();
		return miAlbum;
	}

	@Override
	public void save(Object t) {
		ArrayList<Album> guardoMiAlbum = (ArrayList<Album>) AlbumRecoveryService.getAllAlbums();
		guardoMiAlbum.add((Album) t);
		AlbumRecoveryService.saveAlbums(guardoMiAlbum);		
	}

	@Override //FALTA, sin id no se como coger el objeto
	public void update(Object t, String[] params) {
		List<Album> miAlbum = AlbumRecoveryService.getAllAlbums();
		
		//miAlbum.get();
	}

	@Override
	public void delete(Object t) {
		List<Album> miAlbum = AlbumRecoveryService.getAllAlbums();
		miAlbum.remove(t);
		AlbumRecoveryService.saveAlbums(miAlbum);		
	}

	
	
} //FIN CLASS
