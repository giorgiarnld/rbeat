package monitor.services

import monitor.models.HealthReport

class ReportService {

    fun print(

        reports: List<HealthReport>

    ) {

        println()

        println("Camera Status Report")

        println("------------------------------")

        reports.forEach {

            println(

                "${it.camera.name} | " +

                "${it.status} | " +

                "${it.latency} ms | " +

                "${it.signalQuality}%"

            )

        }

    }

}
