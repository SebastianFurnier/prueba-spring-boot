package veterinaria.veterinaria.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @NotNull
    @Positive
    private Long id_mascota;
    @NotBlank
    @NotNull
    private String nombre;
    @NotBlank
    @NotNull
    private String especie;
    @NotBlank
    @NotNull
    private String raza;
    private String color;

    public Mascota(){}

    public Mascota(Long id_mascota, String nombre, String especie, String raza, String color){
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
    }
}
