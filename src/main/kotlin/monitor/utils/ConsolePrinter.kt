package monitor.utils

import monitor.models.HealthReport

object ConsolePrinter {

    fun print(report: HealthReport) {

        println("--------------------------------")

        println("Camera   : ${report.camera.name}")

        println("IP       : ${report.camera.ip}")

        println("Location : ${report.camera.location}")

        println("Status   : ${report.status}")

        println("Latency  : ${report.latency} ms")

        println("Signal   : ${report.signalQuality}%")

        println("--------------------------------")

    }

}
