import {AfterContentInit,  Renderer2} from '@angular/core';
import {Component, ElementRef} from '@angular/core';
import * as confetti from 'canvas-confetti';

@Component({
  selector: 'app-confetti',
  templateUrl: './confetti.component.html',
  styleUrls: ['./confetti.component.scss']
})
export class ConfettiComponent implements AfterContentInit{


  constructor(
    private renderer2: Renderer2,
    private elementRef: ElementRef
  ) {  }


  public suprise(): void {
    const canvas = this.renderer2.createElement('canvas');

    this.renderer2.appendChild(this.elementRef.nativeElement, canvas);
    //this.renderer2.setStyle(canvas, 'width','100%')

    const myConfetti = confetti.create(canvas, {
      resize: true,
      useWorker: false
    });

    myConfetti({
      particleCount: 160,
      startVelocity: 30,
      spread: 300,
    });
    setTimeout(()=> {
      this.renderer2.removeChild(this.elementRef.nativeElement, canvas);
    }, 1000)
  }


  ngAfterContentInit(): void {
    this.suprise();
  }

  ngOnDestroy(): void {
  }

}
