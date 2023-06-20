package com.chartboost.sdk.impl;

import com.chartboost.sdk.Networking.NetworkHelper;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: b  reason: collision with root package name */
    private static volatile SSLSocketFactory f14305b;

    /* renamed from: a  reason: collision with root package name */
    public static final b f14304a = new b(null);

    /* renamed from: c  reason: collision with root package name */
    private static final a f14306c = new a();

    /* loaded from: classes.dex */
    public static final class a implements X509TrustManager {
        a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }

        public final SSLSocketFactory a() {
            SSLSocketFactory sSLSocketFactory = t0.f14305b;
            if (sSLSocketFactory == null) {
                synchronized (this) {
                    sSLSocketFactory = t0.f14305b;
                    if (sSLSocketFactory == null) {
                        SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                        if (NetworkHelper.a()) {
                            sSLContext.init(null, new a[]{t0.f14306c}, null);
                        } else {
                            sSLContext.init(null, null, null);
                        }
                        sSLContext.createSSLEngine();
                        com.chartboost.sdk.Networking.e eVar = new com.chartboost.sdk.Networking.e(sSLContext.getSocketFactory());
                        b bVar = t0.f14304a;
                        t0.f14305b = eVar;
                        sSLSocketFactory = eVar;
                    }
                    ee.u uVar = ee.u.f29813a;
                }
            }
            return sSLSocketFactory;
        }
    }

    public static final SSLSocketFactory c() {
        return f14304a.a();
    }
}
