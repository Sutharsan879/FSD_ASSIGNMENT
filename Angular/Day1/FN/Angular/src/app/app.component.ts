import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})

export class AppComponent {
  name:string
  age:Number
  email:string
  constructor()
  {
    this.name="Sutharsan"
    this.age=20
    this.email="sutharsanmurugan87@gmail.com"
  }
  changeName()
  {
    this.name="Dhanush"
  }
  changeage()
  {
    this.age=24;
  }
  changeemail()
  {
    this.email="sutharsanm879@gmail.com"
  }
  // <img [src]="download.png"/>
}
