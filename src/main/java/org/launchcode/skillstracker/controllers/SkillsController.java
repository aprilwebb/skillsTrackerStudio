package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String languagePossibilities(){
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we'd like to learn." +
                "Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</html>";
    }

    @GetMapping("form")
    public String languageForm(){
        return "<html>" +
                "<body>" +
                "<form method='post' action='form'>" +
                "<label>Name:</label><br>" +
                "<input type='text' name='name'><br><br>" +
                "<label>My favorite language</label><br>" +
                "<select name='language1'>" +
                "<option language=''>Choose a programming language</option>" +
                "<option language='1'>Java</option>" +
                "<option language='2'>JavaScript</option>" +
                "<option language='3'>Python</option>" +
                "</select><br>" +
                "<br><label>My second favorite language</label><br>" +
                "<select name='language2'><br>"+
                "<option language=''>Choose a programming language</option>" +
                "<option language='1'>Java</option>" +
                "<option language='2'>JavaScript</option>" +
                "<option language='3'>Python</option>" +
                "</select><br>" +
                "<br><label>My third favorite language</label><br>" +
                "<select name='language3'><br>"+
                "<option language=''>Choose a programming language</option>" +
                "<option language='1'>Java</option>" +
                "<option language='2'>JavaScript</option>" +
                "<option language='3'>Python</option>" +
                "</select><br>" +
                "<br><input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String languageFormUpdate(@RequestParam String name, String language1, String language2, String language3){
            return "<html>" +
                    "<h1>" + name +"</h1>" +
                    "<ol>" +
                    "<li>" + language1 + "</li>" +
                    "<li>" +language2 + "</li>" +
                    "<li>" +language3 +"</li>" +
                    "</ol>" +
                    "</html>";
    }
}
