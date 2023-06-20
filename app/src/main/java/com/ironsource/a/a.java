package com.ironsource.a;

import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    String f26058a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26059b;

    /* renamed from: c  reason: collision with root package name */
    String f26060c;

    /* renamed from: d  reason: collision with root package name */
    d f26061d;

    /* renamed from: e  reason: collision with root package name */
    boolean f26062e;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<Pair<String, String>> f26063f;

    /* renamed from: com.ironsource.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0333a {

        /* renamed from: a  reason: collision with root package name */
        String f26064a;

        /* renamed from: d  reason: collision with root package name */
        public d f26067d;

        /* renamed from: b  reason: collision with root package name */
        public boolean f26065b = false;

        /* renamed from: c  reason: collision with root package name */
        public String f26066c = "POST";

        /* renamed from: e  reason: collision with root package name */
        public boolean f26068e = false;

        /* renamed from: f  reason: collision with root package name */
        public ArrayList<Pair<String, String>> f26069f = new ArrayList<>();

        public C0333a(String str) {
            this.f26064a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f26064a = str;
        }
    }

    public a(C0333a c0333a) {
        this.f26062e = false;
        this.f26058a = c0333a.f26064a;
        this.f26059b = c0333a.f26065b;
        this.f26060c = c0333a.f26066c;
        this.f26061d = c0333a.f26067d;
        this.f26062e = c0333a.f26068e;
        if (c0333a.f26069f != null) {
            this.f26063f = new ArrayList<>(c0333a.f26069f);
        }
    }
}
