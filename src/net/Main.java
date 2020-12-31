//package net;
//
//import com.sun.net.httpserver.HttpContext;
//import com.sun.net.httpserver.HttpExchange;
//import com.sun.net.httpserver.HttpHandler;
//import com.sun.net.httpserver.HttpServer;
//
//import java.io.IOException;
//import java.io.OutputStream;
//import java.net.InetSocketAddress;
//import java.net.URI;
//import java.net.http.HttpResponse;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        HttpServer server = HttpServer.create(new InetSocketAddress(8500), 0);
//        HttpContext context = server.createContext("/")
//                                    .setHandler(Main::handleRequest)
//
//        server.createContext("/message")
//                            .setHandler();
//        server.start();
//    }
//
//    private static void showMessage(HttpExchange exchange) throws IOException {
//        URI requestUri = exchange.getRequestURI();
//
//    }
//
//    private static void handleRequest(HttpExchange exchange) throws IOException {
//        String response = "Hi there!";
//        exchange.sendResponseHeaders(200, response.getBytes().length);//response code and length
//        OutputStream os = exchange.getResponseBody();
//        os.write(response.getBytes());
//        os.close();
//    }
//
//}