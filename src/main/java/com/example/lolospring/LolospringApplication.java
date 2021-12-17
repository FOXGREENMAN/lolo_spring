package com.example.lolospring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan(
        "com.example.lolospring.dao"
)
@ServletComponentScan(
        "com.example.lolospring.filter"
)
@SpringBootApplication
public class LolospringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LolospringApplication.class, args);
        System.out.println(" __        ______    __        ______           _______..______   .______       __  .__   __.   _______ \n" +
                "|  |      /  __  \\  |  |      /  __  \\         /       ||   _  \\  |   _  \\     |  | |  \\ |  |  /  _____|\n" +
                "|  |     |  |  |  | |  |     |  |  |  |       |   (----`|  |_)  | |  |_)  |    |  | |   \\|  | |  |  __  \n" +
                "|  |     |  |  |  | |  |     |  |  |  |        \\   \\    |   ___/  |      /     |  | |  . `  | |  | |_ | \n" +
                "|  `----.|  `--'  | |  `----.|  `--'  |    .----)   |   |  |      |  |\\  \\----.|  | |  |\\   | |  |__| | \n" +
                "|_______| \\______/  |_______| \\______/     |_______/    | _|      | _| `._____||__| |__| \\__|  \\______| \n" +
                "                                                                                                        \n" +
                ".______     ______     ______   .___________.        _______.___________.    ___      .______     .___________.\n" +
                "|   _  \\   /  __  \\   /  __  \\  |           |       /       |           |   /   \\     |   _  \\    |           |\n" +
                "|  |_)  | |  |  |  | |  |  |  | `---|  |----`      |   (----`---|  |----`  /  ^  \\    |  |_)  |   `---|  |----`\n" +
                "|   _  <  |  |  |  | |  |  |  |     |  |            \\   \\       |  |      /  /_\\  \\   |      /        |  |     \n" +
                "|  |_)  | |  `--'  | |  `--'  |     |  |        .----)   |      |  |     /  _____  \\  |  |\\  \\----.   |  |     \n" +
                "|______/   \\______/   \\______/      |__|        |_______/       |__|    /__/     \\__\\ | _| `._____|   |__|     \n" +
                "                                                                                                               ");
    }
}
