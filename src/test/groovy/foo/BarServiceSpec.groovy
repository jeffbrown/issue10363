package foo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(BarService)
class BarServiceSpec extends Specification {

    void "class under test getter throws exception"() {
        when:
        getService()

        then:
        thrown(ClassCastException)
    }

}
