import { Component, OnInit } from '@angular/core';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'leave-planner';

  workDays;
  vacationDays;
  dataSource;

  displayedColumns = ['employeeId', 'type', 'vacationDays', 'workDays', 'takeLeave', 'work']

  constructor(private appService: AppService) {
    
  }

  ngOnInit(): void {
    this.appService.getEmployeeData().subscribe(result => this.dataSource = result)
  }

  takeLeave(vacationDays) {
    this.appService.takeLeave(vacationDays).subscribe(
      () => this.refresh()
    )
  } 

  work(workDays) {
    this.appService.work(workDays).subscribe(
      () => this.refresh()
    )
  }

  refresh() {
    window.location.reload();
  }
}
