package veterinaria.veterinaria.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import veterinaria.veterinaria.Model.Mascota;
import veterinaria.veterinaria.Service.IMascotaService;

import java.util.List;

@RestController
public class MascotaController {
    @Autowired
    private IMascotaService mascotaService;

    @PostMapping("/mascota/crear")
    @ResponseBody
    public Mascota crearMascota(@RequestBody Mascota mascota){
        mascotaService.mascotaCrear(mascota);
        return mascotaService.getMascota(mascota.getId_mascota());
    }
    @PutMapping("/mascota/editar")
    @ResponseBody
    public Mascota editarMascota(@RequestBody Mascota mascota){
        mascotaService.mascotaCrear(mascota);
        return mascotaService.getMascota(mascota.getId_mascota());
    }

    @GetMapping("/mascota/obtener")
    @ResponseBody
    public List<Mascota> obtenerMascotas(){
        return mascotaService.getAllMascota();
    }

    @GetMapping("/mascota/obtener/{id_mascota}")
    @ResponseBody
    public Mascota obtenerMascota(@PathVariable Long id_mascota){
        return mascotaService.getMascota(id_mascota);
    }

    @GetMapping("/mascota/obtener/raza/{raza}")
    @ResponseBody
    public List<Mascota> obtenerMascotaRaza(@PathVariable String raza){
        return mascotaService.getMascotaRazaService(raza);
    }

    @GetMapping("/mascota/obtener/especie/{especie}")
    @ResponseBody
    public List<Mascota> obtenerMascotaEspecie(@PathVariable String especie){
        return mascotaService.getMascotaEspecie(especie);
    }

    @GetMapping("mascota/razaEspecie/{raza}/{especie}")
    @ResponseBody
    public List<Mascota> obtenerRazaEspecie(@PathVariable String raza, @PathVariable String especie){
        return mascotaService.getMascotaRazaEspecie(raza, especie);
    }
}
