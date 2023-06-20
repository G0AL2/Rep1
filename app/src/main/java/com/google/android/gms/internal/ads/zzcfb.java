package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcfb {
    public static final Handler zza = new zzfnw(Looper.getMainLooper());
    private static final String zzb = AdView.class.getName();
    private static final String zzc = InterstitialAd.class.getName();
    private static final String zzd = AdManagerAdView.class.getName();
    private static final String zze = AdManagerInterstitialAd.class.getName();
    private static final String zzf = SearchAdView.class.getName();
    private static final String zzg = AdLoader.class.getName();
    private float zzh = -1.0f;

    private final void zzA(JSONObject jSONObject, String str, Object obj) throws JSONException {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzr)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzh((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, zzi((Map) obj));
        } else if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), zzy((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, zzy(Arrays.asList((Object[]) obj)));
        } else {
            int i10 = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    numArr = new Integer[0];
                } else {
                    int length = iArr.length;
                    Integer[] numArr2 = new Integer[length];
                    while (i10 < length) {
                        numArr2[i10] = Integer.valueOf(iArr[i10]);
                        i10++;
                    }
                    numArr = numArr2;
                }
                jSONObject.put(str, zzg(numArr));
            } else if (obj instanceof double[]) {
                double[] dArr2 = (double[]) obj;
                if (dArr2 == null) {
                    dArr = new Double[0];
                } else {
                    int length2 = dArr2.length;
                    Double[] dArr3 = new Double[length2];
                    while (i10 < length2) {
                        dArr3[i10] = Double.valueOf(dArr2[i10]);
                        i10++;
                    }
                    dArr = dArr3;
                }
                jSONObject.put(str, zzg(dArr));
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    lArr = new Long[0];
                } else {
                    int length3 = jArr.length;
                    Long[] lArr2 = new Long[length3];
                    while (i10 < length3) {
                        lArr2[i10] = Long.valueOf(jArr[i10]);
                        i10++;
                    }
                    lArr = lArr2;
                }
                jSONObject.put(str, zzg(lArr));
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    boolArr = new Boolean[0];
                } else {
                    int length4 = zArr.length;
                    Boolean[] boolArr2 = new Boolean[length4];
                    while (i10 < length4) {
                        boolArr2[i10] = Boolean.valueOf(zArr[i10]);
                        i10++;
                    }
                    boolArr = boolArr2;
                }
                jSONObject.put(str, zzg(boolArr));
            } else {
                jSONObject.put(str, obj);
            }
        }
    }

    private static final void zzB(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, int i10, int i11) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i10);
        textView.setBackgroundColor(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i10);
        int zzw = zzw(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(zzqVar.zzf - zzw, zzqVar.zzc - zzw, 17));
        viewGroup.addView(frameLayout, zzqVar.zzf, zzqVar.zzc);
    }

    public static int zza(Context context, int i10) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i11 = configuration.orientation;
        if (i10 == 0) {
            i10 = i11;
        }
        if (i10 == i11) {
            return Math.round(displayMetrics.heightPixels / displayMetrics.density);
        }
        return Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static AdSize zzc(Context context, int i10, int i11, int i12) {
        int round;
        int zza2 = zza(context, i12);
        if (zza2 == -1) {
            return AdSize.INVALID;
        }
        int min = Math.min(90, Math.round(zza2 * 0.15f));
        if (i10 > 655) {
            round = Math.round((i10 / 728.0f) * 90.0f);
        } else if (i10 > 632) {
            round = 81;
        } else if (i10 > 526) {
            round = Math.round((i10 / 468.0f) * 60.0f);
        } else {
            round = i10 > 432 ? 68 : Math.round((i10 / 320.0f) * 50.0f);
        }
        return new AdSize(i10, Math.max(Math.min(round, min), 50));
    }

    public static String zzd() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static String zze(String str) {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static Throwable zzf(Throwable th) {
        if (((Boolean) zzbjx.zzf.zze()).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z10 = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (zzn(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z10 = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    } else {
                        arrayList.add(stackTraceElement);
                    }
                }
            }
            if (z10) {
                if (th2 == null) {
                    th2 = new Throwable(th3.getMessage());
                } else {
                    th2 = new Throwable(th3.getMessage(), th2);
                }
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    @VisibleForTesting
    public static boolean zzn(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbjx.zzd.zze());
    }

    public static final int zzo(DisplayMetrics displayMetrics, int i10) {
        return (int) TypedValue.applyDimension(1, i10, displayMetrics);
    }

    @VisibleForTesting
    public static final String zzp(StackTraceElement[] stackTraceElementArr, String str) {
        int i10;
        int i11;
        String str2;
        while (true) {
            i11 = i10 + 1;
            if (i11 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            String className = stackTraceElement.getClassName();
            i10 = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (zzb.equalsIgnoreCase(className) || zzc.equalsIgnoreCase(className) || zzd.equalsIgnoreCase(className) || zze.equalsIgnoreCase(className) || zzf.equalsIgnoreCase(className) || zzg.equalsIgnoreCase(className))) ? 0 : i11;
        }
        str2 = stackTraceElementArr[i11].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb2 = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb2.append(stringTokenizer.nextToken());
                int i12 = 2;
                while (true) {
                    int i13 = i12 - 1;
                    if (i12 <= 0 || !stringTokenizer.hasMoreElements()) {
                        break;
                    }
                    sb2.append(".");
                    sb2.append(stringTokenizer.nextToken());
                    i12 = i13;
                }
                str = sb2.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean zzq() {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            return str.contains("generic") || str.contains("emulator");
        }
        return Build.DEVICE.startsWith("generic");
    }

    public static final boolean zzr(Context context, int i10) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i10) == 0;
    }

    public static final boolean zzs(Context context) {
        int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        return isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2;
    }

    public static final boolean zzt() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int zzu(DisplayMetrics displayMetrics, int i10) {
        return Math.round(i10 / displayMetrics.density);
    }

    public static final void zzv(Context context, String str, String str2, Bundle bundle, boolean z10, zzcfa zzcfaVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = GoogleApiAvailabilityLight.getInstance().getApkVersion(context) + ".221908000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzcfaVar.zza(appendQueryParameter.toString());
    }

    public static final int zzw(Context context, int i10) {
        return zzo(context.getResources().getDisplayMetrics(), i10);
    }

    public static final String zzx(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return zze(((contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id")) == null || zzq()) ? "emulator" : "emulator");
    }

    private final JSONArray zzy(Collection collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : collection) {
            zzz(jSONArray, obj);
        }
        return jSONArray;
    }

    private final void zzz(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(zzh((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(zzi((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(zzy((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(zzg((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    public final int zzb(Context context, int i10) {
        if (this.zzh < 0.0f) {
            synchronized (this) {
                if (this.zzh < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.zzh = displayMetrics.density;
                }
            }
        }
        return Math.round(i10 / this.zzh);
    }

    @VisibleForTesting
    final JSONArray zzg(Object[] objArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            zzz(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject zzh(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zzA(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject zzi(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zzA(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e10) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e10.getMessage())));
        }
    }

    public final JSONObject zzj(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return zzh(bundle);
            } catch (JSONException e10) {
                zzcfi.zzh("Error converting Bundle to JSON", e10);
                return null;
            }
        }
        return null;
    }

    public final void zzk(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, String str2) {
        if (str2 != null) {
            zzcfi.zzj(str2);
        }
        zzB(viewGroup, zzqVar, str, -65536, -16777216);
    }

    public final void zzl(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar, String str) {
        zzB(viewGroup, zzqVar, "Ads by Google", -16777216, -1);
    }

    public final void zzm(Context context, String str, String str2, Bundle bundle, boolean z10) {
        zzv(context, str, "gmob-apps", bundle, true, new zzcfa() { // from class: com.google.android.gms.internal.ads.zzcey
            @Override // com.google.android.gms.internal.ads.zzcfa
            public final boolean zza(String str3) {
                new zzcez(zzcfb.this, str3).start();
                return true;
            }
        });
    }
}
