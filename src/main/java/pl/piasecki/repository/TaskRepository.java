package pl.piasecki.repository;

import org.springframework.data.repository.CrudRepository;
import pl.piasecki.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
