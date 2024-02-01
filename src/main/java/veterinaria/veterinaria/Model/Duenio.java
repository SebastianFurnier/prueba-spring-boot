package veterinaria.veterinaria.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Duenio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id_duenio;
    private Long DNI;
    private String nombre;
    private String apellido;
    private Long celular;
    @OneToOne
    private Mascota mascota;

    public Duenio(){}

    public Duenio(Long id_duenio, Long DNI, String nombre, String apellido, Long celular){
        this.id_duenio = id_duenio;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

}
