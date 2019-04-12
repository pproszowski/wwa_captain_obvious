import { Component, OnInit } from '@angular/core';

class Product {

  name: string;
  price: number;
  image_url: string;

  constructor(name, price, image_url){
    this.name = name;
    this.price = price;
    this.image_url = image_url;
  }
}

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: Product[];

  constructor() { }

  ngOnInit() {
    this.products = [];
    this.products.push(new Product("Pendrive",30, "https://images-na.ssl-images-amazon.com/images/I/61fFVQlEB6L._SX425_.jpg"));
    this.products.push(new Product("Peleryna",300, "/image2.jpg"));

  }
}
