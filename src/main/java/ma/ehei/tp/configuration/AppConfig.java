package ma.ehei.tp.configuration;

import ma.ehei.tp.service.reduction.ReductionService;
import ma.ehei.tp.service.reduction.impl.ParametrableReductionService;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "ma.ehei.tp")
@PropertySource("classpath:app.properties")
@ImportResource("classpath:spring-config.xml")
public class AppConfig {

    @Bean("franceParametrableReductionService")
    public ReductionService genererReductionFrance(){
        ParametrableReductionService reductionService = new ParametrableReductionService();
        reductionService.setTaux(30.0);
        return reductionService;
    }
}