package co.edu.sena.computador;

import co.edu.sena.computador.dispositivo.entrada.Camara;
import co.edu.sena.computador.dispositivo.entrada.Mouse;
import co.edu.sena.computador.dispositivo.entrada.Scanner;
import co.edu.sena.computador.dispositivo.entrada.Teclado;
import co.edu.sena.computador.dispositivo.entradasalida.Multifuncional;
import co.edu.sena.computador.dispositivo.salida.Impresora;
import co.edu.sena.computador.dispositivo.salida.Monitor;
import co.edu.sena.computador.partes.torre.Bateria;
import co.edu.sena.computador.partes.torre.DiscoDuro;
import co.edu.sena.computador.partes.torre.Disipador;
import co.edu.sena.computador.partes.torre.Fuente;
import co.edu.sena.computador.partes.torre.LectorBR;
import co.edu.sena.computador.partes.torre.LectorCD;
import co.edu.sena.computador.partes.torre.LectorDVD;
import co.edu.sena.computador.partes.torre.LectorDisquette;
import co.edu.sena.computador.partes.torre.MotherBoard;
import co.edu.sena.computador.partes.torre.Procesador;
import co.edu.sena.computador.partes.torre.RAM;
import co.edu.sena.computador.partes.torre.TarjetaSonido;
import co.edu.sena.computador.partes.torre.TarjetaVideo;
import co.edu.sena.computador.partes.torre.Torre;

public class ComputadorAPP {
	public static void main(String[] args) {
		Multifuncional mult1 = new Multifuncional("Canon", "PY57843");
		mult1.setMarca("Canon");
		mult1.setSerial("PY57843");		
		Mouse mouse = new Mouse("R-Hourse", "JT53Y");
		mouse.setMarca("R-Hourse");
		mouse.setSerial("JT53Y");
		Scanner scan = new Scanner("Epson", "5KT2");
		scan.setMarca("Epson");
		scan.setSerial("5KT2");
		Camara cam = new Camara("Genius", "89TJ");
		cam.setMarca("Genius");
		cam.setSerial("89TJ");
		Teclado tec = new Teclado("Argom", "RGT9");
		tec.setMarca("Argom");
		tec.setSerial("RGT9");
		Impresora imp = new Impresora("Epson", "80T");
		imp.setMarca("Epson");
		imp.setSerial("80T");
		Monitor pant = new Monitor("LG", "JHK43M");
		pant.setMarca("LG");
		pant.setSerial("JHK43M");
		TarjetaSonido tarjSon = new TarjetaSonido("Asus", "hG77u");
		tarjSon.setMarca("Asus");
		tarjSon.setSerial("hG77u");
		Bateria bar = new Bateria("Duracell", "OjP97");
		bar.setMarca("Duracell");
		bar.setSerial("OjP97");
		Procesador pro = new Procesador("Intel Core", "i5 7600X");
		pro.setMarca("Intel Core");
		pro.setSerial("i5 7600X");
		TarjetaVideo tarvi = new TarjetaVideo("GForce", "1050Ti");
		tarvi.setMarca("GForce");
		tarvi.setSerial("1050Ti");
		DiscoDuro disc = new DiscoDuro("Hitachi", "GYZ509");
		disc.setMarca("Hitachi");
		disc.setSerial("GYZ509");
		Disipador dis = new Disipador("Master Cooler", "HGC1500");
		dis.setMarca("Master Cooler");
		dis.setSerial("HGC1500");
		LectorCD lecCd = new LectorCD(7.5, 5.3, 335.2, "MSI", "GNY503");
		lecCd.setMarca("MSI");
		lecCd.setSerial("GNY503");
		LectorBR lecBr = new LectorBR(8.1, 7.3, 136.4, "Hitachi", "JIP536");
		lecBr.setMarca("Hitachi");
		lecBr.setSerial("JIP536");
		LectorDisquette lecDis = new LectorDisquette(3.2, 2.7, 30.1, "Mitsumi", "JPO783");
		lecDis.setMarca("Mitsumi");
		lecDis.setSerial("JPO783");
		LectorDVD lecDvd = new LectorDVD(4.2, 2.5, 15.6, "LG", "GT805");
		lecDvd.setMarca("LG");
		lecDvd.setSerial("GT805");
		MotherBoard mb = new MotherBoard("Asus", "HG503");
		mb.setMarca("Asus");
		mb.setSerial("HG503");
		Fuente fuen = new Fuente("ATX", "600W");
		fuen.setMarca("ATX");
		fuen.setSerial("600W");
		RAM Ram = new RAM("Corssair", "JC500");
		Ram.setMarca("Corssair");
		Ram.setSerial("JC500");
		Torre tor = new Torre("Asus", "GTU5000", disc, mb, Ram, fuen, pro, dis, tarjSon, tarvi, bar);
		tor.setBateria(bar);
		tor.setDiscoDuro(disc);
		tor.setDisipador(dis);
		tor.setFuente(fuen);
		tor.setMarca("Asus");
		tor.setSerial("GTU5000");
		tor.setProcesador(pro);
		tor.setTarjetaMadre(mb);
		tor.setTarjetaMemoria(Ram);
		tor.setTarjetaSonido(tarjSon);
		tor.setTarjetaVideo(tarvi);
		Computador com=new Computador(tor, mouse, tec,pant);
		
		ComputadorEscritorio pc = new ComputadorEscritorio(tor, mouse, tec, pant);
		ComputadorPortatil pc1 = new ComputadorPortatil(tor, mouse, tec, pant);
		System.out.println(tor.getTarjetaVideo()+""+tor.getTarjetaSonido());
		
	}
	public void escribirComputador(Computador com){
		
	}

}
