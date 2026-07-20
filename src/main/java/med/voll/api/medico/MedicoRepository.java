package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

/*JpaRepository<tipoDaEntidade, tipoDaChavePrimariaDaEntidade>*/
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
