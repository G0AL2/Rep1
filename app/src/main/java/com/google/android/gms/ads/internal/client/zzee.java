package com.google.android.gms.ads.internal.client;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzee extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        Bundle bundle = null;
        try {
            bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            zzcfi.zzh("Failed to load metadata: Package name not found.", e10);
        } catch (NullPointerException e11) {
            zzcfi.zzh("Failed to load metadata: Null pointer exception.", e11);
        }
        zzbtt zza = zzbtt.zza();
        if (bundle == null) {
            zzcfi.zzg("Metadata was null.");
        } else {
            try {
                String str = (String) bundle.get("com.google.android.gms.ads.APPLICATION_ID");
                try {
                    Boolean bool = (Boolean) bundle.get("com.google.android.gms.ads.AD_MANAGER_APP");
                    try {
                        Boolean bool2 = (Boolean) bundle.get("com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT");
                        try {
                            String str2 = (String) bundle.get("com.google.android.gms.ads.INTEGRATION_MANAGER");
                            if (str != null && !str.matches("^/\\d+~.+$")) {
                                if (str.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                                    zzcfi.zze("Publisher provided Google AdMob App ID in manifest: ".concat(str));
                                    if (bool2 == null || !bool2.booleanValue()) {
                                        zza.zzb(context, str);
                                    }
                                } else {
                                    throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n******************************************************************************\n\n");
                                }
                            } else if (bool == null || !bool.booleanValue()) {
                                if (!TextUtils.isEmpty(str2)) {
                                    zzcfi.zze("The Google Mobile Ads SDK is integrated by ".concat(String.valueOf(str2)));
                                } else {
                                    throw new IllegalStateException("\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here:                                       *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                                }
                            }
                        } catch (ClassCastException e12) {
                            throw new IllegalStateException("The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value.", e12);
                        }
                    } catch (ClassCastException e13) {
                        throw new IllegalStateException("The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value.", e13);
                    }
                } catch (ClassCastException e14) {
                    throw new IllegalStateException("The com.google.android.gms.ads.AD_MANAGER_APP metadata must have a boolean value.", e14);
                }
            } catch (ClassCastException e15) {
                throw new IllegalStateException("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", e15);
            }
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
