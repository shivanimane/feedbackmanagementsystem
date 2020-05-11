import { TrainingProgramModel } from "./trainingprogram.model";
import { EmployeeModel } from "./employee.model";

export class FeedbackModel{
    feedbackId : number;
    trainingProgram : TrainingProgramModel;
    participantId : EmployeeModel;
    fbPrsComm : number;
    fbClrfyDbts : number;
    fbTm : number;
    fbHndOut : number;
    fbHwSwNtwrk : number;
    comments : String;
    suggestions : String;
    feedbackDate : Date;
} 