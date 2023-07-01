import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MovieControlComponent } from './movie-control.component';

describe('MovieControlComponent', () => {
  let component: MovieControlComponent;
  let fixture: ComponentFixture<MovieControlComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MovieControlComponent]
    });
    fixture = TestBed.createComponent(MovieControlComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
