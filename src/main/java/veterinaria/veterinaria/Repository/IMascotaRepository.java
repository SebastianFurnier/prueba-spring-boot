package veterinaria.veterinaria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import veterinaria.veterinaria.Model.Mascota;

import java.util.List;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
    @Query("SELECT e FROM Mascota e WHERE e.raza LIKE %:valor%")
    public List<Mascota> getMascotaRaza(@Param("valor") String valor);
    @Query("SELECT e FROM Mascota e WHERE e.especie LIKE %:valor%")
    public List<Mascota> getMascotaEspecieRepo(@Param("valor") String valor);
}
