import { Directive, ElementRef, HostListener, Input, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appHighlight]',
  standalone: true
})
export class Highlight {

  @Input() appHighlight = 'yellow';

  constructor(
    private el: ElementRef,
    private renderer: Renderer2
  ) {}

  @HostListener('mouseenter')
  onMouseEnter() {
    this.renderer.setStyle(this.el.nativeElement, 'backgroundColor', 'yellow');
    this.renderer.setStyle(this.el.nativeElement, 'border', '5px solid red');
  }

  @HostListener('mouseleave')
  onMouseLeave() {
    this.renderer.removeStyle(this.el.nativeElement, 'backgroundColor');
    this.renderer.removeStyle(this.el.nativeElement, 'border');
  }
}