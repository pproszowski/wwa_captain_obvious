import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductBasketComponent } from './product-basket/product-basket.component';
import { ProductListComponent } from './product-list/product-list.component';
import {RecommendationsComponent} from './product-basket/recommendations/recommendations.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MaterialModule} from '../material/material.module';

@NgModule({
  declarations: [
    AppComponent,
    ProductBasketComponent,
    ProductListComponent,
      RecommendationsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
      BrowserAnimationsModule,
      MaterialModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
