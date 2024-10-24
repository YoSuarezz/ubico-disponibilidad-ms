package co.edu.uco.ubico.application.primaryports.interactor;

public interface InteractorWithReturn <T, R>{
    R execute(T data);
}
