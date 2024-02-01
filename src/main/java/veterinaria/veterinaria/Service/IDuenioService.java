package veterinaria.veterinaria.Service;

import veterinaria.veterinaria.Model.Duenio;
import veterinaria.veterinaria.Model.Mascota;

import java.util.List;

public interface IDuenioService {
    public void duenioCrear(Duenio duenio);
    public void duenioModificar(Duenio duenio);
    public void duenioEliminar(Long id_duenio);
    public Duenio getDuenio(Long id_duenio);
    public List<Duenio> getAllDuenios();
    public Mascota getMascota(Long id_duenio);

}
