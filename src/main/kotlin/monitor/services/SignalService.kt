package monitor.services

import monitor.models.Camera
import kotlin.random.Random

class SignalService {

    fun quality(

        camera: Camera

    ): Int {

        return Random.nextInt(

            65,

            100

        )

    }

}
