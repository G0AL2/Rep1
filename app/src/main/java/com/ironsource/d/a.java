package com.ironsource.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f26080a = true;

    /* renamed from: b  reason: collision with root package name */
    private IronSourceError f26081b = null;

    public static String a(Context context) {
        return Build.VERSION.SDK_INT >= 23 ? a(b(context), context) : d(context);
    }

    @SuppressLint({"MissingPermission"})
    public static String a(Network network, Context context) {
        String d10;
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities == null) {
                    return d(context);
                }
                if (networkCapabilities.hasTransport(1)) {
                    d10 = "wifi";
                } else if (!networkCapabilities.hasTransport(0)) {
                    return d(context);
                } else {
                    d10 = "3g";
                }
            } else {
                d10 = d(context);
            }
            return d10;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "none";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static JSONObject a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (Build.VERSION.SDK_INT >= 23 && network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put("hasVPN", c(context));
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONObject;
    }

    @SuppressLint({"MissingPermission"})
    public static Network b(Context context) {
        if (context == null) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 23 && connectivityManager != null) {
            try {
                return connectivityManager.getActiveNetwork();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    private static String c(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (Build.VERSION.SDK_INT >= 23 && network != null && context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) {
                    return "";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return "ethernet";
                }
                if (networkCapabilities.hasTransport(5)) {
                    return "wifiAware";
                }
                if (networkCapabilities.hasTransport(6)) {
                    return "lowpan";
                }
                if (networkCapabilities.hasTransport(2)) {
                    return "bluetooth";
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return "";
    }

    public static boolean c(Context context) {
        return c(context, b(context)).equals("vpn");
    }

    private static String d(Context context) {
        String a10 = a.AnonymousClass1.a(context);
        return TextUtils.isEmpty(a10) ? "none" : a10;
    }

    public void a(IronSourceError ironSourceError) {
        this.f26080a = false;
        this.f26081b = ironSourceError;
    }

    public boolean a() {
        return this.f26080a;
    }

    public IronSourceError b() {
        return this.f26081b;
    }

    public String toString() {
        StringBuilder sb2;
        if (a()) {
            sb2 = new StringBuilder("valid:");
            sb2.append(this.f26080a);
        } else {
            sb2 = new StringBuilder("valid:");
            sb2.append(this.f26080a);
            sb2.append(", IronSourceError:");
            sb2.append(this.f26081b);
        }
        return sb2.toString();
    }
}
