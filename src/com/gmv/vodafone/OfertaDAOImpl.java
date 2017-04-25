package com.gmv.vodafone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OfertaDAOImpl implements OfertaDAO {
	private static List<Oferta> ofertas = new ArrayList<>();
	static{
		List<Oferta> ofertas = new ArrayList<>();
		
		Oferta of1 = new Oferta();
		of1.setCodigoOferta(1);
		of1.setReferencia("jljj");
		of1.setFechaInicio(LocalDate.of(2017, 5, 1));
		ofertas.add(of1);
		
		Oferta of2 = new Oferta();
		of2.setCodigoOferta(2);
		of2.setReferencia("sghos");
		of2.setFechaInicio(LocalDate.of(2017, 5, 16));
		ofertas.add(of2);
	}
		
	@Override 
	public List<Oferta> getOfertas(){
		return ofertas;
	}
	

	@Override
	public Oferta getOferta(int codigoOferta) {
		for(Oferta oferta : ofertas){
			if(oferta.getCodigoOferta()==codigoOferta){
				return oferta;
			}
		}
		
		throw new IllegalArgumentException();
		
	}

}
