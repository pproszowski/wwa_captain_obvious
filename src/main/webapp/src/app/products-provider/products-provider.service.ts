import {Injectable, OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Product} from '../product';
import {Observable} from 'rxjs';
import {Cart} from '../cart';

@Injectable({
    providedIn: 'root'
})
export class ProductsProviderService {

    private baseUrl = 'http://localhost:8080/api/';

    constructor(private http: HttpClient) {
    }

    getCart(): Observable<Cart> {
        return this.http.get<Cart>(this.baseUrl + 'cart');
    }

}
