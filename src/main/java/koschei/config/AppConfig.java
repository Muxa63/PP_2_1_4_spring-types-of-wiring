package koschei.config;

import koschei.models.Island2;
import koschei.models.Wood3;
import koschei.models.Duck5;
import koschei.models.Death8;
import koschei.models.Rabbit4;
import koschei.models.Egg6;
import koschei.models.Needle7;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {
    @Bean
    public Island2 island() {
        return new Island2(wood());
    }

    @Bean
    public Wood3 wood() {
        return new Wood3();
    }

    @Bean
    public Rabbit4 rabbit() {
        return new Rabbit4();
    }

    @Bean
    public Duck5 duck() {
        return new Duck5();
    }

    @Bean
    public Egg6 egg() {
        return new Egg6();
    }

    @Bean
    public Needle7 needle() {
        return new Needle7();
    }

    @Bean
    public Death8 death() {
        return new Death8();
    }
}