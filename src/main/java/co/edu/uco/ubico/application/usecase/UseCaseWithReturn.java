package co.edu.uco.ubico.application.usecase;

public interface UseCaseWithReturn <D, R> {
    R execute(D domain);
}
