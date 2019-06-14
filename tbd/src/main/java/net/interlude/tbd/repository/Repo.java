package net.interlude.tbd.repository;

import net.interlude.tbd.domain.Tbd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Tbd, String>  {

}
