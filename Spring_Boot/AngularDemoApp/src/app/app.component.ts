import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Thunder';

  num1: number = 34;
  cs: number = 2;

  cssClass = "myClass myClass2";


  newCSSFun(): string {
    return this.cssClass;
  }


  css = "myClass";
  css2 = "myClass2";

  functionTrue(): boolean {
    return false;
  }

  bool1 :boolean = false;



}
