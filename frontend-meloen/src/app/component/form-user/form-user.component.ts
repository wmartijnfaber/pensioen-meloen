import { Component, OnInit } from '@angular/core';
import {Observable} from "rxjs";
import {PatchUser, PensionState, UserStateModel} from "../../states/pension.state";
import {Select, Store} from "@ngxs/store";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {MatSnackBar} from "@angular/material/snack-bar";

@Component({
  selector: 'app-form-user',
  templateUrl: './form-user.component.html',
  styleUrls: ['./form-user.component.scss']
})
export class FormUserComponent implements OnInit {

  @Select(PensionState.getUser)
  private user$: Observable<UserStateModel>

  private user: UserStateModel;

  public userForm: FormGroup = this.formBuilder.group({
    firstname: [null, Validators.required],
    lastname: [null, Validators.required],
    email: [null, [Validators.required, Validators.email]],
    dateOfBirth: [null, Validators.required],
    street: [null , Validators.required],
    city: [null , Validators.required],
    zip: [null , [Validators.required, Validators.minLength(6)]],
    housenumber: [null , Validators.required],
    housenumberAddition: [null],
    preferredRetireAge: [null, [Validators.required, Validators.minLength(2), Validators.maxLength(3)]],
  })


  constructor(private formBuilder: FormBuilder, private store: Store, private _snackBar: MatSnackBar) { }

  ngOnInit(): void {
    this.user$.subscribe(res => {
      this.patchForm(res);
    })
  }

  private patchForm(user:UserStateModel) {
    if(user) {
      this.userForm.setValue(user);
    }
  }

  public submitForm() {
    let user: UserStateModel;
    if(this.userForm.valid) {
      this.store.dispatch(new PatchUser(this.userForm.value)).subscribe(res => {
        this._snackBar.open("Formulier opgeslagen");
      })
    }
  }

}
