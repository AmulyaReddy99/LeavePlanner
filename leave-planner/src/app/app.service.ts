import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  BASE_URL =  `http://localhost:8080`

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*'
    })
  };

  constructor(private http: HttpClient) { }

  takeLeave(vacationDays): Observable<any> {
    let URL = `${this.BASE_URL}/takeLeave/${vacationDays}`
    return this.http.post(URL, this.httpOptions);
  }

  getEmployeeData(): Observable<any> {
    let URL = `${this.BASE_URL}/getEmployeeData`
    return this.http.post(URL, this.httpOptions);
  }

  work(workDays): Observable<any> {
    let URL = `${this.BASE_URL}/work/${workDays}`
    return this.http.post(URL, this.httpOptions);
  }
}
