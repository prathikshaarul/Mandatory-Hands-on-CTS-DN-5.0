import { Component, OnInit, OnDestroy } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CourseList } from '../course-list/course-list';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    FormsModule,
    CourseList
  ],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home implements OnInit, OnDestroy {

  portalName = 'Student Course Portal';
  isPortalActive = true;
  message = '';
  searchTerm = '';

  availableCourses = 0;

  ngOnInit(): void {
    this.availableCourses = 12;
    console.log('HomeComponent initialised — courses loaded');
  }

  ngOnDestroy(): void {
    console.log('HomeComponent destroyed');
  }

  onEnrollClick(): void {
    this.message = 'Enrollment opened!';
  }

}