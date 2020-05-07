import { Component, OnInit } from '@angular/core';
import { FormGroup,FormBuilder, Validators } from '@angular/forms';
import { CustomerService } from "../customer.service";
import { Router } from "@angular/router";

@Component({
  selector: 'app-assign-test',
  templateUrl: './assign-test.component.html',
  styleUrls: ['./assign-test.component.css']
})
export class AssignTestComponent implements OnInit {

  public userId: number;
  public testId: number;
  assignForm :FormGroup
  message : any;
  errorFlag : boolean;
  submitted: boolean = false;
  constructor(
    public customerservice: CustomerService,
    private router: Router,
    private formBuilder: FormBuilder
  ) { }

  ngOnInit(): void {
    this.assignForm = this.formBuilder.group({
      usrid: ["", Validators.required],
      testId: ["", Validators.required],
    });
  }
  public submit() {
    this.submitted=true;
    if(this.assignForm.valid) {
      this.userId=this.assignForm.controls.usrid.value;
      this.testId=this.assignForm.controls.testId.value;
      this.customerservice
        .assignTest(this.userId,this.testId)
        .subscribe((data) => {
          if(data=="sucess") {
            alert("Test has been assigned successfully");
            this.router.navigate(["/admin"]);
          }
        },
          (error) => {
            this.message=error.error;
            this.errorFlag=true;
          }
        );
        }else
        {
          return;
        }
    }
  }

