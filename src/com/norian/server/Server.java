package com.norian.server;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * Created by rnorian on 5/30/16.
 */
public class Server {
    public static void main(String[] args) {
        if (args.length > 1) {
            port(Integer.parseInt(args[0]));
        }
        get("/", (request, response) -> "<Response><Message to=\"+4407887795375\">Hi Raffi</Message></Response>");
        get("/sms/forward", (request, response) ->
                "<Response><Message to=\"+4407887795375\">" +
                        request.queryParams("Body") + "</Message></Response>");
    }
}
