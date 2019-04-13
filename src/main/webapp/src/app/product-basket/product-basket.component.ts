import {Component, OnInit} from '@angular/core';
import {ProductsProviderService} from '../products-provider/products-provider.service';
import {Cart} from '../cart';
import {Product} from '../product';
import {TotalPrice} from '../total-price';

@Component({
    selector: 'app-product-basket',
    templateUrl: './product-basket.component.html',
    styleUrls: ['./product-basket.component.css']
})
export class ProductBasketComponent implements OnInit {

    private cart: Cart;
    private recommended: Product[];
    private selected: Product[];
    private total = new TotalPrice();

    constructor(private productsProvider: ProductsProviderService) {
    }

    ngOnInit() {
        this.productsProvider.getCart().subscribe(cart => {
                this.cart = cart;
                this.selected = cart.selected;
                this.recommended = cart.recommended;
                this.total.price = cart.total;
            }
        );
    }

}
