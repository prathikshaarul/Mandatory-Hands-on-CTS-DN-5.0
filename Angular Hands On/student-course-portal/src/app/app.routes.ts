import { Routes } from '@angular/router';
import { Home } from './pages/home/home';
import { EnrollmentForm } from './pages/enrollment-form/enrollment-form';
import { ReactiveEnrollmentForm } from './pages/reactive-enrollment-form/reactive-enrollment-form';

export const routes: Routes = [
  {
    path: '',
    component: Home
  },
  {
    path: 'enroll',
    component: EnrollmentForm
  },
  {
    path: 'enroll-reactive',
    component: ReactiveEnrollmentForm
  }
];