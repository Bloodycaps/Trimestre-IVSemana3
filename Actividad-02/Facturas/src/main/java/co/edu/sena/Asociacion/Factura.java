package co.edu.sena.Asociacion;

import java.util.Collection;
import java.util.Date;

public class Factura {
	private int idFactura;
	private Date fecha;
	private float totalFactura;
	private float iva;
	private Collection<Item> items;
	private Cliente cliente;

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getTotalFactura() {
		return totalFactura;
	}

	public void setTotalFactura(float totalFactura) {
		this.totalFactura = totalFactura;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public Collection<Item> getItems() {
		return items;
	}

	public void setItems(Collection<Item> items) {
		this.items = items;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + idFactura;
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		result = prime * result + Float.floatToIntBits(iva);
		result = prime * result + Float.floatToIntBits(totalFactura);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (idFactura != other.idFactura)
			return false;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		if (Float.floatToIntBits(iva) != Float.floatToIntBits(other.iva))
			return false;
		if (Float.floatToIntBits(totalFactura) != Float.floatToIntBits(other.totalFactura))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", fecha=" + fecha + ", totalFactura=" + totalFactura + ", iva="
				+ iva + ", items=" + items + ", cliente=" + cliente + ", getIdFactura()=" + getIdFactura()
				+ ", getFecha()=" + getFecha() + ", getTotalFactura()=" + getTotalFactura() + ", getIva()=" + getIva()
				+ ", getItems()=" + getItems() + ", getCliente()=" + getCliente() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

}
