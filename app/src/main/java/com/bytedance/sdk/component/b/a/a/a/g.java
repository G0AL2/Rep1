package com.bytedance.sdk.component.b.a.a.a;

import com.bytedance.sdk.component.b.a.n;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: NetResponseBody.java */
/* loaded from: classes.dex */
public class g extends n {

    /* renamed from: a  reason: collision with root package name */
    HttpURLConnection f10003a;

    /* renamed from: b  reason: collision with root package name */
    InputStream f10004b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(HttpURLConnection httpURLConnection) throws IOException {
        this.f10003a = httpURLConnection;
        this.f10004b = new e(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.b.a.n
    public long a() {
        try {
            return this.f10003a.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.b.a.n
    public String b() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f10004b));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuffer.append(readLine + "\n");
                } else {
                    String stringBuffer2 = stringBuffer.toString();
                    close();
                    return stringBuffer2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.b.a.n
    public InputStream c() {
        return this.f10004b;
    }

    @Override // com.bytedance.sdk.component.b.a.n, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f10004b.close();
            this.f10003a.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.b.a.n
    public byte[] d() {
        try {
            byte[] bArr = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = this.f10004b.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }
}
