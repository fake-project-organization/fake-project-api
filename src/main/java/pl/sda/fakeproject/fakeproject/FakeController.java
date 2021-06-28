package pl.sda.fakeproject.fakeproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/")
public class FakeController {

    @GetMapping
    public List<String> getNames() {

        List<String> names = new ArrayList<>();
        names.add("Jan");
        names.add("Tomek");
        names.add("Anna");

        return names;
    }

}
