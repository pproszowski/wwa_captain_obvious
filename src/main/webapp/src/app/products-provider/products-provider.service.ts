import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Product} from '../product';
import {Cart} from '../cart';

@Injectable({
    providedIn: 'root'
})
export class ProductsProviderService {

    private cart: Cart;
    private baseUrl = 'http://localhost:8080/api/';

    constructor(private http: HttpClient) {
        this.http.get<Cart>(this.baseUrl + 'cart').subscribe(cart =>{
            this.cart = cart;
            console.log(cart);
        });
    }

    getRecommendations() {
        const ids = [];
        this.cart.products.forEach(product => ids.push(product.id));
        const idsString = ids.join(',');
        let parameter = '?itemsIds=';
        if (ids.length > 0) {
            parameter += idsString;
        } else {
            parameter = '';
        }
        return this.http.get<Product[]>(this.baseUrl + 'recommendation' + parameter);
    }

    getRandomCartProducts() {
        return this.http.get<Product[]>(this.baseUrl + 'products');
    }

    addProduct(product: Product) {
        this.cart.products.push(product);
    }

    removeProduct(product: Product) {
        const id = this.cart.products.indexOf(product);
        this.cart.products.splice(id, 1);
    }
}
