package com.endava.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Hinciu on 29.10.2017.
 */
public class RestClient {
    public static final String SERVICE_URL = "http://localhost:8080/";
    public static final String COINS_SERVICE_URL = "https://api.coinmarketcap.com/v1/ticker/";
    private static Logger LOGGER = LoggerFactory.getLogger(RestClient.class);

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        //System.out.printf(restTemplate.getForObject(SERVICE_URL + "/user/", String.class));
        LOGGER.info(restTemplate.getForObject(COINS_SERVICE_URL, String.class));

    }
}
