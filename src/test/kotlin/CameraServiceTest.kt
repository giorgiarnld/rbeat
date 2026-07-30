package monitor

import kotlin.test.Test
import kotlin.test.assertNotNull
import monitor.services.CameraService

class CameraServiceTest {

    @Test
    fun shouldCreateService() {

        val service = CameraService()

        assertNotNull(service)

    }

}
