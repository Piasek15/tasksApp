package pl.piasecki.controller;

import org.hibernate.internal.build.AllowPrintStacktrace;
import org.springframework.web.bind.annotation.*;
import pl.piasecki.domain.Task;
import pl.piasecki.service.TaskService;

@AllowPrintStacktrace
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Task> list(){
        return this.taskService.list();
    }

    @PostMapping("/save")
    private Task save(@RequestBody Task task){
        return this.taskService.save(task);
    }
}
