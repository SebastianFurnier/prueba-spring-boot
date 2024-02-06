package veterinaria.veterinaria.Controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import veterinaria.veterinaria.DTO.MascotaDuenio;
import veterinaria.veterinaria.Model.Duenio;
import veterinaria.veterinaria.Model.Mascota;
import veterinaria.veterinaria.Service.IDuenioService;

import java.util.List;

@RestController
public class DuenioController {
    @Autowired
    private IDuenioService duenioService;

    @PostMapping("/duenio/crear")
    public Duenio duenioCrear(@Valid @RequestBody Duenio duenio){
        duenioService.duenioCrear(duenio);
        return duenioService.getDuenio(duenio.getId_duenio());
    }

    @PutMapping("/duenio/editar")
    public Duenio duenioEditar(@Valid @RequestBody Duenio duenio){
        duenioService.duenioModificar(duenio);
        return duenioService.getDuenio(duenio.getId_duenio());
    }

    @GetMapping("/duenio/obtener")
    @ResponseBody
    public List<Duenio> dueniosObtener(){
        return duenioService.getAllDuenios();
    }

    @GetMapping("/duenio/eliminar/{id_duenio}")
    @ResponseBody
    public String eliminarDuenio(@Valid @PathVariable Long id_duenio){
        duenioService.duenioEliminar(id_duenio);
        return "Duenio eliminado con exito";
    }

    @GetMapping("/duenio/obtenerReducido/{id_duenio}")
    @ResponseBody
    public MascotaDuenio duenioReducido(@Valid @PathVariable Long id_duenio){
        Duenio duenio = duenioService.getDuenio(id_duenio);
        Mascota mascota = duenioService.getMascota(id_duenio);

        return new MascotaDuenio(mascota.getNombre(), mascota.getEspecie(), mascota.getRaza(), duenio.getNombre(), duenio.getApellido());
    }

}
