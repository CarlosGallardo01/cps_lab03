public class StudentEntity {
    private Long id;
    private String nombre;
    private String correo;
    private String estado; // NUEVO CAMPO AÑADIDO

    // Generar getters y setters para 'estado'
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}