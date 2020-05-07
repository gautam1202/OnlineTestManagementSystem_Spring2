import { Time } from "@angular/common";
import { Login } from "./login";

export class Test {
  testId: number;
  testTitle: string;
  testDuration: Time;
  testTotalMarks: number;
  testMarksScored;
  startTime: Time;
  endTime: Time;
  login: Login;
}
