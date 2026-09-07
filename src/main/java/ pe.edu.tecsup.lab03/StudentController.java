package pe.edu.tecsup.lab03.controllers;
import pe.edu.tecsup.lab03.services.StudentService;

public class StudentController {
    private final StudentService service;
    public StudentController(StudentService service) { this.service = service; }

    // Nuevo comportamiento añadido
    public void filtrarEstudiantesActivos() {
        System.out.println("Filtrando estudiantes activos para el sprint-2");
        System.out.println("Moficiacion del responsable");
        service.obtenerPorEstado("ACTIVO");
    }
}