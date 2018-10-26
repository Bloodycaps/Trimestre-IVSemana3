package co.edu.sena.computador.partes.torre;

public class Torre extends Parte {

	public Torre(String marca, String serial, DiscoDuro discoDuro, MotherBoard tarjetaMadre, RAM tarjetaMemoria,
			Fuente fuente, Procesador procesador, Disipador disipador, TarjetaSonido tarjetaSonido,
			TarjetaVideo tarjetaVideo, Bateria bateria) {
		super(marca, serial);
		this.discoDuro = discoDuro;
		this.tarjetaMadre = tarjetaMadre;
		this.tarjetaMemoria = tarjetaMemoria;
		this.fuente = fuente;
		this.procesador = procesador;
		this.disipador = disipador;
		this.tarjetaSonido = tarjetaSonido;
		this.tarjetaVideo = tarjetaVideo;
		this.bateria = bateria;
	}

	private DiscoDuro discoDuro;
	private MotherBoard tarjetaMadre;
	private RAM tarjetaMemoria;
	private Fuente fuente;
	private Procesador procesador;
	private Disipador disipador;
	private LectorCD lectorCd = new LectorCD(0, 0, 0, null, null);
	private LectorDVD lectorDvd = new LectorDVD(0, 0, 0, null, null);
	private LectorBR lectorBr = new LectorBR(0, 0, 0, null, null);
	private LectorDisquette lectorDisquette = new LectorDisquette(0, 0, 0, null, null);
	private TarjetaSonido tarjetaSonido = new TarjetaSonido(null, null);
	private TarjetaVideo tarjetaVideo = new TarjetaVideo(null, null);
	private Bateria bateria = new Bateria(null, null);

	public DiscoDuro getDiscoDuro() {
		return discoDuro;
	}

	public void setDiscoDuro(DiscoDuro discoDuro) {
		this.discoDuro = discoDuro;
	}

	public MotherBoard getTarjetaMadre() {
		return tarjetaMadre;
	}

	public void setTarjetaMadre(MotherBoard tarjetaMadre) {
		this.tarjetaMadre = tarjetaMadre;
	}

	public RAM getTarjetaMemoria() {
		return tarjetaMemoria;
	}

	public void setTarjetaMemoria(RAM tarjetaMemoria) {
		this.tarjetaMemoria = tarjetaMemoria;
	}

	public Fuente getFuente() {
		return fuente;
	}

	public void setFuente(Fuente fuente) {
		this.fuente = fuente;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public Disipador getDisipador() {
		return disipador;
	}

	public void setDisipador(Disipador disipador) {
		this.disipador = disipador;
	}

	public LectorCD getLectorCd() {
		return lectorCd;
	}

	public void setLectorCd(LectorCD lectorCd) {
		this.lectorCd = lectorCd;
	}

	public LectorDVD getLectorDvd() {
		return lectorDvd;
	}

	public void setLectorDvd(LectorDVD lectorDvd) {
		this.lectorDvd = lectorDvd;
	}

	public LectorBR getLectorBr() {
		return lectorBr;
	}

	public void setLectorBr(LectorBR lectorBr) {
		this.lectorBr = lectorBr;
	}

	public LectorDisquette getLectorDisquette() {
		return lectorDisquette;
	}

	public void setLectorDisquette(LectorDisquette lectorDisquette) {
		this.lectorDisquette = lectorDisquette;
	}

	public TarjetaSonido getTarjetaSonido() {
		return tarjetaSonido;
	}

	public void setTarjetaSonido(TarjetaSonido tarjetaSonido) {
		this.tarjetaSonido = tarjetaSonido;
	}

	public TarjetaVideo getTarjetaVideo() {
		return tarjetaVideo;
	}

	public void setTarjetaVideo(TarjetaVideo tarjetaVideo) {
		this.tarjetaVideo = tarjetaVideo;
	}

	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}

}
