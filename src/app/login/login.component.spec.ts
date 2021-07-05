import { DebugElement } from '@angular/core';
import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule, By } from '@angular/platform-browser';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import {HttpClientModule} from '@angular/common/http';
import { LoginComponent } from './login.component';

describe('LoginComponent', () => {
  let component: LoginComponent;
  let fixture: ComponentFixture<LoginComponent>;
  let de: DebugElement;
  let el: HTMLElement;
  beforeEach(waitForAsync (() => {
     TestBed.configureTestingModule({
      declarations: [ LoginComponent ],
      imports: [
        RouterTestingModule,
        BrowserModule,
        FormsModule,
        ReactiveFormsModule,
        HttpClientTestingModule
      ]
    }).compileComponents().then(()=>{
      fixture = TestBed.createComponent(LoginComponent);
      component = fixture.componentInstance;
    de=fixture.debugElement.query(By.css('form'));
    el=de.nativeElement;
    });
  }));

 // beforeEach(() => {
   // fixture = TestBed.createComponent(LoginComponent);
   // component = fixture.componentInstance;
   // fixture.detectChanges();
  //});

 // it('should create', () => {
   // expect(component).toBeTruthy();
  //});

  it(`should call the loginNow method`, waitForAsync(() => {
    fixture.detectChanges();
    spyOn(component, 'loginNow');
    el=fixture.debugElement.query(By.css('button')).nativeElement;
    el.click();
   expect(component.loginNow).toHaveBeenCalledTimes(0);
 }));



 it('form should be invalid', waitForAsync(() => {
  component.contactForm.controls['username'].setValue('');
  component.contactForm.controls['password'].setValue('');
   expect(component.contactForm.valid).toBeFalsy();
 }));

 it('form should be valid', waitForAsync(() => {
  component.contactForm.controls['username'].setValue('vachi');
  component.contactForm.controls['password'].setValue('vachi12');
   expect(component.contactForm.valid).toBeTruthy();
 }));
});

