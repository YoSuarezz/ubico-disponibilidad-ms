package co.edu.uco.ubico.domain;

public interface DomainRule<T>{
    void validate(T data);
}
