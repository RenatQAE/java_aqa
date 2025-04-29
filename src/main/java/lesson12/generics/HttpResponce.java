package lesson12.generics;

import java.util.Map;
import java.util.Objects;

public class HttpResponce {

    private int statusCode;
    private Map<String,String> headers;
    private String body;

    @Override
    public String toString() {
        return "HttpResponce{" +
                "statusCode=" + statusCode +
                ", headers=" + headers +
                ", body='" + body + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HttpResponce that = (HttpResponce) o;
        return statusCode == that.statusCode && Objects.equals(headers, that.headers) && Objects.equals(body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, headers, body);
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public HttpResponce(int statusCode, String body) {
        this.statusCode = statusCode;
        this.body = body;
    }

    }

