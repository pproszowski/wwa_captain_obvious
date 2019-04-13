import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {MatCardModule, MatGridListModule, MatListModule, MatProgressSpinnerModule} from '@angular/material';

@NgModule({
    declarations: [],
    imports: [
        CommonModule,
        MatProgressSpinnerModule,
        MatCardModule,
        MatListModule,
        MatGridListModule
    ],
    exports: [
        MatProgressSpinnerModule,
        MatCardModule,
        MatListModule,
        MatGridListModule
    ]
})
export class MaterialModule {
}
