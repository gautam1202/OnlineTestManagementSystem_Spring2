import { Injectable } from "@angular/core";

import { HttpClient } from "@angular/common/http";

import { Observable } from "rxjs";
import { Login } from "./login";

@Injectable({
  providedIn: "root",
})
export class CustomerService {
  public userId: number;
  public password: string;
  public testId : number;
  constructor(private http: HttpClient) {}

  public loginValidate(userId: number, password: string) {
    this.password = password;
    this.userId = userId;
    return this.http.get(
      "http://localhost:1130/User/validate/" + userId + "/" + password
    );
  }

  // public getUserById(id: number) {
  //   return this.http.get<Customer[]>("http://localhost:1130/User/id/" + id);
  // }
  public loginDetails(name: string) {
    return this.http.get<Login>(
      "http://localhost:1130/Login/LoginDetails/" + name
    );
  }

  public changePassword(login: Login) {
    return this.http.put("http://localhost:1130/Login/ChangePassword", login, {
      responseType: "text" as "json",
    });
  }
  public SignUp(user: Login) {
    return this.http.post("http://localhost:1130/SignUp", user, {
      responseType: "text" as "json",
    });
  }

  public assignTest(userId :number,testId:number) {
    this.userId=userId;
    this.testId=testId;
    return this.http.get("http://localhost:1130/test/assignTest"+userId+"/"+testId);
  }
}
