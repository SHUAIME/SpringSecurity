package com.yan.util;

import org.junit.Test;

public class RsaUtilsTest {

    private String privateFilePath = "E:\\study\\SpringSecurity\\auth_key\\id_key_rsa";
    private String publicFilePath = "E:\\study\\SpringSecurity\\auth_key\\id_key_rsa.pub";

    @Test
    public void generateKey() throws Exception {
        RsaUtils.generateKey(publicFilePath, privateFilePath, "shuaime", 2048);
    }

    @Test
    public void getPublicKey() throws Exception {
        System.out.println(RsaUtils.getPublicKey(publicFilePath));
    }

    @Test
    public void getPrivateKey() throws Exception {
        System.out.println(RsaUtils.getPrivateKey(privateFilePath));
    }


}