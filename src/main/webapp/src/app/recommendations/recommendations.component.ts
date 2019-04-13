import { Component, OnInit } from '@angular/core';
import {ProductsProviderService} from '../products-provider/products-provider.service';
import {Product} from '../product';

@Component({
  selector: 'app-recommendations',
  templateUrl: './recommendations.component.html',
  styleUrls: ['./recommendations.component.css']
})
export class RecommendationsComponent implements OnInit {

  private recommendedProducts: Product[];

  constructor(private recommendationsProvider: ProductsProviderService) { }

  ngOnInit() {
    this.recommendationsProvider.getRecommendations().subscribe(result => this.recommendedProducts = result);
  }

}
