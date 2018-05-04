package kz.kaznitu.herokudemo3.repositories;

import kz.kaznitu.herokudemo3.models.Klient;
import org.springframework.data.repository.CrudRepository;

public interface KlientRepository extends CrudRepository<Klient,Long> {
}
