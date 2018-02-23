package model;

public class Event {
    public String evento;
    public String acceso;
    public String xnum;
    public String nivelPrecio;
    public String seccion;
    public String fila;
    public String seat;
    public String tipoBoleto;
    public String bc;
    public String id;

    public Event(String evento, String acceso, String xnum, String nivelPrecio, String seccion, String fila, String seat, String tipoBoleto, String bc, String id) {
        this.evento = evento;
        this.acceso = acceso;
        this.xnum = xnum;
        this.nivelPrecio = nivelPrecio;
        this.seccion = seccion;
        this.fila = fila;
        this.seat = seat;
        this.tipoBoleto = tipoBoleto;
        this.bc = bc;
        this.id = id;
    }

    public Event(String evento, String acceso, String xnum, String nivelPrecio, String seccion, String fila, String seat, String tipoBoleto, String bc) {
        this.evento = evento;
        this.acceso = acceso;
        this.xnum = xnum;
        this.nivelPrecio = nivelPrecio;
        this.seccion = seccion;
        this.fila = fila;
        this.seat = seat;
        this.tipoBoleto = tipoBoleto;
        this.bc = bc;
    }
    
    
    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public String getXnum() {
        return xnum;
    }

    public void setXnum(String xnum) {
        this.xnum = xnum;
    }

    public String getNivelPrecio() {
        return nivelPrecio;
    }

    public void setNivelPrecio(String nivelPrecio) {
        this.nivelPrecio = nivelPrecio;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getTipoBoleto() {
        return tipoBoleto;
    }

    public void setTipoBoleto(String tipoBoleto) {
        this.tipoBoleto = tipoBoleto;
    }

    public String getBc() {
        return bc;
    }

    public void setBc(String bc) {
        this.bc = bc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    
    
    
}
