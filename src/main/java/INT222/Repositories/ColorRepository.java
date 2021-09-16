package INT222.Repositories;

import INT222.Models.Colors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<Colors,Long> {

    Boolean existsColorsByHex_codeOrLabel(String hex,String label);
}
