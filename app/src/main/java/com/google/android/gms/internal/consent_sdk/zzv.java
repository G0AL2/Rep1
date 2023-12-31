package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.unity3d.ads.metadata.MediationMetaData;
import fm.castbox.mediation.model.NetworkName;
import hb.a;
import hb.c;
import hb.d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzv {
    private final Application zza;
    private final zzac zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zzam zze;
    private final zzba zzf;
    private final zzn zzg;
    private final zzz zzh;
    private final zzh zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzv(Application application, zzac zzacVar, Handler handler, Executor executor, zzam zzamVar, zzba zzbaVar, zzn zznVar, zzz zzzVar, zzh zzhVar) {
        this.zza = application;
        this.zzb = zzacVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzamVar;
        this.zzf = zzbaVar;
        this.zzg = zznVar;
        this.zzh = zzzVar;
        this.zzi = zzhVar;
    }

    private final zzbw zzd(zzbu zzbuVar) throws zzj {
        String userAgentString;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            Application application = this.zza;
            if (Build.VERSION.SDK_INT >= 17) {
                userAgentString = WebSettings.getDefaultUserAgent(application);
            } else {
                userAgentString = new WebView(application).getSettings().getUserAgentString();
            }
            httpURLConnection.setRequestProperty("User-Agent", userAgentString);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                jsonWriter.beginObject();
                String str = zzbuVar.zza;
                if (str != null) {
                    jsonWriter.name("admob_app_id");
                    jsonWriter.value(str);
                }
                Boolean bool = zzbuVar.zzb;
                if (bool != null) {
                    jsonWriter.name("is_lat");
                    jsonWriter.value(bool.booleanValue());
                }
                String str2 = zzbuVar.zzc;
                if (str2 != null) {
                    jsonWriter.name("adid");
                    jsonWriter.value(str2);
                }
                zzbq zzbqVar = zzbuVar.zzd;
                if (zzbqVar != null) {
                    jsonWriter.name("device_info");
                    jsonWriter.beginObject();
                    int i10 = zzbqVar.zzc;
                    if (i10 != 1) {
                        jsonWriter.name("os_type");
                        if (i10 != 0) {
                            zzbp zzbpVar = zzbp.DEBUG_PARAM_UNKNOWN;
                            if (i10 - 1 != 0) {
                                jsonWriter.value("ANDROID");
                            } else {
                                jsonWriter.value(NetworkName.UNKNOWN);
                            }
                        } else {
                            throw null;
                        }
                    }
                    String str3 = zzbqVar.zza;
                    if (str3 != null) {
                        jsonWriter.name("model");
                        jsonWriter.value(str3);
                    }
                    Integer num = zzbqVar.zzb;
                    if (num != null) {
                        jsonWriter.name("android_api_level");
                        jsonWriter.value(num);
                    }
                    jsonWriter.endObject();
                }
                String str4 = zzbuVar.zze;
                if (str4 != null) {
                    jsonWriter.name("language_code");
                    jsonWriter.value(str4);
                }
                Boolean bool2 = zzbuVar.zzf;
                if (bool2 != null) {
                    jsonWriter.name("tag_for_under_age_of_consent");
                    jsonWriter.value(bool2.booleanValue());
                }
                Map<String, String> map = zzbuVar.zzg;
                if (!map.isEmpty()) {
                    jsonWriter.name("stored_infos_map");
                    jsonWriter.beginObject();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        jsonWriter.name(entry.getKey());
                        jsonWriter.value(entry.getValue());
                    }
                    jsonWriter.endObject();
                }
                zzbs zzbsVar = zzbuVar.zzh;
                if (zzbsVar != null) {
                    jsonWriter.name("screen_info");
                    jsonWriter.beginObject();
                    Integer num2 = zzbsVar.zza;
                    if (num2 != null) {
                        jsonWriter.name("width");
                        jsonWriter.value(num2);
                    }
                    Integer num3 = zzbsVar.zzb;
                    if (num3 != null) {
                        jsonWriter.name("height");
                        jsonWriter.value(num3);
                    }
                    Double d10 = zzbsVar.zzc;
                    if (d10 != null) {
                        jsonWriter.name("density");
                        jsonWriter.value(d10);
                    }
                    List<zzbr> list = zzbsVar.zzd;
                    if (!list.isEmpty()) {
                        jsonWriter.name("screen_insets");
                        jsonWriter.beginArray();
                        for (zzbr zzbrVar : list) {
                            jsonWriter.beginObject();
                            Integer num4 = zzbrVar.zza;
                            if (num4 != null) {
                                jsonWriter.name("top");
                                jsonWriter.value(num4);
                            }
                            Integer num5 = zzbrVar.zzb;
                            if (num5 != null) {
                                jsonWriter.name("left");
                                jsonWriter.value(num5);
                            }
                            Integer num6 = zzbrVar.zzc;
                            if (num6 != null) {
                                jsonWriter.name("right");
                                jsonWriter.value(num6);
                            }
                            Integer num7 = zzbrVar.zzd;
                            if (num7 != null) {
                                jsonWriter.name("bottom");
                                jsonWriter.value(num7);
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                }
                zzbo zzboVar = zzbuVar.zzi;
                if (zzboVar != null) {
                    jsonWriter.name("app_info");
                    jsonWriter.beginObject();
                    String str5 = zzboVar.zza;
                    if (str5 != null) {
                        jsonWriter.name("package_name");
                        jsonWriter.value(str5);
                    }
                    String str6 = zzboVar.zzb;
                    if (str6 != null) {
                        jsonWriter.name("publisher_display_name");
                        jsonWriter.value(str6);
                    }
                    String str7 = zzboVar.zzc;
                    if (str7 != null) {
                        jsonWriter.name(MediationMetaData.KEY_VERSION);
                        jsonWriter.value(str7);
                    }
                    jsonWriter.endObject();
                }
                zzbt zzbtVar = zzbuVar.zzj;
                if (zzbtVar != null) {
                    jsonWriter.name("sdk_info");
                    jsonWriter.beginObject();
                    String str8 = zzbtVar.zza;
                    if (str8 != null) {
                        jsonWriter.name(MediationMetaData.KEY_VERSION);
                        jsonWriter.value(str8);
                    }
                    jsonWriter.endObject();
                }
                List<zzbp> list2 = zzbuVar.zzk;
                if (!list2.isEmpty()) {
                    jsonWriter.name("debug_params");
                    jsonWriter.beginArray();
                    for (zzbp zzbpVar2 : list2) {
                        zzbp zzbpVar3 = zzbp.DEBUG_PARAM_UNKNOWN;
                        int ordinal = zzbpVar2.ordinal();
                        if (ordinal == 0) {
                            jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                        } else if (ordinal == 1) {
                            jsonWriter.value("ALWAYS_SHOW");
                        } else if (ordinal == 2) {
                            jsonWriter.value("GEO_OVERRIDE_EEA");
                        } else if (ordinal == 3) {
                            jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                        } else if (ordinal == 4) {
                            jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
                jsonWriter.close();
                outputStreamWriter.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        zzbw zza = zzbw.zza(new JsonReader(new StringReader(headerField)));
                        zza.zza = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return zza;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        zzbw zza2 = zzbw.zza(jsonReader);
                        jsonReader.close();
                        bufferedReader.close();
                        return zza2;
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                String next = new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next();
                StringBuilder sb2 = new StringBuilder(String.valueOf(next).length() + 31);
                sb2.append("Http error code - ");
                sb2.append(responseCode);
                sb2.append(".\n");
                sb2.append(next);
                throw new IOException(sb2.toString());
            } catch (Throwable th3) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (SocketTimeoutException e10) {
            throw new zzj(4, "The server timed out.", e10);
        } catch (IOException e11) {
            throw new zzj(2, "Error making request.", e11);
        }
    }

    public final /* synthetic */ void zza(final c.b bVar) {
        Handler handler = this.zzc;
        bVar.getClass();
        handler.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzu
            @Override // java.lang.Runnable
            public final void run() {
                c.b.this.a();
            }
        });
    }

    public final /* synthetic */ void zzb(Activity activity, d dVar, final c.b bVar, final c.a aVar) {
        try {
            a a10 = dVar.a();
            if (a10 == null || !a10.b()) {
                String zza = zzbx.zza(this.zza);
                StringBuilder sb2 = new StringBuilder(String.valueOf(zza).length() + 95);
                sb2.append("Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"");
                sb2.append(zza);
                sb2.append("\") to set this as a debug device.");
                Log.i("UserMessagingPlatform", sb2.toString());
            }
            zzaa zza2 = new zzy(this.zzh, zzd(this.zzg.zzd(activity, dVar))).zza();
            this.zze.zzf(zza2.zza);
            this.zzf.zzb(zza2.zzb);
            this.zzi.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzr
                @Override // java.lang.Runnable
                public final void run() {
                    zzv.this.zza(bVar);
                }
            });
        } catch (zzj e10) {
            this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    c.a.this.a(e10.zza());
                }
            });
        } catch (RuntimeException e11) {
            String valueOf = String.valueOf(Log.getStackTraceString(e11));
            final zzj zzjVar = new zzj(1, valueOf.length() != 0 ? "Caught exception when trying to request consent info update: ".concat(valueOf) : new String("Caught exception when trying to request consent info update: "));
            this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzt
                @Override // java.lang.Runnable
                public final void run() {
                    c.a.this.a(zzjVar.zza());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(final Activity activity, final d dVar, final c.b bVar, final c.a aVar) {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzq
            @Override // java.lang.Runnable
            public final void run() {
                zzv.this.zzb(activity, dVar, bVar, aVar);
            }
        });
    }
}
