import { Component, OnInit } from "@angular/core";
import { Validators, FormBuilder, FormGroup } from "@angular/forms";
import { CustomerService } from "../customer.service";
import { Router } from "@angular/router";
import { Login } from "../login";

@Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"],
})
export class LoginComponent implements OnInit {
  public loginarr: Login[] = [];
  public userId: number;
  public password: string;
  public loginFlag: boolean = false;
  public adminFlag: boolean = false;
  public employeeFlag: boolean = false;
  public empFlag: boolean = false;
  loginArr: Login[] = [];

  loginForm: FormGroup;
  invalidLogin = false;

  submitted: boolean = false;
  message : any;
  errorFlag : boolean;
  constructor(
    public customerservice: CustomerService,
    private router: Router,
    private formBuilder: FormBuilder
  ) {}
  ngOnInit() {
    this.loginForm = this.formBuilder.group({
      usrid: ["", Validators.required],
      password: ["", Validators.required],
    });
  }
  public authenticate() {
    this.submitted = true;
    if (this.loginForm.valid) {
      this.userId = this.loginForm.controls.usrid.value;
      this.password = this.loginForm.controls.password.value;
      this.customerservice
        .loginValidate(this.userId, this.password)
        .subscribe((data) => {
          if (data === 1) {
            this.router.navigate(["/user"]);
          } else if (data === 2) {
            this.router.navigate(["/admin"]);
          } else {
            this.invalidLogin = true;
          }
        },
        (error) =>{
          this.message=error.error;
          this.errorFlag=true;
        }
        );
    } else {
      return;
    }
  }
}
