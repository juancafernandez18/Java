public class Furgoneta extends Auto{
    private int capacidad_carga;

    private int plazas_extra;

    public Furgoneta(int plazas_extra, int capacidad_carga){
        super();                                                    //llama al constructor de la clase padre
        this.capacidad_carga=capacidad_carga;
        this.plazas_extra=plazas_extra;
    }
    public int getCapacidadCarga(){
        return capacidad_carga;
    }
    public int getPlazas_extra(){
        return plazas_extra;
    }
}
