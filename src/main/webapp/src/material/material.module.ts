import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {MatCardModule, MatProgressSpinnerModule} from '@angular/material';

@NgModule({
    declarations: [],
    imports: [
        CommonModule,
        MatProgressSpinnerModule,
        MatCardModule,
    ],
    exports: [
        MatProgressSpinnerModule,
        MatCardModule,
    ]
})
export class MaterialModule {
}
