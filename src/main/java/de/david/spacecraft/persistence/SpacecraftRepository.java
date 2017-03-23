package de.david.spacecraft.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author David Klassen
 */
public interface SpacecraftRepository extends JpaRepository<Spacecraft, Long> {
}
