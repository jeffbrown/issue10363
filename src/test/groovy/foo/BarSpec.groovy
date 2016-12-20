package foo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(Bar)
class BarSpec extends Specification {

    void "class under test getter throws exception"() {
        when:
        getDomain()

        then:
        notThrown ClassCastException
    }

}
