package figi.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Zaal {

    @Id
    private Long id;
    private int aantalRijen;
    private int aantalStoelenPerRij;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public int getAantalRijen() { return aantalRijen; }
    public void setAantalRijen(int aantalRijen) { this.aantalRijen = aantalRijen; }
    public int getAantalStoelenPerRij() { return aantalStoelenPerRij; }
    public void setAantalStoelenPerRij(int aantalStoelenPerRij) { this.aantalStoelenPerRij = aantalStoelenPerRij; }
}