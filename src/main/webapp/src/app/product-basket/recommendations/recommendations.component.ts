import {Component, Input, OnInit} from '@angular/core';
import {Product} from '../../product';
import {ProductsProviderService} from '../../products-provider/products-provider.service';
import {TotalPrice} from '../../total-price';

@Component({
    selector: 'app-recommendations',
    templateUrl: './recommendations.component.html',
    styleUrls: ['./recommendations.component.css']
})
export class RecommendationsComponent implements OnInit {

    @Input('recommended') recommendedProducts: Product[];
    @Input('selected') selectedProducts: Product[];
    @Input() productsProvider: ProductsProviderService;
    @Input() total: TotalPrice;

    constructor() {
    }

    ngOnInit() { }

    addProduct(product: Product) {
        this.total.price += product.price * product.count;
        console.log(this.total);
        this.selectedProducts.push(product);
        const ids = this.getIdsSeparatedByComma();
        this.productsProvider.getRecommendations(ids).subscribe(recommendations => {
            this.recommendedProducts = recommendations.items.slice(0, 4);
        });
    }

    private getIdsSeparatedByComma(): string {
        const ids = [];
        this.selectedProducts.forEach(product => ids.push(product.id));
        return ids.join(',');
    }
}
