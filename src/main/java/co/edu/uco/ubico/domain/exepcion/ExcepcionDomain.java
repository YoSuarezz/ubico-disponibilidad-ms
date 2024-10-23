package co.edu.uco.ubico.domain.exepcion;

import co.edu.uco.ubico.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ubico.crosscutting.helpers.TextHelper;
import co.edu.uco.ubico.domain.MotivoNoDisponibilidad.MotivoNoDisponibilidadDomain;
import co.edu.uco.ubico.domain.aula.AulaDomain;

import java.time.LocalDateTime;

public class ExcepcionDomain {

    private int id;
    private AulaDomain aula;
    private LocalDateTime fecha;
    private String horaInicio;
    private String horaFin;
    private MotivoNoDisponibilidadDomain motivoNoDisponibilidad;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AulaDomain getAula() {
        return aula;
    }

    public void setAula(AulaDomain aula) {
        this.aula = ObjectHelper.getObjectHelper().getDefault(aula,AulaDomain.crear());
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public MotivoNoDisponibilidadDomain getMotivoNoDisponibilidad() {
        return motivoNoDisponibilidad;
    }

    public void setMotivoNoDisponibilidad(MotivoNoDisponibilidadDomain motivoNoDisponibilidad) {
        this.motivoNoDisponibilidad = ObjectHelper.getObjectHelper().getDefault(motivoNoDisponibilidad,MotivoNoDisponibilidadDomain.crear());
    }
}
