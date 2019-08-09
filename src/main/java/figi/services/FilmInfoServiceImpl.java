package figi.services;

import figi.pojo.FilmInfo;
import figi.repositories.FilmInfoRepository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;

@Service
public class FilmInfoServiceImpl implements FilmInfoService{
	private FilmInfoRepository filmInfoRepository;
	
	@Autowired
	public FilmInfoServiceImpl(FilmInfoRepository filmInfoRepository) {
		this.filmInfoRepository = filmInfoRepository;
	}
	
	@Override
	public List<FilmInfo> vindAlle(){
		List<FilmInfo> films = new ArrayList<>();
		filmInfoRepository.findAll().forEach(films::add);
		return films;
	}
	
	@Override
	public FilmInfo vindMetId(Long id) {
		return filmInfoRepository.findById(id).orElse(null);
	}
	
	@Override
	public FilmInfo opslaan(FilmInfo film) {
		filmInfoRepository.save(film);
		return film;
	}
	
	@Override
	public void verwijder(Long id) {
		filmInfoRepository.deleteById(id);
	}

}
