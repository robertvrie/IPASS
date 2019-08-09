package figi.services;

import figi.pojo.Zaal;

import java.util.List;

public interface ZaalService {
    List<Zaal> vindAlle();

    void verwijder(Long id);

    Zaal opslaan(Zaal zaal);
}
