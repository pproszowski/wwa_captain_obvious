import { Component, OnInit } from '@angular/core';
import {ProductsProviderService} from '../products-provider/products-provider.service';
import {Product} from '../product';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-recommendations',
  templateUrl: './recommendations.component.html',
  styleUrls: ['./recommendations.component.css']
})
export class RecommendationsComponent implements OnInit {

  private recommendedProducts: Observable<Product[]>;

  constructor(private recommendationsProvider: ProductsProviderService) { }

  ngOnInit() {
  }

}
