package com.RNFetchBlob;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.inmobi.media.fq;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import ye.z;

/* compiled from: RNFetchBlobUtils.java */
/* loaded from: classes.dex */
public class h {

    /* compiled from: RNFetchBlobUtils.java */
    /* loaded from: classes.dex */
    class a implements X509TrustManager {
        a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* compiled from: RNFetchBlobUtils.java */
    /* loaded from: classes.dex */
    class b implements HostnameVerifier {
        b() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    public static void a(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", "warn");
        createMap.putString("detail", str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobMessage", createMap);
    }

    public static String b(String str) {
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                byte[] digest = messageDigest.digest();
                StringBuilder sb2 = new StringBuilder();
                int length = digest.length;
                for (int i10 = 0; i10 < length; i10++) {
                    sb2.append(String.format("%02x", Integer.valueOf(digest[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED)));
                }
                return sb2.toString();
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public static z.a c(z zVar) {
        try {
            a aVar = new a();
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, new TrustManager[]{aVar}, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            z.a z10 = zVar.z();
            z10.W(socketFactory, aVar);
            z10.Q(new b());
            return z10;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
