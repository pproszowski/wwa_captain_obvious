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

  constructor() { }

  ngOnInit() {
  }
}
