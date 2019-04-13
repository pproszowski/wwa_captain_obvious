import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Cart} from '../cart';
import {Product} from '../product';
import {Recommendations} from '../recommendations';

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

    getRecommendations(ids: String) {
        return this.http.get<Recommendations>(this.baseUrl + 'recommendation?itemsIds=' + ids);
    }
}
