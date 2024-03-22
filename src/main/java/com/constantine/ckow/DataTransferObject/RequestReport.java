package com.constantine.ckow.DataTransferObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@AllArgsConstructor
@Getter
@Setter
public class RequestReport {
    // Authentication
    BigInteger domain_id;

    // Client info
    String ip;
    String client_host;
    String client_port;
    String client_user;
    String client_locale;

    // Session info
    String session;
    String cookies;

    // Request info
    String request_uri;
    String request_url;
    String request_method;
    String request_header;
    String request_protocol;
    String request_scheme;
}