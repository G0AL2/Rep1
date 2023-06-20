package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f22018a;

    /* renamed from: b  reason: collision with root package name */
    private int f22019b;

    /* renamed from: c  reason: collision with root package name */
    private int f22020c;

    /* renamed from: d  reason: collision with root package name */
    private int f22021d;

    /* renamed from: e  reason: collision with root package name */
    private int f22022e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f22023f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f22024g = true;

    public d(View view) {
        this.f22018a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        View view = this.f22018a;
        z.b0(view, this.f22021d - (view.getTop() - this.f22019b));
        View view2 = this.f22018a;
        z.a0(view2, this.f22022e - (view2.getLeft() - this.f22020c));
    }

    public int b() {
        return this.f22021d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f22019b = this.f22018a.getTop();
        this.f22020c = this.f22018a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f22024g || this.f22022e == i10) {
            return false;
        }
        this.f22022e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f22023f || this.f22021d == i10) {
            return false;
        }
        this.f22021d = i10;
        a();
        return true;
    }
}
