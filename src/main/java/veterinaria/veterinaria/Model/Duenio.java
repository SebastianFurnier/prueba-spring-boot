package veterinaria.veterinaria.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Duenio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @NotNull
    @Positive
    private Long id_duenio;
    @NotNull
    @Positive
    private Long DNI;
    @NotNull
    @NotBlank
    private String nombre;
    @NotNull
    @NotBlank
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
