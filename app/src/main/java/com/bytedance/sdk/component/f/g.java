package com.bytedance.sdk.component.f;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.UUID;

/* compiled from: TTRunnable.java */
/* loaded from: classes.dex */
public abstract class g implements Comparable<g>, Runnable {

    /* renamed from: a  reason: collision with root package name */
    private int f10439a;

    /* renamed from: b  reason: collision with root package name */
    private String f10440b;

    /* renamed from: c  reason: collision with root package name */
    private String f10441c;

    public g(String str, int i10) {
        this.f10439a = 0;
        this.f10439a = i10 == 0 ? 5 : i10;
        this.f10440b = UUID.randomUUID().toString() + Constants.FILENAME_SEQUENCE_SEPARATOR + String.valueOf(System.nanoTime());
        this.f10441c = str;
    }

    public void a(int i10) {
        this.f10439a = i10;
    }

    public String b() {
        return this.f10441c;
    }

    public int a() {
        return this.f10439a;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(g gVar) {
        if (a() < gVar.a()) {
            return 1;
        }
        return a() >= gVar.a() ? -1 : 0;
    }

    public g(String str) {
        this.f10439a = 0;
        this.f10439a = 5;
        this.f10440b = UUID.randomUUID().toString() + Constants.FILENAME_SEQUENCE_SEPARATOR + String.valueOf(System.nanoTime());
        this.f10441c = str;
    }
}
