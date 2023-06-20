package com.fyber.inneractive.sdk.serverapi;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationManager;
import android.app.usage.StorageStatsManager;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.d0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r;
import com.fyber.inneractive.sdk.config.x;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.util.l;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.io.File;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Integer> f20189a = new C0270a();

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f20190b = Arrays.asList("POWER_SAVE_MODE_OPEN", "SmartModeStatus");

    /* renamed from: com.fyber.inneractive.sdk.serverapi.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0270a extends HashMap<String, Integer> {
        public C0270a() {
            put("HUAWEI", 4);
            put("XIAOMI", 1);
        }
    }

    public static String a() {
        try {
            Intent registerReceiver = l.f20301a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                return a((registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / registerReceiver.getIntExtra("scale", -1));
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(float f10) {
        return f10 < 5.0f ? "1" : f10 <= 9.0f ? "2" : f10 <= 24.0f ? "3" : f10 <= 39.0f ? "4" : f10 <= 54.0f ? "5" : f10 <= 69.0f ? "6" : f10 <= 84.0f ? "7" : f10 <= 100.0f ? "8" : "";
    }

    public static Long b() {
        long j10;
        d0 d0Var = IAConfigManager.J.f16888x;
        d0Var.getClass();
        try {
            String str = "";
            String str2 = d0Var.f16932c.get("SESSION_STAMP");
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            j10 = Long.parseLong(str);
        } catch (Exception unused) {
            j10 = 0;
        }
        return Long.valueOf(TimeUnit.SECONDS.convert(SystemClock.elapsedRealtime() - j10, TimeUnit.MILLISECONDS));
    }

    public static String c() {
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            return "unity3d";
        } catch (Throwable unused) {
            return "native";
        }
    }

    public static Long d() {
        try {
            Application application = l.f20301a;
            return Long.valueOf((a(application, true) + application.getCacheDir().getFreeSpace()) / 1048576);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Long e() {
        try {
            return Long.valueOf(TimeUnit.MINUTES.convert(Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()), TimeUnit.MILLISECONDS));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Long f() {
        long a10;
        UUID nameUUIDFromBytes;
        long j10 = 0;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                StorageStatsManager storageStatsManager = (StorageStatsManager) l.f20301a.getSystemService("storagestats");
                for (StorageVolume storageVolume : ((StorageManager) l.f20301a.getSystemService("storage")).getStorageVolumes()) {
                    try {
                        try {
                            if (storageVolume.getUuid() == null) {
                                nameUUIDFromBytes = StorageManager.UUID_DEFAULT;
                            } else {
                                nameUUIDFromBytes = UUID.nameUUIDFromBytes(storageVolume.getUuid().getBytes());
                            }
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        if (storageVolume.isRemovable()) {
                            a10 = a(l.f20301a, false) / 1048576;
                        }
                    }
                    if (nameUUIDFromBytes != null) {
                        a10 = storageStatsManager.getTotalBytes(nameUUIDFromBytes) / 1048576;
                        j10 += a10;
                    }
                }
            } else {
                Application application = l.f20301a;
                j10 = (a(application, false) + application.getCacheDir().getTotalSpace()) / 1048576;
            }
        } catch (Throwable unused3) {
        }
        return Long.valueOf(j10);
    }

    public static Boolean g() {
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                return Boolean.valueOf(Settings.System.getInt(l.f20301a.getContentResolver(), "airplane_mode_on", 0) != 0);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    public static Boolean h() {
        if (l.b("android.permission.BLUETOOTH") && Build.VERSION.SDK_INT >= 18) {
            try {
                BluetoothManager bluetoothManager = (BluetoothManager) l.f20301a.getSystemService("bluetooth");
                if (bluetoothManager.getAdapter().getProfileConnectionState(1) != 2 && bluetoothManager.getAdapter().getProfileConnectionState(2) != 2) {
                    return null;
                }
                return Boolean.TRUE;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Boolean i() {
        return Boolean.valueOf((l.f20301a.getResources().getConfiguration().uiMode & 48) == 32);
    }

    public static Boolean j() {
        int intExtra;
        try {
            Intent registerReceiver = l.f20301a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z10 = true;
            if (registerReceiver == null || ((intExtra = registerReceiver.getIntExtra("plugged", -1)) != 1 && intExtra != 2 && intExtra != 4)) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean k() {
        try {
            boolean z10 = false;
            int ringerMode = ((AudioManager) l.f20301a.getSystemService("audio")).getRingerMode();
            if (ringerMode == 0 || ringerMode == 1) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean l() {
        try {
            NotificationManager notificationManager = (NotificationManager) l.f20301a.getSystemService("notification");
            if (Build.VERSION.SDK_INT >= 23) {
                int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
                return Boolean.valueOf(currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean m() {
        boolean isWiredHeadsetOn;
        AudioDeviceInfo[] devices;
        try {
            AudioManager audioManager = (AudioManager) l.f20301a.getSystemService("audio");
            if (Build.VERSION.SDK_INT >= 23) {
                isWiredHeadsetOn = false;
                for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                    if (audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                        isWiredHeadsetOn = true;
                    }
                }
            } else {
                isWiredHeadsetOn = audioManager.isWiredHeadsetOn();
            }
            return Boolean.valueOf(isWiredHeadsetOn);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean n() {
        Integer num;
        try {
            String upperCase = Build.MANUFACTURER.toUpperCase(Locale.getDefault());
            if (!TextUtils.isEmpty(upperCase) && f20189a.containsKey(upperCase)) {
                try {
                    for (String str : f20190b) {
                        int i10 = Settings.System.getInt(l.f20301a.getContentResolver(), str, -1);
                        if (i10 != -1 && (num = f20189a.get(upperCase)) != null) {
                            return Boolean.valueOf(num.intValue() == i10);
                        }
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            } else if (Build.VERSION.SDK_INT >= 21) {
                return Boolean.valueOf(((PowerManager) l.f20301a.getSystemService("power")).isPowerSaveMode());
            } else {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static UnitDisplayType a(String str) {
        y yVar;
        UnitDisplayType unitDisplayType = UnitDisplayType.INTERSTITIAL;
        x a10 = com.fyber.inneractive.sdk.config.a.a(str);
        if (a10 == null || a10.f17070a.size() <= 0 || (yVar = a10.f17070a.get(0)) == null) {
            return unitDisplayType;
        }
        a0 a0Var = yVar.f17077f;
        r rVar = yVar.f17074c;
        if (a0Var != null) {
            return a0Var.f16908j;
        }
        return rVar != null ? rVar.f17018b : unitDisplayType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if ("mounted_ro".equals(r0) != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long a(android.content.Context r3, boolean r4) {
        /*
            java.lang.String r0 = com.fyber.inneractive.sdk.util.l.b()     // Catch: java.lang.Throwable -> L25
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L25
            r2 = 19
            if (r1 < r2) goto L25
            r1 = 0
            java.io.File[] r1 = r3.getExternalFilesDirs(r1)     // Catch: java.lang.Throwable -> L25
            int r1 = r1.length     // Catch: java.lang.Throwable -> L25
            r2 = 2
            if (r1 < r2) goto L25
            java.lang.String r1 = "mounted"
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L23
            java.lang.String r1 = "mounted_ro"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L25
        L23:
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            if (r0 == 0) goto L3c
            if (r4 == 0) goto L33
            java.io.File r3 = a(r3)     // Catch: java.lang.Throwable -> L3c
            long r3 = r3.getFreeSpace()     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L33:
            java.io.File r3 = a(r3)     // Catch: java.lang.Throwable -> L3c
            long r3 = r3.getTotalSpace()     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r3 = 0
        L3e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.serverapi.a.a(android.content.Context, boolean):long");
    }

    public static File a(Context context) {
        File[] externalCacheDirs;
        if (context == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        for (File file : context.getExternalCacheDirs()) {
            if (!Environment.isExternalStorageEmulated(file)) {
                return file;
            }
        }
        return null;
    }
}
