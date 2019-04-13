import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {
    MatButtonModule,
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
        MatButtonModule
    ],
    exports: [
        MatProgressSpinnerModule,
        MatCardModule,
        MatListModule,
        MatGridListModule,
        MatInputModule,
        MatFormFieldModule,
        MatButtonModule
    ]
})
export class MaterialModule {
}
