package monitor

import monitor.services.CameraService

fun main() {

    val service = CameraService()

    println("Camera Health Monitor")

    println("=====================")

    service.printReport()

}
