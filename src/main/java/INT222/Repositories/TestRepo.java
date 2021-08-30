package INT222.Repositories;

import INT222.Models.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<Test,String> {
}
