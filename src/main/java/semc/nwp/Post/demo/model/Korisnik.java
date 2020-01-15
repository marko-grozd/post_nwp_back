package semc.nwp.Post.demo.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the korisnik database table.
 * 
 */
@Entity
@NamedQuery(name="Korisnik.findAll", query="SELECT k FROM Korisnik k")
public class Korisnik implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_korisnik")
	private int idKorisnik;

	@Column(name="broj_lk")
	private String brojLk;

	@Column(name="broj_telefona")
	private String brojTelefona;

	private String email;

	private String ime;

	@Column(name="kucni_broj")
	private String kucniBroj;

	private String prezime;

	//bi-directional many-to-one association to FinansijksaTransakcija
	@OneToMany(mappedBy="korisnik1")
	@JsonIgnore
	private List<FinansijksaTransakcija> finansijksaTransakcijas1;

	//bi-directional many-to-one association to FinansijksaTransakcija
	@OneToMany(mappedBy="korisnik2")
	@JsonIgnore
	private List<FinansijksaTransakcija> finansijksaTransakcijas2;

	//bi-directional many-to-one association to Adresa
	@ManyToOne
	private Adresa adresa;

	//bi-directional many-to-one association to Paket
	@OneToMany(mappedBy="korisnik1")
	@JsonIgnore
	private List<Paket> pakets1;

	//bi-directional many-to-one association to Paket
	@OneToMany(mappedBy="korisnik2")
	@JsonIgnore
	private List<Paket> pakets2;

	//bi-directional many-to-one association to Pismo
	@OneToMany(mappedBy="korisnik1")
	@JsonIgnore
	private List<Pismo> pismos1;

	//bi-directional many-to-one association to Pismo
	@OneToMany(mappedBy="korisnik2")
	@JsonIgnore
	private List<Pismo> pismos2;

	public Korisnik() {
	}

	public int getIdKorisnik() {
		return this.idKorisnik;
	}

	public void setIdKorisnik(int idKorisnik) {
		this.idKorisnik = idKorisnik;
	}

	public String getBrojLk() {
		return this.brojLk;
	}

	public void setBrojLk(String brojLk) {
		this.brojLk = brojLk;
	}

	public String getBrojTelefona() {
		return this.brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getKucniBroj() {
		return this.kucniBroj;
	}

	public void setKucniBroj(String kucniBroj) {
		this.kucniBroj = kucniBroj;
	}

	public String getPrezime() {
		return this.prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public List<FinansijksaTransakcija> getFinansijksaTransakcijas1() {
		return this.finansijksaTransakcijas1;
	}

	public void setFinansijksaTransakcijas1(List<FinansijksaTransakcija> finansijksaTransakcijas1) {
		this.finansijksaTransakcijas1 = finansijksaTransakcijas1;
	}

	public FinansijksaTransakcija addFinansijksaTransakcijas1(FinansijksaTransakcija finansijksaTransakcijas1) {
		getFinansijksaTransakcijas1().add(finansijksaTransakcijas1);
		finansijksaTransakcijas1.setKorisnik1(this);

		return finansijksaTransakcijas1;
	}

	public FinansijksaTransakcija removeFinansijksaTransakcijas1(FinansijksaTransakcija finansijksaTransakcijas1) {
		getFinansijksaTransakcijas1().remove(finansijksaTransakcijas1);
		finansijksaTransakcijas1.setKorisnik1(null);

		return finansijksaTransakcijas1;
	}

	public List<FinansijksaTransakcija> getFinansijksaTransakcijas2() {
		return this.finansijksaTransakcijas2;
	}

	public void setFinansijksaTransakcijas2(List<FinansijksaTransakcija> finansijksaTransakcijas2) {
		this.finansijksaTransakcijas2 = finansijksaTransakcijas2;
	}

	public FinansijksaTransakcija addFinansijksaTransakcijas2(FinansijksaTransakcija finansijksaTransakcijas2) {
		getFinansijksaTransakcijas2().add(finansijksaTransakcijas2);
		finansijksaTransakcijas2.setKorisnik2(this);

		return finansijksaTransakcijas2;
	}

	public FinansijksaTransakcija removeFinansijksaTransakcijas2(FinansijksaTransakcija finansijksaTransakcijas2) {
		getFinansijksaTransakcijas2().remove(finansijksaTransakcijas2);
		finansijksaTransakcijas2.setKorisnik2(null);

		return finansijksaTransakcijas2;
	}

	public Adresa getAdresa() {
		return this.adresa;
	}

	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}

	public List<Paket> getPakets1() {
		return this.pakets1;
	}

	public void setPakets1(List<Paket> pakets1) {
		this.pakets1 = pakets1;
	}

	public Paket addPakets1(Paket pakets1) {
		getPakets1().add(pakets1);
		pakets1.setKorisnik1(this);

		return pakets1;
	}

	public Paket removePakets1(Paket pakets1) {
		getPakets1().remove(pakets1);
		pakets1.setKorisnik1(null);

		return pakets1;
	}

	public List<Paket> getPakets2() {
		return this.pakets2;
	}

	public void setPakets2(List<Paket> pakets2) {
		this.pakets2 = pakets2;
	}

	public Paket addPakets2(Paket pakets2) {
		getPakets2().add(pakets2);
		pakets2.setKorisnik2(this);

		return pakets2;
	}

	public Paket removePakets2(Paket pakets2) {
		getPakets2().remove(pakets2);
		pakets2.setKorisnik2(null);

		return pakets2;
	}

	public List<Pismo> getPismos1() {
		return this.pismos1;
	}

	public void setPismos1(List<Pismo> pismos1) {
		this.pismos1 = pismos1;
	}

	public Pismo addPismos1(Pismo pismos1) {
		getPismos1().add(pismos1);
		pismos1.setKorisnik1(this);

		return pismos1;
	}

	public Pismo removePismos1(Pismo pismos1) {
		getPismos1().remove(pismos1);
		pismos1.setKorisnik1(null);

		return pismos1;
	}

	public List<Pismo> getPismos2() {
		return this.pismos2;
	}

	public void setPismos2(List<Pismo> pismos2) {
		this.pismos2 = pismos2;
	}

	public Pismo addPismos2(Pismo pismos2) {
		getPismos2().add(pismos2);
		pismos2.setKorisnik2(this);

		return pismos2;
	}

	public Pismo removePismos2(Pismo pismos2) {
		getPismos2().remove(pismos2);
		pismos2.setKorisnik2(null);

		return pismos2;
	}

}