package com.ironsource.environment;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.ironsource.mediationsdk.ai;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a extends Thread {

    /* renamed from: j  reason: collision with root package name */
    private static final com.ironsource.environment.b f26112j = new AnonymousClass1();

    /* renamed from: k  reason: collision with root package name */
    private static final i f26113k = new C0336a();

    /* renamed from: d  reason: collision with root package name */
    private final int f26117d;

    /* renamed from: a  reason: collision with root package name */
    com.ironsource.environment.b f26114a = f26112j;

    /* renamed from: b  reason: collision with root package name */
    private i f26115b = f26113k;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f26116c = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    boolean f26118e = false;

    /* renamed from: f  reason: collision with root package name */
    private volatile int f26119f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f26120g = 1;

    /* renamed from: h  reason: collision with root package name */
    private int f26121h = 0;

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f26122i = new b();

    /* renamed from: com.ironsource.environment.a$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass1 implements com.ironsource.environment.b {
        AnonymousClass1() {
        }

        public static String a(int i10) {
            String str = "not defined message for " + i10;
            if (i10 != 404) {
                switch (i10) {
                    case IronSourceError.AUCTION_ERROR_EMPTY_WATERFALL /* 1004 */:
                        return "malformed url exception";
                    case 1005:
                        break;
                    case 1006:
                        return "http empty response";
                    default:
                        switch (i10) {
                            case IronSourceError.AUCTION_ERROR_DECOMPRESSION /* 1008 */:
                                return "socket timeout exception";
                            case 1009:
                                return "io exception";
                            case 1010:
                                return "uri syntax exception";
                            case IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND /* 1011 */:
                                return "http error code";
                            default:
                                switch (i10) {
                                    case 1018:
                                        return "file not found exception";
                                    case 1019:
                                        return "out of memory exception";
                                    case IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT /* 1020 */:
                                        return "failed to create folder for file";
                                    default:
                                        return str;
                                }
                        }
                }
            }
            return "http not found";
        }

        public static String a(Context context) {
            ConnectivityManager connectivityManager;
            String str;
            StringBuilder sb2 = new StringBuilder();
            if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        String typeName = activeNetworkInfo.getTypeName();
                        int type = activeNetworkInfo.getType();
                        if (type == 0) {
                            str = "3g";
                        } else if (type == 1) {
                            str = "wifi";
                        } else {
                            sb2.append(typeName);
                        }
                        sb2.append(str);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return sb2.toString();
        }

        public static String a(String str) {
            try {
                return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
            } catch (UnsupportedEncodingException unused) {
                return "";
            }
        }

        public static String a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            try {
                return Base64.encodeToString(b(str.getBytes("UTF-8"), (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 0)))), 0).replaceAll(System.getProperty("line.separator"), "");
            } catch (Exception e10) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception on string encryption error: " + e10.getMessage());
                e10.printStackTrace();
                return "";
            }
        }

        public static String a(byte[] bArr) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        return sb2.toString();
                    }
                    sb2.append(readLine);
                }
            } catch (Exception e10) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception while decompressing " + e10);
                return null;
            }
        }

        public static Map<String, Object> a(Object[][] objArr) {
            HashMap hashMap = new HashMap();
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception unused) {
            }
            return hashMap;
        }

        public static void a(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                throw new Exception("url is null");
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            if (!TextUtils.isEmpty(str2)) {
                intent.setPackage(str2);
            }
            context.startActivity(intent);
        }

        public static byte[] a(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[Constants.BUFFER_SIZE];
            while (true) {
                int read = inputStream.read(bArr, 0, Constants.BUFFER_SIZE);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }

        public static JSONObject b(String str, String str2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errMsg", str);
                jSONObject.put("adViewId", str2);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return jSONObject;
        }

        public static boolean b(Context context) {
            ConnectivityManager connectivityManager;
            if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                return false;
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.isConnected()) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e10) {
                e10.printStackTrace();
                return false;
            }
        }

        public static byte[] b(String str) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        }

        private static byte[] b(byte[] bArr, PublicKey publicKey) {
            try {
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(1, publicKey);
                return cipher.doFinal(bArr);
            } catch (Exception e10) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception on encryption error: " + e10.getMessage());
                throw new RuntimeException(e10);
            }
        }

        public static int c(Context context) {
            if (context != null) {
                try {
                    return context.getResources().getConfiguration().mcc;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return -1;
                }
            }
            return -1;
        }

        public static String c() {
            try {
                new ai();
                return ",kiag";
            } catch (Throwable unused) {
                return ",kiang";
            }
        }

        public static String c(String str) {
            return Base64.encodeToString(str.getBytes(), 10);
        }

        public static int d(Context context) {
            if (context != null) {
                try {
                    return context.getResources().getConfiguration().mnc;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return -1;
                }
            }
            return -1;
        }

        public static boolean d() {
            try {
                new ai();
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public static String e(Context context) {
            if (context != null) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    return telephonyManager != null ? telephonyManager.getSimOperator() : "";
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return "";
                }
            }
            return "";
        }

        public static int f(Context context) {
            if (context != null) {
                try {
                    return ((TelephonyManager) context.getSystemService("phone")).getPhoneType();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return -1;
        }

        @Override // com.ironsource.environment.b
        public final void a() {
        }

        @Override // com.ironsource.environment.b
        public final void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    /* renamed from: com.ironsource.environment.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0336a implements i {
        C0336a() {
        }

        @Override // com.ironsource.environment.i
        public final void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* loaded from: classes3.dex */
    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            aVar.f26119f = (aVar.f26119f + 1) % Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
    }

    public a(int i10) {
        this.f26117d = i10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        setName("|ANR-ANRHandler|");
        int i10 = -1;
        while (!isInterrupted() && this.f26121h < this.f26120g) {
            int i11 = this.f26119f;
            this.f26116c.post(this.f26122i);
            try {
                Thread.sleep(this.f26117d);
                if (this.f26119f != i11) {
                    this.f26121h = 0;
                } else if (this.f26118e || !Debug.isDebuggerConnected()) {
                    this.f26121h++;
                    this.f26114a.a();
                    String str = e.f26143c;
                    if (str != null && !str.trim().isEmpty()) {
                        new c(e.f26143c, String.valueOf(System.currentTimeMillis()), "ANR").d();
                    }
                } else {
                    if (this.f26119f != i10) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i10 = this.f26119f;
                }
            } catch (InterruptedException e10) {
                this.f26115b.a(e10);
                return;
            }
        }
        if (this.f26121h >= this.f26120g) {
            this.f26114a.b();
        }
    }
}
