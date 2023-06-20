package com.unity3d.services.core.properties;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.unity3d.services.core.log.DeviceLog;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes3.dex */
public class ClientProperties {
    private static final X500Principal DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
    private static WeakReference<Activity> _activity;
    private static Application _application;
    private static Context _applicationContext;
    private static String _gameId;

    public static Activity getActivity() {
        return _activity.get();
    }

    public static String getAppName() {
        return _applicationContext.getPackageName();
    }

    public static String getAppVersion() {
        String packageName = getApplicationContext().getPackageName();
        PackageManager packageManager = getApplicationContext().getPackageManager();
        try {
            return packageManager.getPackageInfo(packageName, 0).versionName == null ? "FakeVersionName" : packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            DeviceLog.exception("Error getting package info", e10);
            return null;
        }
    }

    public static Application getApplication() {
        return _application;
    }

    public static Context getApplicationContext() {
        return _applicationContext;
    }

    public static String getGameId() {
        return _gameId;
    }

    public static boolean isAppDebuggable() {
        boolean z10;
        if (getApplicationContext() != null) {
            PackageManager packageManager = getApplicationContext().getPackageManager();
            String packageName = getApplicationContext().getPackageName();
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
                int i10 = applicationInfo.flags & 2;
                applicationInfo.flags = i10;
                z10 = i10 != 0;
                r4 = false;
            } catch (PackageManager.NameNotFoundException e10) {
                DeviceLog.exception("Could not find name", e10);
                z10 = false;
            }
            if (r4) {
                try {
                    for (Signature signature : packageManager.getPackageInfo(packageName, 64).signatures) {
                        z10 = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getSubjectX500Principal().equals(DEBUG_CERT);
                        if (z10) {
                            break;
                        }
                    }
                } catch (PackageManager.NameNotFoundException e11) {
                    DeviceLog.exception("Could not find name", e11);
                } catch (CertificateException e12) {
                    DeviceLog.exception("Certificate exception", e12);
                }
            }
            return z10;
        }
        return false;
    }

    public static void setActivity(Activity activity) {
        _activity = new WeakReference<>(activity);
    }

    public static void setApplication(Application application) {
        _application = application;
    }

    public static void setApplicationContext(Context context) {
        _applicationContext = context;
    }

    public static void setGameId(String str) {
        _gameId = str;
    }
}
