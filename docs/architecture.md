# Architecture

```
               Main
                 │
                 ▼
          CameraService
      ┌──────┼──────────┬──────────┐
      ▼      ▼          ▼          ▼
 PingService Signal  Report  Statistics
      │
      ▼
 ConsolePrinter
```

## Components

### CameraService

Coordinates the monitoring workflow.

### PingService

Measures camera latency.

### SignalService

Evaluates signal quality.

### ReportService

Builds health reports.

### StatisticsService

Calculates dashboard metrics.

### ConsolePrinter

Formats console output.
