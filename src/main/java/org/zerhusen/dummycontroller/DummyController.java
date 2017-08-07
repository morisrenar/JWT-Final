package org.zerhusen.dummycontroller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bmshamsnahid on 8/7/17.
 */
@RestController
public class DummyController {

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/adminSec")
    public String admin() {
        return "admin section";
    }

    @PreAuthorize("hasRole('USER')")
    @RequestMapping("/userSec")
    public String user() {
        return "user section";
    }

    @RequestMapping("/guestSec")
    public String guest() {
        return "guest section";
    }
}
