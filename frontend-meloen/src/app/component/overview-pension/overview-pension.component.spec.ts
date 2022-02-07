import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OverviewPensionComponent } from './overview-pension.component';

describe('OverviewPensionComponent', () => {
  let component: OverviewPensionComponent;
  let fixture: ComponentFixture<OverviewPensionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OverviewPensionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OverviewPensionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
