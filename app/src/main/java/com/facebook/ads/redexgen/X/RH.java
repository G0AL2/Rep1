package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;

/* loaded from: assets/audience_network.dex */
public interface RH {
    boolean AAl(RF rf);

    HttpURLConnection ACz(String str, @Nullable Proxy proxy) throws IOException;

    InputStream AD0(HttpURLConnection httpURLConnection) throws IOException;

    OutputStream AD1(HttpURLConnection httpURLConnection) throws IOException;

    void ADI(HttpURLConnection httpURLConnection, RD rd2, String str) throws IOException;

    byte[] ADe(InputStream inputStream) throws IOException;

    void AFk(OutputStream outputStream, byte[] bArr) throws IOException;
}
