import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../environments/environment";
import {PensionStateModel, UserStateModel} from "../states/pension.state";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class BackendService {

  constructor(private http: HttpClient) {}

  public updateBackend(userModel: UserStateModel): Observable<PensionStateModel> {
    return this.http.post<PensionStateModel>(environment.host+"/post", userModel);
  }

  public getPension(id: number): Observable<PensionStateModel> {
    return this.http.get<PensionStateModel>(environment.host+"/get" + id);
  }
}
