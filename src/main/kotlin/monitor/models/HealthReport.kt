package monitor.models

data class HealthReport(

    val camera: Camera,

    val status: CameraStatus,

    val latency: Int,

    val signalQuality: Int

)
