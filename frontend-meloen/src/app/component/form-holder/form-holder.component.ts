import { Component, OnInit } from '@angular/core';
import {Select, Selector, Store} from "@ngxs/store";
import {PensionState} from "../../states/pension.state";
import {Observable} from "rxjs";

@Component({
  selector: 'app-form-holder',
  templateUrl: './form-holder.component.html',
  styleUrls: ['./form-holder.component.scss']
})
export class FormHolderComponent implements OnInit {

  @Select(PensionState.getPensioen)
  private pension$: Observable<PensionState>

  private pension: PensionState;

  private loading: true;

  private wantToSeeForm: true;

  constructor() { }



  ngOnInit(): void {
    this.pension$.subscribe(res => {
      this.pension = res;
    })
  }

  doIshowForm(): boolean {
    return true;
    /*if(this.loading == false && this.loading == wantToSeeForm) {
      return true;
    }
    return false;*/
  }

}
