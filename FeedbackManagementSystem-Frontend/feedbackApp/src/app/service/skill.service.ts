import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { SkillsModel } from '../models/skills.model';

@Injectable({
  providedIn: 'root'
})
export class SkillService {

  constructor(private http: HttpClient) { }

  getAllSkills(){
    return this.http.get<SkillsModel[]>("http://localhost:5055/coordinator/allskills");
  }

  getSkillById(index : number){
    return this.http.get<SkillsModel>("http://localhost:5055/coordinator/"+index);
  }
}
