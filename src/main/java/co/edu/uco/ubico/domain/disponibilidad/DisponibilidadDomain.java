package co.edu.uco.ubico.domain.disponibilidad;

import co.edu.uco.ubico.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ubico.crosscutting.helpers.TextHelper;
import co.edu.uco.ubico.domain.aula.AulaDomain;
import org.mapstruct.Mapper;

import java.time.LocalDateTime;

public class DisponibilidadDomain {
    private int id;
    private String nombre;
    private LocalDateTime fecha;
    private String horaInicio;
    private String horaFin;
    private AulaDomain aula;

    private DisponibilidadDomain(final int id, final String nombre, final LocalDateTime fecha,
                                 final String horaInicio, final String horaFin, final AulaDomain aula) {
        setId(id);
        setNombre(nombre);
        setFecha(fecha);
        setHoraInicio(horaInicio);
        setHoraFin(horaFin);
        setAula(aula);
    }

    private DisponibilidadDomain() {
        setNombre(TextHelper.EMPTY);
        setFecha(LocalDateTime.now());
        setHoraInicio(TextHelper.getHour());
        setHoraFin(TextHelper.getHour());
        setAula(AulaDomain.crear());
    }

    public static final DisponibilidadDomain crear(final int id, final String nombre, final LocalDateTime fecha,
                                                   final String horaInicio, final String horaFin, final AulaDomain aula) {
        return new DisponibilidadDomain(id, nombre, fecha, horaInicio, horaFin, aula);
    }

    public static final DisponibilidadDomain crear() {
        return new DisponibilidadDomain();
    }

    public final int getId() {
        return id;
    }

    public final String getNombre() {
        return nombre;
    }

    public final LocalDateTime getFecha() {
        return fecha;
    }

    public final String getHoraInicio() {
        return horaInicio;
    }

    public final String getHoraFin() {
        return horaFin;
    }

    public final AulaDomain getAula() {
        return aula;
    }

    private final void setId(final int id) {
        this.id = id;
    }

    private final void setNombre(final String nombre) {
        this.nombre = TextHelper.applyTrim(nombre);
    }

    private void setAula(final AulaDomain aula) {
        this.aula = ObjectHelper.getObjectHelper().getDefault(aula, AulaDomain.crear());
    }

    private void setFecha(final LocalDateTime fecha) {
        this.fecha = ObjectHelper.getObjectHelper().getDefault(fecha, LocalDateTime.now());
    }

    private void setHoraInicio(final String horaInicio) {
        this.horaInicio = ObjectHelper.getObjectHelper().getDefault(horaInicio, TextHelper.getHour());
    }

    private void setHoraFin(final String horaFin) {
        this.horaFin = ObjectHelper.getObjectHelper().getDefault(horaFin, TextHelper.getHour());
    }


}

