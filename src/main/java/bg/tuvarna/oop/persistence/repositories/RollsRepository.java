package bg.tuvarna.oop.persistence.repositories;

import bg.tuvarna.oop.persistence.entities.Rolls;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RollsRepository extends JpaRepository<Rolls, Long> {

//    Optional<Rolls> findByGameType(Long gameId);
}