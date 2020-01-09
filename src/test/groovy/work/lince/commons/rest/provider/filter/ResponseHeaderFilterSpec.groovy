package work.lince.commons.rest.provider.filter

import spock.lang.Specification
import spock.lang.Unroll

import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletResponse

class ResponseHeaderFilterSpec extends Specification {

    ResponseHeaderFilter filter

    def setup() {
        filter = Spy(ResponseHeaderFilter)
    }

    @Unroll
    def "doFilter with #hostName"() {
        given:
            filter.hostName = hostName
            ServletRequest request = Mock(ServletRequest)
            ServletResponse response = Mock(HttpServletResponse)
            FilterChain chain = Mock(FilterChain)

        when:
            filter.doFilter(request, response, chain)

        then:
            1 * response.setHeader("host-name", hostName)
            1 * chain.doFilter(request, response)

        where:
            hostName        | _
            "localhost"     | _
            "localhost.com" | _
            "lince.work"    | _

    }

}