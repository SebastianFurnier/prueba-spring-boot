package veterinaria.veterinaria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import veterinaria.veterinaria.Model.Duenio;
import veterinaria.veterinaria.Model.Mascota;

import java.util.List;

@Repository
public interface IDuenioRepository extends JpaRepository<Duenio, Long> {
    @Query("SELECT m FROM Duenio d JOIN d.mascota m WHERE d.id_duenio = :duenio_id")
    Mascota getMascota(@Param("duenio_id") Long duenio_id);
}
