package veterinaria.veterinaria.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veterinaria.veterinaria.Model.Mascota;
import veterinaria.veterinaria.Repository.IMascotaRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService implements IMascotaService{
    @Autowired
    private IMascotaRepository mascotaRepository;

    @Override
    public void mascotaCrear(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    @Override
    public void mascotaModificar(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    @Override
    public void mascotaEliminar(Long id_mascota) {
        mascotaRepository.deleteById(id_mascota);
    }

    @Override
    public Mascota getMascota(Long id_mascota) {
        return mascotaRepository.findById(id_mascota).orElse(null);
    }

    @Override
    public List<Mascota> getAllMascota() {
        return mascotaRepository.findAll();
    }

    @Override
    public List<Mascota> getMascotaRazaService(String valor) {
        return mascotaRepository.getMascotaRaza(valor);
    }


    @Override
    public List<Mascota> getMascotaEspecie(String valor) {
        return mascotaRepository.getMascotaEspecieRepo(valor);
    }

    @Override
    public List<Mascota> getMascotaRazaEspecie(String raza, String especie) {
        List<Mascota> mascotaRaza = getMascotaRazaService(raza);
        List<Mascota> mascotaRazaEspecie = new ArrayList<>();

        for(Mascota mascota:mascotaRaza){
            if(mascota.getEspecie().equals(especie))
                mascotaRazaEspecie.add(mascota);
        }
        return mascotaRazaEspecie;
    }
}
