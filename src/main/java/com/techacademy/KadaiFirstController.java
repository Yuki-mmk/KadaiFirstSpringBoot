package com.techacademy;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{yyyymmdd}")
    public String dispDayOfWeek(@PathVariable("yyyymmdd") String yyyymmdd) {
    	String yyyy = yyyymmdd.substring(0, 4);
    	String mm = yyyymmdd.substring(4, 6);
    	String dd = yyyymmdd.substring(6, 8);

    	int y = Integer.parseInt(yyyy);
    	int m = Integer.parseInt(mm);
    	int d = Integer.parseInt(dd);

    	Calendar cal = Calendar.getInstance();
    	cal.set(y, m, d);

    	switch( cal.get(Calendar.DAY_OF_WEEK)) {
    	case Calendar.SUNDAY:
    		return "Sunday";

    	case Calendar.MONDAY:
    		return "Monday";

    	case Calendar.TUESDAY:
    		return "Tuesday";

    	case Calendar.WEDNESDAY:
    		return "Wednesday";

    	case Calendar.THURSDAY:
    		return "Thursday";

    	case Calendar.FRIDAY:
    		return "Friday";

    	case Calendar.SATURDAY:
    		return "Saturday";
    	}

    	return "error";
	}

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable("val1") int val1, @PathVariable("val2") int val2) {
        int res = 0;
        res = val1 + val2;
        return "実行結果：" + res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable("val1") int val1, @PathVariable("val2") int val2) {
        int res = 0;
        res = val1 - val2;
        return "実行結果：" + res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable("val1") int val1, @PathVariable("val2") int val2) {
        int res = 0;
        res = val1 * val2;
        return "実行結果：" + res;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable("val1") int val1, @PathVariable("val2") int val2) {
        int res = 0;
        res = val1 / val2;
        return "実行結果：" + res;
    }
}