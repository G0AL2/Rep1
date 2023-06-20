package com.ironsource.mediationsdk.server;

import android.text.TextUtils;
import com.ironsource.mediationsdk.J;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class HttpFunctions {
    public static final String ERROR_PREFIX = "ERROR:";

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f27376a = Executors.newSingleThreadExecutor();

    public static String getStringFromURL(String str) {
        return getStringFromURL(str, null);
    }

    public static String getStringFromURL(String str, J.a aVar) {
        BufferedReader bufferedReader;
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader2;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 400) {
                    if (aVar != null) {
                        aVar.a("Bad Request - 400");
                    }
                    httpURLConnection.disconnect();
                    return null;
                }
                bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                    }
                    String sb3 = sb2.toString();
                    boolean isEmpty = TextUtils.isEmpty(sb3);
                    httpURLConnection.disconnect();
                    bufferedReader2.close();
                    if (isEmpty) {
                        return null;
                    }
                    return sb3;
                } catch (Exception unused) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return null;
                } catch (Throwable th) {
                    httpURLConnection2 = httpURLConnection;
                    bufferedReader = bufferedReader2;
                    th = th;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                bufferedReader2 = null;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                bufferedReader = null;
            }
        } catch (Exception unused3) {
            httpURLConnection = null;
            bufferedReader2 = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    public static void sendPostRequest(String str, String str2, a aVar) {
        sendPostRequestWithAutho(str, str2, null, null, aVar);
    }

    public static void sendPostRequestWithAutho(final String str, final String str2, final String str3, final String str4, final a aVar) {
        f27376a.submit(new Runnable() { // from class: com.ironsource.mediationsdk.server.HttpFunctions.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.io.OutputStream, java.net.HttpURLConnection] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r1v5 */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r8 = this;
                    r0 = 0
                    r1 = 0
                    java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                    java.lang.String r3 = r1     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                    r2.<init>(r3)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                    java.lang.String r3 = r2     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                    if (r3 == 0) goto L16
                    java.lang.String r4 = r3     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                    if (r4 != 0) goto L12
                    goto L16
                L12:
                    com.ironsource.mediationsdk.utils.IronSourceUtils.getBase64Auth(r3, r4)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                    throw r1     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                L16:
                    java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                    java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
                    r3 = 15000(0x3a98, float:2.102E-41)
                    r2.setReadTimeout(r3)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    r2.setConnectTimeout(r3)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    java.lang.String r3 = "POST"
                    r2.setRequestMethod(r3)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    r3 = 1
                    r2.setDoInput(r3)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    r2.setDoOutput(r3)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    java.io.OutputStream r1 = r2.getOutputStream()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    java.lang.String r6 = "UTF-8"
                    r5.<init>(r1, r6)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    r4.<init>(r5)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    java.lang.String r5 = r4     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    r4.write(r5)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    r4.flush()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    r4.close()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    int r4 = r2.getResponseCode()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    r5 = 200(0xc8, float:2.8E-43)
                    if (r4 != r5) goto L54
                    goto L55
                L54:
                    r3 = 0
                L55:
                    if (r3 != 0) goto L6f
                    com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    java.lang.String r7 = "invalid response code "
                    r6.<init>(r7)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    r6.append(r4)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    java.lang.String r4 = " sending request"
                    r6.append(r4)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    java.lang.String r4 = r6.toString()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    r5.error(r4)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                L6f:
                    com.ironsource.mediationsdk.server.a r4 = r5     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    r4.a(r3)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> Lb9
                    if (r1 == 0) goto L7e
                    r1.close()     // Catch: java.io.IOException -> L7a
                    goto L7e
                L7a:
                    r0 = move-exception
                    r0.printStackTrace()
                L7e:
                    r2.disconnect()
                    return
                L82:
                    r3 = move-exception
                    goto L8a
                L84:
                    r0 = move-exception
                    r2 = r1
                    goto Lba
                L87:
                    r2 = move-exception
                    r3 = r2
                    r2 = r1
                L8a:
                    r3.printStackTrace()     // Catch: java.lang.Throwable -> Lb9
                    com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> Lb9
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9
                    java.lang.String r6 = "exception while sending request "
                    r5.<init>(r6)     // Catch: java.lang.Throwable -> Lb9
                    java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> Lb9
                    r5.append(r3)     // Catch: java.lang.Throwable -> Lb9
                    java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Lb9
                    r4.error(r3)     // Catch: java.lang.Throwable -> Lb9
                    com.ironsource.mediationsdk.server.a r3 = r5     // Catch: java.lang.Throwable -> Lb9
                    r3.a(r0)     // Catch: java.lang.Throwable -> Lb9
                    if (r1 == 0) goto Lb3
                    r1.close()     // Catch: java.io.IOException -> Laf
                    goto Lb3
                Laf:
                    r0 = move-exception
                    r0.printStackTrace()
                Lb3:
                    if (r2 == 0) goto Lb8
                    r2.disconnect()
                Lb8:
                    return
                Lb9:
                    r0 = move-exception
                Lba:
                    if (r1 == 0) goto Lc4
                    r1.close()     // Catch: java.io.IOException -> Lc0
                    goto Lc4
                Lc0:
                    r1 = move-exception
                    r1.printStackTrace()
                Lc4:
                    if (r2 == 0) goto Lc9
                    r2.disconnect()
                Lc9:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.server.HttpFunctions.AnonymousClass1.run():void");
            }
        });
    }
}
