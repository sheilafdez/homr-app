package com.javaloping.homr.controller;

import com.javaloping.homr.dto.property.RentDTO;
import com.javaloping.homr.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author victormiranda@gmail.com
 */

@RestController
@RequestMapping("/renting")
public class RentController extends BaseController {

    @Autowired
    private PropertyService propertyService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public RentDTO addRent(final @RequestBody RentDTO rent) {
        return propertyService.addRent(rent);
    }
}
