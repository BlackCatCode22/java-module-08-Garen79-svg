package mainProgram;

@Controller
public class Webcontroller {
	/**
     * Maps the root URL ("/") to the index.html file in the static folder.
     *
     * @return the name of the index.html file.
     */
    @GetMapping("/")
    public String index() {
        // Spring Boot will look for this file in src/main/resources/static/
        return "index.html";
    }
}
