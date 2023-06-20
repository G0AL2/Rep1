package com.inmobi.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* compiled from: NetworkUtils.java */
/* loaded from: classes3.dex */
public class hv {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25706a = "hv";

    @SuppressLint({"MissingPermission"})
    public static boolean a() {
        Context c10 = ho.c();
        if (c10 == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) c10.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (!b()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean b() {
        Context c10 = ho.c();
        if (c10 == null) {
            return false;
        }
        try {
            PowerManager powerManager = (PowerManager) c10.getSystemService("power");
            if (Build.VERSION.SDK_INT <= 22 || powerManager == null) {
                return false;
            }
            return powerManager.isDeviceIdleMode();
        } catch (Exception unused) {
            return false;
        }
    }

    public static String a(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append(str);
                }
                sb2.append(String.format(Locale.US, "%s=%s", a(entry.getKey()), a(entry.getValue())));
            }
        }
        return sb2.toString();
    }

    private static String a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static void a(Map<String, String> map) {
        if (map != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() != null && entry.getValue().trim().length() != 0 && entry.getKey() != null && entry.getKey().trim().length() != 0) {
                    hashMap.put(entry.getKey().trim(), entry.getValue().trim());
                }
            }
            map.clear();
            map.putAll(hashMap);
        }
    }

    public static HashMap<String, String> a(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    public static String a(String str, Map<String, String> map) {
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                str = str.replace(entry.getKey(), entry.getValue());
            }
        }
        return str;
    }

    public static byte[] a(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        IOException e10;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        } catch (IOException e11) {
            gZIPInputStream = null;
            e10 = e11;
        } catch (Throwable th) {
            th = th;
            a((Closeable) byteArrayInputStream);
            a((Closeable) gZIPInputStream2);
            throw th;
        }
        try {
            try {
                bArr = a((InputStream) gZIPInputStream);
            } catch (Throwable th2) {
                th = th2;
                gZIPInputStream2 = gZIPInputStream;
                a((Closeable) byteArrayInputStream);
                a((Closeable) gZIPInputStream2);
                throw th;
            }
        } catch (IOException e12) {
            e10 = e12;
            hu.a((byte) 2, f25706a, "Failed to decompress response", e10);
            a((Closeable) byteArrayInputStream);
            a((Closeable) gZIPInputStream);
            return bArr;
        }
        a((Closeable) byteArrayInputStream);
        a((Closeable) gZIPInputStream);
        return bArr;
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (-1 != read) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            } finally {
                a(byteArrayOutputStream);
            }
        }
    }

    public static void a(HttpURLConnection httpURLConnection) {
        try {
            a((Closeable) httpURLConnection.getInputStream());
        } catch (IOException unused) {
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
