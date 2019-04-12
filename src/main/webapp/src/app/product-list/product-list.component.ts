import {Component, OnInit} from '@angular/core';

class MockProduct {

    id: string;
    name: string;
    price: number;
    count: number;
    image_url: string;

    constructor(name, price, count, image_url) {
        this.id = "0";
        this.name = name;
        this.price = price;
        this.image_url = image_url;
        this.count = count;
    }
}

@Component({
    selector: 'app-product-list',
    templateUrl: './product-list.component.html',
    styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

    products: MockProduct[];

    constructor() {
    }

    ngOnInit() {
        this.products = [];
        this.products.push(new MockProduct("Pendrive", 30, 2,  "https://images-na.ssl-images-amazon.com/images/I/61fFVQlEB6L._SX425_.jpg"));
        this.products.push(new MockProduct("Peleryna", 300, 1, "https://sklepanimatora.pl/data/gfx/pictures/medium/2/7/10372_2.png"));

    }
}
