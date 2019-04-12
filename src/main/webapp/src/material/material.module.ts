import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {MatCardModule, MatListModule, MatProgressSpinnerModule} from '@angular/material';

@NgModule({
    declarations: [],
    imports: [
        CommonModule,
        MatProgressSpinnerModule,
        MatCardModule,
        MatListModule,
    ],
    exports: [
        MatProgressSpinnerModule,
        MatCardModule,
        MatListModule,
    ]
})
export class MaterialModule {
}
