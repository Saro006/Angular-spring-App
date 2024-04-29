import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TaskComponent } from "./task/task.component";
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, TaskComponent,CommonModule]
})
export class AppComponent {
  title = 'todo-frontend';
}
