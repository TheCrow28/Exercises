package co.develhope.interceptorsmiddleware2.interceptors;

import co.develhope.interceptorsmiddleware2.entities.Month;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class MonthInterceptor implements HandlerInterceptor {

    public static List<Month> months = new ArrayList<>(Arrays.asList(
            new Month(1, "January", "Januar"),
            new Month(2, "February","Februar"),
            new Month(3,"March","Marsch"),
            new Month(4,"April", "April"),
            new Month(5,"May", "Kann"),
            new Month(6,"June", "Juni")
    ));

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String monthNumberString = request.getHeader("monthNumber");
        if (monthNumberString == null || monthNumberString.isEmpty()) {
            response.setStatus(400);
        }
        int monthNumber = Integer.parseInt(monthNumberString);
        Optional<Month> month = months.stream().filter(singleMonth->{
            return singleMonth.getNumber() == monthNumber;
        }).findFirst();

        if (month.isPresent()) {
            request.setAttribute("Month", month.get());
            response.setStatus(200);
        } else {
            request.setAttribute("Month", new Month(monthNumber,"nope","nope"));
            response.setStatus(200);
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }

}

