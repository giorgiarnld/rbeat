package monitor.services

import monitor.models.HealthReport

class StatisticsService {

    fun printSummary(

        reports: List<HealthReport>

    ) {

        val averageLatency =

            reports.map {

                it.latency

            }.average()

        val averageSignal =

            reports.map {

                it.signalQuality

            }.average()

        println()

        println("Summary")

        println("-------")

        println("Cameras: ${reports.size}")

        println("Average latency: %.1f ms".format(averageLatency))

        println("Average signal: %.1f%%".format(averageSignal))

    }

}
