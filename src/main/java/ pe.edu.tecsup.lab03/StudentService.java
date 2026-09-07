import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;
import java.util.List;

public class StudentService {
    private final StudentRepository repository;
    public StudentService(StudentRepository repository) { this.repository = repository; }

    public List<StudentEntity> obtenerTodos() { return repository.findAll(); }

    // Nuevo metodo añadido
    public List<StudentEntity> obtenerPorEstado(String estado) {
        return repository.findByEstado(estado);
    }
}