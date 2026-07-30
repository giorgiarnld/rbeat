package monitor.services

import monitor.models.Camera
import kotlin.random.Random

class PingService {

    fun measure(

        camera: Camera

    ): Int {

        return Random.nextInt(

            8,

            90

        )

    }

}
