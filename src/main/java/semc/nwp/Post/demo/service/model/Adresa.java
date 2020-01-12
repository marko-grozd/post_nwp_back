package semc.nwp.Post.demo.service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the adresa database table.
 * 
 */
@Entity
@NamedQuery(name="Adresa.findAll", query="SELECT a FROM Adresa a")
public class Adresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_adresa")
	private int idAdresa;

	@Column(name="naziv_ulice")
	private String nazivUlice;

	//bi-directional many-to-one association to Grad
	@ManyToOne
	private Grad grad;

	//bi-directional many-to-one association to Korisnik
	@OneToMany(mappedBy="adresa")
	@JsonIgnore
	private List<Korisnik> korisniks;

	public Adresa() {
	}

	public int getIdAdresa() {
		return this.idAdresa;
	}

	public void setIdAdresa(int idAdresa) {
		this.idAdresa = idAdresa;
	}

	public String getNazivUlice() {
		return this.nazivUlice;
	}

	public void setNazivUlice(String nazivUlice) {
		this.nazivUlice = nazivUlice;
	}

	public Grad getGrad() {
		return this.grad;
	}

	public void setGrad(Grad grad) {
		this.grad = grad;
	}

	public List<Korisnik> getKorisniks() {
		return this.korisniks;
	}

	public void setKorisniks(List<Korisnik> korisniks) {
		this.korisniks = korisniks;
	}

	public Korisnik addKorisnik(Korisnik korisnik) {
		getKorisniks().add(korisnik);
		korisnik.setAdresa(this);

		return korisnik;
	}

	public Korisnik removeKorisnik(Korisnik korisnik) {
		getKorisniks().remove(korisnik);
		korisnik.setAdresa(null);

		return korisnik;
	}

}