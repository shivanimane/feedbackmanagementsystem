import { Component, OnInit } from '@angular/core';
import { FacultyModel } from '../models/faculty.model';
import { FacultyService } from '../service/faculty.service';
import { Router } from '@angular/router';
import { SkillService } from '../service/skill.service';
import { NgForm } from '@angular/forms';
import { s } from '@angular/core/src/render3';

@Component({
  selector: 'app-add-faculty',
  templateUrl: './add-faculty.component.html',
  styleUrls: ['./add-faculty.component.css']
})
export class AddFacultyComponent implements OnInit {
  faculty : FacultyModel;
  // skills : SkillsModel[] =[];
  // selectedSkills : SkillsModel[] =[];
  // flag : SkillsModel;
  selectedSkills:String[]=[];
  index : number=0;
  checkedSkills:String[]=[];

  constructor(
    private service : FacultyService,
    private route : Router,
    private skillsservice : SkillService  ) {

    this.faculty = new FacultyModel();
  
   }

  ngOnInit() {
    this.selectedSkills=["Java","AWS","C++"];
    //this.skillsservice.getAllSkills().subscribe(data => this.skills=data);
  }

  // add(index : number){
  //   this.selectedSkills.push(this.skills[index]);
  // }

  add(index:number){
    this.checkedSkills.push(this.selectedSkills[index]);
  }

  saveFaculty(){
   // this.selectedSkills.push(this.skills[form.controls['selectedSkill'].value]);
  //  if((this.skills.filter(s=>s.checked))){
  //       this.selectedSkills.push(this.skills);
  //  }
   // console.log(this.selectedSkills);
    console.log(this.checkedSkills);
  //this.selectedSkills = this.skills.filter( (s) => s.checked =="true");
    //console.log(this.selectedSkills);
    //this.selectedSkills.push(selected);
    //pushed again
    this.faculty.skills=this.checkedSkills;

    console.log(this.faculty);
    this.service.addFaculty(this.faculty).subscribe(response=>{
      this.route.navigate(['list-faculty'])
    });
  }
}
