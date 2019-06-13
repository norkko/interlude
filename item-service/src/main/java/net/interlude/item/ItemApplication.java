package net.interlude.item

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
class ItemApplication : CommandLineRunner {

    override fun run(vararg args: String) {
        logger.info("Item service running")
    }

    companion object {

        private val logger = LoggerFactory.getLogger(ItemApplication::class.java!!)

        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(ItemApplication::class.java, *args)
        }
    }

}
