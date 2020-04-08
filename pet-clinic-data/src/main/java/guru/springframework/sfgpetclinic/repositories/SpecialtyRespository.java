package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRespository extends CrudRepository<Specialty, Long> {
}
