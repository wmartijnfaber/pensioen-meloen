import { Injectable } from '@angular/core';
import {Action, Selector, State, StateContext} from '@ngxs/store';
import {BackendService} from "../service/backend.service";


/// Actions

export class PatchUser {
  static readonly type = '[PensionStateModel] Patch User';
  constructor(public  payload: UserStateModel) {
  }
}

export class PatchPension {
  static readonly type = '[PensionStateModel] Patch Pension';
  constructor(public  payload: PensionStateModel) {
  }
}


/// Models



export interface UserStateModel {
  firstname: string,
  lastname: string,
  email: string,
  dateOfBirth: string,
  street: string,
  city: string,
  zip: string,
  housenumber: number,
  housenumberAddition: string,
  preferredRetireAge: number;

}

export interface EmploymentStateModel {
  employerName: string,
  salary: number,
  currentValue: number,
  employmentType: string,
  depositBankAccount: string

}

export interface PensionStateModel {
  calculatedValue: number
  user: UserStateModel| undefined
  employment: EmploymentStateModel| undefined
}

@State<PensionStateModel>({
  defaults: {
    calculatedValue: 0,
    user: undefined,
    employment: undefined,
  },
  name: 'PensionState',
})

@Injectable()
export class PensionState {

  constructor(private backendService: BackendService) {
  }

  @Selector()
  static getPensioen(state: PensionStateModel): PensionStateModel {
    return state;
  }

  @Selector()
  static getUser(state: PensionStateModel): UserStateModel | undefined {
    return state.user;
  }

  @Selector()
  static getEmployment(state: PensionStateModel): EmploymentStateModel | undefined {
    return state.employment;
  }



  @Action(PatchUser)
  patchUser(ctx: StateContext<PensionStateModel>, action: {payload: UserStateModel}) {
    ctx.patchState({
       employment: ctx.getState().employment,
       user: action.payload
      })
    this.updateBackend(action.payload);
  }

  private updateBackend(user:UserStateModel) {
    this.backendService.updateBackend(user);
  }
}
