package co.edu.uco.ubico.application.usecase;

public interface UseCaseWithoutReturn<D> {

    void execute(D domain);
}
