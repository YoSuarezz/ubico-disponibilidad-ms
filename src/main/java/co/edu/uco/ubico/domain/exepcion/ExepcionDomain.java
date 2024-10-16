package co.edu.uco.ubico.domain.exepcion;

import co.edu.uco.ubico.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ubico.domain.aula.AulaDomain;

import java.time.LocalDateTime;

public class ExepcionDomain {

    private int id;
    private AulaDomain aula;
    private LocalDateTime fecha;
    private LocalDateTime hora_inicio;
    private LocalDateTime hora_fin;

    public ExepcionDomain(int id, AulaDomain aula, LocalDateTime fecha, LocalDateTime hora_inicio, LocalDateTime hora_fin) {
        this.id = id;
        this.aula = aula;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
    }

    public static final ExepcionDomain crear(final int id, final AulaDomain aula, final LocalDateTime fecha, final LocalDateTime hora_inicio, final LocalDateTime hora_fin) {
        return new ExepcionDomain(id, aula, fecha, hora_inicio, hora_fin);
    }

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
        this.aula = ObjectHelper.getObjectHelper().getDefault(aula, AulaDomain.crear());
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = ObjectHelper.getObjectHelper().getDefault(fecha, LocalDateTime.now());
    }

    public LocalDateTime getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(LocalDateTime hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public LocalDateTime getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(LocalDateTime hora_fin) {
        this.hora_fin = hora_fin;
    }
}
