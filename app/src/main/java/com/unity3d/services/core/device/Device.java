package com.unity3d.services.core.device;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Device {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.unity3d.services.core.device.Device$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$device$Device$MemoryInfoType;

        static {
            int[] iArr = new int[MemoryInfoType.values().length];
            $SwitchMap$com$unity3d$services$core$device$Device$MemoryInfoType = iArr;
            try {
                iArr[MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$device$Device$MemoryInfoType[MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum MemoryInfoType {
        TOTAL_MEMORY,
        FREE_MEMORY
    }

    public static String getAdvertisingTrackingId() {
        return AdvertisingId.getAdvertisingTrackingId();
    }

    public static int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    public static String getApkDigest() throws Exception {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(new File(ClientProperties.getApplicationContext().getPackageCodePath()));
        } catch (Throwable th) {
            th = th;
        }
        try {
            String Sha256 = Utilities.Sha256(fileInputStream);
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
            return Sha256;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static float getBatteryLevel() {
        Intent registerReceiver;
        if (ClientProperties.getApplicationContext() == null || (registerReceiver = ClientProperties.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1.0f;
        }
        return registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / registerReceiver.getIntExtra("scale", -1);
    }

    public static int getBatteryStatus() {
        Intent registerReceiver;
        if (ClientProperties.getApplicationContext() == null || (registerReceiver = ClientProperties.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1;
        }
        return registerReceiver.getIntExtra("status", -1);
    }

    public static String getBoard() {
        return Build.BOARD;
    }

    public static String getBootloader() {
        return Build.BOOTLOADER;
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getBuildId() {
        return Build.ID;
    }

    public static String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    public static long getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static String getCertificateFingerprint() {
        try {
            Signature[] signatureArr = ClientProperties.getApplicationContext().getPackageManager().getPackageInfo(ClientProperties.getApplicationContext().getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length < 1) {
                return null;
            }
            return Utilities.toHexString(MessageDigest.getInstance("SHA-1").digest(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded()));
        } catch (Exception e10) {
            DeviceLog.exception("Exception when signing certificate fingerprint", e10);
            return null;
        }
    }

    public static String getConnectionType() {
        return isUsingWifi() ? "wifi" : isActiveNetworkConnected() ? "cellular" : "none";
    }

    public static String getDevice() {
        return Build.DEVICE;
    }

    public static float getDisplayMetricDensity() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().density;
        }
        return -1.0f;
    }

    public static long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public static String getFingerprint() {
        return Build.FINGERPRINT;
    }

    public static long getFreeMemory() {
        return getMemoryInfo(MemoryInfoType.FREE_MEMORY);
    }

    public static long getFreeSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return Math.round((float) (file.getFreeSpace() / 1024));
    }

    public static String getGLVersion() {
        ActivityManager activityManager;
        ConfigurationInfo deviceConfigurationInfo;
        if (ClientProperties.getApplicationContext() == null || (activityManager = (ActivityManager) ClientProperties.getApplicationContext().getSystemService("activity")) == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null) {
            return null;
        }
        return deviceConfigurationInfo.getGlEsVersion();
    }

    public static String getHardware() {
        return Build.HARDWARE;
    }

    public static String getHost() {
        return Build.HOST;
    }

    public static String getIdfi() {
        String string = AndroidPreferences.getString("unityads-installinfo", "unityads-idfi");
        if (string == null) {
            String uniqueEventId = getUniqueEventId();
            AndroidPreferences.setString("unityads-installinfo", "unityads-idfi", uniqueEventId);
            return uniqueEventId;
        }
        return string;
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    private static long getMemoryInfo(MemoryInfoType memoryInfoType) {
        RandomAccessFile randomAccessFile;
        IOException e10;
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$services$core$device$Device$MemoryInfoType[memoryInfoType.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            i11 = 1;
        } else if (i10 != 2) {
            i11 = -1;
        }
        RandomAccessFile randomAccessFile2 = null;
        String str = null;
        try {
            randomAccessFile = new RandomAccessFile("/proc/meminfo", "r");
            for (int i12 = 0; i12 < i11; i12++) {
                try {
                    try {
                        str = randomAccessFile.readLine();
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile2 = randomAccessFile;
                        try {
                            randomAccessFile2.close();
                        } catch (IOException e11) {
                            DeviceLog.exception("Error closing RandomAccessFile", e11);
                        }
                        throw th;
                    }
                } catch (IOException e12) {
                    e10 = e12;
                    DeviceLog.exception("Error while reading memory info: " + memoryInfoType, e10);
                    try {
                        randomAccessFile.close();
                        return -1L;
                    } catch (IOException e13) {
                        DeviceLog.exception("Error closing RandomAccessFile", e13);
                        return -1L;
                    }
                }
            }
            long memoryValueFromString = getMemoryValueFromString(str);
            try {
                randomAccessFile.close();
            } catch (IOException e14) {
                DeviceLog.exception("Error closing RandomAccessFile", e14);
            }
            return memoryValueFromString;
        } catch (IOException e15) {
            randomAccessFile = null;
            e10 = e15;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2.close();
            throw th;
        }
    }

    private static long getMemoryValueFromString(String str) {
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
            String str2 = "";
            while (matcher.find()) {
                str2 = matcher.group(1);
            }
            return Long.parseLong(str2);
        }
        return -1L;
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static String getNetworkCountryISO() {
        return ClientProperties.getApplicationContext() != null ? ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkCountryIso() : "";
    }

    public static boolean getNetworkMetered() {
        ConnectivityManager connectivityManager;
        if (ClientProperties.getApplicationContext() == null || Build.VERSION.SDK_INT < 16 || (connectivityManager = (ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        return connectivityManager.isActiveNetworkMetered();
    }

    public static String getNetworkOperator() {
        return ClientProperties.getApplicationContext() != null ? ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkOperator() : "";
    }

    public static String getNetworkOperatorName() {
        return ClientProperties.getApplicationContext() != null ? ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkOperatorName() : "";
    }

    public static int getNetworkType() {
        if (ClientProperties.getApplicationContext() != null) {
            try {
                return ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkType();
            } catch (SecurityException unused) {
                DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
                return -1;
            }
        }
        return -1;
    }

    @TargetApi(21)
    private static ArrayList<String> getNewAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(Build.SUPPORTED_ABIS));
        return arrayList;
    }

    private static ArrayList<String> getOldAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(Build.CPU_ABI);
        arrayList.add(Build.CPU_ABI2);
        return arrayList;
    }

    public static String getOpenAdvertisingTrackingId() {
        return OpenAdvertisingId.getOpenAdvertisingTrackingId();
    }

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static JSONObject getPackageInfo(PackageManager packageManager) throws PackageManager.NameNotFoundException, JSONException {
        String appName = ClientProperties.getAppName();
        PackageInfo packageInfo = packageManager.getPackageInfo(appName, 0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("installer", packageManager.getInstallerPackageName(appName));
        jSONObject.put("firstInstallTime", packageInfo.firstInstallTime);
        jSONObject.put("lastUpdateTime", packageInfo.lastUpdateTime);
        jSONObject.put("versionCode", packageInfo.versionCode);
        jSONObject.put("versionName", packageInfo.versionName);
        jSONObject.put("packageName", packageInfo.packageName);
        return jSONObject;
    }

    public static Map<String, String> getProcessInfo() {
        Throwable th;
        RandomAccessFile randomAccessFile;
        IOException e10;
        HashMap hashMap = new HashMap();
        RandomAccessFile randomAccessFile2 = null;
        try {
        } catch (IOException e11) {
            DeviceLog.exception("Error closing RandomAccessFile", e11);
        }
        try {
            try {
                randomAccessFile = new RandomAccessFile("/proc/self/stat", "r");
            } catch (IOException e12) {
                randomAccessFile = null;
                e10 = e12;
            } catch (Throwable th2) {
                th = th2;
                try {
                    randomAccessFile2.close();
                } catch (IOException e13) {
                    DeviceLog.exception("Error closing RandomAccessFile", e13);
                }
                throw th;
            }
            try {
                hashMap.put("stat", randomAccessFile.readLine());
                randomAccessFile.close();
            } catch (IOException e14) {
                e10 = e14;
                DeviceLog.exception("Error while reading processor info: ", e10);
                randomAccessFile.close();
                return hashMap;
            }
            return hashMap;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            randomAccessFile2.close();
            throw th;
        }
    }

    public static String getProduct() {
        return Build.PRODUCT;
    }

    public static int getRingerMode() {
        if (ClientProperties.getApplicationContext() != null) {
            AudioManager audioManager = (AudioManager) ClientProperties.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                return audioManager.getRingerMode();
            }
            return -2;
        }
        return -1;
    }

    public static int getScreenBrightness() {
        if (ClientProperties.getApplicationContext() != null) {
            return Settings.System.getInt(ClientProperties.getApplicationContext().getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    public static int getScreenDensity() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        }
        return -1;
    }

    public static int getScreenHeight() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
        }
        return -1;
    }

    public static int getScreenLayout() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getConfiguration().screenLayout;
        }
        return -1;
    }

    public static int getScreenWidth() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
        }
        return -1;
    }

    public static List<Sensor> getSensorList() {
        if (ClientProperties.getApplicationContext() != null) {
            return ((SensorManager) ClientProperties.getApplicationContext().getSystemService("sensor")).getSensorList(-1);
        }
        return null;
    }

    public static int getStreamMaxVolume(int i10) {
        if (ClientProperties.getApplicationContext() != null) {
            AudioManager audioManager = (AudioManager) ClientProperties.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                return audioManager.getStreamMaxVolume(i10);
            }
            return -2;
        }
        return -1;
    }

    public static int getStreamVolume(int i10) {
        if (ClientProperties.getApplicationContext() != null) {
            AudioManager audioManager = (AudioManager) ClientProperties.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                return audioManager.getStreamVolume(i10);
            }
            return -2;
        }
        return -1;
    }

    public static ArrayList<String> getSupportedAbis() {
        if (getApiLevel() < 21) {
            return getOldAbiList();
        }
        return getNewAbiList();
    }

    public static String getSystemProperty(String str, String str2) {
        if (str2 != null) {
            return System.getProperty(str, str2);
        }
        return System.getProperty(str);
    }

    public static long getTotalMemory() {
        return getMemoryInfo(MemoryInfoType.TOTAL_MEMORY);
    }

    public static long getTotalSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return Math.round((float) (file.getTotalSpace() / 1024));
    }

    public static String getUniqueEventId() {
        return UUID.randomUUID().toString();
    }

    public static long getUptime() {
        return SystemClock.uptimeMillis();
    }

    public static boolean isActiveNetworkConnected() {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        return (ClientProperties.getApplicationContext() == null || (connectivityManager = (ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static Boolean isAdbEnabled() {
        if (getApiLevel() < 17) {
            return oldAdbStatus();
        }
        return newAdbStatus();
    }

    public static boolean isLimitAdTrackingEnabled() {
        return AdvertisingId.getLimitedAdTracking();
    }

    public static boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    public static boolean isRooted() {
        try {
            return searchPathForBinary("su");
        } catch (Exception e10) {
            DeviceLog.exception("Rooted check failed", e10);
            return false;
        }
    }

    public static boolean isUSBConnected() {
        Intent registerReceiver;
        if (ClientProperties.getApplicationContext() == null || (registerReceiver = ClientProperties.getApplicationContext().registerReceiver(null, new IntentFilter("android.hardware.usb.action.USB_STATE"))) == null) {
            return false;
        }
        return registerReceiver.getBooleanExtra("connected", false);
    }

    public static boolean isUsingWifi() {
        ConnectivityManager connectivityManager;
        if (ClientProperties.getApplicationContext() == null || (connectivityManager = (ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        TelephonyManager telephonyManager = (TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && connectivityManager.getBackgroundDataSetting() && connectivityManager.getActiveNetworkInfo().isConnected() && telephonyManager != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected();
    }

    public static boolean isWiredHeadsetOn() {
        if (ClientProperties.getApplicationContext() != null) {
            return ((AudioManager) ClientProperties.getApplicationContext().getSystemService("audio")).isWiredHeadsetOn();
        }
        return false;
    }

    @TargetApi(17)
    private static Boolean newAdbStatus() {
        try {
            return Boolean.valueOf(1 == Settings.Global.getInt(ClientProperties.getApplicationContext().getContentResolver(), "adb_enabled", 0));
        } catch (Exception e10) {
            DeviceLog.exception("Problems fetching adb enabled status", e10);
            return null;
        }
    }

    private static Boolean oldAdbStatus() {
        try {
            return Boolean.valueOf(1 == Settings.Secure.getInt(ClientProperties.getApplicationContext().getContentResolver(), "adb_enabled", 0));
        } catch (Exception e10) {
            DeviceLog.exception("Problems fetching adb enabled status", e10);
            return null;
        }
    }

    private static boolean searchPathForBinary(String str) {
        File[] listFiles;
        for (String str2 : System.getenv("PATH").split(":")) {
            File file = new File(str2);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.getName().equals(str)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
