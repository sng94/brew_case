import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule  }    from '@angular/common/http';
import { TodoService } from './todo.service';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { TodoListComponent } from './todo-list.component';

@NgModule({
  declarations: [
    AppComponent,
    TodoListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [TodoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
