import { Injectable } from '@angular/core';
import {Action, Selector, State, StateContext} from '@ngxs/store';


/// Actions

export class PatchUser {
  static readonly type = '[PensionStateModel] Patch User';
  constructor(public  payload: UserStateModel) {
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
  employmentType: string,
  depositBankAccount: string

}

export interface PensionStateModel {
  user: UserStateModel| undefined
  employment: EmploymentStateModel| undefined
}

@State<PensionStateModel>({
  defaults: {
    user: undefined,
    employment: undefined,
  },
  name: 'PensionState',
})

@Injectable()
export class PensionState {

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
  }
}
