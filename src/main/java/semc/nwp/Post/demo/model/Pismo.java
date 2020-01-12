package semc.nwp.Post.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pismo database table.
 * 
 */
@Entity
@NamedQuery(name="Pismo.findAll", query="SELECT p FROM Pismo p")
public class Pismo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idpismo;

	@Temporal(TemporalType.DATE)
	@Column(name="datum_prijema")
	private Date datumPrijema;

	@Temporal(TemporalType.DATE)
	@Column(name="datum_prispeca")
	private Date datumPrispeca;

	private byte preporuceno;

	//bi-directional many-to-one association to Korisnik
	@ManyToOne
	@JoinColumn(name="primalac")
	private Korisnik korisnik1;

	//bi-directional many-to-one association to Korisnik
	@ManyToOne
	@JoinColumn(name="posiljalac")
	private Korisnik korisnik2;

	public Pismo() {
	}

	public int getIdpismo() {
		return this.idpismo;
	}

	public void setIdpismo(int idpismo) {
		this.idpismo = idpismo;
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

	public byte getPreporuceno() {
		return this.preporuceno;
	}

	public void setPreporuceno(byte preporuceno) {
		this.preporuceno = preporuceno;
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