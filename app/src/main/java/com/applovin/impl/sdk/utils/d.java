package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.applovin.impl.sdk.v;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f8811a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f8812b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f8813c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8814d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f8815e;

    private d(Context context) {
        boolean z10;
        Bundle bundle = null;
        try {
            try {
                bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e10) {
                if (v.a()) {
                    v.c("AndroidManifest", "Failed to get meta data.", e10);
                }
            }
            this.f8813c = bundle;
            int i10 = 0;
            try {
                XmlResourceParser openXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
                int eventType = openXmlResourceParser.getEventType();
                int i11 = 0;
                z10 = false;
                do {
                    if (2 == eventType) {
                        try {
                            if (openXmlResourceParser.getName().equals("application")) {
                                for (int i12 = 0; i12 < openXmlResourceParser.getAttributeCount(); i12++) {
                                    String attributeName = openXmlResourceParser.getAttributeName(i12);
                                    String attributeValue = openXmlResourceParser.getAttributeValue(i12);
                                    if (attributeName.equals("networkSecurityConfig")) {
                                        i11 = Integer.valueOf(attributeValue.substring(1)).intValue();
                                    } else if (attributeName.equals("usesCleartextTraffic")) {
                                        z10 = Boolean.valueOf(attributeValue).booleanValue();
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            i10 = i11;
                            try {
                                if (v.a()) {
                                    v.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                                }
                                this.f8814d = i10;
                                this.f8815e = z10;
                            } catch (Throwable th2) {
                                this.f8814d = i10;
                                this.f8815e = z10;
                                throw th2;
                            }
                        }
                    }
                    eventType = openXmlResourceParser.next();
                } while (eventType != 1);
                this.f8814d = i11;
            } catch (Throwable th3) {
                th = th3;
                z10 = false;
            }
            this.f8815e = z10;
        } catch (Throwable th4) {
            this.f8813c = null;
            throw th4;
        }
    }

    public static d a(Context context) {
        d dVar;
        synchronized (f8812b) {
            if (f8811a == null) {
                f8811a = new d(context);
            }
            dVar = f8811a;
        }
        return dVar;
    }

    public String a(String str, String str2) {
        Bundle bundle = this.f8813c;
        return bundle != null ? bundle.getString(str, str2) : str2;
    }

    public boolean a() {
        return this.f8814d != 0;
    }

    public boolean a(String str) {
        Bundle bundle = this.f8813c;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public boolean a(String str, boolean z10) {
        Bundle bundle = this.f8813c;
        return bundle != null ? bundle.getBoolean(str, z10) : z10;
    }
}
