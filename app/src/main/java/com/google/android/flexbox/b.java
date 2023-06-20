package com.google.android.flexbox;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FlexLine.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: e  reason: collision with root package name */
    int f21913e;

    /* renamed from: f  reason: collision with root package name */
    int f21914f;

    /* renamed from: g  reason: collision with root package name */
    int f21915g;

    /* renamed from: h  reason: collision with root package name */
    int f21916h;

    /* renamed from: i  reason: collision with root package name */
    int f21917i;

    /* renamed from: j  reason: collision with root package name */
    float f21918j;

    /* renamed from: k  reason: collision with root package name */
    float f21919k;

    /* renamed from: l  reason: collision with root package name */
    int f21920l;

    /* renamed from: m  reason: collision with root package name */
    int f21921m;

    /* renamed from: o  reason: collision with root package name */
    int f21923o;

    /* renamed from: p  reason: collision with root package name */
    int f21924p;

    /* renamed from: q  reason: collision with root package name */
    boolean f21925q;

    /* renamed from: r  reason: collision with root package name */
    boolean f21926r;

    /* renamed from: a  reason: collision with root package name */
    int f21909a = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: b  reason: collision with root package name */
    int f21910b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: c  reason: collision with root package name */
    int f21911c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d  reason: collision with root package name */
    int f21912d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: n  reason: collision with root package name */
    List<Integer> f21922n = new ArrayList();

    public int a() {
        return this.f21915g;
    }

    public int b() {
        return this.f21916h;
    }

    public int c() {
        return this.f21916h - this.f21917i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(View view, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f21909a = Math.min(this.f21909a, (view.getLeft() - flexItem.E0()) - i10);
        this.f21910b = Math.min(this.f21910b, (view.getTop() - flexItem.O()) - i11);
        this.f21911c = Math.max(this.f21911c, view.getRight() + flexItem.U0() + i12);
        this.f21912d = Math.max(this.f21912d, view.getBottom() + flexItem.C0() + i13);
    }
}
