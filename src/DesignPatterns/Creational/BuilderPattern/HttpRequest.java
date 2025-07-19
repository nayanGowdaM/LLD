package DesignPatterns.Creational.BuilderPattern;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    // Required parameters
    private final String url;

    // Optional
    private final String method;
    private final Map<String, String> headers ;
    private final Map<String, String> queryParams;
    private final String body;
    private final int timeout;

    public int timeout() {
        return timeout;
    }

    public String url() {
        return url;
    }

    public Map<String, String> queryParams() {
        return queryParams;
    }

    public Map<String, String> headers() {
        return headers;
    }

    public String method() {
        return method;
    }

    public String body() {
        return body;
    }

    private  HttpRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.queryParams = builder.queryParams;
        this.body = builder.body;
        this.timeout = builder.timeout;
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", headers=" + headers +
                ", queryParams=" + queryParams +
                ", body='" + body + '\'' +
                ", timeout=" + timeout +
                '}';
    }

    public static class  Builder {
        private final String url;
        private String method;
        private final Map<String, String> headers = new HashMap<>();
        private final Map<String, String> queryParams = new HashMap<>();
        private String body;
        private int timeout;

        public Builder(String url) {
            this.url = url;
        }

        public Builder method(String method) {
            this.method = method;
            return this;
        }

        public Builder headers(String key, String value) {
            this.headers.put(key, value);
            return this;
        }

        public Builder queryParams(String key, String value) {
            this.queryParams.put(key, value);
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }
        public Builder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }

}
