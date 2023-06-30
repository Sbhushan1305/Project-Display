import { TestBed } from '@angular/core/testing';

import { MoviewServiceService } from './moview-service.service';

describe('MoviewServiceService', () => {
  let service: MoviewServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MoviewServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
