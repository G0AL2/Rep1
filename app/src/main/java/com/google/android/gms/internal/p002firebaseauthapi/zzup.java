package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.iid.InstanceID;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzup  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzup {
    public static void zza(String str, zzts zztsVar, zzum zzumVar, Type type, zztw zztwVar) {
        InputStream errorStream;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zztsVar.zza().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zztwVar.zza(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            try {
                bufferedOutputStream.write(bytes, 0, length);
                bufferedOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (zzb(responseCode)) {
                    errorStream = httpURLConnection.getInputStream();
                } else {
                    errorStream = httpURLConnection.getErrorStream();
                }
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String sb3 = sb2.toString();
                if (!zzb(responseCode)) {
                    zzumVar.zza((String) zztr.zza(sb3, String.class));
                } else {
                    zzumVar.zzb((zztt) zztr.zza(sb3, type));
                }
            } catch (Throwable th3) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th4) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                }
                throw th3;
            }
        } catch (zzrm e10) {
            e = e10;
            zzumVar.zza(e.getMessage());
        } catch (SocketTimeoutException unused) {
            zzumVar.zza(InstanceID.ERROR_TIMEOUT);
        } catch (UnknownHostException unused2) {
            zzumVar.zza("<<Network Error>>");
        } catch (IOException e11) {
            e = e11;
            zzumVar.zza(e.getMessage());
        } catch (JSONException e12) {
            e = e12;
            zzumVar.zza(e.getMessage());
        }
    }

    private static final boolean zzb(int i10) {
        return i10 >= 200 && i10 < 300;
    }
}
