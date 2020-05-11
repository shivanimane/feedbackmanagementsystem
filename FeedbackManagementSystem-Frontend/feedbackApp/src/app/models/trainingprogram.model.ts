import { CourseModel } from "./course.model";
import { FacultyModel } from "./faculty.model";

export class TrainingProgramModel{
    trainingCode : number;
    course : CourseModel;
    faculty : FacultyModel;
    startDate : Date;
    endDate : Date;
}