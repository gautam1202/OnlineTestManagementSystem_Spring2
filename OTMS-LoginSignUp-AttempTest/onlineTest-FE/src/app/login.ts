import { Test } from "./test";

export class Login {
  userId: number;
  userName: string;
  password: string;
  isAdmin: boolean;
  test: Test;
  constructor(userId, userName, password, isAdmin, test) {
    this.userId = userId;
    this.userName = userName;
    this.password = password;
    this.isAdmin = isAdmin;
    this.test = test;
  }
}
