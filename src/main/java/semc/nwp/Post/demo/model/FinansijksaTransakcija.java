package semc.nwp.Post.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the finansijksa_transakcija database table.
 * 
 */
@Entity
@Table(name="finansijksa_transakcija")
@NamedQuery(name="FinansijksaTransakcija.findAll", query="SELECT f FROM FinansijksaTransakcija f")
public class FinansijksaTransakcija implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idfinansijksa_transakcija")
	private int idfinansijksaTransakcija;

	private BigDecimal iznos;

	private String valuta;

	//bi-directional many-to-one association to Korisnik
	@ManyToOne
	@JoinColumn(name="primalac")
	private Korisnik korisnik1;

	//bi-directional many-to-one association to Korisnik
	@ManyToOne
	@JoinColumn(name="posiljalac")
	private Korisnik korisnik2;

	public FinansijksaTransakcija() {
	}

	public int getIdfinansijksaTransakcija() {
		return this.idfinansijksaTransakcija;
	}

	public void setIdfinansijksaTransakcija(int idfinansijksaTransakcija) {
		this.idfinansijksaTransakcija = idfinansijksaTransakcija;
	}

	public BigDecimal getIznos() {
		return this.iznos;
	}

	public void setIznos(BigDecimal iznos) {
		this.iznos = iznos;
	}

	public String getValuta() {
		return this.valuta;
	}

	public void setValuta(String valuta) {
		this.valuta = valuta;
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