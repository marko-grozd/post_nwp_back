package semc.nwp.Post.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the grad database table.
 * 
 */
@Entity
@NamedQuery(name="Grad.findAll", query="SELECT g FROM Grad g")
public class Grad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="postanski_broj")
	private int postanskiBroj;

	private String naziv;

	private String okrug;

	@Column(name="geografska_duzina")
	private String geografskaDuzina;

	@Column(name="geografska_sirina")
	private String geografskaSirina;

	@Column(name="statisticki_region")
	private String statistickiRegion;

	//bi-directional many-to-one association to Adresa
	@OneToMany(mappedBy="grad")
	@JsonIgnore
	private List<Adresa> adresas;

	public Grad() {
	}

	public String getGeografskaDuzina() {
		return geografskaDuzina;
	}

	public void setGeografskaDuzina(String geografskaDuzina) {
		this.geografskaDuzina = geografskaDuzina;
	}

	public String getGeografskaSirina() {
		return geografskaSirina;
	}

	public void setGeografskaSirina(String geografskaSirina) {
		this.geografskaSirina = geografskaSirina;
	}

	public int getPostanskiBroj() {
		return this.postanskiBroj;
	}

	public void setPostanskiBroj(int postanskiBroj) {
		this.postanskiBroj = postanskiBroj;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOkrug() {
		return this.okrug;
	}

	public void setOkrug(String okrug) {
		this.okrug = okrug;
	}

	public String getStatistickiRegion() {
		return this.statistickiRegion;
	}

	public void setStatistickiRegion(String statistickiRegion) {
		this.statistickiRegion = statistickiRegion;
	}

	public List<Adresa> getAdresas() {
		return this.adresas;
	}

	public void setAdresas(List<Adresa> adresas) {
		this.adresas = adresas;
	}

	public Adresa addAdresa(Adresa adresa) {
		getAdresas().add(adresa);
		adresa.setGrad(this);

		return adresa;
	}

	public Adresa removeAdresa(Adresa adresa) {
		getAdresas().remove(adresa);
		adresa.setGrad(null);

		return adresa;
	}

}