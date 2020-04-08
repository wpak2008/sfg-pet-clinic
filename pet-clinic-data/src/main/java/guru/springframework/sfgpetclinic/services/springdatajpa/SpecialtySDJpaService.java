package guru.springframework.sfgpetclinic.services.springdatajpa;


import guru.springframework.sfgpetclinic.model.Specialty;
import guru.springframework.sfgpetclinic.repositories.SpecialtyRespository;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtyService {
    private final SpecialtyRespository specialtyRespository;

    public SpecialtySDJpaService(SpecialtyRespository specialtyRespository) {
        this.specialtyRespository = specialtyRespository;
    }

    @Override
    public Set<Specialty> findAll() {

        Set<Specialty> specialties = new HashSet<>();

        specialtyRespository.findAll().forEach(specialties::add);

        return specialties;
    }

    @Override
    public Specialty findById(Long aLong) {
        return specialtyRespository.findById(aLong).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRespository.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRespository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRespository.deleteById(aLong);
    }
}
