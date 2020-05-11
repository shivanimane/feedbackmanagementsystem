import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { RouterModule, Routes } from '@angular/router';
import { Login } from './models/login.model';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { CoordinatorComponent } from './coordinator/coordinator.component';
import { ParticipantComponent } from './participant/participant.component';
import { HomeComponent } from './home/home.component';
import { AddCourseComponent } from './add-course/add-course.component';
import { ListCourseComponent } from './list-course/list-course.component';
import { AddFacultyComponent } from './add-faculty/add-faculty.component';
import { ListFacultyComponent } from './list-faculty/list-faculty.component';
import { BarRatingModule } from "ngx-bar-rating";
import { AddFeedbackComponent } from './add-feedback/add-feedback.component';
<<<<<<< HEAD
import { AddTrainingprogramComponent } from './add-trainingprogram/add-trainingprogram.component';
import { ListTrainingProgramComponent } from './list-training-program/list-training-program.component';
=======
import { ListFeedbackFacultyComponent } from './list-feedback-faculty/list-feedback-faculty.component';
>>>>>>> ff655218054cbe66460fe9b431e4ed832a142fc7

const routes : Routes = [
  {path:'login', component:LoginComponent},
  {path:'admin', component:AdminComponent},
  {path:'home', component:HomeComponent},
  {path:'add-course', component:AddCourseComponent},
  {path:'list-course', component:ListCourseComponent},
  {path:'add-faculty', component:AddFacultyComponent},
  {path:'list-faculty', component:ListFacultyComponent},
  {path:'coordinator', component:CoordinatorComponent},
  {path:'participant', component:ParticipantComponent},
  {path:'add-feedback', component:AddFeedbackComponent},
<<<<<<< HEAD
  {path:'add-training',component:AddTrainingprogramComponent},
  {path:'list-training',component:ListTrainingProgramComponent},
=======
  {path:'list-feedback-faculty/:id', component:AddFeedbackComponent},
>>>>>>> ff655218054cbe66460fe9b431e4ed832a142fc7
  {path:'', redirectTo:'home', pathMatch:"full"},
  {path:'*', redirectTo:'home', pathMatch:"full"}
];

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AdminComponent,
    CoordinatorComponent,
    ParticipantComponent,
    HomeComponent,
    AddCourseComponent,
    ListCourseComponent,
    AddFacultyComponent,
    ListFacultyComponent,
    AddFeedbackComponent,
<<<<<<< HEAD
    AddTrainingprogramComponent,
    ListTrainingProgramComponent
=======
    ListFeedbackFacultyComponent
>>>>>>> ff655218054cbe66460fe9b431e4ed832a142fc7
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    BarRatingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
