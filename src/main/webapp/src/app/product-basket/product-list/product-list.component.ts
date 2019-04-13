import {Component, Input, OnInit} from '@angular/core';
import {Product} from '../../product';
import {TotalPrice} from '../../total-price';

@Component({
    selector: 'app-product-list',
    templateUrl: './product-list.component.html',
    styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

    @Input('selected') products: Product[];
    @Input() total: TotalPrice;
    product_value: number;

    constructor() {
    }

    ngOnInit() {
    }

    firechange() {

        let price = 0;
        this.products.forEach(product => price += product.count * product.price);
        this.total.price = price;

    }


    myFunction(product: Product) {
        // this.products = this.products.filter(obj => obj !== product);

        this.deleteMsg(product);
        this.firechange();
    }


    private deleteMsg(product: Product) {
        const index: number = this.products.indexOf(product);
        if (index !== -1) {
            this.products.splice(index, 1);
        }
    }
}
