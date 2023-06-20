package com.bytedance.sdk.component.d.b;

import android.util.Log;
import com.inmobi.media.jh;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultHttpClient.java */
/* loaded from: classes.dex */
public class a implements com.bytedance.sdk.component.d.d<d> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.bytedance.sdk.component.d.d
    /* renamed from: b */
    public d<byte[]> a(com.bytedance.sdk.component.d.e eVar) {
        Closeable closeable;
        InputStream inputStream;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        String message;
        Closeable closeable2;
        HttpURLConnection httpURLConnection;
        int i10 = 0;
        InputStream inputStream2 = null;
        Map<String, String> map = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(eVar.a()).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(jh.DEFAULT_BITMAP_TIMEOUT);
                httpURLConnection.setReadTimeout(jh.DEFAULT_BITMAP_TIMEOUT);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
            } catch (MalformedURLException e10) {
                e = e10;
                inputStream = null;
                bArr = null;
            } catch (IOException e11) {
                e = e11;
                inputStream = null;
                bArr = null;
            } catch (Throwable th) {
                th = th;
                closeable = null;
                com.bytedance.sdk.component.d.c.c.b.a(inputStream2);
                com.bytedance.sdk.component.d.c.c.b.a(closeable);
                throw th;
            }
            try {
                byte[] bArr2 = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = inputStream.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    } catch (MalformedURLException e12) {
                        e = e12;
                        bArr = null;
                    } catch (IOException e13) {
                        e = e13;
                        bArr = null;
                    }
                }
                i10 = 200;
                bArr = byteArrayOutputStream.toByteArray();
            } catch (MalformedURLException e14) {
                e = e14;
                bArr = null;
                byteArrayOutputStream = bArr;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                com.bytedance.sdk.component.d.c.c.b.a(inputStream);
                com.bytedance.sdk.component.d.c.c.b.a(closeable2);
                return new d<>(i10, bArr, message, map);
            } catch (IOException e15) {
                e = e15;
                bArr = null;
                byteArrayOutputStream = bArr;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                com.bytedance.sdk.component.d.c.c.b.a(inputStream);
                com.bytedance.sdk.component.d.c.c.b.a(closeable2);
                return new d<>(i10, bArr, message, map);
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                inputStream2 = inputStream;
                com.bytedance.sdk.component.d.c.c.b.a(inputStream2);
                com.bytedance.sdk.component.d.c.c.b.a(closeable);
                throw th;
            }
            try {
                map = eVar.b() ? a(httpURLConnection) : null;
                com.bytedance.sdk.component.d.c.c.b.a(inputStream);
                com.bytedance.sdk.component.d.c.c.b.a(byteArrayOutputStream);
                message = "success";
            } catch (MalformedURLException e16) {
                e = e16;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                com.bytedance.sdk.component.d.c.c.b.a(inputStream);
                com.bytedance.sdk.component.d.c.c.b.a(closeable2);
                return new d<>(i10, bArr, message, map);
            } catch (IOException e17) {
                e = e17;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                com.bytedance.sdk.component.d.c.c.b.a(inputStream);
                com.bytedance.sdk.component.d.c.c.b.a(closeable2);
                return new d<>(i10, bArr, message, map);
            }
            return new d<>(i10, bArr, message, map);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private Map<String, String> a(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                hashMap.put(str, list.get(0));
            }
        }
        return hashMap;
    }
}
