package semc.nwp.Post.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the paket database table.
 * 
 */
@Entity
@NamedQuery(name="Paket.findAll", query="SELECT p FROM Paket p")
public class Paket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idpaket;

	@Temporal(TemporalType.DATE)
	@Column(name="datum_prijema")
	private Date datumPrijema;

	@Temporal(TemporalType.DATE)
	@Column(name="datum_prispeca")
	private Date datumPrispeca;

	private String napomena;

	private int tezina;

	//bi-directional many-to-one association to Korisnik
	@ManyToOne
	@JoinColumn(name="primalac")
	private Korisnik korisnik1;

	//bi-directional many-to-one association to Korisnik
	@ManyToOne
	@JoinColumn(name="posiljalac")
	private Korisnik korisnik2;

	public Paket() {
	}

	public int getIdpaket() {
		return this.idpaket;
	}

	public void setIdpaket(int idpaket) {
		this.idpaket = idpaket;
	}

	public Date getDatumPrijema() {
		return this.datumPrijema;
	}

	public void setDatumPrijema(Date datumPrijema) {
		this.datumPrijema = datumPrijema;
	}

	public Date getDatumPrispeca() {
		return this.datumPrispeca;
	}

	public void setDatumPrispeca(Date datumPrispeca) {
		this.datumPrispeca = datumPrispeca;
	}

	public String getNapomena() {
		return this.napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public int getTezina() {
		return this.tezina;
	}

	public void setTezina(int tezina) {
		this.tezina = tezina;
	}

	public Korisnik getKorisnik1() {
		return this.korisnik1;
	}

	public void setKorisnik1(Korisnik korisnik1) {
		this.korisnik1 = korisnik1;
	}

	public Korisnik getKorisnik2() {
		return this.korisnik2;
	}

	public void setKorisnik2(Korisnik korisnik2) {
		this.korisnik2 = korisnik2;
	}

}