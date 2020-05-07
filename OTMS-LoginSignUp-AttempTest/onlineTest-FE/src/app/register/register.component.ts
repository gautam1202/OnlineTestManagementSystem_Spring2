import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from "@angular/forms";
import { Router } from "@angular/router";
import { CustomerService } from "../customer.service";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  addForm: FormGroup;
  submitted: boolean = false;
  constructor(
    private customerService: CustomerService,
    private formBuilder: FormBuilder,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.addForm = this.formBuilder.group({
      userId: [
        "",
        [Validators.required, Validators.pattern("[0-9]{8,8}")],
      ],
      userName: ["", [Validators.required, Validators.pattern("[A-Z a-z]{6,12}")]],
      userPassword: [
        "",
        [
          Validators.required,
          Validators.minLength(6),
          Validators.maxLength(12),
        ],
      ],
    });
    if (localStorage.usr != null) {
      localStorage.removeItem("usr");
    }
  }
  addUser() {
    this.submitted = true;
    if (this.addForm.invalid) {
      return alert(`Not Registered`);
    }
    console.log(this.addForm.value);
    this.customerService.SignUp(this.addForm.value).subscribe(
      (data) => {
        alert(
          `Hello, ${this.addForm.controls.userId.value}. Your User has been created successfully😊`
        );
        this.router.navigate(["login"]);
      },
      (err) => {
        console.log(err.stack);
      }
    );
  }
}

