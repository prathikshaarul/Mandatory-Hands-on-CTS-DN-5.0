import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseCard } from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CommonModule, CourseCard],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList implements OnInit {

  isLoading: boolean = true;

  courses = [
  {
    id: 1,
    name: 'Angular',
    code: 'CS101',
    credits: 4,
    gradeStatus: 'passed',
    enrolled: true
  },
  {
    id: 2,
    name: 'Java',
    code: 'CS102',
    credits: 3,
    gradeStatus: 'failed',
    enrolled: false
  },
  {
    id: 3,
    name: 'Python',
    code: 'CS103',
    credits: 4,
    gradeStatus: 'pending',
    enrolled: false
  },
  {
    id: 4,
    name: 'Database Systems',
    code: 'CS104',
    credits: 3,
    gradeStatus: 'passed',
    enrolled: true
  },
  {
    id: 5,
    name: 'Machine Learning',
    code: 'CS105',
    credits: 4,
    gradeStatus: 'pending',
    enrolled: false
  }
];
  selectedCourseId: number | null = null;

  ngOnInit(): void {
  console.log('ngOnInit called');

  setTimeout(() => {
    console.log('Loading finished');
    this.isLoading = false;
  }, 1500);
}

  onEnroll(courseId: number): void {
    console.log('Enrolling in course: ' + courseId);
    this.selectedCourseId = courseId;
  }

  // trackBy improves performance by reusing DOM elements
  trackByCourseId(index: number, course: any): number {
    return course.id;
  }
}