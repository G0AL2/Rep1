package com.fyber.inneractive.sdk.config;

import android.content.Context;
import java.io.Serializable;

/* loaded from: classes.dex */
public class k implements t {

    /* renamed from: a  reason: collision with root package name */
    public Context f16993a;

    /* renamed from: b  reason: collision with root package name */
    public c f16994b = new c();

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static k f16995a = new k();
    }

    /* loaded from: classes.dex */
    public static class c implements Serializable {
        public static final long serialVersionUID = 2;

        /* renamed from: a  reason: collision with root package name */
        public String f16996a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f16997b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f16998c;

        public c() {
        }
    }

    public static String a() {
        c cVar = b.f16995a.f16994b;
        if (cVar != null) {
            return cVar.f16996a;
        }
        return null;
    }

    public static boolean b() {
        c cVar = b.f16995a.f16994b;
        if (cVar != null) {
            return cVar.f16998c;
        }
        return false;
    }

    public static boolean c() {
        c cVar = b.f16995a.f16994b;
        if (cVar != null) {
            return cVar.f16997b;
        }
        return false;
    }
}
