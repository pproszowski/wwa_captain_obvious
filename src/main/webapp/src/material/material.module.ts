import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {
    MatCardModule,
    MatFormFieldModule,
    MatGridListModule,
    MatInputModule,
    MatListModule,
    MatProgressSpinnerModule
} from '@angular/material';

@NgModule({
    declarations: [],
    imports: [
        CommonModule,
        MatProgressSpinnerModule,
        MatCardModule,
        MatListModule,
        MatGridListModule,
        MatInputModule,
        MatFormFieldModule,
    ],
    exports: [
        MatProgressSpinnerModule,
        MatCardModule,
        MatListModule,
        MatGridListModule,
        MatInputModule,
        MatFormFieldModule,
    ]
})
export class MaterialModule {
}
