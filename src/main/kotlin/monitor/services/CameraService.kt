package monitor.services

import monitor.models.Camera
import monitor.models.CameraStatus
import monitor.models.HealthReport

class CameraService {

    private val pingService = PingService()

    private val signalService = SignalService()

    private val reportService = ReportService()

    private val statisticsService = StatisticsService()

    private val cameras = listOf(

        Camera(
            "CAM-01",
            "Front Entrance",
            "192.168.1.10",
            "Entrance"
        ),

        Camera(
            "CAM-02",
            "Warehouse",
            "192.168.1.11",
            "Warehouse"
        ),

        Camera(
            "CAM-03",
            "Parking",
            "192.168.1.12",
            "Parking"
        )

    )

    fun printReport() {

        val reports = cameras.map {

            HealthReport(

                camera = it,

                status = CameraStatus.ONLINE,

                latency = pingService.measure(it),

                signalQuality = signalService.quality(it)

            )

        }

        reportService.print(reports)

        statisticsService.printSummary(reports)

    }

}
