import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";

import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";

import { HttpClientModule } from "@angular/common/http";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { LoginComponent } from "./login/login.component";
import { CustomerService } from "./customer.service";
import { AdminComponent } from "./admin/admin.component";
import { UserComponent } from "./user/user.component";
import { RegisterComponent } from './register/register.component';
import { AssignTestComponent } from './assign-test/assign-test.component';
@NgModule({
  declarations: [AppComponent, AdminComponent, LoginComponent, UserComponent, RegisterComponent, AssignTestComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [CustomerService],
  bootstrap: [AppComponent],
})
export class AppModule {}
