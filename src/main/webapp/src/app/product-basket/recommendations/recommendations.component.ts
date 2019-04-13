import {Component, Input, OnInit} from '@angular/core';
import {Product} from '../../product';
import {ProductsProviderService} from '../../products-provider/products-provider.service';

@Component({
    selector: 'app-recommendations',
    templateUrl: './recommendations.component.html',
    styleUrls: ['./recommendations.component.css']
})
export class RecommendationsComponent implements OnInit {

    @Input('recommended') recommendedProducts: Product[];
    @Input('selected') selectedProducts: Product[];
    @Input() productsProvider: ProductsProviderService;

    constructor() {
    }

    ngOnInit() { }

    addProduct(product: Product) {
        this.selectedProducts.push(product);
        const ids = this.getIdsSeparatedByComma();
        this.productsProvider.getRecommendations(ids).subscribe(recommendations => {
            this.recommendedProducts = recommendations.items.slice(0,4);
        });
    }

    private getIdsSeparatedByComma(): string {
        const ids = [];
        this.selectedProducts.forEach(product => ids.push(product.id));
        return ids.join(',');
    }
}
