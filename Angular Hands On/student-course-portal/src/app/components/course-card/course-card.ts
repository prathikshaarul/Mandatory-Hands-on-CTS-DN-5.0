import { Component, Input, Output, EventEmitter } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Highlight } from '../../directives/highlight';
import { CreditLabelPipe } from '../../pipes/credit-label-pipe';
@Component({
  selector: 'app-course-card',
  standalone: true,
  imports: [CommonModule, Highlight, CreditLabelPipe],
  templateUrl: './course-card.html',
  styleUrl: './course-card.css'
})
export class CourseCard {

  @Input() course!: {
    id: number;
    name: string;
    code: string;
    credits: number;
    gradeStatus: string;
    enrolled?: boolean;
  };

  @Output() enrollRequested = new EventEmitter<number>();

  isExpanded = false;


  enroll(): void {
    this.enrollRequested.emit(this.course.id);
  }


  toggleDetails(): void {
    this.isExpanded = !this.isExpanded;
  }


  // Getter keeps template clean by moving class logic into component
  get cardClasses() {
    return {
      'card--enrolled': this.course.enrolled,
      'card--full': this.course.credits >= 4,
      'expanded': this.isExpanded
    };
  }


  get borderColor(): string {

    switch(this.course.gradeStatus) {

      case 'passed':
        return 'green';

      case 'failed':
        return 'red';

      default:
        return 'grey';
    }
  }

}