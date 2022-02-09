import {Component, Input, OnInit} from '@angular/core';
import {Select} from "@ngxs/store";
import {PensionState, PensionStateModel} from "../../states/pension.state";
import {Observable} from "rxjs";

@Component({
  selector: 'app-overview-pension',
  templateUrl: './overview-pension.component.html',
  styleUrls: ['./overview-pension.component.scss']
})
export class OverviewPensionComponent implements OnInit {

  @Input()
  public pension: PensionStateModel

  constructor() { }

  ngOnInit(): void {
  }

}
