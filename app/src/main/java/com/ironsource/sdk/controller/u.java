package com.ironsource.sdk.controller;

import android.media.AudioManager;
import android.text.TextUtils;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class u {

    /* renamed from: c  reason: collision with root package name */
    private String f27876c;

    /* renamed from: d  reason: collision with root package name */
    private String f27877d;

    /* renamed from: f  reason: collision with root package name */
    private int f27879f;

    /* renamed from: b  reason: collision with root package name */
    private HashSet<String> f27875b = new HashSet<>();

    /* renamed from: a  reason: collision with root package name */
    private boolean f27874a = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f27878e = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f27880g = true;

    /* loaded from: classes3.dex */
    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ AudioManager f27881a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(AudioManager audioManager) {
            this.f27881a = audioManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f27881a.abandonAudioFocus(null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ AudioManager f27882a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(AudioManager audioManager) {
            this.f27882a = audioManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f27882a.requestAudioFocus(null, 3, 2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public HashSet<String> a() {
        return this.f27875b;
    }

    public void a(int i10) {
        this.f27879f = i10;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f27875b.add(str);
    }

    public void a(boolean z10) {
        this.f27874a = z10;
    }

    public void b(String str) {
        this.f27876c = str;
    }

    public void b(boolean z10) {
        this.f27878e = z10;
    }

    public boolean b() {
        return this.f27874a;
    }

    public String c() {
        return this.f27876c;
    }

    public void c(String str) {
        this.f27877d = str;
    }

    public void c(boolean z10) {
        this.f27880g = z10;
    }

    public String d() {
        return this.f27877d;
    }

    public boolean e() {
        return this.f27878e;
    }

    public int f() {
        return this.f27879f;
    }

    public boolean g() {
        return this.f27880g;
    }
}
