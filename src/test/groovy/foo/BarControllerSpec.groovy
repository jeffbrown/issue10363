package foo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(BarController)
class BarControllerSpec extends Specification {

    void "class under test getter throws exception"() {
        when:
        getController()

        then:
        notThrown ClassCastException
    }

}
