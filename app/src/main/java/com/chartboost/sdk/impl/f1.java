package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.chartboost.sdk.Libraries.CBLogging;

/* loaded from: classes.dex */
public class f1 {
    private int a(int i10, int i11) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 0) {
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 4;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return 5;
                case 13:
                    return 6;
                default:
                    return 3;
            }
        }
        return 0;
    }

    @SuppressLint({"MissingPermission"})
    public NetworkInfo a(Context context) {
        ConnectivityManager c10;
        if (context == null || (c10 = c(context)) == null) {
            return null;
        }
        try {
            return c10.getActiveNetworkInfo();
        } catch (Exception e10) {
            CBLogging.a("Chartboost", "Cannot retrieve active network info: " + e10.toString());
            return null;
        }
    }

    public int b(Context context) {
        NetworkInfo a10 = a(context);
        if (a10 == null || !a10.isConnected()) {
            return 0;
        }
        return a10.getSubtype();
    }

    public ConnectivityManager c(Context context) {
        if (context != null) {
            try {
                return (ConnectivityManager) context.getSystemService("connectivity");
            } catch (Exception e10) {
                CBLogging.a("Chartboost", "Cannot retrieve connectivity manager: " + e10.toString());
            }
        }
        return null;
    }

    public int d(Context context) {
        NetworkInfo a10 = a(context);
        if (a10 == null || !a10.isConnected()) {
            return 0;
        }
        return a(a10.getType(), a10.getSubtype());
    }

    public boolean e(Context context) {
        NetworkCapabilities a10;
        NetworkInfo a11 = a(context);
        if (Build.VERSION.SDK_INT < 23 || (a10 = a(context, (Network) null)) == null) {
            return a11 != null && a11.isConnected();
        }
        return a10.hasCapability(16);
    }

    @SuppressLint({"MissingPermission"})
    public NetworkCapabilities a(Context context, Network network) {
        ConnectivityManager c10;
        if (context == null || (c10 = c(context)) == null) {
            return null;
        }
        if (network == null) {
            try {
                network = c10.getActiveNetwork();
            } catch (Exception e10) {
                CBLogging.a("Chartboost", "Cannot retrieve network capabilities: " + e10.toString());
                return null;
            }
        }
        return c10.getNetworkCapabilities(network);
    }
}
