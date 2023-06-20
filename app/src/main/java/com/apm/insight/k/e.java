package com.apm.insight.k;

import android.text.TextUtils;
import com.apm.insight.Npth;
import com.apm.insight.l.q;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f6425a = false;

    /* renamed from: b  reason: collision with root package name */
    private static h f6426b;

    /* loaded from: classes.dex */
    public enum a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        

        /* renamed from: d  reason: collision with root package name */
        final int f6431d;

        a(int i10) {
            this.f6431d = i10;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);
        

        /* renamed from: l  reason: collision with root package name */
        final int f6444l;

        b(int i10) {
            this.f6444l = i10;
        }
    }

    public static l a(long j10, String str, byte[] bArr, a aVar, String str2, boolean z10) {
        String str3;
        StringBuilder sb2;
        if (!Npth.isStopUpload() && str != null) {
            if (bArr == null) {
                bArr = new byte[0];
            }
            int length = bArr.length;
            String str4 = null;
            if (a.GZIP == aVar && length > 128) {
                bArr = b(bArr);
                str4 = "gzip";
            } else if (a.DEFLATER == aVar && length > 128) {
                bArr = a(bArr);
                str4 = "deflate";
            }
            String str5 = str4;
            byte[] bArr2 = bArr;
            if (bArr2 == null) {
                return new l(202);
            }
            if (z10) {
                byte[] a10 = com.apm.insight.h.i().getEncryptImpl().a(bArr2);
                if (a10 != null) {
                    if (TextUtils.isEmpty(new URL(str).getQuery())) {
                        str3 = "?";
                        if (!str.endsWith("?")) {
                            sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(str3);
                            str = sb2.toString();
                        }
                        str = str + "tt_data=a";
                        str2 = "application/octet-stream;tt-data=a";
                        bArr2 = a10;
                    } else {
                        str3 = "&";
                        if (!str.endsWith("&")) {
                            sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(str3);
                            str = sb2.toString();
                        }
                        str = str + "tt_data=a";
                        str2 = "application/octet-stream;tt-data=a";
                        bArr2 = a10;
                    }
                }
                return a(str, bArr2, str2, str5, "POST", true, true);
            }
            return a(str, bArr2, str2, str5, "POST", true, false);
        }
        return new l(201);
    }

    public static l a(String str, String str2) {
        return a(str, str2, b());
    }

    public static l a(String str, String str2, boolean z10) {
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                return a(2097152L, str, str2.getBytes(), a.GZIP, "application/json; charset=utf-8", z10);
            }
            return new l(201);
        } catch (Throwable th) {
            q.b(th);
            return new l(207, th);
        }
    }

    public static l a(String str, String str2, File... fileArr) {
        return b(str, str2, fileArr);
    }

    private static l a(String str, byte[] bArr, String str2, String str3, String str4, boolean z10, boolean z11) {
        return b(str, bArr, str2, str3, str4, z10, z11);
    }

    private static String a(String str, Map map) {
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (!str.contains("?")) {
            sb2.append("?");
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    if (!sb2.toString().endsWith("?")) {
                        sb2.append("&");
                    }
                    sb2.append(d(entry.getKey().toString(), "UTF-8"));
                    sb2.append("=");
                    sb2.append(d(entry.getValue().toString(), "UTF-8"));
                }
            }
            return sb2.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static void a(h hVar) {
        f6426b = hVar;
    }

    public static boolean a() {
        return true;
    }

    public static boolean a(String str, String str2, String str3, String str4, List<String> list) {
        if (Npth.isStopUpload()) {
            return false;
        }
        try {
            j jVar = new j(str, "UTF-8", false);
            jVar.a("aid", str2);
            jVar.a("device_id", str3);
            jVar.a("os", "Android");
            jVar.a("process_name", str4);
            for (String str5 : list) {
                File file = new File(str5);
                if (file.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", "崩溃");
                    jVar.a(file.getName(), file, hashMap);
                }
            }
            return new JSONObject(jVar.a()).optInt("errno", -1) == 200;
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Constants.BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    com.apm.insight.l.k.a(byteArrayOutputStream);
                }
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static byte[] a(String str, Map<String, String> map, byte[] bArr) {
        try {
            return a(2097152L, a(str, map), bArr, a.GZIP, "application/json; charset=utf-8", false).b();
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Constants.BUFFER_SIZE);
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[Constants.BUFFER_SIZE];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    public static l b(String str, String str2) {
        return a(str, str2, a());
    }

    public static l b(String str, String str2, File... fileArr) {
        if (Npth.isStopUpload()) {
            return new l(201);
        }
        try {
            j jVar = new j(c(str, "have_dump=true&encrypt=true"), "UTF-8", true);
            jVar.a("json", str2, true);
            jVar.a("file", fileArr);
            try {
                return new l(0, new JSONObject(jVar.a()));
            } catch (JSONException e10) {
                return new l(0, e10);
            }
        } catch (IOException e11) {
            e11.printStackTrace();
            return new l(207);
        }
    }

    private static l b(String str, byte[] bArr, String str2, String str3, String str4, boolean z10, boolean z11) {
        InputStream inputStream;
        GZIPInputStream gZIPInputStream;
        byte[] a10;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection = null;
        GZIPInputStream gZIPInputStream2 = null;
        try {
            h hVar = f6426b;
            if (hVar != null) {
                try {
                    str = hVar.a(str, bArr);
                } catch (Throwable unused) {
                }
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                if (z10) {
                    httpURLConnection2.setDoOutput(true);
                } else {
                    httpURLConnection2.setDoOutput(false);
                }
                if (str2 != null) {
                    httpURLConnection2.setRequestProperty("Content-Type", str2);
                }
                if (str3 != null) {
                    httpURLConnection2.setRequestProperty("Content-Encoding", str3);
                }
                httpURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                if (str4 != null) {
                    httpURLConnection2.setRequestMethod(str4);
                    if (bArr != null && bArr.length > 0) {
                        try {
                            dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                        } catch (Throwable th) {
                            th = th;
                            dataOutputStream = null;
                        }
                        try {
                            dataOutputStream.write(bArr);
                            dataOutputStream.flush();
                            com.apm.insight.l.k.a(dataOutputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            com.apm.insight.l.k.a(dataOutputStream);
                            throw th;
                        }
                    }
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode != 200) {
                        l lVar = new l(206, "http response code " + responseCode);
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused2) {
                        }
                        com.apm.insight.l.k.a((Closeable) null);
                        return lVar;
                    }
                    InputStream inputStream2 = httpURLConnection2.getInputStream();
                    try {
                        if ("gzip".equalsIgnoreCase(httpURLConnection2.getContentEncoding())) {
                            try {
                                gZIPInputStream = new GZIPInputStream(inputStream2);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            try {
                                a10 = a(gZIPInputStream);
                                com.apm.insight.l.k.a(gZIPInputStream);
                            } catch (Throwable th4) {
                                th = th4;
                                gZIPInputStream2 = gZIPInputStream;
                                com.apm.insight.l.k.a(gZIPInputStream2);
                                throw th;
                            }
                        } else {
                            a10 = a(inputStream2);
                        }
                        l c10 = c(a10);
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused3) {
                        }
                        com.apm.insight.l.k.a(inputStream2);
                        return c10;
                    } catch (Throwable th5) {
                        httpURLConnection = httpURLConnection2;
                        inputStream = inputStream2;
                        th = th5;
                        try {
                            q.a(th);
                            return new l(207, th);
                        } finally {
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception unused4) {
                                }
                            }
                            com.apm.insight.l.k.a(inputStream);
                        }
                    }
                }
                throw new IllegalArgumentException("request method is not null");
            } catch (Throwable th6) {
                th = th6;
                httpURLConnection = httpURLConnection2;
                inputStream = null;
            }
        } catch (Throwable th7) {
            th = th7;
            inputStream = null;
        }
    }

    public static boolean b() {
        return true;
    }

    private static byte[] b(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Constants.BUFFER_SIZE);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                q.b(th);
                return null;
            } finally {
                gZIPOutputStream.close();
            }
        }
    }

    private static l c(byte[] bArr) {
        return new l(204, bArr);
    }

    public static String c() {
        return com.apm.insight.h.i().getJavaCrashUploadUrl();
    }

    private static String c(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str + "?";
                }
            } else if (!str.endsWith("&")) {
                str = str + "&";
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String d() {
        return com.apm.insight.h.i().getAlogUploadUrl();
    }

    private static String d(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static String e() {
        return com.apm.insight.h.i().getLaunchCrashUploadUrl();
    }

    public static String f() {
        return com.apm.insight.h.i().getExceptionUploadUrl();
    }

    public static String g() {
        return com.apm.insight.h.i().getNativeCrashUploadUrl();
    }
}
