import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddMoviewComponent } from './add-moview.component';

describe('AddMoviewComponent', () => {
  let component: AddMoviewComponent;
  let fixture: ComponentFixture<AddMoviewComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddMoviewComponent]
    });
    fixture = TestBed.createComponent(AddMoviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
