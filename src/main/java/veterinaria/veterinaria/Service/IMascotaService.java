package veterinaria.veterinaria.Service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import veterinaria.veterinaria.Model.Mascota;

import java.util.List;

public interface IMascotaService {

    public void mascotaCrear(Mascota mascota);
    public void mascotaModificar(Mascota mascota);
    public void mascotaEliminar(Long id_mascota);
    public Mascota getMascota(Long id_mascota);
    public List<Mascota> getAllMascota();
    public List<Mascota> getMascotaRazaService(String valor);
    public List<Mascota> getMascotaEspecie(String valor);
    public List<Mascota> getMascotaRazaEspecie(String raza, String especie);
}
