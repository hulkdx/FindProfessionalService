package com.hulkdx.findprofessional

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @GetMapping
    fun index(): String {
        return "TODO"
    }
}
