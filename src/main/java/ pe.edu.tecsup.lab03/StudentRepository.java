import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.List;

public interface StudentRepository {
    List<StudentEntity> findAll();
    StudentEntity findById(Long id);
    List<StudentEntity> findByEstado(String estado); // Nuevo metodo
    void save(StudentEntity student);
    void delete(Long id);
}