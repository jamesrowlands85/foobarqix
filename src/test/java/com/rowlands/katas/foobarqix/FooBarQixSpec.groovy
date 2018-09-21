package com.rowlands.katas.foobarqix

import spock.lang.Specification

class FooBarQixSpec extends Specification {
    FooBarQix fbq

    def setup() {
        fbq = new FooBarQix()
    }

    def "FooBarQix response"() {
        expect:
        fbq.calculcateResponse(number) == response

        where:
        number  | response
        1       | "1"
        2       | "2"
        3       | "FooFoo"
        5       | "BarBar"
        6       | "Foo"
        7       | "QixQix"
        8       | "8"
        9       | "Foo"
        10      | "Bar*"
        15      | "FooBarBar"
        21      | "FooQix"
        33      | "FooFooFoo"
        51      | "FooBar"
        53      | "BarFoo"
        303     | "FooFoo*Foo"
        105     | "FooBarQix*Bar"
        10101   | "FooQix**"
    }
}
