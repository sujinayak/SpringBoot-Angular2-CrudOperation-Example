import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CustomerComponent } from './components/customer.component';


const appRoutes : Routes= [
    {
        path:'',
        component: CustomerComponent
    },
    {
        path:'user',
        component: CustomerComponent 
    }
 
];
export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);


