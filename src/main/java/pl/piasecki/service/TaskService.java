package pl.piasecki.service;

import pl.piasecki.domain.Task;

public interface TaskService {
    Iterable<Task> list();

    Task save(Task task);
}
