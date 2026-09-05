package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.services.StudentService;

public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // Aquí irían los métodos para manejar la interfaz o las rutas web
    public void mostrarEstudiantes() {
        System.out.println("Cargando lista de estudiantes...");
        // Lógica de presentación llamando a service.obtenerTodos()
    }
}