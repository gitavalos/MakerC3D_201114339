package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String etqv;
    private String etqf;

    public String getEtqv() {
        return etqv;
    }

    public void setEtqv(String etqv) {
        this.etqv = etqv;
    }

    public String getEtqf() {
        return etqf;
    }

    public void setEtqf(String etqf) {
        this.etqf = etqf;
    }

    
    
    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public NodoC3D(String lv,String lf) {
        this.etqv=lv;
        this.etqf=lf;
    }
    
    
    public String getCad(){
        return cad;
    }
        
}
