package Tienda;

public class Servicio extends Item implements Tributable{

    private int cantidadHoras;

    public double calculaImpuesto() {
        //servicio tiene 12% de impuesto:
        return getPrecio() * 0.12;
        
    }

	public int getCantidadHoras() {
		return cantidadHoras;
	}

	public void setCantidadHoras(int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}
	
}