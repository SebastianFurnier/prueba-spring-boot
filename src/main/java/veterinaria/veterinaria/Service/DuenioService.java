package veterinaria.veterinaria.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veterinaria.veterinaria.Model.Duenio;
import veterinaria.veterinaria.Model.Mascota;
import veterinaria.veterinaria.Repository.IDuenioRepository;

import java.util.List;

@Service
public class DuenioService implements IDuenioService{
    @Autowired
    private IDuenioRepository duenioRepository;
    @Override
    public void duenioCrear(Duenio duenio) {
        duenioRepository.save(duenio);
    }

    @Override
    public void duenioModificar(Duenio duenio) {
        duenioRepository.save(duenio);
    }

    @Override
    public void duenioEliminar(Long id_duenio) {
        duenioRepository.deleteById(id_duenio);
    }

    @Override
    public Duenio getDuenio(Long id_duenio) {
        return duenioRepository.findById(id_duenio).orElse(null);
    }

    @Override
    public List<Duenio> getAllDuenios() {
        return duenioRepository.findAll();
    }

    @Override
    public Mascota getMascota(Long id_duenio){
        return duenioRepository.getMascota(id_duenio);
    }
}
