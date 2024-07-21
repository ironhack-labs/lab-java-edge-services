package feign;

public class StudentInfoClient {

    import org.springframework.cloud.openfeign.FeignClient;

    import org.springframework.web.bind.annotation.GetMapping;

    import org.springframework.web.bind.annotation.PathVariable;


    @FeignClient(name = "student-info-service")

    public interface StudentInfoCLient(){
        @GetMapping("/students/{id}")
        Student getStudentById(@PathVariable("id") Long id);

    }


}
