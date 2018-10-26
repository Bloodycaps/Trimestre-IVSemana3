package co.edu.sena.Asociacion;

public class Item {
	private int cantidad;
	private float precioVenta;
	private float valorTotal;
	private Producto producto;
	private Factura factura;

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidad;
		result = prime * result + ((factura == null) ? 0 : factura.hashCode());
		result = prime * result + Float.floatToIntBits(precioVenta);
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
		result = prime * result + Float.floatToIntBits(valorTotal);
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
		Item other = (Item) obj;
		if (cantidad != other.cantidad)
			return false;
		if (factura == null) {
			if (other.factura != null)
				return false;
		} else if (!factura.equals(other.factura))
			return false;
		if (Float.floatToIntBits(precioVenta) != Float.floatToIntBits(other.precioVenta))
			return false;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		if (Float.floatToIntBits(valorTotal) != Float.floatToIntBits(other.valorTotal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Item [cantidad=" + cantidad + ", precioVenta=" + precioVenta + ", valorTotal=" + valorTotal
				+ ", producto=" + producto + ", factura=" + factura + ", getCantidad()=" + getCantidad()
				+ ", getPrecioVenta()=" + getPrecioVenta() + ", getValorTotal()=" + getValorTotal() + ", getProducto()="
				+ getProducto() + ", getFactura()=" + getFactura() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}

}
