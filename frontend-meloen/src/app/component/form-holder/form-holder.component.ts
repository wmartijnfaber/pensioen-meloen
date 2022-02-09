import { Component, OnInit } from '@angular/core';
import {Select, Selector, Store} from "@ngxs/store";
import {PatchPension, PensionState, PensionStateModel} from "../../states/pension.state";
import {Observable} from "rxjs";
import {BackendService} from "../../service/backend.service";

@Component({
  selector: 'app-form-holder',
  templateUrl: './form-holder.component.html',
  styleUrls: ['./form-holder.component.scss']
})
export class FormHolderComponent implements OnInit {

  @Select(PensionState.getPensioen)
  private pension$: Observable<PensionStateModel>

  public pension: PensionStateModel;

  private loading: boolean = true;

  private wantToSeeForm: true;

  constructor(private store: Store, private backendService: BackendService) {  }

  ngOnInit(): void {

    this.backendService.getPension(1).subscribe(res => {
      this.store.dispatch( new PatchPension(res)).subscribe(res => {
        this.loading = false
      });
    })

    this.pension$.subscribe(res => {
      this.pension = res;
    })
  }

  doIshowForm(): boolean {
    return this.loading == false && this.wantToSeeForm == true
  }

}
