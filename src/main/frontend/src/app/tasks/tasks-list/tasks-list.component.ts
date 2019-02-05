import {Component, OnInit} from '@angular/core';
import {Task} from "../task.model";
import {TaskService} from "../task.service";

@Component({
    selector: 'app-tasks-list',
    templateUrl: './tasks-list.component.html',
    styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

    tasks: Task[] = [];

    constructor(private taskService: TaskService) {
    }

    ngOnInit() {
        this.taskService.getTasks()
            .subscribe(
                (tasks: Task[]) => {
                    this.tasks = tasks
                },
                (error) => console.log(error)
            );
    }

    onTaskChange(event, task) {
        this.taskService.saveTask(task, event.target.checked).subscribe();
    }

    getDueDateBadge(task: Task) {
        return task.completed ? 'badge-success' : 'badge-primary';
    }
}
