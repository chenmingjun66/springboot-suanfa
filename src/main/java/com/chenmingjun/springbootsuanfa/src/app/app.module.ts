import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgGanttEditorModule } from 'ng-gantt'
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { TextMaskModule } from 'angular2-text-mask';

@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    NgGanttEditorModule
    ],
  declarations: [AppComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
