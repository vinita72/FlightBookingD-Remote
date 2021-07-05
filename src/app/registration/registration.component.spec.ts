import { DebugElement } from '@angular/core';
import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule, By } from '@angular/platform-browser';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import {HttpClientModule} from '@angular/common/http';
import { RegistrationComponent } from './registration.component';

describe('RegistrationComponent', () => {
  let component: RegistrationComponent;
  let fixture: ComponentFixture<RegistrationComponent>;
  let de: DebugElement;
  let el: HTMLElement;
  beforeEach(waitForAsync( () => {
     TestBed.configureTestingModule({
      declarations: [ RegistrationComponent ],
      imports: [
        RouterTestingModule,
        BrowserModule,
        FormsModule,
        ReactiveFormsModule,
        HttpClientTestingModule
      ]
    })
    .compileComponents().then(()=>{
      fixture = TestBed.createComponent(RegistrationComponent);
      component = fixture.componentInstance;
    de=fixture.debugElement.query(By.css('form'));
    el=de.nativeElement;
    });
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RegistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  //it('should create', () => {
   // expect(component).toBeTruthy();
 // });


 
 it(`should call the registerNow method`, waitForAsync(() => {
  fixture.detectChanges();
  spyOn(component, 'registerNow');
  el=fixture.debugElement.query(By.css('button')).nativeElement;
  el.click();
 expect(component.registerNow).toHaveBeenCalledTimes(0);
}));



it('form should be invalid', waitForAsync(() => {
  component.contactForm.controls['id'].setValue('');
component.contactForm.controls['username'].setValue('');
component.contactForm.controls['password'].setValue('');
component.contactForm.controls['email'].setValue('');
 expect(component.contactForm.valid).toBeFalsy();
}));

it('form should be valid', waitForAsync(() => {
  component.contactForm.controls['username'].setValue('1');
component.contactForm.controls['username'].setValue('vachi');
component.contactForm.controls['password'].setValue('vachi12');
component.contactForm.controls['username'].setValue('vachi12@gmail.com');
 expect(component.contactForm.valid).toBeTruthy();
}));
});
