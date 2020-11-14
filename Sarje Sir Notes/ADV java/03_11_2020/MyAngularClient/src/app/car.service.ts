import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CarService {

  
  constructor(private http: HttpClient) {
  }

  getAll(): Observable<any> {
    return this.http.get('//localhost:8080/car_list');
  }


  get(id: string) {
    return this.http.get( '//localhost:8080/get_car/' + id);
  }

  save(car: any): Observable<any> {
    let result: Observable<any>;
    if (car.href) {
      result = this.http.put(car.href, car);
    } else {
      result = this.http.post('//localhost:8080/car_add', car);
    }
    return result;
  }

  remove(href: string) {
    return this.http.delete(href);
  }



}
